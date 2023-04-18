/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Menu;

import java.util.Objects;

/**
 *
 * @author mabardaji
 */
public class OptionItem {
    private String option_phrase;

    public OptionItem(String option_phrase) {
        this.option_phrase = option_phrase;
    }

    
    public String getOption_phrase() {
        return option_phrase;
    }

    public void setOption_phrase(String option_phrase) {
        this.option_phrase = option_phrase;
    }

    @Override
    public String toString() {
        return  option_phrase ;
    }
    
    
    //equals falta implementar!!!!!


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
         if (!(obj instanceof OptionItem)) {
            return false;
        }
        final OptionItem other = (OptionItem) obj;
        return 
       this.option_phrase.equalsIgnoreCase(other.option_phrase);
    }
    
}
