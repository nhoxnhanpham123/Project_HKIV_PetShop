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
public interface AdminsFacadeLocal {

    void create(Admins admins);

    void edit(Admins admins);

    void remove(Admins admins);

    Admins find(Object id);

    List<Admins> findAll();

    List<Admins> findRange(int[] range);

    int count();
    
}
