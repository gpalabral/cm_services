package com.bap.erp.modelo.cpp;

import com.bap.erp.modelo.AbstractEntity;
import com.bap.erp.modelo.ERP;
import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "CPP_PLAN_PAGO")
public class CppPlanPago extends AbstractEntity implements Serializable {

    private static final long serialVersionUID = ERP.serialVersionIdErp;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_plan_pago", nullable = false)
    private Long idPlanPago;
    
    @JoinColumn(name = "id_factura", referencedColumnName = "id_factura")
    @ManyToOne(optional = false)
    private CppFactura cppFactura;
    
    @Column(name = "fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;  
    
    @Column(name = "monto_primera_moneda")
    private Integer montoPrimeraMoneda;
    
    @Column(name = "monto_segunda_moneda")
    private Integer montoSegundaMoneda;
   
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPlanPago != null ? idPlanPago.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof CppPlanPago)) {
            return false;
        }
        CppPlanPago other = (CppPlanPago) object;
        if ((this.idPlanPago == null && other.idPlanPago != null) || (this.idPlanPago != null && !this.idPlanPago.equals(other.idPlanPago))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CppPlanPago[ idPlanPago=" + idPlanPago + " ]";
    }

    public Long getIdPlanPago() {
        return idPlanPago;
    }

    public void setIdPlanPago(Long idPlanPago) {
        this.idPlanPago = idPlanPago;
    }

    public CppFactura getCppFactura() {
        return cppFactura;
    }

    public void setCppFactura(CppFactura cppFactura) {
        this.cppFactura = cppFactura;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Integer getMontoPrimeraMoneda() {
        return montoPrimeraMoneda;
    }

    public void setMontoPrimeraMoneda(Integer montoPrimeraMoneda) {
        this.montoPrimeraMoneda = montoPrimeraMoneda;
    }

    public Integer getMontoSegundaMoneda() {
        return montoSegundaMoneda;
    }

    public void setMontoSegundaMoneda(Integer montoSegundaMoneda) {
        this.montoSegundaMoneda = montoSegundaMoneda;
    }

   
        
}
