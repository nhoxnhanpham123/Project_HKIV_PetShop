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
@Table(name = "admins", catalog = "Project_HK4_PetShop", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Admins.findAll", query = "SELECT a FROM Admins a"),
    @NamedQuery(name = "Admins.findByAId", query = "SELECT a FROM Admins a WHERE a.aId = :aId"),
    @NamedQuery(name = "Admins.findByMail", query = "SELECT a FROM Admins a WHERE a.mail = :mail"),
    @NamedQuery(name = "Admins.findByPassword", query = "SELECT a FROM Admins a WHERE a.password = :password")})
public class Admins implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "AId", nullable = false)
    private Integer aId;
    @Size(max = 20)
    @Column(name = "mail", length = 50)
    private String mail;
    @Size(max = 20)
    @Column(name = "password", length = 20)
    private String password;

    public Admins() {
    }

    public Admins(String mail, String password) {
        this.mail = mail;
        this.password = password;
    }

    public Admins(Integer aId) {
        this.aId = aId;
    }

    public Integer getAId() {
        return aId;
    }

    public void setAId(Integer aId) {
        this.aId = aId;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (aId != null ? aId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Admins)) {
            return false;
        }
        Admins other = (Admins) object;
        if ((this.aId == null && other.aId != null) || (this.aId != null && !this.aId.equals(other.aId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Admins[ aId=" + aId + " ]";
    }
    
}
