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
public interface PetsFacadeLocal {

    void create(Pets pets);

    void edit(Pets pets);

    void remove(Pets pets);

    Pets find(Object id);

    List<Pets> findAll();

    List<Pets> findRange(int[] range);

    int count();

    void deleteByAnimals(Animals animals);
    
    void deleteBYBreed(Breeds breeds);

    List<Pets> recommentPet(Breeds breeds);
    
    List<Pets> searchByName(String name);
    
    List<Pets> searchByPrice(int from, int to);
    
    List<Pets> searchByMaxPrice(int max);
    
    List<Pets> selectLimit(int a);
    
    List<Pets> selectAcc();
}
