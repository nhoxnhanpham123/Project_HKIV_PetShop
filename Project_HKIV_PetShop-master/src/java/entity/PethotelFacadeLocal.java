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
public interface PethotelFacadeLocal {

    void create(Pethotel pethotel);

    void edit(Pethotel pethotel);

    void remove(Pethotel pethotel);

    Pethotel find(Object id);

    List<Pethotel> findAll();

    List<Pethotel> findRange(int[] range);

    int count();
    
    void deleteByUser(Members members);
}
