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
public interface CateESFacadeLocal {

    void create(CateES cateES);

    void edit(CateES cateES);

    void remove(CateES cateES);

    CateES find(Object id);

    List<CateES> findAll();

    List<CateES> findRange(int[] range);

    int count();
    
}
