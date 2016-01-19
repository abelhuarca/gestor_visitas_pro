package com.gestorvisitas.model;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name = "tbSeUsuario")
public class TbSeUsuario implements Serializable{
	private static final long serialVersionUID = 1L;
    private Integer usuCodigo;
    private Integer rolCodigo;
    private String usuNombre;
    private String usuCorreo;
    private String usuPassword;
    private Integer usuTipo;
    private Integer usuEstado;
    private Date usuFecAlta;
    private Date usuFecBaja;
    private Date usuFecModificacion;
    private String usuUsuBaja;
    private String usuUsuAlta;
    private String usuUsuModificación;
    public Integer getUsuCodigo() {
        return usuCodigo;
    }
    @XmlElement
    public void setUsuCodigo(Integer usuCodigo) {
        this.usuCodigo = usuCodigo;
    }

    public Integer getRolCodigo() {
        return rolCodigo;
    }
    @XmlElement
    public void setRolCodigo(Integer rolCodigo) {
        this.rolCodigo = rolCodigo;
    }

    public String getUsuNombre() {
        return usuNombre;
    }
    @XmlElement
    public void setUsuNombre(String usuNombre) {
        this.usuNombre = usuNombre;
    }

    public String getUsuCorreo() {
        return usuCorreo;
    }
    @XmlElement
    public void setUsuCorreo(String usuCorreo) {
        this.usuCorreo = usuCorreo;
    }

    public String getUsuPassword() {
        return usuPassword;
    }
    @XmlElement
    public void setUsuPassword(String usuPassword) {
        this.usuPassword = usuPassword;
    }

    public Integer getUsuTipo() {
        return usuTipo;
    }
    @XmlElement
    public void setUsuTipo(Integer usuTipo) {
        this.usuTipo = usuTipo;
    }

    public Integer getUsuEstado() {
        return usuEstado;
    }
    @XmlElement
    public void setUsuEstado(Integer usuEstado) {
        this.usuEstado = usuEstado;
    }

    public Date getUsuFecAlta() {
        return usuFecAlta;
    }
    @XmlElement
    public void setUsuFecAlta(Date usuFecAlta) {
        this.usuFecAlta = usuFecAlta;
    }

    public Date getUsuFecBaja() {
        return usuFecBaja;
    }
    @XmlElement
    public void setUsuFecBaja(Date usuFecBaja) {
        this.usuFecBaja = usuFecBaja;
    }

    public Date getUsuFecModificacion() {
        return usuFecModificacion;
    }
    @XmlElement
    public void setUsuFecModificacion(Date usuFecModificacion) {
        this.usuFecModificacion = usuFecModificacion;
    }

    public String getUsuUsuBaja() {
        return usuUsuBaja;
    }
    @XmlElement
    public void setUsuUsuBaja(String usuUsuBaja) {
        this.usuUsuBaja = usuUsuBaja;
    }

    public String getUsuUsuAlta() {
        return usuUsuAlta;
    }
    @XmlElement
    public void setUsuUsuAlta(String usuUsuAlta) {
        this.usuUsuAlta = usuUsuAlta;
    }

    public String getUsuUsuModificación() {
        return usuUsuModificación;
    }
    @XmlElement
    public void setUsuUsuModificación(String usuUsuModificación) {
        this.usuUsuModificación = usuUsuModificación;
    }

	@Override
	public String toString() {
		return "TbSeUsuario [usuCodigo=" + usuCodigo + ", rolCodigo="
				+ rolCodigo + ", usuNombre=" + usuNombre + ", usuCorreo="
				+ usuCorreo + ", usuPassword=" + usuPassword + ", usuTipo="
				+ usuTipo + ", usuEstado=" + usuEstado + ", usuFecAlta="
				+ usuFecAlta + ", usuFecBaja=" + usuFecBaja
				+ ", usuFecModificacion=" + usuFecModificacion
				+ ", usuUsuBaja=" + usuUsuBaja + ", usuUsuAlta=" + usuUsuAlta
				+ ", usuUsuModificación=" + usuUsuModificación + "]";
	}
    
    
}