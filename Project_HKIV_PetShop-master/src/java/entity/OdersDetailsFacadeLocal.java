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
public interface OdersDetailsFacadeLocal {

    void create(OdersDetails odersDetails);

    void edit(OdersDetails odersDetails);

    void remove(OdersDetails odersDetails);

    OdersDetails find(Object id);

    List<OdersDetails> findAll();

    List<OdersDetails> findRange(int[] range);

    int count();
    
    void deleteByOrder(Orders order);
}
