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
@Table(name = "animals", catalog = "Project_HK4_PetShop", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Animals.findAll", query = "SELECT a FROM Animals a"),
    @NamedQuery(name = "Animals.findByCFId", query = "SELECT a FROM Animals a WHERE a.cFId = :cFId"),
    @NamedQuery(name = "Animals.findByName", query = "SELECT a FROM Animals a WHERE a.name = :name")})
public class Animals implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CFId", nullable = false)
    private Integer cFId;
    @Size(max = 20)
    @Column(name = "name", length = 20)
    private String name;
    @OneToMany(mappedBy = "cFId")
    private Collection<Pets> petsCollection;
    @OneToMany(mappedBy = "cFId")
    private Collection<Foods> foodsCollection;
    @OneToMany(mappedBy = "cFId")
    private Collection<Accessories> accessoriesCollection;

    public Animals() {
    }

    public Animals(Integer cFId, String name, Collection<Pets> petsCollection, Collection<Foods> foodsCollection, Collection<Accessories> accessoriesCollection) {
        this.cFId = cFId;
        this.name = name;
        this.petsCollection = petsCollection;
        this.foodsCollection = foodsCollection;
        this.accessoriesCollection = accessoriesCollection;
    }

    public Animals(String name) {
        this.name = name;
    }

    public Animals(Integer cFId) {
        this.cFId = cFId;
    }

    public Integer getCFId() {
        return cFId;
    }

    public void setCFId(Integer cFId) {
        this.cFId = cFId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animals(Integer cFId, String name) {
        this.cFId = cFId;
        this.name = name;
    }

    @XmlTransient
    public Collection<Pets> getPetsCollection() {
        return petsCollection;
    }

    public void setPetsCollection(Collection<Pets> petsCollection) {
        this.petsCollection = petsCollection;
    }

    @XmlTransient
    public Collection<Foods> getFoodsCollection() {
        return foodsCollection;
    }

    public void setFoodsCollection(Collection<Foods> foodsCollection) {
        this.foodsCollection = foodsCollection;
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
        hash += (cFId != null ? cFId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Animals)) {
            return false;
        }
        Animals other = (Animals) object;
        if ((this.cFId == null && other.cFId != null) || (this.cFId != null && !this.cFId.equals(other.cFId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Animals[ cFId=" + cFId + " ]";
    }
    
}
