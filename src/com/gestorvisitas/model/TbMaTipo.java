package com.gestorvisitas.model;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name = "tbMaTipo")
public class TbMaTipo implements Serializable{
	
	private static final long serialVersionUID = 1L;
    private Integer tipCodigo;

    private Integer mtiCodigo;

    private String tipNombre;

    private String tipDescripcion;

    private Integer tibEstado;

    private Date tipFecAlta;

    private Date tipFechaBaja;

    private Date tipFecModificacion;

    private String tipUsuAlta;

    private String tipUsuBaja;

    private String tipUsuModificacion;

    public Integer getTipCodigo() {
        return tipCodigo;
    }
    @XmlElement
    public void setTipCodigo(Integer tipCodigo) {
        this.tipCodigo = tipCodigo;
    }

    public Integer getMtiCodigo() {
        return mtiCodigo;
    }
    @XmlElement
    public void setMtiCodigo(Integer mtiCodigo) {
        this.mtiCodigo = mtiCodigo;
    }

    public String getTipNombre() {
        return tipNombre;
    }
    @XmlElement
    public void setTipNombre(String tipNombre) {
        this.tipNombre = tipNombre;
    }

    public String getTipDescripcion() {
        return tipDescripcion;
    }
    @XmlElement
    public void setTipDescripcion(String tipDescripcion) {
        this.tipDescripcion = tipDescripcion;
    }

    public Integer getTibEstado() {
        return tibEstado;
    }
    @XmlElement
    public void setTibEstado(Integer tibEstado) {
        this.tibEstado = tibEstado;
    }

    public Date getTipFecAlta() {
        return tipFecAlta;
    }
    @XmlElement
    public void setTipFecAlta(Date tipFecAlta) {
        this.tipFecAlta = tipFecAlta;
    }

    public Date getTipFechaBaja() {
        return tipFechaBaja;
    }
    @XmlElement
    public void setTipFechaBaja(Date tipFechaBaja) {
        this.tipFechaBaja = tipFechaBaja;
    }

    public Date getTipFecModificacion() {
        return tipFecModificacion;
    }
    @XmlElement
    public void setTipFecModificacion(Date tipFecModificacion) {
        this.tipFecModificacion = tipFecModificacion;
    }

    public String getTipUsuAlta() {
        return tipUsuAlta;
    }
    @XmlElement
    public void setTipUsuAlta(String tipUsuAlta) {
        this.tipUsuAlta = tipUsuAlta;
    }

    public String getTipUsuBaja() {
        return tipUsuBaja;
    }
    @XmlElement
    public void setTipUsuBaja(String tipUsuBaja) {
        this.tipUsuBaja = tipUsuBaja;
    }

    public String getTipUsuModificacion() {
        return tipUsuModificacion;
    }
    @XmlElement
    public void setTipUsuModificacion(String tipUsuModificacion) {
        this.tipUsuModificacion = tipUsuModificacion;
    }

	@Override
	public String toString() {
		return "TbMaTipo [tipCodigo=" + tipCodigo + ", mtiCodigo=" + mtiCodigo
				+ ", tipNombre=" + tipNombre + ", tipDescripcion="
				+ tipDescripcion + ", tibEstado=" + tibEstado + ", tipFecAlta="
				+ tipFecAlta + ", tipFechaBaja=" + tipFechaBaja
				+ ", tipFecModificacion=" + tipFecModificacion
				+ ", tipUsuAlta=" + tipUsuAlta + ", tipUsuBaja=" + tipUsuBaja
				+ ", tipUsuModificacion=" + tipUsuModificacion + "]";
	}
    
    
    
}