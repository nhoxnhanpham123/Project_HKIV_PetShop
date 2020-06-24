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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author NGUYEN HOANG BAO
 */
@Entity
@Table(name = "members", catalog = "Project_HK4_PetShop", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Members.findAll", query = "SELECT m FROM Members m"),
    @NamedQuery(name = "Members.findByMId", query = "SELECT m FROM Members m WHERE m.mId = :mId"),
    @NamedQuery(name = "Members.findByName", query = "SELECT m FROM Members m WHERE m.name = :name"),
    @NamedQuery(name = "Members.findByMail", query = "SELECT m FROM Members m WHERE m.mail = :mail"),
    @NamedQuery(name = "Members.findByPassword", query = "SELECT m FROM Members m WHERE m.password = :password"),
    @NamedQuery(name = "Members.findByPhone", query = "SELECT m FROM Members m WHERE m.phone = :phone"),
    @NamedQuery(name = "Members.findByAddress", query = "SELECT m FROM Members m WHERE m.address = :address")})
public class Members implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MId", nullable = false)
    private Integer mId;
    @Size(max = 50)
    @Column(name = "name", length = 50)
    private String name;
    @Size(max = 50)
    @Column(name = "mail", length = 50)
    private String mail;
    @Size(max = 20)
    @Column(name = "password", length = 20)
    private String password;
    // @Pattern(regexp="^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$", message="Invalid phone/fax format, should be as xxx-xxx-xxxx")//if the field contains phone or fax number consider using this annotation to enforce field validation
    @Size(max = 20)
    @Column(name = "phone", length = 20)
    private String phone;
    @Size(max = 50)
    @Column(name = "address", length = 50)
    private String address;
    @OneToMany(mappedBy = "mId")
    private Collection<Feedbacks> feedbacksCollection;
    @OneToMany(mappedBy = "mId")
    private Collection<Orders> ordersCollection;
    @OneToMany(mappedBy = "mId")
    private Collection<Pethotel> pethotelCollection;

    @XmlTransient
    public Collection<Pethotel> getPethotelCollection() {
        return pethotelCollection;
    }

    public void setPethotelCollection(Collection<Pethotel> pethotelCollection) {
        this.pethotelCollection = pethotelCollection;
    }
     
    @XmlTransient
    public Collection<Orders> getOrdersCollection() {
        return ordersCollection;
    }

    public void setOrdersCollection(Collection<Orders> ordersCollection) {
        this.ordersCollection = ordersCollection;
    }
    

    public Members() {
    }

    public Members(Integer mId, String name, String mail, String password, String phone, String address) {
        this.mId = mId;
        this.name = name;
        this.mail = mail;
        this.password = password;
        this.phone = phone;
        this.address = address;
    }

    public Members(Integer mId) {
        this.mId = mId;
    }

    public Integer getMId() {
        return mId;
    }

    public void setMId(Integer mId) {
        this.mId = mId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Members(String name, String mail, String password, String phone, String address) {
        this.name = name;
        this.mail = mail;
        this.password = password;
        this.phone = phone;
        this.address = address;
    }

    @XmlTransient
    public Collection<Feedbacks> getFeedbacksCollection() {
        return feedbacksCollection;
    }

    public void setFeedbacksCollection(Collection<Feedbacks> feedbacksCollection) {
        this.feedbacksCollection = feedbacksCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mId != null ? mId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Members)) {
            return false;
        }
        Members other = (Members) object;
        if ((this.mId == null && other.mId != null) || (this.mId != null && !this.mId.equals(other.mId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Members[ mId=" + mId + " ]";
    }
    
}
