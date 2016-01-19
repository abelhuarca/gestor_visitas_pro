package com.gestorvisitas.model;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name = "tbTrCliente")
public class TbTrCliente implements Serializable{
	private static final long serialVersionUID = 1L;
    private Integer cliRuc;

    private String cliRazonSocial;

    private String cliSector;

    private String cliGerenteGeneral;

    private String cliContacto;

    private String cliDireccion;

    private String cliTelefono;

    private String cliCorreo;

    private Integer cliEstado;

    private Date cliFecAlta;

    private Date cliFecBaja;

    private Date cliFecModificacion;

    private String cliUsuAlta;

    private String cliUsuBaja;

    private String cliUsuModificacion;

    public Integer getCliRuc() {
        return cliRuc;
    }
    @XmlElement
    public void setCliRuc(Integer cliRuc) {
        this.cliRuc = cliRuc;
    }

    public String getCliRazonSocial() {
        return cliRazonSocial;
    }
    @XmlElement
    public void setCliRazonSocial(String cliRazonSocial) {
        this.cliRazonSocial = cliRazonSocial;
    }

    public String getCliSector() {
        return cliSector;
    }
    @XmlElement
    public void setCliSector(String cliSector) {
        this.cliSector = cliSector;
    }

    public String getCliGerenteGeneral() {
        return cliGerenteGeneral;
    }
    @XmlElement
    public void setCliGerenteGeneral(String cliGerenteGeneral) {
        this.cliGerenteGeneral = cliGerenteGeneral;
    }

    public String getCliContacto() {
        return cliContacto;
    }
    @XmlElement
    public void setCliContacto(String cliContacto) {
        this.cliContacto = cliContacto;
    }

    public String getCliDireccion() {
        return cliDireccion;
    }
    @XmlElement
    public void setCliDireccion(String cliDireccion) {
        this.cliDireccion = cliDireccion;
    }

    public String getCliTelefono() {
        return cliTelefono;
    }
    @XmlElement
    public void setCliTelefono(String cliTelefono) {
        this.cliTelefono = cliTelefono;
    }

    public String getCliCorreo() {
        return cliCorreo;
    }
    @XmlElement
    public void setCliCorreo(String cliCorreo) {
        this.cliCorreo = cliCorreo;
    }

    public Integer getCliEstado() {
        return cliEstado;
    }
    @XmlElement
    public void setCliEstado(Integer cliEstado) {
        this.cliEstado = cliEstado;
    }

    public Date getCliFecAlta() {
        return cliFecAlta;
    }
    @XmlElement
    public void setCliFecAlta(Date cliFecAlta) {
        this.cliFecAlta = cliFecAlta;
    }

    public Date getCliFecBaja() {
        return cliFecBaja;
    }
    @XmlElement
    public void setCliFecBaja(Date cliFecBaja) {
        this.cliFecBaja = cliFecBaja;
    }

    public Date getCliFecModificacion() {
        return cliFecModificacion;
    }
    @XmlElement
    public void setCliFecModificacion(Date cliFecModificacion) {
        this.cliFecModificacion = cliFecModificacion;
    }

    public String getCliUsuAlta() {
        return cliUsuAlta;
    }
    @XmlElement
    public void setCliUsuAlta(String cliUsuAlta) {
        this.cliUsuAlta = cliUsuAlta;
    }

    public String getCliUsuBaja() {
        return cliUsuBaja;
    }
    @XmlElement
    public void setCliUsuBaja(String cliUsuBaja) {
        this.cliUsuBaja = cliUsuBaja;
    }

    public String getCliUsuModificacion() {
        return cliUsuModificacion;
    }
    @XmlElement
    public void setCliUsuModificacion(String cliUsuModificacion) {
        this.cliUsuModificacion = cliUsuModificacion;
    }

	@Override
	public String toString() {
		return "TbTrCliente [cliRuc=" + cliRuc + ", cliRazonSocial="
				+ cliRazonSocial + ", cliSector=" + cliSector
				+ ", cliGerenteGeneral=" + cliGerenteGeneral + ", cliContacto="
				+ cliContacto + ", cliDireccion=" + cliDireccion
				+ ", cliTelefono=" + cliTelefono + ", cliCorreo=" + cliCorreo
				+ ", cliEstado=" + cliEstado + ", cliFecAlta=" + cliFecAlta
				+ ", cliFecBaja=" + cliFecBaja + ", cliFecModificacion="
				+ cliFecModificacion + ", cliUsuAlta=" + cliUsuAlta
				+ ", cliUsuBaja=" + cliUsuBaja + ", cliUsuModificacion="
				+ cliUsuModificacion + "]";
	}
    
    
}