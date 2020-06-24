/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author NGUYEN HOANG BAO
 */
@Entity
@Table(name = "breeds", catalog = "Project_HK4_PetShop", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Breeds.findAll", query = "SELECT b FROM Breeds b"),
    @NamedQuery(name = "Breeds.findByCPId", query = "SELECT b FROM Breeds b WHERE b.cPId = :cPId"),
    @NamedQuery(name = "Breeds.findByName", query = "SELECT b FROM Breeds b WHERE b.name = :name")})
public class Breeds implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CPId", nullable = false)
    private Integer cPId;
    @Size(max = 20)
    @Column(name = "name", length = 20)
    private String name;
    @OneToMany(mappedBy = "cPId")
    private Collection<Pets> petsCollection;

    public Breeds() {
    }

    public Breeds(Integer cPId, String name, Collection<Pets> petsCollection) {
        this.cPId = cPId;
        this.name = name;
        this.petsCollection = petsCollection;
    }

    public Breeds(String name) {
        this.name = name;
    }

    public Breeds(Integer cPId) {
        this.cPId = cPId;
    }

    public Integer getCPId() {
        return cPId;
    }

    public void setCPId(Integer cPId) {
        this.cPId = cPId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Breeds(Integer cPId, String name) {
        this.cPId = cPId;
        this.name = name;
    }

    @XmlTransient
    public Collection<Pets> getPetsCollection() {
        return petsCollection;
    }

    public void setPetsCollection(Collection<Pets> petsCollection) {
        this.petsCollection = petsCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cPId != null ? cPId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Breeds)) {
            return false;
        }
        Breeds other = (Breeds) object;
        if ((this.cPId == null && other.cPId != null) || (this.cPId != null && !this.cPId.equals(other.cPId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Breeds[ cPId=" + cPId + " ]";
    }
    
}
