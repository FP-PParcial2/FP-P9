/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fp.p10;
import java.util.*;

/**
 *
 * @author Esteban
 */
public class FPP10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   int num;
num = pedirNumero();
fiboSeq(num);

}
public static int pedirNumero(){
Scanner entrada = new Scanner(System.in);
System.out.print("Ingrese el numero de terminos que desea: ");
int num=entrada.nextInt();
if(num<=1) {
System.out.println("El numero debe ser mayor a 1");
pedirNumero();
}
return num;
}
public static void fiboSeq(int n){
int sec1=1,sec2=1;
System.out.println("Los primeros "+n+" digitos de la serie de Fibonacci son: ");
System.out.print(sec1+ " ");
for(int i=0;i<n;i++){
System.out.print(sec2+" ");
sec2 = sec1 + sec2;
sec1 = sec2 - sec1;
 }
System.out.println("");
}
}