package com.gestorvisitas.model;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "tbTrCliente")
public class TbTrVisita extends TbTrVisitaKey implements Serializable{
     
	private static final long serialVersionUID = 1L;
    private Integer proCodigo;
      
    private Integer motCodigo;

    private Integer usuCodigo;

    private Integer areCodigo;

    private Date visFecInicio;
      
    private String visLatitud;

    private String visLongitud;
      
    private Integer visLicitacion;

    private Integer visCompetencia;

    private String visDetalleOportunidad;

    private Integer visNumeroLineas;

    private Date visFecFinalizacion;

    private Date visFecComprometida;

    private String visResponsable;

    private String visDescripcion;

    private Integer visNoVisita;

    private Integer visEstado;

    private Date visFecAlta;
      
    private Date visFecBaja;
      
    private Date visFecModificacion;
      
    private String visUsuAlta;
      
    private String visUsuBaja;
      
    private String visUsuModificacion;
      
    public Integer getProCodigo() {
        return proCodigo;
    }
    @XmlElement
    public void setProCodigo(Integer proCodigo) {
        this.proCodigo = proCodigo;
    }

      
    public Integer getMotCodigo() {
        return motCodigo;
    }
    @XmlElement
    public void setMotCodigo(Integer motCodigo) {
        this.motCodigo = motCodigo;
    }


      
    public Integer getUsuCodigo() {
        return usuCodigo;
    }

    @XmlElement
    public void setUsuCodigo(Integer usuCodigo) {
        this.usuCodigo = usuCodigo;
    }

      
    public Integer getAreCodigo() {
        return areCodigo;
    }
    @XmlElement
    public void setAreCodigo(Integer areCodigo) {
        this.areCodigo = areCodigo;
    }

      
    public Date getVisFecInicio() {
        return visFecInicio;
    }
    @XmlElement
    public void setVisFecInicio(Date visFecInicio) {
        this.visFecInicio = visFecInicio;
    }
      
    public String getVisLatitud() {
        return visLatitud;
    }

    @XmlElement
    public void setVisLatitud(String visLatitud) {
        this.visLatitud = visLatitud;
    }
      
    public String getVisLongitud() {
        return visLongitud;
    }

    @XmlElement
    public void setVisLongitud(String visLongitud) {
        this.visLongitud = visLongitud;
    }

      
    public Integer getVisLicitacion() {
        return visLicitacion;
    }
    @XmlElement
    public void setVisLicitacion(Integer visLicitacion) {
        this.visLicitacion = visLicitacion;
    }

      
    public Integer getVisCompetencia() {
        return visCompetencia;
    }
    @XmlElement
    public void setVisCompetencia(Integer visCompetencia) {
        this.visCompetencia = visCompetencia;
    }

      
    public String getVisDetalleOportunidad() {
        return visDetalleOportunidad;
    }
    @XmlElement
    public void setVisDetalleOportunidad(String visDetalleOportunidad) {
        this.visDetalleOportunidad = visDetalleOportunidad;
    }
      
    public Integer getVisNumeroLineas() {
        return visNumeroLineas;
    }
    @XmlElement
    public void setVisNumeroLineas(Integer visNumeroLineas) {
        this.visNumeroLineas = visNumeroLineas;
    }
      
    public Date getVisFecFinalizacion() {
        return visFecFinalizacion;
    }
    @XmlElement
    public void setVisFecFinalizacion(Date visFecFinalizacion) {
        this.visFecFinalizacion = visFecFinalizacion;
    }
      
    public Date getVisFecComprometida() {
        return visFecComprometida;
    }
    @XmlElement
    public void setVisFecComprometida(Date visFecComprometida) {
        this.visFecComprometida = visFecComprometida;
    }
      
    public String getVisResponsable() {
        return visResponsable;
    }
    @XmlElement
    public void setVisResponsable(String visResponsable) {
        this.visResponsable = visResponsable;
    }
      
    public String getVisDescripcion() {
        return visDescripcion;
    }
    @XmlElement
    public void setVisDescripcion(String visDescripcion) {
        this.visDescripcion = visDescripcion;
    }
      
    public Integer getVisNoVisita() {
        return visNoVisita;
    }
    @XmlElement
    public void setVisNoVisita(Integer visNoVisita) {
        this.visNoVisita = visNoVisita;
    }
      
    public Integer getVisEstado() {
        return visEstado;
    }
    @XmlElement
    public void setVisEstado(Integer visEstado) {
        this.visEstado = visEstado;
    }
      
    public Date getVisFecAlta() {
        return visFecAlta;
    }
    @XmlElement
    public void setVisFecAlta(Date visFecAlta) {
        this.visFecAlta = visFecAlta;
    }

      
    public Date getVisFecBaja() {
        return visFecBaja;
    }

    @XmlElement
    public void setVisFecBaja(Date visFecBaja) {
        this.visFecBaja = visFecBaja;
    }

      
    public Date getVisFecModificacion() {
        return visFecModificacion;
    }

    @XmlElement
    public void setVisFecModificacion(Date visFecModificacion) {
        this.visFecModificacion = visFecModificacion;
    }

      
    public String getVisUsuAlta() {
        return visUsuAlta;
    }

    @XmlElement
    public void setVisUsuAlta(String visUsuAlta) {
        this.visUsuAlta = visUsuAlta;
    }

    public String getVisUsuBaja() {
        return visUsuBaja;
    }
    
    @XmlElement
    public void setVisUsuBaja(String visUsuBaja) {
        this.visUsuBaja = visUsuBaja;
    }
      
    public String getVisUsuModificacion() {
        return visUsuModificacion;
    }
 
    @XmlElement
    public void setVisUsuModificacion(String visUsuModificacion) {
        this.visUsuModificacion = visUsuModificacion;
    }

	@Override
	public String toString() {
		return "TbTrVisita [proCodigo=" + proCodigo + ", motCodigo="
				+ motCodigo + ", usuCodigo=" + usuCodigo + ", areCodigo="
				+ areCodigo + ", visFecInicio=" + visFecInicio
				+ ", visLatitud=" + visLatitud + ", visLongitud=" + visLongitud
				+ ", visLicitacion=" + visLicitacion + ", visCompetencia="
				+ visCompetencia + ", visDetalleOportunidad="
				+ visDetalleOportunidad + ", visNumeroLineas="
				+ visNumeroLineas + ", visFecFinalizacion="
				+ visFecFinalizacion + ", visFecComprometida="
				+ visFecComprometida + ", visResponsable=" + visResponsable
				+ ", visDescripcion=" + visDescripcion + ", visNoVisita="
				+ visNoVisita + ", visEstado=" + visEstado + ", visFecAlta="
				+ visFecAlta + ", visFecBaja=" + visFecBaja
				+ ", visFecModificacion=" + visFecModificacion
				+ ", visUsuAlta=" + visUsuAlta + ", visUsuBaja=" + visUsuBaja
				+ ", visUsuModificacion=" + visUsuModificacion + "]";
	}
}