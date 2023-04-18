/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Menu {
    private String title;
    private List<OptionItem> options_menu; //null


    public Menu(String title) {
        this.title = title;
        options_menu = new ArrayList<OptionItem>();
    }
    
    /**
     * A�ade la nueva opci�n al array de opciones
     * @param afegir opci�n a a�adir
     */
    public void AddOption(OptionItem afegir)
    {
        if (!options_menu.contains(afegir))
        { //si no existeix
           options_menu.add(afegir);
        }
        else
        {
            System.out.println("Opci� ja afegida");
        }

        
    }
    
    public void AddOptionByIndex(OptionItem afegir, int pos)
    {
        if (!options_menu.contains(afegir))
        { //si no existeix
            
         options_menu.add(pos, afegir);
        }
        else
        {
            System.out.println("Opci� ja afegida");
        }
        
    }
    
    
    public int NumeroOptionsMenu()
    {
        return options_menu.size();
    }
    
    
    public boolean removeOption(OptionItem delete)
    {
        return options_menu.remove(delete);
    }
     
    public OptionItem removeOptionByIndex(int delete_index)// throws IndexOutOfBoundsException
    {
        return options_menu.remove(delete_index);
    }

//    @Override
//    public String toString() {
//        StringBuilder sb = new StringBuilder();
//        sb.append("Menu{");
//        sb.append("title=").append(title);
//        sb.append(", options_menu=").append(options_menu);
//        sb.append('}');
//        return sb.toString();
//    }
    
    
    

    @Override
    public String toString() {
        StringBuilder build = new StringBuilder();
        build.append("**" + this.title + "**\n");
        build.append("------------------\n");
        for (int i = 0; i < options_menu.size(); i++) {
            build.append((i+1) + "-" + options_menu.get(i).toString() + "\n");
        }
        build.append("______________________\n");
               
        
        return build.toString();
    }
    
    public void DisplayMenu()
    {
        System.out.println(this.toString());
    }
    
    /**
     * escoge la opcion de menu escogida estara entre 1 y el nunmero maximo del men�
     * @return opcion escogida
     */
    public int chooseOption()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print
        ("Choose one option (1-" + options_menu.size() + ") : ");
        int option;
        do
        {
            option = sc.nextInt();
        }while(option<1 && option>options_menu.size());
        return option;
    }
    
    
}
