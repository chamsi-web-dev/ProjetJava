/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.List;


/**
 *
 * @author mac
 */
public interface ICrud<T> {
    public boolean insertEntity(T o);
    public boolean UpdateEntity(T o);
    public boolean deleteEntity(T o);
    public T       displayEntityById(int id);
    public List<T> displayAllEntity();
}
