
package ec.edu.intsupeior.vista;

import ec.edu.intsupeior.controlador.Pais;

public class Aplicacion {
    public static void main(String[] args) {
        System.out.println("hola");
        Pais pais1= new Pais("p001","Argentina");
        Pais pais2= new Pais("p002","Brasil");
        Pais pais3= new Pais("p003","Bolivia");
        Pais pais4;
        pais4 = new Pais("p004","Chile");

        //System.out.println(pais1.getCodigoPais()+" - "+pais1.getNombrePais());
        System.out.println(pais3.toString());

    }
    
}
