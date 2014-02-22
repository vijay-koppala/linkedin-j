
package com.google.code.linkedinapi.schema.impl;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.google.code.linkedinapi.schema.Adapter1;
import com.google.code.linkedinapi.schema.Companies;
import com.google.code.linkedinapi.schema.CompanySearch;
import com.google.code.linkedinapi.schema.Facets;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "companies",
    "numResults",
    "facets"
})
@XmlRootElement(name = "company-search")
public class CompanySearchImpl
    implements Serializable, CompanySearch
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(required = true, type = CompaniesImpl.class)
    protected CompaniesImpl companies;
    @XmlElement(name = "num-results", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Long numResults;
    @XmlElement(required = true, type = FacetsImpl.class)
    protected FacetsImpl facets;

    public Companies getCompanies() {
        return companies;
    }

    public void setCompanies(Companies value) {
        this.companies = ((CompaniesImpl) value);
    }

    public Long getNumResults() {
        return numResults;
    }

    public void setNumResults(Long value) {
        this.numResults = value;
    }

    public Facets getFacets() {
        return facets;
    }

    public void setFacets(Facets value) {
        this.facets = ((FacetsImpl) value);
    }

}
