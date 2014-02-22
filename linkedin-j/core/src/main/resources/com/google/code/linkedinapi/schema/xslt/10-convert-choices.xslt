<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
				xmlns:xs="http://www.w3.org/2001/XMLSchema" 
				version="1.0">
  <xsl:output method="xml" indent="yes"/>
  
  <xsl:template match="@*|node()">
    <xsl:copy>
      <xsl:apply-templates select="@*|node()"/>
    </xsl:copy>
  </xsl:template>
  
  
  <!--
  	Removing the attribute "mixed" on <xs:complexType>, (jaxb will have some issues otherwise),
  	and copying everything else.
  	
  	General Note:
  		You need to approach differently when applying your changes using XSLT. It is not like get the nodes,
  		apply your changes, get the next set of nodes and apply some other changes It is not linear like that. 
  		<xsl:apply-templates match="SOME_EXP"> will look for all available templates and apply the changes. 
  		You need to look at all of the changes, group them together/applying them together, 
  		
  		How do we make sure, we  call apply-templates on the new nodes we are creating, that matches one of the apply-templates?
   -->
  <xsl:template match="xs:complexType">
    <xsl:copy>
      <xsl:apply-templates select="@*[not(name() = 'mixed')]|node()"/>
    </xsl:copy>
  </xsl:template>
  
  <!--
  	<xs:choice>s are bad. convert them to <xs:sequence>s. Currently I am ignoring @maxOccurs  on a  <xs:choice>
  	but retaining @minOccurs. 
	 -->
  <xsl:template match="xs:choice">
  	<xsl:choose>
  		<xsl:when test="@minOccurs">  		
			<xsl:element name="xs:sequence">
				<xsl:attribute name="minOccurs"><xsl:value-of select="@minOccurs"/></xsl:attribute>
		  		<xsl:apply-templates select="node()"/>
		  	</xsl:element>
  		</xsl:when>
  		<xsl:otherwise>
  			<xsl:element name="xs:sequence">
		  		<xsl:apply-templates select="node()"/>
		  	</xsl:element>
  		</xsl:otherwise>
  	</xsl:choose>
  </xsl:template>
  
  
  <!-- 
  
  	Changing 
  		<xs:sequence minOccurs="0">
  			<xs:element ref="xxx"/>
  		</xs:sequence>
  		
  	to,
  		<xs:element ref="xxx" minOccurs="0"/>
  		
  	It works, but we don't need it.
   -->
  
  <!--
  
  <xsl:template match="xs:sequence[@minOccurs='0']">
  	<xsl:variable name="minOccursValue"><xsl:value-of select="@minOccurs"/></xsl:variable>
  	<xsl:for-each select="./xs:element">
  		<xsl:copy>
  			<xsl:attribute name="minOccurs"><xsl:value-of select="$minOccursValue"/></xsl:attribute>
	      <xsl:apply-templates select="@*|node()"/>
	    </xsl:copy>
  	</xsl:for-each>
  </xsl:template>
  
	-->

<!--

	The following is trying to flattening nested <xs:sequence>s
		<xs:sequence>
			<xs:element ref="xxx"/>
			<xs:sequence>
				<xs:element ref="yyy"/>
			</xs:sequence>
		</xs:sequence> 
	
	To,
	<xs:sequence>
		<xs:element ref="xxx"/>
		<xs:element ref="yyy"/>
	</xs:sequence>
	
	Careful, when some of them has @minOccurs and the others don't.What to do? At the end of the day,it doesn't matter, because nothing is required.
 -->

<!--
  <xsl:template match="xs:sequence">
    <xsl:choose>
      <xsl:when test="name(..) = 'xs:sequence'">
        <xsl:apply-templates select="@*|node()"/>
      </xsl:when>
      <xsl:otherwise>
	    <xsl:copy>
	      <xsl:apply-templates select="@*|node()"/>
	    </xsl:copy>
      </xsl:otherwise>
    </xsl:choose>
  </xsl:template>
-->

</xsl:stylesheet>