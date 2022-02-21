/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Paqui Elena
 */
public class Calculador {

    private final int operando1;
    private final int operando2;

   public Calculador(int a, int b) {
       operando1 = a;
       operando2 = b;
   }
   public int suma() {
       int resul = operando1 + operando2;
       return resul;
   }
   public int resta() {
       int resul = operando1 - operando2;
       return resul;
   }
   public int multiplica() {
       int resul = operando1 * operando2;
       return resul;
   }
   public int divide() {
       int resul = operando1 / operando2;
       return resul;
   }
   
   public int divide0() {		   
	   if(operando2 == 0)
	      throw new java.lang.ArithmeticException("División por 0");
	   else{
	      int resul= operando1 / operando2;
	      return resul;
	   } 
	}
   
}
