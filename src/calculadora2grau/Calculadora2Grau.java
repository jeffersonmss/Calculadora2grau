/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora2grau;

import java.lang.Math;

/**
 *
 * @author Jefferson
 */
public class Calculadora2Grau {

   public static Double calculaDelta(String valorX2, String valorX,String valorC){
       
       Double x2 = Double.parseDouble(valorX2);
       Double x = Double.parseDouble(valorX);
       Double c = Double.parseDouble(valorC);
       Double delta;
       
       
       delta = Math.pow(x, 2)-4*x2*c;
       
       System.out.println(delta);
       
       return delta;
       
   }
   
   // Calcula o x1 da equação    
   public Double calculaX1(String delta, String valorA, String valorB){
       
       Double valorDelta = Double.parseDouble(delta);
       Double B = Double.parseDouble(valorB);
       Double A = Double.parseDouble(valorA);
       Double X1;
       
       X1 = ((B*-1)+Math.sqrt(valorDelta))/2*A;
       
       return X1;
       
       
   }
   // Calcula o x2 da equação
   public Double calculaX2(String delta, String valorA, String valorB){
       
       Double valorDelta = Double.parseDouble(delta);
       Double B = Double.parseDouble(valorB);
       Double A = Double.parseDouble(valorA);
       Double X1;
       
       X1 = ((B*-1)-Math.sqrt(valorDelta))/2*A;
       
       return X1;
       
       
   }
    
    
}
