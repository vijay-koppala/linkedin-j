
package com.google.code.linkedinapi.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for null.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType>
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ASE"/>
 *     &lt;enumeration value="NYS"/>
 *     &lt;enumeration value="NMS"/>
 *     &lt;enumeration value="LSE"/>
 *     &lt;enumeration value="FRA"/>
 *     &lt;enumeration value="GER"/>
 *     &lt;enumeration value="PAR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "")
@XmlEnum
public enum StockExchangeCode {

    @XmlEnumValue("ASE")
    AMERICAN_STOCK_EXCHANGE("ASE"),
    @XmlEnumValue("NYS")
    NEWYORK_STOCK_EXCHANGE("NYS"),
    @XmlEnumValue("NMS")
    NASDAQ("NMS"),
    @XmlEnumValue("LSE")
    LONDON_STOCK_EXCHANGE("LSE"),
    @XmlEnumValue("FRA")
    FRANKFURT_STOCK_EXCHANGE("FRA"),
    @XmlEnumValue("GER")
    XETRA_TRADING_PLATFORM("GER"),
    @XmlEnumValue("PAR")
    EURONEXT_PARIS("PAR");
    private final String value;

    StockExchangeCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StockExchangeCode fromValue(String v) {
        for (StockExchangeCode c: StockExchangeCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
