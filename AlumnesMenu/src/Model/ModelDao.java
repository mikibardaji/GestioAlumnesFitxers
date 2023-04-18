/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bardaji
 */
public class ModelDao {
    List<Alumne> llista_clase;

    public ModelDao() {
        llista_clase = new ArrayList<Alumne>();
    }
    
    
    
    public boolean afegir(Alumne add)
    {
        if (!llista_clase.contains(add)) //tenir implementat el equals
        {
            return llista_clase.add(add);    
        }
        else
        {
            return false;
           
        }
    }

    public List<Alumne> getLlista_clase() {
        return llista_clase;
    }

    public int numAlumnesExistents() {
        return llista_clase.size();
    }
    
    /**
     * Inicialitzar llista deixantla buida
     */
    public void inicialitzarLlistaAlumnes()
    {
        llista_clase= new ArrayList<>();
    }
}
