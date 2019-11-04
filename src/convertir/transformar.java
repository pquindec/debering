/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertir;

import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class transformar {
    

 public String convercion (int numero){
       String res="";
        String unidades [] = {"cero", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve"};
        String decenaEspecial [] = {"once", "doce", "trece", "catorce", "quince", "dieciseis", "diecisiete", "dieciocho", "diecinueve"};
        String decena [] = {"diez", "veinte", "treinta", "cuarenta", "cincuenta", "sesenta", "setenta", "ochenta", "noventa"};
        String centena [] = {"ciento", "doscientos", "trescientos", "cuatrocientos", "quinientos", "seiscientos", "setecientos", "ochocientos", "novecientos"};      
        if ( numero >=0 && numero < 100000){
            String d1;
            String d2;
            String d3;
            String d4;
            String d5;
            String numtexto = numero +" "+" "+" "+" ";
            d1 = numtexto.substring(0,1);
            System.out.println(d1);
            d2 = numtexto.substring(1,2);
            System.out.println(d2);
            d3 = numtexto.substring(2,3);
            System.out.println(d3);
            d4 = numtexto.substring(3,4);
            System.out.println(d4);
            d5 = numtexto.substring(4,5);
            System.out.println(d5);
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
                if (Integer.parseInt(d1)==1 &&Integer.parseInt(d2)==0 && Integer.parseInt(d3)==0)
                    res = "cien";
                    else if( Integer.parseInt(d2)<1 &&Integer.parseInt(d2)==0 && Integer.parseInt(d3)==0)
                        res= centena[Integer.parseInt(d1)-1];
                    else if( Integer.parseInt(d3) == 0 )
                             res= centena[Integer.parseInt(d1)-1] +" "+ decena[Integer.parseInt(d2)-1];
                        else if( Integer.parseInt(d2)== 0)
                              res= centena[Integer.parseInt(d1)-1] +" "+ unidades[Integer.parseInt(d3)];
                              else if(Integer.parseInt(d1)== 1 &&Integer.parseInt(d2)== 1 && Integer.parseInt(d3)<=9)
                                  res= centena[Integer.parseInt(d1)-1] +" "+ decenaEspecial[Integer.parseInt(d3)-1];
                                    else res = centena[Integer.parseInt(d1)-1] +" "+ decena[Integer.parseInt(d2)-1] +" y "+unidades[Integer.parseInt(d3)];
            }else if(numero < 10000){
                if ( Integer.parseInt(d1)==1 && Integer.parseInt(d2)==0 &&Integer.parseInt(d3)==0 && Integer.parseInt(d4)==0)
                    res= "Mil";
                else if ( Integer.parseInt(d1)==1 && Integer.parseInt(d2)==1 &&Integer.parseInt(d3)==0 && Integer.parseInt(d4)==0)
                    res = "Mil cien";
                    else if ( Integer.parseInt(d1)==1 && Integer.parseInt(d2)<=9 &&Integer.parseInt(d3)==0 && Integer.parseInt(d4)==0)
                    res = "Mil "+centena[Integer.parseInt(d2)-1];
                    else  if(Integer.parseInt(d1)<= 1&&Integer.parseInt(d2)==0 && Integer.parseInt(d4)== 0 )
                        res = "Mil " + decena[Integer.parseInt(d3)-1];
                        else if(Integer.parseInt(d1)<= 1&&Integer.parseInt(d2)==0 && Integer.parseInt(d3)== 0)
                            res= "Mil "+ unidades[Integer.parseInt(d4)];
                                else if(Integer.parseInt(d1)== 1 &&Integer.parseInt(d2)== 0 && Integer.parseInt(d3)==1 && Integer.parseInt(d4)<=9 )
                                       res= "Mil "+ decenaEspecial[Integer.parseInt(d4)-1];
                                else if(Integer.parseInt(d1)== 1 &&Integer.parseInt(d2)== 0 && Integer.parseInt(d3) <= 9 && Integer.parseInt(d3) <= 9 && Integer.parseInt(d4)<=9 )       
                                        res = "Mil "+ " "+ decena[Integer.parseInt(d3)-1]+ " y "+unidades[Integer.parseInt(d4)];
                                else if( Integer.parseInt(d1)== 1 &&Integer.parseInt(d2)<= 9 &&Integer.parseInt(d3)==0 && Integer.parseInt(d4)<=9)
                                        res = "Mil "+" "+centena[Integer.parseInt(d2)-1]+ " "+unidades[Integer.parseInt(d4)];
                               else if( Integer.parseInt(d1)== 1 &&Integer.parseInt(d2)<= 9 && Integer.parseInt(d3)<=9 && Integer.parseInt(d4)==0)
                                    res= "Mil "+centena[Integer.parseInt(d2)-1]+" "+decena[Integer.parseInt(d3)-1];
                                else if( Integer.parseInt(d1)== 1 &&Integer.parseInt(d2)<= 9 && Integer.parseInt(d3)==1 && Integer.parseInt(d4)<=9)
                                    res= "Mil "+centena[Integer.parseInt(d2)-1]+" "+decenaEspecial[Integer.parseInt(d4)-1];
                                else  if( Integer.parseInt(d1)<= 1 &&Integer.parseInt(d2)<= 9 && Integer.parseInt(d3)<=9 && Integer.parseInt(d4)<=9)
                                    res= "Mil "+centena[Integer.parseInt(d2)-1]+" "+decena[Integer.parseInt(d3)-1]+" y "+unidades[Integer.parseInt(d4)];
                                //
                                else  if ( Integer.parseInt(d1)>1 && Integer.parseInt(d2)==0 &&Integer.parseInt(d3)==0 && Integer.parseInt(d4)==0)
                                    res = unidades[Integer.parseInt(d1)]+" mil ";
                                else if ( Integer.parseInt(d1)>1 && Integer.parseInt(d2)==1 &&Integer.parseInt(d3)==0 && Integer.parseInt(d4)==0)
                                    res = unidades[Integer.parseInt(d1)]+" mil cien";
                                    else if ( Integer.parseInt(d1)>1 && Integer.parseInt(d2)<=9 &&Integer.parseInt(d3)==0 && Integer.parseInt(d4)==0)
                                     res = unidades[Integer.parseInt(d1)]+" mil "+centena[Integer.parseInt(d2)-1];
                                else  if(Integer.parseInt(d1)> 1&&Integer.parseInt(d2)==0 && Integer.parseInt(d4)== 0 )
                                    res =unidades[Integer.parseInt(d1)]+" mil "+decena[Integer.parseInt(d3)-1];
                                else if(Integer.parseInt(d1)> 1&&Integer.parseInt(d2)==0 && Integer.parseInt(d3)== 0)
                                    res= unidades[Integer.parseInt(d1)]+" mil "+unidades[Integer.parseInt(d4)]; 
                                else if(Integer.parseInt(d1)> 1 &&Integer.parseInt(d2)== 0 && Integer.parseInt(d3)==1 && Integer.parseInt(d4)<=9 )
                                       res=unidades[Integer.parseInt(d1)]+" mil "+decenaEspecial[Integer.parseInt(d4)-1];
                                else if(Integer.parseInt(d1)> 1 &&Integer.parseInt(d2)== 0 && Integer.parseInt(d3) <= 9 && Integer.parseInt(d3) <= 9 && Integer.parseInt(d4)<=9 )       
                                        res = unidades[Integer.parseInt(d1)]+" mil "+ decena[Integer.parseInt(d3)-1]+ " y "+unidades[Integer.parseInt(d4)];
                                else if( Integer.parseInt(d1)> 1 &&Integer.parseInt(d2)<= 9 &&Integer.parseInt(d3)==0 && Integer.parseInt(d4)<=9)
                                        res = unidades[Integer.parseInt(d1)]+" mil "+centena[Integer.parseInt(d2)-1]+ " "+unidades[Integer.parseInt(d4)];
                                else if( Integer.parseInt(d1)> 1 &&Integer.parseInt(d2)<= 9 && Integer.parseInt(d3)<=9 && Integer.parseInt(d4)==0)
                                    res= unidades[Integer.parseInt(d1)]+" mil "+centena[Integer.parseInt(d2)-1]+" "+decena[Integer.parseInt(d3)-1];
                                else if( Integer.parseInt(d1)> 1 &&Integer.parseInt(d2)<= 9 && Integer.parseInt(d3)==1 && Integer.parseInt(d4)<=9)
                                    res= unidades[Integer.parseInt(d1)]+" mil "+centena[Integer.parseInt(d2)-1]+" "+decenaEspecial[Integer.parseInt(d4)-1];
                                else  if( Integer.parseInt(d1)> 1 &&Integer.parseInt(d2)<= 9 && Integer.parseInt(d3)<=9 && Integer.parseInt(d4)<=9)
                                    res= unidades[Integer.parseInt(d1)]+" mil "+centena[Integer.parseInt(d2)-1]+" "+decena[Integer.parseInt(d3)-1]+" y "+unidades[Integer.parseInt(d4)];
            }else if(numero < 100000){
                if ( Integer.parseInt(d1)==1 && Integer.parseInt(d2)==0 &&Integer.parseInt(d3)==0 && Integer.parseInt(d4)==0 && Integer.parseInt(d5)==0)
                    res= decena[0]+" mil";
                else if ( Integer.parseInt(d1)==1 && Integer.parseInt(d2)==0 &&Integer.parseInt(d3)==1 && Integer.parseInt(d4)==0&& Integer.parseInt(d5)==0)
                    res = decena[0]+" mil cien";
                else if ( Integer.parseInt(d1)==1 && Integer.parseInt(d2)==0 &&Integer.parseInt(d3)<=9 && Integer.parseInt(d4)==0&& Integer.parseInt(d5)==0)
                    res = decena[0]+" mil "+centena[Integer.parseInt(d3)-1];
                else  if( Integer.parseInt(d1)== 1&&Integer.parseInt(d2)==0 && Integer.parseInt(d3)== 0 && Integer.parseInt(d5)== 0)
                        res = decena[0]+ " mil " + decena[Integer.parseInt(d4)-1];
                else if(Integer.parseInt(d1)== 1&&Integer.parseInt(d2)==0 && Integer.parseInt(d3)==0 && Integer.parseInt(d4)==0)
                            res= decena[0]+ " mil " +unidades[Integer.parseInt(d5)];
            }
             JOptionPane.showMessageDialog(null, res);
        }else if (numero>0 && numero <= 100000){
            res="cien mil";
            JOptionPane.showMessageDialog(null, res);
        }else JOptionPane.showMessageDialog(null, "Ingrese un numero valido entre 0 y 100000");
    return res;
    }
}