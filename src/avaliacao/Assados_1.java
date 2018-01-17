

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
@Table(name = "Assados", catalog = "GerenciadorDePedidos", schema = "")
@NamedQueries({
    @NamedQuery(name = "Assados_1.findAll", query = "SELECT a FROM Assados_1 a")
    , @NamedQuery(name = "Assados_1.findByIdAssados", query = "SELECT a FROM Assados_1 a WHERE a.idAssados = :idAssados")
    , @NamedQuery(name = "Assados_1.findByValorAssado", query = "SELECT a FROM Assados_1 a WHERE a.valorAssado = :valorAssado")
    , @NamedQuery(name = "Assados_1.findByNomeAssado", query = "SELECT a FROM Assados_1 a WHERE a.nomeAssado = :nomeAssado")
    , @NamedQuery(name = "Assados_1.findByQuantidadeAssado", query = "SELECT a FROM Assados_1 a WHERE a.quantidadeAssado = :quantidadeAssado")})
public class Assados_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idAssados")
    private Integer idAssados;
    @Basic(optional = false)
    @Column(name = "valorAssado")
    private double valorAssado;
    @Basic(optional = false)
    @Column(name = "nomeAssado")
    private String nomeAssado;
    @Basic(optional = false)
    @Column(name = "quantidadeAssado")
    private int quantidadeAssado;

    public Assados_1() {
    }

    public Assados_1(Integer idAssados) {
        this.idAssados = idAssados;
    }

    public Assados_1(Integer idAssados, double valorAssado, String nomeAssado, int quantidadeAssado) {
        this.idAssados = idAssados;
        this.valorAssado = valorAssado;
        this.nomeAssado = nomeAssado;
        this.quantidadeAssado = quantidadeAssado;
    }

    public Integer getIdAssados() {
        return idAssados;
    }

    public void setIdAssados(Integer idAssados) {
        Integer oldIdAssados = this.idAssados;
        this.idAssados = idAssados;
        changeSupport.firePropertyChange("idAssados", oldIdAssados, idAssados);
    }

    public double getValorAssado() {
        return valorAssado;
    }

    public void setValorAssado(double valorAssado) {
        double oldValorAssado = this.valorAssado;
        this.valorAssado = valorAssado;
        changeSupport.firePropertyChange("valorAssado", oldValorAssado, valorAssado);
    }

    public String getNomeAssado() {
        return nomeAssado;
    }

    public void setNomeAssado(String nomeAssado) {
        String oldNomeAssado = this.nomeAssado;
        this.nomeAssado = nomeAssado;
        changeSupport.firePropertyChange("nomeAssado", oldNomeAssado, nomeAssado);
    }

    public int getQuantidadeAssado() {
        return quantidadeAssado;
    }

    public void setQuantidadeAssado(int quantidadeAssado) {
        int oldQuantidadeAssado = this.quantidadeAssado;
        this.quantidadeAssado = quantidadeAssado;
        changeSupport.firePropertyChange("quantidadeAssado", oldQuantidadeAssado, quantidadeAssado);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAssados != null ? idAssados.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Assados_1)) {
            return false;
        }
        Assados_1 other = (Assados_1) object;
        if ((this.idAssados == null && other.idAssados != null) || (this.idAssados != null && !this.idAssados.equals(other.idAssados))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "avaliacao.Assados_1[ idAssados=" + idAssados + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
