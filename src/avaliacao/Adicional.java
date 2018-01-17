

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author felipedania
 */
@Entity
@Table(name = "Adicional", catalog = "GerenciadorDePedidos", schema = "")
@NamedQueries({
    @NamedQuery(name = "Adicional.findAll", query = "SELECT a FROM Adicional a")
    , @NamedQuery(name = "Adicional.findByIdAdicional", query = "SELECT a FROM Adicional a WHERE a.idAdicional = :idAdicional")
    , @NamedQuery(name = "Adicional.findByValorAdicional", query = "SELECT a FROM Adicional a WHERE a.valorAdicional = :valorAdicional")
    , @NamedQuery(name = "Adicional.findByNomeAdicional", query = "SELECT a FROM Adicional a WHERE a.nomeAdicional = :nomeAdicional")
    , @NamedQuery(name = "Adicional.findByQuantidadeAdicional", query = "SELECT a FROM Adicional a WHERE a.quantidadeAdicional = :quantidadeAdicional")})
public class Adicional implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idAdicional")
    private Integer idAdicional;
    @Basic(optional = false)
    @Column(name = "valorAdicional")
    private double valorAdicional;
    @Basic(optional = false)
    @Column(name = "nomeAdicional")
    private String nomeAdicional;
    @Basic(optional = false)
    @Column(name = "quantidadeAdicional")
    private int quantidadeAdicional;

    public Adicional() {
    }

    public Adicional(Integer idAdicional) {
        this.idAdicional = idAdicional;
    }

    public Adicional(Integer idAdicional, double valorAdicional, String nomeAdicional, int quantidadeAdicional) {
        this.idAdicional = idAdicional;
        this.valorAdicional = valorAdicional;
        this.nomeAdicional = nomeAdicional;
        this.quantidadeAdicional = quantidadeAdicional;
    }

    public Integer getIdAdicional() {
        return idAdicional;
    }

    public void setIdAdicional(Integer idAdicional) {
        Integer oldIdAdicional = this.idAdicional;
        this.idAdicional = idAdicional;
        changeSupport.firePropertyChange("idAdicional", oldIdAdicional, idAdicional);
    }

    public double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        double oldValorAdicional = this.valorAdicional;
        this.valorAdicional = valorAdicional;
        changeSupport.firePropertyChange("valorAdicional", oldValorAdicional, valorAdicional);
    }

    public String getNomeAdicional() {
        return nomeAdicional;
    }

    public void setNomeAdicional(String nomeAdicional) {
        String oldNomeAdicional = this.nomeAdicional;
        this.nomeAdicional = nomeAdicional;
        changeSupport.firePropertyChange("nomeAdicional", oldNomeAdicional, nomeAdicional);
    }

    public int getQuantidadeAdicional() {
        return quantidadeAdicional;
    }

    public void setQuantidadeAdicional(int quantidadeAdicional) {
        int oldQuantidadeAdicional = this.quantidadeAdicional;
        this.quantidadeAdicional = quantidadeAdicional;
        changeSupport.firePropertyChange("quantidadeAdicional", oldQuantidadeAdicional, quantidadeAdicional);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAdicional != null ? idAdicional.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Adicional)) {
            return false;
        }
        Adicional other = (Adicional) object;
        if ((this.idAdicional == null && other.idAdicional != null) || (this.idAdicional != null && !this.idAdicional.equals(other.idAdicional))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "avaliacao.Adicional[ idAdicional=" + idAdicional + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
