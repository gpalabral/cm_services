package com.server.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "ADM_USUARIOS", schema = "ADM")
public class Usuario implements Serializable {

    private static final long serialVersionUID = -1;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario", nullable = false)
    private Long idUsuario;
    @Column(name = "login", length = 50, nullable = false)
    private String login;
    @Column(name = "password", length = 150)
    private String password;
    @Column(name = "estado_usuario", length = 5, nullable = false)
    private String estadoUsuario;
    @Column(name = "correo_electronico", length = 50)
    private String correoElectronico;
    @Column(name = "fecha_inicio", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaInicio;
    @Column(name = "fecha_fin", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaFin;
    @Column(name = "es_actdir", length = 5, nullable=false)
    private String esActDir;
    
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

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEstadoUsuario() {
        return estadoUsuario;
    }

    public void setEstadoUsuario(String estadoUsuario) {
        this.estadoUsuario = estadoUsuario;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

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
        hash += (idUsuario != null ? idUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.idUsuario == null && other.idUsuario != null) || (this.idUsuario != null && !this.idUsuario.equals(other.idUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "AdmUsuarios[ idUsuario=" + idUsuario + " ]";
    }

    /**
     * @return the esActDir
     */
    public String getEsActDir() {
        return esActDir;
    }

    /**
     * @param esActDir the esActDir to set
     */
    public void setEsActDir(String esActDir) {
        this.esActDir = esActDir;
    }

}
