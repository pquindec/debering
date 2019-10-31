/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertir;

import java.util.Scanner;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/** 
 *
 * @author usuario
 */
public class Numero_Letras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
  }    
    public String convercion (int numero){
       String res = "";
        String unidades [] = {"cero", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve"};
        String decenaEspecial [] = {"once", "doce", "trece", "catorce", "quince", "dieciseis", "diecisiete", "dieciocho", "diecinueve"};
        String decena [] = {"diez", "veinte", "treinta", "cuarenta", "cincuenta", "sesenta", "setenta", "ochenta", "noventa"};
        String centena [] = {"ciento", "doscientos", "trescientos", "cuatrocientos", "quinientos", "seiscientos", "setecientos", "ochocientos", "novecientos"};      
        if (numero < 1000){
            String d1;
            String d2;
            String d3;
            String numtexto = numero +" "+" ";
            d1 = numtexto.substring(0,1);
            System.out.println(d1);
            d2 = numtexto.substring(1,2);
            System.out.println(d2);
            d3 = numtexto.substring(2,3);
            System.out.println(d3);
            if(numero <= 10){
                if(numero < 10){
                    res = unidades[numero];
                }else{
                    res = decena[Integer.parseInt(d2)];
                }
            }else if(numero < 20){
                numero -= 11;
                res = decenaEspecial[numero];
            } else if(numero < 100 ){
                if(Integer.parseInt(d2) == 0){
                 numero /= 10;
                 res = decena[numero-1];
            }else res = decena[Integer.parseInt(d1)-1]+ " y " + unidades[Integer.parseInt(d2)];
            }   else if(numero < 1000){
                if (Integer.parseInt(d2)==0 && Integer.parseInt(d3)==0)
                    res = "cien";
                    else if( Integer.parseInt(d3) == 0 )
                             res= centena[Integer.parseInt(d1)-1] +" "+ decena[Integer.parseInt(d2)-1];
                        else if( Integer.parseInt(d2)== 0)
                              res= centena[Integer.parseInt(d1)-1] +" "+ unidades[Integer.parseInt(d3)];
                              else if(Integer.parseInt(d1)== 1 &&Integer.parseInt(d2)== 1 && Integer.parseInt(d3)<=9)
                                  res= centena[Integer.parseInt(d1)-1] +" "+ decenaEspecial[Integer.parseInt(d3)-1];
                                    else res = centena[Integer.parseInt(d1)-1] +" "+ decena[Integer.parseInt(d2)-1] +" y "+unidades[Integer.parseInt(d3)];
            }   
        }else
            res="Mil";
        JOptionPane.showMessageDialog(null, res);
    return res;
    }
}