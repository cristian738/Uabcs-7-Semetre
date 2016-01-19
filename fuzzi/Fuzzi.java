/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fuzzi;

import java.util.Scanner;

/**
 *
 * @author Cristian M
 */
public class Fuzzi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new Interfaz().setVisible(true);
        
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Error de Entrada Actual:");
        String entrada=lector.next();
        double valor = Double.parseDouble(entrada);
        System.out.println("Error de Entrada Pasada:");
        String entrada2=lector.next();
        double valor2 = Double.parseDouble(entrada2);

        double errorD = (valor-valor2);
        Clase ok = new Clase();
        
        System.out.println("___________________");
        System.out.println("Sumatoria:");
        System.out.println("SPG: "+ ok.spg(errorD, valor));
        System.out.println("SPP: " +  ok.spp(errorD, valor));
        System.out.println("SZ: "  +  ok.sz(errorD, valor));
        System.out.println("SNP: " +  ok.snp(errorD, valor));
        System.out.println("SNG: " + ok.sng(errorD, valor));

        System.out.println("___________________");
        System.out.println("Donde se encuentra en la matriz:");
        System.out.println(ok.diferencial(errorD,valor));
        System.out.println("___________________");
        System.out.println("Centroide");
        System.out.println(ok.centroide(errorD, valor));
        
    }
    
}
