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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author NGUYEN HOANG BAO
 */
@Entity
@Table(name = "feedbacks", catalog = "Project_HK4_PetShop", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Feedbacks.findAll", query = "SELECT f FROM Feedbacks f"),
    @NamedQuery(name = "Feedbacks.findByFBId", query = "SELECT f FROM Feedbacks f WHERE f.fBId = :fBId"),
    @NamedQuery(name = "Feedbacks.findByContent", query = "SELECT f FROM Feedbacks f WHERE f.content = :content")})
public class Feedbacks implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "FBId", nullable = false)
    private Integer fBId;
    @Size(max = 250)
    @Column(name = "content", length = 250)
    private String content;
    @JoinColumn(name = "MId", referencedColumnName = "MId")
    @ManyToOne
    private Members mId;

    public Feedbacks(Integer fBId, String content) {
        this.fBId = fBId;
        this.content = content;
    }

    public Feedbacks(Integer fBId, String content, Members mId) {
        this.fBId = fBId;
        this.content = content;
        this.mId = mId;
    }

    public Feedbacks(String content, Members mId) {
        this.content = content;
        this.mId = mId;
    }

    public Members getmId() {
        return mId;
    }

    public void setmId(Members mId) {
        this.mId = mId;
    }

    public Feedbacks() {
    }

    public Feedbacks(Integer fBId) {
        this.fBId = fBId;
    }

    public Integer getFBId() {
        return fBId;
    }

    public void setFBId(Integer fBId) {
        this.fBId = fBId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Members getMId() {
        return mId;
    }

    public void setMId(Members mId) {
        this.mId = mId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fBId != null ? fBId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Feedbacks)) {
            return false;
        }
        Feedbacks other = (Feedbacks) object;
        if ((this.fBId == null && other.fBId != null) || (this.fBId != null && !this.fBId.equals(other.fBId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Feedbacks[ fBId=" + fBId + " ]";
    }
    
}
