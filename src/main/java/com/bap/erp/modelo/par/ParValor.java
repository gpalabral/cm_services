package com.bap.erp.modelo.par;

import com.bap.erp.modelo.AbstractEntity;
import com.bap.erp.modelo.ERP;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PAR_VALOR")
public class ParValor extends AbstractEntity implements Serializable {

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
