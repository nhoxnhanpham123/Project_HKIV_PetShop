/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author NGUYEN HOANG BAO
 */
@Local
public interface AccessoriesFacadeLocal {

    void create(Accessories accessories);

    void edit(Accessories accessories);

    void remove(Accessories accessories);

    Accessories find(Object id);

    List<Accessories> findAll();

    List<Accessories> findRange(int[] range);

    int count();

    void deleteByCateEs(CateES cate);

    List<Accessories> reconmentAcc(CateES cate);

    List<Accessories> searchByName(String name);

    List<Accessories> searchByPrice(int from, int to);

    List<Accessories> searchByMaxPrice(int max);
    
    List<Accessories> selectLimit(int a);
    
    void deleteByAnimals(Animals animals);
    
    List<Accessories> selectAcc();
}
