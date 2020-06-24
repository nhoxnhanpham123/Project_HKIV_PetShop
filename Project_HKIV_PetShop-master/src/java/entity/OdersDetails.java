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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author NGUYEN HOANG BAO
 */
@Entity
@Table(name = "odersDetails", catalog = "Project_HK4_PetShop", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OdersDetails.findAll", query = "SELECT o FROM OdersDetails o"),
    @NamedQuery(name = "OdersDetails.findByOdId", query = "SELECT o FROM OdersDetails o WHERE o.odId = :odId"),
    @NamedQuery(name = "OdersDetails.findByProductId", query = "SELECT o FROM OdersDetails o WHERE o.productId = :productId"),
    @NamedQuery(name = "OdersDetails.findByProductPrice", query = "SELECT o FROM OdersDetails o WHERE o.productPrice = :productPrice"),
    @NamedQuery(name = "OdersDetails.findByQuantity", query = "SELECT o FROM OdersDetails o WHERE o.quantity = :quantity")})
public class OdersDetails implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "odId", nullable = false)
    private Integer odId;
    @Size(max = 10)
    @Column(name = "productId", length = 10)
    private String productId;
    @Column(name = "productName", length = 50)
    private String productName;
    @Column(name = "productPrice")
    private Integer productPrice;
    @Column(name = "quantity")
    private Integer quantity;
    @Column(name = "image", length = 50)
    private String image;
    @JoinColumn(name = "oderId", referencedColumnName = "oderId")
    @ManyToOne
    private Orders oderId;

    public OdersDetails() {
    }

    public OdersDetails(Integer odId, String productId, String productName, Integer productPrice, Integer quantity, String image, Orders oderId) {
        this.odId = odId;
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.quantity = quantity;
        this.image = image;
        this.oderId = oderId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public OdersDetails(String productId, String productName, Integer productPrice, Integer quantity, String image, Orders oderId) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.quantity = quantity;
        this.image = image;
        this.oderId = oderId;
    }

   

    public OdersDetails(Integer odId) {
        this.odId = odId;
    }

    public Integer getOdId() {
        return odId;
    }

    public void setOdId(Integer odId) {
        this.odId = odId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public Integer getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Integer productPrice) {
        this.productPrice = productPrice;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Orders getOderId() {
        return oderId;
    }

    public void setOderId(Orders oderId) {
        this.oderId = oderId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (odId != null ? odId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OdersDetails)) {
            return false;
        }
        OdersDetails other = (OdersDetails) object;
        if ((this.odId == null && other.odId != null) || (this.odId != null && !this.odId.equals(other.odId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.OdersDetails[ odId=" + odId + " ]";
    }
    
}
