//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.04.26 at 12:44:47 PM BRT 
//


package br.inf.portalfiscal.mdfe;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CNPJAgeNav" type="{http://www.portalfiscal.inf.br/mdfe}TCnpj"/>
 *         &lt;element name="tpEmb">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;whiteSpace value="preserve"/>
 *               &lt;pattern value="[0-9]{2}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="cEmbar">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.portalfiscal.inf.br/mdfe}TString">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="xEmbar">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.portalfiscal.inf.br/mdfe}TString">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="60"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="nViag">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;whiteSpace value="preserve"/>
 *               &lt;pattern value="[1-9]{1}[0-9]{0,9}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="cPrtEmb">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.portalfiscal.inf.br/mdfe}TString">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="cPrtDest">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.portalfiscal.inf.br/mdfe}TString">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="infTermCarreg" maxOccurs="5" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="cTermCarreg">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.portalfiscal.inf.br/mdfe}TString">
 *                         &lt;minLength value="1"/>
 *                         &lt;maxLength value="8"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="xTermCarreg">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.portalfiscal.inf.br/mdfe}TString">
 *                         &lt;minLength value="1"/>
 *                         &lt;maxLength value="60"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="infTermDescarreg" maxOccurs="5" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="cTermDescarreg">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.portalfiscal.inf.br/mdfe}TString">
 *                         &lt;minLength value="1"/>
 *                         &lt;maxLength value="8"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="xTermDescarreg">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.portalfiscal.inf.br/mdfe}TString">
 *                         &lt;minLength value="1"/>
 *                         &lt;maxLength value="60"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="infEmbComb" maxOccurs="30" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="cEmbComb">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.portalfiscal.inf.br/mdfe}TString">
 *                         &lt;minLength value="1"/>
 *                         &lt;maxLength value="10"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="infUnidCargaVazia" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="idUnidCargaVazia" type="{http://www.portalfiscal.inf.br/mdfe}TContainer"/>
 *                   &lt;element name="tpUnidCargaVazia">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.portalfiscal.inf.br/mdfe}TString">
 *                         &lt;enumeration value="1"/>
 *                         &lt;enumeration value="2"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "cnpjAgeNav",
    "tpEmb",
    "cEmbar",
    "xEmbar",
    "nViag",
    "cPrtEmb",
    "cPrtDest",
    "infTermCarreg",
    "infTermDescarreg",
    "infEmbComb",
    "infUnidCargaVazia"
})
@XmlRootElement(name = "aquav")
public class Aquav {

    @XmlElement(name = "CNPJAgeNav", required = true)
    protected String cnpjAgeNav;
    @XmlElement(required = true)
    protected String tpEmb;
    @XmlElement(required = true)
    protected String cEmbar;
    @XmlElement(required = true)
    protected String xEmbar;
    @XmlElement(required = true)
    protected String nViag;
    @XmlElement(required = true)
    protected String cPrtEmb;
    @XmlElement(required = true)
    protected String cPrtDest;
    protected List<Aquav.InfTermCarreg> infTermCarreg;
    protected List<Aquav.InfTermDescarreg> infTermDescarreg;
    protected List<Aquav.InfEmbComb> infEmbComb;
    protected List<Aquav.InfUnidCargaVazia> infUnidCargaVazia;

    /**
     * Gets the value of the cnpjAgeNav property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCNPJAgeNav() {
        return cnpjAgeNav;
    }

    /**
     * Sets the value of the cnpjAgeNav property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCNPJAgeNav(String value) {
        this.cnpjAgeNav = value;
    }

    /**
     * Gets the value of the tpEmb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTpEmb() {
        return tpEmb;
    }

    /**
     * Sets the value of the tpEmb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTpEmb(String value) {
        this.tpEmb = value;
    }

    /**
     * Gets the value of the cEmbar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCEmbar() {
        return cEmbar;
    }

    /**
     * Sets the value of the cEmbar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCEmbar(String value) {
        this.cEmbar = value;
    }

    /**
     * Gets the value of the xEmbar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXEmbar() {
        return xEmbar;
    }

    /**
     * Sets the value of the xEmbar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXEmbar(String value) {
        this.xEmbar = value;
    }

    /**
     * Gets the value of the nViag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNViag() {
        return nViag;
    }

    /**
     * Sets the value of the nViag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNViag(String value) {
        this.nViag = value;
    }

    /**
     * Gets the value of the cPrtEmb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCPrtEmb() {
        return cPrtEmb;
    }

    /**
     * Sets the value of the cPrtEmb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCPrtEmb(String value) {
        this.cPrtEmb = value;
    }

    /**
     * Gets the value of the cPrtDest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCPrtDest() {
        return cPrtDest;
    }

    /**
     * Sets the value of the cPrtDest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCPrtDest(String value) {
        this.cPrtDest = value;
    }

    /**
     * Gets the value of the infTermCarreg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the infTermCarreg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInfTermCarreg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Aquav.InfTermCarreg }
     * 
     * 
     */
    public List<Aquav.InfTermCarreg> getInfTermCarreg() {
        if (infTermCarreg == null) {
            infTermCarreg = new ArrayList<Aquav.InfTermCarreg>();
        }
        return this.infTermCarreg;
    }

    /**
     * Gets the value of the infTermDescarreg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the infTermDescarreg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInfTermDescarreg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Aquav.InfTermDescarreg }
     * 
     * 
     */
    public List<Aquav.InfTermDescarreg> getInfTermDescarreg() {
        if (infTermDescarreg == null) {
            infTermDescarreg = new ArrayList<Aquav.InfTermDescarreg>();
        }
        return this.infTermDescarreg;
    }

    /**
     * Gets the value of the infEmbComb property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the infEmbComb property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInfEmbComb().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Aquav.InfEmbComb }
     * 
     * 
     */
    public List<Aquav.InfEmbComb> getInfEmbComb() {
        if (infEmbComb == null) {
            infEmbComb = new ArrayList<Aquav.InfEmbComb>();
        }
        return this.infEmbComb;
    }

    /**
     * Gets the value of the infUnidCargaVazia property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the infUnidCargaVazia property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInfUnidCargaVazia().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Aquav.InfUnidCargaVazia }
     * 
     * 
     */
    public List<Aquav.InfUnidCargaVazia> getInfUnidCargaVazia() {
        if (infUnidCargaVazia == null) {
            infUnidCargaVazia = new ArrayList<Aquav.InfUnidCargaVazia>();
        }
        return this.infUnidCargaVazia;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="cEmbComb">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.portalfiscal.inf.br/mdfe}TString">
     *               &lt;minLength value="1"/>
     *               &lt;maxLength value="10"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "cEmbComb"
    })
    public static class InfEmbComb {

        @XmlElement(required = true)
        protected String cEmbComb;

        /**
         * Gets the value of the cEmbComb property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCEmbComb() {
            return cEmbComb;
        }

        /**
         * Sets the value of the cEmbComb property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCEmbComb(String value) {
            this.cEmbComb = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="cTermCarreg">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.portalfiscal.inf.br/mdfe}TString">
     *               &lt;minLength value="1"/>
     *               &lt;maxLength value="8"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="xTermCarreg">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.portalfiscal.inf.br/mdfe}TString">
     *               &lt;minLength value="1"/>
     *               &lt;maxLength value="60"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "cTermCarreg",
        "xTermCarreg"
    })
    public static class InfTermCarreg {

        @XmlElement(required = true)
        protected String cTermCarreg;
        @XmlElement(required = true)
        protected String xTermCarreg;

        /**
         * Gets the value of the cTermCarreg property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCTermCarreg() {
            return cTermCarreg;
        }

        /**
         * Sets the value of the cTermCarreg property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCTermCarreg(String value) {
            this.cTermCarreg = value;
        }

        /**
         * Gets the value of the xTermCarreg property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getXTermCarreg() {
            return xTermCarreg;
        }

        /**
         * Sets the value of the xTermCarreg property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setXTermCarreg(String value) {
            this.xTermCarreg = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="cTermDescarreg">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.portalfiscal.inf.br/mdfe}TString">
     *               &lt;minLength value="1"/>
     *               &lt;maxLength value="8"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="xTermDescarreg">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.portalfiscal.inf.br/mdfe}TString">
     *               &lt;minLength value="1"/>
     *               &lt;maxLength value="60"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "cTermDescarreg",
        "xTermDescarreg"
    })
    public static class InfTermDescarreg {

        @XmlElement(required = true)
        protected String cTermDescarreg;
        @XmlElement(required = true)
        protected String xTermDescarreg;

        /**
         * Gets the value of the cTermDescarreg property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCTermDescarreg() {
            return cTermDescarreg;
        }

        /**
         * Sets the value of the cTermDescarreg property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCTermDescarreg(String value) {
            this.cTermDescarreg = value;
        }

        /**
         * Gets the value of the xTermDescarreg property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getXTermDescarreg() {
            return xTermDescarreg;
        }

        /**
         * Sets the value of the xTermDescarreg property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setXTermDescarreg(String value) {
            this.xTermDescarreg = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="idUnidCargaVazia" type="{http://www.portalfiscal.inf.br/mdfe}TContainer"/>
     *         &lt;element name="tpUnidCargaVazia">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.portalfiscal.inf.br/mdfe}TString">
     *               &lt;enumeration value="1"/>
     *               &lt;enumeration value="2"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "idUnidCargaVazia",
        "tpUnidCargaVazia"
    })
    public static class InfUnidCargaVazia {

        @XmlElement(required = true)
        protected String idUnidCargaVazia;
        @XmlElement(required = true)
        protected String tpUnidCargaVazia;

        /**
         * Gets the value of the idUnidCargaVazia property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIdUnidCargaVazia() {
            return idUnidCargaVazia;
        }

        /**
         * Sets the value of the idUnidCargaVazia property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIdUnidCargaVazia(String value) {
            this.idUnidCargaVazia = value;
        }

        /**
         * Gets the value of the tpUnidCargaVazia property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTpUnidCargaVazia() {
            return tpUnidCargaVazia;
        }

        /**
         * Sets the value of the tpUnidCargaVazia property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTpUnidCargaVazia(String value) {
            this.tpUnidCargaVazia = value;
        }

    }

}
