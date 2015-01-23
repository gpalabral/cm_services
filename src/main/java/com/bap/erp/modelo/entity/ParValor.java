package com.bap.erp.modelo.entity;

import com.bap.erp.modelo.ERP;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "PAR_VALOR")
public class ParValor implements Serializable {

    private static final long serialVersionUID = ERP.serialVersionIdErp;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_par_valor", nullable = false)
    private Long idParValor;
    
    @Column(name = "codigo", length = 5)
    private String codigo;     
    
    @Column(name = "descripcion", length = 50)
    private String descripcion;     
    
    @Column(name = "contexto", length = 30)
    private String contexto;     
    
    @Column(name = "valor", length = 30)
    private String valor;     
    
    @Column(name = "fecha_alta", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAlta;
    
    @Column(name = "usuario_alta", length = 50, nullable = false)
    private String usuarioAlta;
    
    @Column(name = "fecha_modificacion", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaModificacion;    
    
    @Column(name = "usuario_modificacion", length = 50, nullable=false)
    private String usuarioModificacion;
    
    @Column(name = "fecha_baja")
    @Temporal(TemporalType.TIMESTAMP)
    
    private Date fechaBaja;    
    @Column(name = "usuario_baja", length = 50)
    private String usuarioBaja;    
    
    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public String getUsuarioAlta() {
        return usuarioAlta;
    }

    public void setUsuarioAlta(String usuarioAlta) {
        this.usuarioAlta = usuarioAlta;
    }

    public Date getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    public String getUsuarioModificacion() {
        return usuarioModificacion;
    }

    public void setUsuarioModificacion(String usuarioModificacion) {
        this.usuarioModificacion = usuarioModificacion;
    }

    public Date getFechaBaja() {
        return fechaBaja;
    }

    public void setFechaBaja(Date fechaBaja) {
        this.fechaBaja = fechaBaja;
    }

    public String getUsuarioBaja() {
        return usuarioBaja;
    }

    public void setUsuarioBaja(String usuarioBaja) {
        this.usuarioBaja = usuarioBaja;
    }  

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idParValor != null ? idParValor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof ParValor)) {
            return false;
        }
        ParValor other = (ParValor) object;
        if ((this.idParValor == null && other.idParValor != null) || (this.idParValor != null && !this.idParValor.equals(other.idParValor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CppProveedorCliente[ idProveedorCliente=" + idParValor + " ]";
    }

    public Long getIdContacto() {
        return idParValor;
    }

    public void setIdContacto(Long idContacto) {
        this.idParValor = idContacto;
    }

    public Long getIdParValor() {
        return idParValor;
    }

    public void setIdParValor(Long idParValor) {
        this.idParValor = idParValor;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getContexto() {
        return contexto;
    }

    public void setContexto(String contexto) {
        this.contexto = contexto;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
     
    
}
