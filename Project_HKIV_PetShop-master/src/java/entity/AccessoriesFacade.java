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
public class AccessoriesFacade extends AbstractFacade<Accessories> implements AccessoriesFacadeLocal {
    @PersistenceContext(unitName = "Project_HK4_PetShopPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AccessoriesFacade() {
        super(Accessories.class);
    }

    @Override
    public void deleteByCateEs(CateES cate) {
        String query = "DELETE FROM Accessories a WHERE a.cEId = :cate";
        Query q = em.createQuery(query);
        q.setParameter("cate", cate);
        q.executeUpdate();
    }

    @Override
    public List<Accessories> reconmentAcc(CateES cate) {
        String query = "SELECT a FROM Accessories a WHERE a.cEId = :cate";
        Query q = em.createQuery(query).setMaxResults(5);
        q.setParameter("cate", cate);
        return q.getResultList();
    }

    @Override
    public List<Accessories> searchByName(String name) {
        String query = "SELECT a FROM Accessories a WHERE a.name LIKE :name";
        Query q = em.createQuery(query);
        q.setParameter("name", "%"+name+"%");
        return q.getResultList();
    }

    @Override
    public List<Accessories> searchByPrice(int from, int to) {
        String query = "SELECT a FROM Accessories a WHERE a.price >= :from and a.price <= :to";
        Query q = em.createQuery(query);
        q.setParameter("from", from);
        q.setParameter("to", to);
        return q.getResultList();
    }

    @Override
    public List<Accessories> searchByMaxPrice(int max) {
        String query = "SELECT a FROM Accessories a WHERE a.price >= :max";
        Query q = em.createQuery(query);
        q.setParameter("max", max);
        return q.getResultList();
    }

    @Override
    public List<Accessories> selectLimit(int a) {
        String query = "SELECT a FROM Accessories a";
        Query q = em.createQuery(query).setMaxResults(a);
        return q.getResultList();
    }

    @Override
    public void deleteByAnimals(Animals animals) {
        String query = "DELETE FROM Accessories a WHERE a.cFId = :cFId";
        Query q = em.createQuery(query);
        q.setParameter("cFId", animals);
        q.executeUpdate();
    }

    @Override
    public List<Accessories> selectAcc() {
        String query = "SELECT f FROM Accessories f ORDER BY f.price DESC";
        Query q = em.createQuery(query).setMaxResults(5);
        return q.getResultList();
    }
    
    
}
