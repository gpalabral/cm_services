package com.bap.erp.modelo.cpp;

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
@Table(name = "CPP_PROVEEDOR_CLIENTE")
public class CppProveedorCliente implements Serializable {

    private static final long serialVersionUID = ERP.serialVersionIdErp;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_proveedor_cliente", nullable = false)
    private Long idProveedorCliente;
    @Column(name = "tipo_proveedor_cliente", length = 5, nullable = false)
    private String tipoProoveedorCliente; //Natural, Juridico
    @Column(name = "razon_social", length = 50)
    private String razonSocial;
    @Column(name = "nombre", length = 50)
    private String nombre;
    @Column(name = "primer_apellido", length = 50)
    private String primerApellido;
    @Column(name = "segundo_apellido", length = 50)
    private String segundoApellido;
    @Column(name = "estado", length = 5, nullable = false)
    private String estado; //Vigente, No Vigente
    @Column(name = "tipo_registro", length = 5, nullable = false)
    private String tipoRegistro; //Proveedor. Cliente, Ambos
    @Column(name = "tipo_documento", length = 5, nullable = false)
    private String tipoDocumento; //CI, Nit, etc..
    @Column(name = "numero_documento", length = 5, nullable = false)
    private String numeroDocumento;
    @Column(name = "sigla", length = 10)
    private String sigla;
    @Column(name = "direccion", length = 50)
    private String direccion;
    @Column(name = "telefono_uno", length = 30)
    private String telefonoUno;
    @Column(name = "telefono_dos", length = 30)
    private String telefonoDos;
    @Column(name = "numero_fax", length = 30)
    private String numeroFax;
    @Column(name = "numero_celular", length = 30)
    private String numeroCelular;
    @Column(name = "correo_electronico", length = 50)
    private String correoElectronico;
    @Column(name = "direccion_web", length = 50)
    private String direccionWeb;
    @Column(name = "logo", length = 50, nullable = false)
    private String logo;
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
        hash += (idProveedorCliente != null ? idProveedorCliente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof CppProveedorCliente)) {
            return false;
        }
        CppProveedorCliente other = (CppProveedorCliente) object;
        if ((this.idProveedorCliente == null && other.idProveedorCliente != null) || (this.idProveedorCliente != null && !this.idProveedorCliente.equals(other.idProveedorCliente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CppProveedorCliente[ idProveedorCliente=" + idProveedorCliente + " ]";
    }

    public Long getIdProveedorCliente() {
        return idProveedorCliente;
    }

    public void setIdProveedorCliente(Long idProveedorCliente) {
        this.idProveedorCliente = idProveedorCliente;
    }

    public String getTipoProoveedorCliente() {
        return tipoProoveedorCliente;
    }

    public void setTipoProoveedorCliente(String tipoProoveedorCliente) {
        this.tipoProoveedorCliente = tipoProoveedorCliente;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTipoRegistro() {
        return tipoRegistro;
    }

    public void setTipoRegistro(String tipoRegistro) {
        this.tipoRegistro = tipoRegistro;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefonoUno() {
        return telefonoUno;
    }

    public void setTelefonoUno(String telefonoUno) {
        this.telefonoUno = telefonoUno;
    }

    public String getTelefonoDos() {
        return telefonoDos;
    }

    public void setTelefonoDos(String telefonoDos) {
        this.telefonoDos = telefonoDos;
    }

    public String getNumeroFax() {
        return numeroFax;
    }

    public void setNumeroFax(String numeroFax) {
        this.numeroFax = numeroFax;
    }

    public String getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCelular(String numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    public String getDireccionWeb() {
        return direccionWeb;
    }

    public void setDireccionWeb(String direccionWeb) {
        this.direccionWeb = direccionWeb;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public Date getFechaAniversario() {
        return fechaAniversario;
    }

    public void setFechaAniversario(Date fechaAniversario) {
        this.fechaAniversario = fechaAniversario;
    }

  
}
