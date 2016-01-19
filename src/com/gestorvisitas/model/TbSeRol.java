package com.gestorvisitas.model;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name="tbSeRol")
public class TbSeRol implements Serializable{
	private static final long serialVersionUID = 1L;
    private Integer rolCodigo;
    private String rolNombre;
    private String rolDescripcion;
    private Integer rolGerarquia;
    private Integer rolEstado;
    private Date rolFecAlta;
    private Date rolFecBaja;
    private Date rolFecModificacion;
    private String rolUsuAlta;
    private String rolUsuBaja;
    private String rolUsuModificacion;
    
    public Integer getRolCodigo() {
        return rolCodigo;
    }
    @XmlElement
    public void setRolCodigo(Integer rolCodigo) {
        this.rolCodigo = rolCodigo;
    }

    public String getRolNombre() {
        return rolNombre;
    }
    @XmlElement
    public void setRolNombre(String rolNombre) {
        this.rolNombre = rolNombre;
    }

    public String getRolDescripcion() {
        return rolDescripcion;
    }
    @XmlElement
    public void setRolDescripcion(String rolDescripcion) {
        this.rolDescripcion = rolDescripcion;
    }

    public Integer getRolGerarquia() {
        return rolGerarquia;
    }
    @XmlElement
    public void setRolGerarquia(Integer rolGerarquia) {
        this.rolGerarquia = rolGerarquia;
    }

    public Integer getRolEstado() {
        return rolEstado;
    }
    @XmlElement
    public void setRolEstado(Integer rolEstado) {
        this.rolEstado = rolEstado;
    }

    public Date getRolFecAlta() {
        return rolFecAlta;
    }
    @XmlElement
    public void setRolFecAlta(Date rolFecAlta) {
        this.rolFecAlta = rolFecAlta;
    }

    public Date getRolFecBaja() {
        return rolFecBaja;
    }
    @XmlElement
    public void setRolFecBaja(Date rolFecBaja) {
        this.rolFecBaja = rolFecBaja;
    }

    public Date getRolFecModificacion() {
        return rolFecModificacion;
    }
    @XmlElement
    public void setRolFecModificacion(Date rolFecModificacion) {
        this.rolFecModificacion = rolFecModificacion;
    }

    public String getRolUsuAlta() {
        return rolUsuAlta;
    }
    @XmlElement
    public void setRolUsuAlta(String rolUsuAlta) {
        this.rolUsuAlta = rolUsuAlta;
    }

    public String getRolUsuBaja() {
        return rolUsuBaja;
    }
    @XmlElement
    public void setRolUsuBaja(String rolUsuBaja) {
        this.rolUsuBaja = rolUsuBaja;
    }

    public String getRolUsuModificacion() {
        return rolUsuModificacion;
    }
    @XmlElement
    public void setRolUsuModificacion(String rolUsuModificacion) {
        this.rolUsuModificacion = rolUsuModificacion;
    }

	@Override
	public String toString() {
		return "TbSeRol [rolCodigo=" + rolCodigo + ", rolNombre=" + rolNombre
				+ ", rolDescripcion=" + rolDescripcion + ", rolGerarquia="
				+ rolGerarquia + ", rolEstado=" + rolEstado + ", rolFecAlta="
				+ rolFecAlta + ", rolFecBaja=" + rolFecBaja
				+ ", rolFecModificacion=" + rolFecModificacion
				+ ", rolUsuAlta=" + rolUsuAlta + ", rolUsuBaja=" + rolUsuBaja
				+ ", rolUsuModificacion=" + rolUsuModificacion + "]";
	}
    
    
}