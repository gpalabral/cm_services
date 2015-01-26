package com.bap.erp.modelo.cpp;

import com.bap.erp.modelo.AbstractEntity;
import com.bap.erp.modelo.ERP;
import com.bap.erp.modelo.par.ParPeriodo;
import com.bap.erp.modelo.par.ParTipoDocumentoMercantil;
import com.bap.erp.modelo.par.ParTipoMoneda;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "CPP_CONCEPTO")
public class CppConcepto extends AbstractEntity implements Serializable {

    private static final long serialVersionUID = ERP.serialVersionIdErp;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_concepto", nullable = false)
    private Long idConcepto;
    
    @Column(name = "id_cnt_entidad", length = 50, nullable = false)
    private Long idCntEntidad;
    
    @JoinColumn(name = "id_grupo", referencedColumnName = "id_grupo")
    @ManyToOne(optional = false)
    private CppGrupo cppGrupo;
    
    @ManyToOne()    
    @JoinColumn(name = "par_tipo_documento_mercantil",referencedColumnName = "codigo",nullable=true,foreignKey = @ForeignKey(name="none"))
    private ParTipoDocumentoMercantil parTipoDocumentoMercantil; //Factura, Nota de Debito, Recibo, etc...
          
    @Column(name = "tiene_factura", length = 1, nullable = false)
    private String tieneFactura;
    
    @Column(name = "monto", length = 30)
    private String monto;
    
    @Column(name = "numero_cuotas", length = 30)
    private Long numeroCuotas;
    
    @ManyToOne()    
    @JoinColumn(name = "par_periodo",referencedColumnName = "codigo",nullable=true,foreignKey = @ForeignKey(name="none"))
    private ParPeriodo parPeriodo; //Mensual, Bimestral, Trimestral, Semestral, Anual
    
    @ManyToOne()    
    @JoinColumn(name = "par_tipo_moneda",referencedColumnName = "codigo",nullable=true,foreignKey = @ForeignKey(name="none"))
    private ParTipoMoneda parTipoMoneda;//Bolivianos, Dolares
    
    @Column(name = "retencion", length = 30)
    private String retencion;
    
    @Column(name = "grossing", length = 30)
    private String grossing;    
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idConcepto != null ? idConcepto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof CppConcepto)) {
            return false;
        }
        CppConcepto other = (CppConcepto) object;
        if ((this.idConcepto == null && other.idConcepto != null) || (this.idConcepto != null && !this.idConcepto.equals(other.idConcepto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CppConcepto[ idConcepto=" + idConcepto + " ]";
    }

    public Long getIdConcepto() {
        return idConcepto;
    }

    public void setIdConcepto(Long idConcepto) {
        this.idConcepto = idConcepto;
    }    

    public Long getIdCntEntidad() {
        return idCntEntidad;
    }

    public void setIdCntEntidad(Long idCntEntidad) {
        this.idCntEntidad = idCntEntidad;
    }

    public CppGrupo getCppGrupo() {
        return cppGrupo;
    }

    public void setCppGrupo(CppGrupo cppGrupo) {
        this.cppGrupo = cppGrupo;
    }

    public ParTipoDocumentoMercantil getParTipoDocumentoMercantil() {
        return parTipoDocumentoMercantil;
    }

    public void setParTipoDocumentoMercantil(ParTipoDocumentoMercantil parTipoDocumentoMercantil) {
        this.parTipoDocumentoMercantil = parTipoDocumentoMercantil;
    }

    public String getTieneFactura() {
        return tieneFactura;
    }

    public void setTieneFactura(String tieneFactura) {
        this.tieneFactura = tieneFactura;
    }

    public String getMonto() {
        return monto;
    }

    public void setMonto(String monto) {
        this.monto = monto;
    }

    public Long getNumeroCuotas() {
        return numeroCuotas;
    }

    public void setNumeroCuotas(Long numeroCuotas) {
        this.numeroCuotas = numeroCuotas;
    }

    public ParPeriodo getParPeriodo() {
        return parPeriodo;
    }

    public void setParPeriodo(ParPeriodo parPeriodo) {
        this.parPeriodo = parPeriodo;
    }

    public ParTipoMoneda getParTipoMoneda() {
        return parTipoMoneda;
    }

    public void setParTipoMoneda(ParTipoMoneda parTipoMoneda) {
        this.parTipoMoneda = parTipoMoneda;
    }

    public String getRetencion() {
        return retencion;
    }

    public void setRetencion(String retencion) {
        this.retencion = retencion;
    }

    public String getGrossing() {
        return grossing;
    }

    public void setGrossing(String grossing) {
        this.grossing = grossing;
    }
    
}
