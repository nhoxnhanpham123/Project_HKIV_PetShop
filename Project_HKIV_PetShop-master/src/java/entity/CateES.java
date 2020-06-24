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
@Table(name = "cateES", catalog = "Project_HK4_PetShop", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CateES.findAll", query = "SELECT c FROM CateES c"),
    @NamedQuery(name = "CateES.findByCEId", query = "SELECT c FROM CateES c WHERE c.cEId = :cEId"),
    @NamedQuery(name = "CateES.findByName", query = "SELECT c FROM CateES c WHERE c.name = :name")})
public class CateES implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CEId", nullable = false)
    private Integer cEId;
    @Size(max = 50)
    @Column(name = "name", length = 50)
    private String name;
    @OneToMany(mappedBy = "cEId")
    private Collection<Accessories> accessoriesCollection;

    public CateES() {
    }

    public CateES(String name) {
        this.name = name;
    }

    public CateES(Integer cEId, String name) {
        this.cEId = cEId;
        this.name = name;
    }

    public CateES(Integer cEId) {
        this.cEId = cEId;
    }

    public Integer getCEId() {
        return cEId;
    }

    public void setCEId(Integer cEId) {
        this.cEId = cEId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlTransient
    public Collection<Accessories> getAccessoriesCollection() {
        return accessoriesCollection;
    }

    public void setAccessoriesCollection(Collection<Accessories> accessoriesCollection) {
        this.accessoriesCollection = accessoriesCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cEId != null ? cEId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CateES)) {
            return false;
        }
        CateES other = (CateES) object;
        if ((this.cEId == null && other.cEId != null) || (this.cEId != null && !this.cEId.equals(other.cEId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.CateES[ cEId=" + cEId + " ]";
    }
    
}
