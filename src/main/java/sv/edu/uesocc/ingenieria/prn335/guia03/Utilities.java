/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.uesocc.ingenieria.prn335.guia03;

import javax.ejb.LocalBean;
import javax.enterprise.context.Dependent;

/**
 *
 * @author PC23
 */

@LocalBean
@Dependent
public class Utilities {
     public String getResume(String texto) {

     String frase = "" ; 
     if (texto.length()>=30){
     frase=frase+texto.substring(0,20);
             } else{ frase=frase+texto ;
     }
        return "";
}
    public String capitalizar(String texto){

    if (texto.length() == 0 ) {
		return texto;
	}
	return texto.substring(0, 1).toUpperCase() +
                 texto.substring(1).toLowerCase();
   }

    public int contarCoincidencias(String frase[], String texto[]){

    

      String frase_Aux[] = new String[frase.length];

        String cadenaAux="";
        for(int i=0;i<frase.length;i++)
        {
            frase_Aux = frase[i].split(texto[i]);
            cadenaAux+=frase_Aux[i];
        }

    return 0;

    }
    
    
}
