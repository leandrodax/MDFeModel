//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.02 at 09:09:23 PM BRT 
//


package br.inf.portalfiscal.mdfe;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Tipo Retorno de Pedido de Consulta do Manifesto Eletrônico de Documentos Fiscais
 * 
 * <p>Java class for TRetMDFeConsultaDFe complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TRetMDFeConsultaDFe">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tpAmb" type="{http://www.portalfiscal.inf.br/mdfe}TAmb"/>
 *         &lt;element name="verAplic" type="{http://www.portalfiscal.inf.br/mdfe}TVerAplic"/>
 *         &lt;element name="cStat" type="{http://www.portalfiscal.inf.br/mdfe}TStat"/>
 *         &lt;element name="xMotivo" type="{http://www.portalfiscal.inf.br/mdfe}TMotivo"/>
 *         &lt;element name="MDFeDFe" type="{http://www.portalfiscal.inf.br/mdfe}TMDFeDFe" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="versao" use="required" type="{http://www.portalfiscal.inf.br/mdfe}TVerMDFeConsultaDFe" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TRetMDFeConsultaDFe", propOrder = {
    "tpAmb",
    "verAplic",
    "cStat",
    "xMotivo",
    "mdFeDFe"
})
public class TRetMDFeConsultaDFe {

    @XmlElement(required = true)
    protected String tpAmb;
    @XmlElement(required = true)
    protected String verAplic;
    @XmlElement(required = true)
    protected String cStat;
    @XmlElement(required = true)
    protected String xMotivo;
    @XmlElement(name = "MDFeDFe")
    protected TMDFeDFe mdFeDFe;
    @XmlAttribute(name = "versao", required = true)
    protected String versao;

    /**
     * Gets the value of the tpAmb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTpAmb() {
        return tpAmb;
    }

    /**
     * Sets the value of the tpAmb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTpAmb(String value) {
        this.tpAmb = value;
    }

    /**
     * Gets the value of the verAplic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerAplic() {
        return verAplic;
    }

    /**
     * Sets the value of the verAplic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerAplic(String value) {
        this.verAplic = value;
    }

    /**
     * Gets the value of the cStat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCStat() {
        return cStat;
    }

    /**
     * Sets the value of the cStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCStat(String value) {
        this.cStat = value;
    }

    /**
     * Gets the value of the xMotivo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXMotivo() {
        return xMotivo;
    }

    /**
     * Sets the value of the xMotivo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXMotivo(String value) {
        this.xMotivo = value;
    }

    /**
     * Gets the value of the mdFeDFe property.
     * 
     * @return
     *     possible object is
     *     {@link TMDFeDFe }
     *     
     */
    public TMDFeDFe getMDFeDFe() {
        return mdFeDFe;
    }

    /**
     * Sets the value of the mdFeDFe property.
     * 
     * @param value
     *     allowed object is
     *     {@link TMDFeDFe }
     *     
     */
    public void setMDFeDFe(TMDFeDFe value) {
        this.mdFeDFe = value;
    }

    /**
     * Gets the value of the versao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersao() {
        return versao;
    }

    /**
     * Sets the value of the versao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersao(String value) {
        this.versao = value;
    }

}
