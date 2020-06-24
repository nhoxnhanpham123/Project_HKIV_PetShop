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
public class OdersDetailsFacade extends AbstractFacade<OdersDetails> implements OdersDetailsFacadeLocal {
    @PersistenceContext(unitName = "Project_HK4_PetShopPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public OdersDetailsFacade() {
        super(OdersDetails.class);
    }

    @Override
    public void deleteByOrder(Orders order) {
        String query = "DELETE FROM OdersDetails o WHERE o.oderId = :oId";
        Query q = em.createQuery(query);
        q.setParameter("oId", order);
        q.executeUpdate();
    }
    
}
