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
public class OrdersFacade extends AbstractFacade<Orders> implements OrdersFacadeLocal {
    @PersistenceContext(unitName = "Project_HK4_PetShopPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public OrdersFacade() {
        super(Orders.class);
    }

    @Override
    public Orders getOrderByUser(Members mId) {
        String query = "SELECT o FROM Orders o WHERE o.mId = :mId";
        Query q = em.createQuery(query);
        q.setParameter("mId", mId);
        return (Orders)q.getSingleResult();
    }

    @Override
    public void deleteByUser(Members mId) {
        String query = "DELETE FROM Orders o WHERE o.mId = :mId";
        Query q = em.createQuery(query);
        q.setParameter("mId", mId);
        q.executeUpdate();
    }
    
}
