/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

/**
 *
 * @author DJ-FRAIBERTH
 */
public class vgrupo_familiar extends vpersona {
   private String embarazo_precoz;

    public vgrupo_familiar(String embarazo_precoz) {
        this.embarazo_precoz = embarazo_precoz;
    }

    public vgrupo_familiar() {
    }

    public String getEmbarazo_precoz() {
        return embarazo_precoz;
    }

    public void setEmbarazo_precoz(String embarazo_precoz) {
        this.embarazo_precoz = embarazo_precoz;
    }

   
   
   
}
