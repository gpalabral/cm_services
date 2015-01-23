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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "CPP_CONTACTOS")
public class CppContactos implements Serializable {

    private static final long serialVersionUID = ERP.serialVersionIdErp;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_contacto", nullable = false)
    private Long idContacto;
    @Column(name = "tipo_contacto", length = 5, nullable = false)
    private String tipoContacto; //Gerente, ContactoComercial, ContactoDeCobroOPago
    @Column(name = "cargo", length = 30)
    private String cargo; 
    @Column(name = "telefono", length = 30)
    private String telefono;
    @Column(name = "interno", length = 30)
    private String interno;
    @Column(name = "celular", length = 30)
    private String celular;
    @Column(name = "correo_electronico", length = 50)
    private String correoElectronico;
    @Column(name = "fecha_aniversario")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAniversario;    
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
    
    @JoinColumn(name = "id_proveedor_cliente", referencedColumnName = "id_proveedor_cliente")
    @ManyToOne(optional = false)
    private CppProveedorCliente cppProveedorCliente;
    

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
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
        hash += (idContacto != null ? idContacto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof CppContactos)) {
            return false;
        }
        CppContactos other = (CppContactos) object;
        if ((this.idContacto == null && other.idContacto != null) || (this.idContacto != null && !this.idContacto.equals(other.idContacto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CppProveedorCliente[ idProveedorCliente=" + idContacto + " ]";
    }

    public Long getIdContacto() {
        return idContacto;
    }

    public void setIdContacto(Long idContacto) {
        this.idContacto = idContacto;
    }

    public String getTipoContacto() {
        return tipoContacto;
    }

    public void setTipoContacto(String tipoContacto) {
        this.tipoContacto = tipoContacto;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getInterno() {
        return interno;
    }

    public void setInterno(String interno) {
        this.interno = interno;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    

    public Date getFechaAniversario() {
        return fechaAniversario;
    }

    public void setFechaAniversario(Date fechaAniversario) {
        this.fechaAniversario = fechaAniversario;
    }

    public CppProveedorCliente getCppProveedorCliente() {
        return cppProveedorCliente;
    }

    public void setCppProveedorCliente(CppProveedorCliente cppProveedorCliente) {
        this.cppProveedorCliente = cppProveedorCliente;
    }

  
}
