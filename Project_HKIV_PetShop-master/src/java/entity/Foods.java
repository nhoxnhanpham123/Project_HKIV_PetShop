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
@Table(name = "foods", catalog = "Project_HK4_PetShop", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Foods.findAll", query = "SELECT f FROM Foods f"),
    @NamedQuery(name = "Foods.findByFId", query = "SELECT f FROM Foods f WHERE f.fId = :fId"),
    @NamedQuery(name = "Foods.findByName", query = "SELECT f FROM Foods f WHERE f.name = :name"),
    @NamedQuery(name = "Foods.findByPrice", query = "SELECT f FROM Foods f WHERE f.price = :price"),
    @NamedQuery(name = "Foods.findByImage", query = "SELECT f FROM Foods f WHERE f.image = :image"),
    @NamedQuery(name = "Foods.findByDescription", query = "SELECT f FROM Foods f WHERE f.description = :description")})
public class Foods implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "FId", nullable = false, length = 10)
    private String fId;
    @Size(max = 50)
    @Column(name = "name", length = 50)
    private String name;
    @Column(name = "price")
    private Integer price;
    @Size(max = 250)
    @Column(name = "image", length = 250)
    private String image;
    @Size(max = 200)
    @Column(name = "description", length = 200)
    private String description;
    @JoinColumn(name = "CFId", referencedColumnName = "CFId")
    @ManyToOne
    private Animals cFId;

    public Foods() {
    }

    public Foods(String fId, String name, Integer price, String image, String description, Animals cFId) {
        this.fId = fId;
        this.name = name;
        this.price = price;
        this.image = image;
        this.description = description;
        this.cFId = cFId;
    }

    public Foods(String fId) {
        this.fId = fId;
    }

    public String getFId() {
        return fId;
    }

    public void setFId(String fId) {
        this.fId = fId;
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Animals getCFId() {
        return cFId;
    }

    public void setCFId(Animals cFId) {
        this.cFId = cFId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fId != null ? fId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Foods)) {
            return false;
        }
        Foods other = (Foods) object;
        if ((this.fId == null && other.fId != null) || (this.fId != null && !this.fId.equals(other.fId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Foods[ fId=" + fId + " ]";
    }
    
}
