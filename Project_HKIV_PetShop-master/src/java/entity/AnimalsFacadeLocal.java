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
public interface AnimalsFacadeLocal {

    void create(Animals animals);

    void edit(Animals animals);

    void remove(Animals animals);

    Animals find(Object id);

    List<Animals> findAll();

    List<Animals> findRange(int[] range);

    int count();
    
}
