/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alumnesmenu;

import Menu.Menu;
import Menu.OptionItem;
import Model.Alumne;
import Model.ModelDao;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author bardaji
 */
public class AlumnesMenu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AlumnesMenu app = new AlumnesMenu();
        
        app.run();
               
        
        
       
        
        
        
        
        
    }

    private void run() {
        Menu menu_principal = new Menu("Gestion Alumnos");
        ModelDao stock = new ModelDao();
        
        loadOptionsItem(menu_principal);
        
        menu_principal.DisplayMenu();
        int option;
        do
        {
            option = menu_principal.chooseOption();
            switch(option)
            {
                case 2: //afegir al arrayList el alumne
                    afegirAlumne(stock);
                    break;
                case 3:
                    llistarAlumne(stock);
                    break;
                case 4: //guardar fitxer objectes serialitzat
                    guardarAlumnesFitxers(stock);
                    break;
                case 5: //recuperar objectes serialitzat
                    recuperarAlumnesFitxers(stock);
                    break;
                case 1:
                    System.out.println("Sortir");
                    break;
                default:
                    System.out.println("Option no valid");
                    break;
            }
        }while(option != 1);
    }

    /**
     * Put all the options in Menú
     * @param menu_principal 
     */
    private void loadOptionsItem(Menu menu_principal) {
        menu_principal.AddOption(new OptionItem("Salir"));
        menu_principal.AddOption(new OptionItem("Añadir Alumno"));
        menu_principal.AddOption(new OptionItem("Listar Alumnos"));
        menu_principal.AddOption(new OptionItem("Guardar en fichero"));
        menu_principal.AddOption(new OptionItem("Recuperar en fichero"));
    }

    /**
     * Demanar les dades necessaries al alumne i afegir-lo al llistat
     * @param stock 
     */
    private void afegirAlumne(ModelDao stock) {
        Alumne afegir = nouAlumne();
        if (stock.afegir(afegir))
        {
            System.out.println("Alumne afegit... " + stock.numAlumnesExistents());
        }
        else
        {
            System.out.println("No s'ha afegit, possiblement ja existia");
        }
       
    }

    /**
     * Demana les dades de nou alumne al usuari i retorna un objecte alumne amb les dades informades
     * @return 
     */
    private Alumne nouAlumne() {
        //demanar dades
        String nom;
        int edat;
        String password;
        
        
        //crear objecte amb constructor
        Alumne nou_alumne=null; //falta constructor
        //retornar objecte
        return nou_alumne;
    }

    private void llistarAlumne(ModelDao stock) {
        List<Alumne> llista = stock.getLlista_clase();
        for (Object alumne_mostrar : llista) {
            System.out.println(alumne_mostrar); //te que tenir el ToString implementat
        }
        System.out.println("Alumnes mostrats " + stock.numAlumnesExistents());
    }

    private void guardarAlumnesFitxers(ModelDao stock) {
      final String Ruta = "dades\\";
      final String nom_fitxer = "posarelnomquevulguis.txt";
      //obrir fitxers
      //recuperarLlistaAlumnes
      //recorrerLlista i guardar un a un els objectes al fitxer
      //tancar fitxers
      //mostrar quants s'han guardat
      
    }

    private void recuperarAlumnesFitxers(ModelDao stock) {
        Scanner sc = new Scanner(System.in);
        final String Ruta = "dades\\";
        System.out.println("Posa el nom del fitxer sense ruta");
        String nom_fitxer = sc.nextLine();
        //TO DO
        //inicialitzar llistar dao (carregarem el fitxer a una llista buida)
        //obrir fitxer
        //recuperar objecte per object
        //afegir al Dao cada objecte
         //tancar fitxers
        //mostrar quants objectes s'han carregat
        
        //END TODO
    }
    
}
