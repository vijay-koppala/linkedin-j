
package com.google.code.linkedinapi.schema.impl;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.google.code.linkedinapi.schema.StockExchange;
import com.google.code.linkedinapi.schema.StockExchangeCode;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "code",
    "name"
})
@XmlRootElement(name = "stock-exchange")
public class StockExchangeImpl
    implements Serializable, StockExchange
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(required = true)
    protected StockExchangeCode code;
    @XmlElement(required = true)
    protected String name;

    public StockExchangeCode getCode() {
        return code;
    }

    public void setCode(StockExchangeCode value) {
        this.code = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

}
