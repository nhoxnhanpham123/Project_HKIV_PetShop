/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author NGUYEN HOANG BAO
 */
@Entity
@Table(name = "accessories", catalog = "Project_HK4_PetShop", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Accessories.findAll", query = "SELECT a FROM Accessories a"),
    @NamedQuery(name = "Accessories.findByESId", query = "SELECT a FROM Accessories a WHERE a.eSId = :eSId"),
    @NamedQuery(name = "Accessories.findByName", query = "SELECT a FROM Accessories a WHERE a.name = :name"),
    @NamedQuery(name = "Accessories.findByPrice", query = "SELECT a FROM Accessories a WHERE a.price = :price"),
    @NamedQuery(name = "Accessories.findByDescription", query = "SELECT a FROM Accessories a WHERE a.description = :description"),
    @NamedQuery(name = "Accessories.findByImage", query = "SELECT a FROM Accessories a WHERE a.image = :image")})
public class Accessories implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "ESId", nullable = false, length = 10)
    private String eSId;
    @Size(max = 50)
    @Column(name = "name", length = 50)
    private String name;
    @Column(name = "price")
    private Integer price;
    @Size(max = 250)
    @Column(name = "description", length = 250)
    private String description;
    @Size(max = 250)
    @Column(name = "image", length = 250)
    private String image;
    @JoinColumn(name = "CFId", referencedColumnName = "CFId")
    @ManyToOne
    private Animals cFId;
    @JoinColumn(name = "CEId", referencedColumnName = "CEId")
    @ManyToOne
    private CateES cEId;

    public Accessories() {
    }

    public Accessories(String eSId) {
        this.eSId = eSId;
    }

    public Accessories(String eSId, String name, Integer price, String description, String image, Animals cFId, CateES cEId) {
        this.eSId = eSId;
        this.name = name;
        this.price = price;
        this.description = description;
        this.image = image;
        this.cFId = cFId;
        this.cEId = cEId;
    }

    public String getESId() {
        return eSId;
    }

    public void setESId(String eSId) {
        this.eSId = eSId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Animals getCFId() {
        return cFId;
    }

    public void setCFId(Animals cFId) {
        this.cFId = cFId;
    }

    public CateES getCEId() {
        return cEId;
    }

    public void setCEId(CateES cEId) {
        this.cEId = cEId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (eSId != null ? eSId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Accessories)) {
            return false;
        }
        Accessories other = (Accessories) object;
        if ((this.eSId == null && other.eSId != null) || (this.eSId != null && !this.eSId.equals(other.eSId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Accessories[ eSId=" + eSId + " ]";
    }
    
}
