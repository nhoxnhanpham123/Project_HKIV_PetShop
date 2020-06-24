/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entity;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author NGUYEN HOANG BAO
 */
@Stateless
public class FoodsFacade extends AbstractFacade<Foods> implements FoodsFacadeLocal {
    @PersistenceContext(unitName = "Project_HK4_PetShopPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public FoodsFacade() {
        super(Foods.class);
    }

    @Override
    public List<Foods> recommentFood(Animals animals) {
        String query = "SELECT f FROM Foods f WHERE f.cFId = :animals";
        Query q = em.createQuery(query).setMaxResults(5);
        q.setParameter("animals", animals);
        return q.getResultList();
    }

    @Override
    public List<Foods> searchByName(String name) {
        String query = "SELECT f FROM Foods f WHERE f.name LIKE :name";
        Query q = em.createQuery(query);
        q.setParameter("name", "%"+name+"%");
        return q.getResultList();
    }

    @Override
    public List<Foods> searchByPrice(int from, int to) {
        String query = "SELECT f FROM Foods f WHERE f.price >= :from AND f.price <= :to";
        Query q = em.createQuery(query);
        q.setParameter("from", from);
        q.setParameter("to", to);
        return q.getResultList();
    }

    @Override
    public List<Foods> searchByMaxPrice(int max) {
        String query = "SELECT f FROM Foods f WHERE f.price >= :max";
        Query q = em.createQuery(query);
        q.setParameter("max", max);
        return q.getResultList();
    }

    @Override
    public List<Foods> selectLimit(int a) {
        String query = "SELECT f FROM Foods f";
        Query q = em.createQuery(query).setMaxResults(a);
        return q.getResultList();
    }

    @Override
    public void deleteByAnimals(Animals animals) {
        String query = "DELETE FROM Foods f WHERE f.cFId = :cFId";
        Query q = em.createQuery(query);
        q.setParameter("cFId", animals);
        q.executeUpdate();
    }

    @Override
    public List<Foods> selectAcc() {
        String query = "SELECT f FROM Foods f ORDER BY f.price DESC";
        Query q = em.createQuery(query).setMaxResults(5);
        return q.getResultList();
    }
    
    
    
}
