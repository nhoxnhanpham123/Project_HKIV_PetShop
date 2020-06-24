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
public interface FoodsFacadeLocal {

    void create(Foods foods);

    void edit(Foods foods);

    void remove(Foods foods);

    Foods find(Object id);

    List<Foods> findAll();

    List<Foods> findRange(int[] range);

    int count();
    
    List<Foods> recommentFood(Animals animals);
    
    List<Foods> searchByName(String name);
    
    List<Foods> searchByPrice(int from, int to);
    
    List<Foods> searchByMaxPrice(int max);
    
    List<Foods> selectLimit(int a);
    
    void deleteByAnimals(Animals animals);
    
    List<Foods> selectAcc();
}
