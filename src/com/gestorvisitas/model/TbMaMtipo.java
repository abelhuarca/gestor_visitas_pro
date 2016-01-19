package com.gestorvisitas.model;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "tbMaMtipo")
public class TbMaMtipo implements Serializable{
	private static final long serialVersionUID = 1L;
    private Integer mtiCodigo;
    private String mtiNombre;
    private String mtiDescripcion;
    private Integer mtiEstado;
    private Date mtiFecAlta;
    private Date mtiFecBaja;
    private Date mtiFecModificacion;
    private String mtiUsuAlta;
    private String mtiUsuBaja;
    private String mtiUsuModificacion;
    public Integer getMtiCodigo() {
        return mtiCodigo;
    }
    @XmlElement
    public void setMtiCodigo(Integer mtiCodigo) {
        this.mtiCodigo = mtiCodigo;
    }

    public String getMtiNombre() {
        return mtiNombre;
    }
    @XmlElement
    public void setMtiNombre(String mtiNombre) {
        this.mtiNombre = mtiNombre;
    }

    public String getMtiDescripcion() {
        return mtiDescripcion;
    }
    @XmlElement
    public void setMtiDescripcion(String mtiDescripcion) {
        this.mtiDescripcion = mtiDescripcion;
    }

    public Integer getMtiEstado() {
        return mtiEstado;
    }
    @XmlElement
    public void setMtiEstado(Integer mtiEstado) {
        this.mtiEstado = mtiEstado;
    }

    public Date getMtiFecAlta() {
        return mtiFecAlta;
    }
    @XmlElement
    public void setMtiFecAlta(Date mtiFecAlta) {
        this.mtiFecAlta = mtiFecAlta;
    }

    public Date getMtiFecBaja() {
        return mtiFecBaja;
    }
    @XmlElement
    public void setMtiFecBaja(Date mtiFecBaja) {
        this.mtiFecBaja = mtiFecBaja;
    }

    public Date getMtiFecModificacion() {
        return mtiFecModificacion;
    }
    @XmlElement
    public void setMtiFecModificacion(Date mtiFecModificacion) {
        this.mtiFecModificacion = mtiFecModificacion;
    }

    public String getMtiUsuAlta() {
        return mtiUsuAlta;
    }
    @XmlElement
    public void setMtiUsuAlta(String mtiUsuAlta) {
        this.mtiUsuAlta = mtiUsuAlta;
    }

    public String getMtiUsuBaja() {
        return mtiUsuBaja;
    }
    @XmlElement
    public void setMtiUsuBaja(String mtiUsuBaja) {
        this.mtiUsuBaja = mtiUsuBaja;
    }

    public String getMtiUsuModificacion() {
        return mtiUsuModificacion;
    }
    @XmlElement
    public void setMtiUsuModificacion(String mtiUsuModificacion) {
        this.mtiUsuModificacion = mtiUsuModificacion;
    }

	@Override
	public String toString() {
		return "TbMaMtipo [mtiCodigo=" + mtiCodigo + ", mtiNombre=" + mtiNombre
				+ ", mtiDescripcion=" + mtiDescripcion + ", mtiEstado="
				+ mtiEstado + ", mtiFecAlta=" + mtiFecAlta + ", mtiFecBaja="
				+ mtiFecBaja + ", mtiFecModificacion=" + mtiFecModificacion
				+ ", mtiUsuAlta=" + mtiUsuAlta + ", mtiUsuBaja=" + mtiUsuBaja
				+ ", mtiUsuModificacion=" + mtiUsuModificacion + "]";
	}
    
    
}