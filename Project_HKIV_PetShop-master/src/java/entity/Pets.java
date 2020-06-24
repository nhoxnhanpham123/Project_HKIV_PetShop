/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author NGUYEN HOANG BAO
 */
@Entity
@Table(name = "pets", catalog = "Project_HK4_PetShop", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pets.findAll", query = "SELECT p FROM Pets p"),
    @NamedQuery(name = "Pets.findByPId", query = "SELECT p FROM Pets p WHERE p.pId = :pId"),
    @NamedQuery(name = "Pets.findByPName", query = "SELECT p FROM Pets p WHERE p.pName = :pName"),
    @NamedQuery(name = "Pets.findByColor", query = "SELECT p FROM Pets p WHERE p.color = :color"),
    @NamedQuery(name = "Pets.findByAge", query = "SELECT p FROM Pets p WHERE p.age = :age"),
    @NamedQuery(name = "Pets.findByGender", query = "SELECT p FROM Pets p WHERE p.gender = :gender"),
    @NamedQuery(name = "Pets.findByOrigin", query = "SELECT p FROM Pets p WHERE p.origin = :origin"),
    @NamedQuery(name = "Pets.findByPrice", query = "SELECT p FROM Pets p WHERE p.price = :price"),
    @NamedQuery(name = "Pets.findByImage", query = "SELECT p FROM Pets p WHERE p.image = :image"),
    @NamedQuery(name = "Pets.findByDescription", query = "SELECT p FROM Pets p WHERE p.description = :description")})
public class Pets implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "PId", nullable = false, length = 10)
    private String pId;
    @Size(max = 50)
    @Column(name = "pName", length = 50)
    private String pName;
    @Size(max = 20)
    @Column(name = "color", length = 20)
    private String color;
    @Column(name = "age", length = 50)
    private String age;
    @Column(name = "gender")
    private Boolean gender;
    @Size(max = 20)
    @Column(name = "origin", length = 20)
    private String origin;
    @Column(name = "price")
    private Integer price;
    @Size(max = 250)
    @Column(name = "image", length = 250)
    private String image;
    @Size(max = 250)
    @Column(name = "description", length = 250)
    private String description;
    @JoinColumn(name = "CFId", referencedColumnName = "CFId")
    @ManyToOne
    private Animals cFId;
    @JoinColumn(name = "CPId", referencedColumnName = "CPId")
    @ManyToOne
    private Breeds cPId;

    public Pets() {
    }

    public Pets(String pId, String pName, String color, String age, Boolean gender, String origin, Integer price, String image, String description, Animals cFId, Breeds cPId) {
        this.pId = pId;
        this.pName = pName;
        this.color = color;
        this.age = age;
        this.gender = gender;
        this.origin = origin;
        this.price = price;
        this.image = image;
        this.description = description;
        this.cFId = cFId;
        this.cPId = cPId;
    }
    
    public Pets(String pId) {
        this.pId = pId;
    }

    public String getPId() {
        return pId;
    }

    public void setPId(String pId) {
        this.pId = pId;
    }

    public String getPName() {
        return pName;
    }

    public void setPName(String pName) {
        this.pName = pName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
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

    public Breeds getCPId() {
        return cPId;
    }

    public void setCPId(Breeds cPId) {
        this.cPId = cPId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pId != null ? pId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pets)) {
            return false;
        }
        Pets other = (Pets) object;
        if ((this.pId == null && other.pId != null) || (this.pId != null && !this.pId.equals(other.pId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Pets[ pId=" + pId + " ]";
    }
    
}
