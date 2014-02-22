<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
				xmlns:xs="http://www.w3.org/2001/XMLSchema" 
				version="1.0">
  <xsl:output method="xml" indent="yes"/>
  
  <xsl:template match="/xs:schema" >
  	<xs:schema xmlns:xs="http://www.w3.org/2001/XMLSchema" elementFormDefault="qualified">
  	<xsl:for-each select="./xs:element">
  		<xsl:sort select="@name"/>
  		<xsl:apply-templates select="."/>
  	</xsl:for-each>
  	<xsl:for-each select="./xs:complexType">
  		<xsl:sort select="@name"/>
  		<xsl:apply-templates select="."/>
  	</xsl:for-each>
  	</xs:schema>
  </xsl:template>
  
  <xsl:template match="/xs:schema/xs:element">
    <xsl:copy-of select="."/>
  </xsl:template>
  
  <xsl:template match="/xs:schema/xs:complexType">
    <xsl:copy-of select="."/>
  </xsl:template>
  
</xsl:stylesheet>