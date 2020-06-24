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
public interface BreedsFacadeLocal {

    void create(Breeds breeds);

    void edit(Breeds breeds);

    void remove(Breeds breeds);

    Breeds find(Object id);

    List<Breeds> findAll();

    List<Breeds> findRange(int[] range);

    int count();
    
}
