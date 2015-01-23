package com.bap.erp.modelo.entity;

import com.bap.erp.modelo.ERP;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "CPP_GRUPO")
public class CppGrupo implements Serializable {

    private static final long serialVersionUID = ERP.serialVersionIdErp;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_grupo", nullable = false)
    private Long idGrupo;
    @Column(name = "nombre", length = 50)
    private String nombre;

    @ManyToOne()
    @JoinColumn(name = "par_recurrencia", 
                referencedColumnName = "codigo")
    private ParRecurrencia parRecurrencia;

    @ManyToOne
    @JoinColumn(name = "par_tipo_grupo", referencedColumnName = "codigo")
    private ParTipoGrupo parTipoGrupo;

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
        hash += (idGrupo != null ? idGrupo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof CppGrupo)) {
            return false;
        }
        CppGrupo other = (CppGrupo) object;
        if ((this.idGrupo == null && other.idGrupo != null) || (this.idGrupo != null && !this.idGrupo.equals(other.idGrupo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CppProveedorCliente[ idProveedorCliente=" + idGrupo + " ]";
    }

    public Long getIdContacto() {
        return idGrupo;
    }

    public void setIdContacto(Long idContacto) {
        this.idGrupo = idContacto;
    }

    public Long getIdGrupo() {
        return idGrupo;
    }

    public void setIdGrupo(Long idGrupo) {
        this.idGrupo = idGrupo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ParRecurrencia getParRecurrencia() {
        return parRecurrencia;
    }

    public void setParRecurrencia(ParRecurrencia parRecurrencia) {
        this.parRecurrencia = parRecurrencia;
    }

    public ParTipoGrupo getParTipoGrupo() {
        return parTipoGrupo;
    }

    public void setParTipoGrupo(ParTipoGrupo parTipoGrupo) {
        this.parTipoGrupo = parTipoGrupo;
    }
    
    

}
