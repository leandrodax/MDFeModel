//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.10.12 at 05:11:22 PM BRT 
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
 *         &lt;element name="trem">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="xPref">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.portalfiscal.inf.br/mdfe}TString">
 *                         &lt;minLength value="1"/>
 *                         &lt;maxLength value="10"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="dhTrem" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;pattern value="(((20(([02468][048])|([13579][26]))-02-29))|(20[0-9][0-9])-((((0[1-9])|(1[0-2]))-((0[1-9])|(1\d)|(2[0-8])))|((((0[13578])|(1[02]))-31)|(((0[1,3-9])|(1[0-2]))-(29|30)))))T(20|21|22|23|[0-1]\d):[0-5]\d:[0-5]\d"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="xOri">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.portalfiscal.inf.br/mdfe}TString">
 *                         &lt;minLength value="1"/>
 *                         &lt;maxLength value="3"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="xDest">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.portalfiscal.inf.br/mdfe}TString">
 *                         &lt;minLength value="1"/>
 *                         &lt;maxLength value="3"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="qVag">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;pattern value="[1-9]{1}[0-9]{0,2}"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="vag" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="serie">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.portalfiscal.inf.br/mdfe}TString">
 *                         &lt;length value="3"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="nVag">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;whiteSpace value="preserve"/>
 *                         &lt;minLength value="1"/>
 *                         &lt;maxLength value="8"/>
 *                         &lt;pattern value="[1-9]{1}[0-9]{0,7}"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="nSeq" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;whiteSpace value="preserve"/>
 *                         &lt;pattern value="[1-9]{1}[0-9]{0,2}"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="TU" type="{http://www.portalfiscal.inf.br/mdfe}TDec_0303"/>
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
    "trem",
    "vag"
})
@XmlRootElement(name = "ferrov")
public class Ferrov {

    @XmlElement(required = true)
    protected Ferrov.Trem trem;
    @XmlElement(required = true)
    protected List<Ferrov.Vag> vag;

    /**
     * Gets the value of the trem property.
     * 
     * @return
     *     possible object is
     *     {@link Ferrov.Trem }
     *     
     */
    public Ferrov.Trem getTrem() {
        return trem;
    }

    /**
     * Sets the value of the trem property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ferrov.Trem }
     *     
     */
    public void setTrem(Ferrov.Trem value) {
        this.trem = value;
    }

    /**
     * Gets the value of the vag property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vag property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVag().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Ferrov.Vag }
     * 
     * 
     */
    public List<Ferrov.Vag> getVag() {
        if (vag == null) {
            vag = new ArrayList<Ferrov.Vag>();
        }
        return this.vag;
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
     *         &lt;element name="xPref">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.portalfiscal.inf.br/mdfe}TString">
     *               &lt;minLength value="1"/>
     *               &lt;maxLength value="10"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="dhTrem" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;pattern value="(((20(([02468][048])|([13579][26]))-02-29))|(20[0-9][0-9])-((((0[1-9])|(1[0-2]))-((0[1-9])|(1\d)|(2[0-8])))|((((0[13578])|(1[02]))-31)|(((0[1,3-9])|(1[0-2]))-(29|30)))))T(20|21|22|23|[0-1]\d):[0-5]\d:[0-5]\d"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="xOri">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.portalfiscal.inf.br/mdfe}TString">
     *               &lt;minLength value="1"/>
     *               &lt;maxLength value="3"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="xDest">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.portalfiscal.inf.br/mdfe}TString">
     *               &lt;minLength value="1"/>
     *               &lt;maxLength value="3"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="qVag">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;pattern value="[1-9]{1}[0-9]{0,2}"/>
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
        "xPref",
        "dhTrem",
        "xOri",
        "xDest",
        "qVag"
    })
    public static class Trem {

        @XmlElement(required = true)
        protected String xPref;
        protected String dhTrem;
        @XmlElement(required = true)
        protected String xOri;
        @XmlElement(required = true)
        protected String xDest;
        @XmlElement(required = true)
        protected String qVag;

        /**
         * Gets the value of the xPref property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getXPref() {
            return xPref;
        }

        /**
         * Sets the value of the xPref property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setXPref(String value) {
            this.xPref = value;
        }

        /**
         * Gets the value of the dhTrem property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDhTrem() {
            return dhTrem;
        }

        /**
         * Sets the value of the dhTrem property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDhTrem(String value) {
            this.dhTrem = value;
        }

        /**
         * Gets the value of the xOri property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getXOri() {
            return xOri;
        }

        /**
         * Sets the value of the xOri property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setXOri(String value) {
            this.xOri = value;
        }

        /**
         * Gets the value of the xDest property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getXDest() {
            return xDest;
        }

        /**
         * Sets the value of the xDest property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setXDest(String value) {
            this.xDest = value;
        }

        /**
         * Gets the value of the qVag property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getQVag() {
            return qVag;
        }

        /**
         * Sets the value of the qVag property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setQVag(String value) {
            this.qVag = value;
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
     *         &lt;element name="serie">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.portalfiscal.inf.br/mdfe}TString">
     *               &lt;length value="3"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="nVag">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;whiteSpace value="preserve"/>
     *               &lt;minLength value="1"/>
     *               &lt;maxLength value="8"/>
     *               &lt;pattern value="[1-9]{1}[0-9]{0,7}"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="nSeq" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;whiteSpace value="preserve"/>
     *               &lt;pattern value="[1-9]{1}[0-9]{0,2}"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="TU" type="{http://www.portalfiscal.inf.br/mdfe}TDec_0303"/>
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
        "serie",
        "nVag",
        "nSeq",
        "tu"
    })
    public static class Vag {

        @XmlElement(required = true)
        protected String serie;
        @XmlElement(required = true)
        protected String nVag;
        protected String nSeq;
        @XmlElement(name = "TU", required = true)
        protected String tu;

        /**
         * Gets the value of the serie property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSerie() {
            return serie;
        }

        /**
         * Sets the value of the serie property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSerie(String value) {
            this.serie = value;
        }

        /**
         * Gets the value of the nVag property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNVag() {
            return nVag;
        }

        /**
         * Sets the value of the nVag property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNVag(String value) {
            this.nVag = value;
        }

        /**
         * Gets the value of the nSeq property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNSeq() {
            return nSeq;
        }

        /**
         * Sets the value of the nSeq property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNSeq(String value) {
            this.nSeq = value;
        }

        /**
         * Gets the value of the tu property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTU() {
            return tu;
        }

        /**
         * Sets the value of the tu property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTU(String value) {
            this.tu = value;
        }

    }

}
