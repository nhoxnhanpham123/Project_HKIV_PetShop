/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entity;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author NGUYEN HOANG BAO
 */
@Stateless
public class FeedbacksFacade extends AbstractFacade<Feedbacks> implements FeedbacksFacadeLocal {
    @PersistenceContext(unitName = "Project_HK4_PetShopPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public FeedbacksFacade() {
        super(Feedbacks.class);
    }

    @Override
    public void deleteByUser(Members members) {
        String query = "DELETE FROM Feedbacks f WHERE f.mId = :mId";
        Query q = em.createQuery(query);
        q.setParameter("mId", members);
        q.executeUpdate();
    }
    
}
