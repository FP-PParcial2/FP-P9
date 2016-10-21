/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fp.p9;
import java.util.*;

/**
 *
 * @author Esteban
 */
public class FPP9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaracion de variables
int num;
num=pedirNumero();
Desgloce(num);

}
public static int pedirNumero(){//inGRESAR Numero a Desglosar
Scanner entrada = new Scanner(System.in);
System.out.print("Ingrese el numero para Desglosar ");
int num=entrada.nextInt();
return num;
}
public static void Desgloce(int n){//metodo para desglosar
System.out.print(n+" = ");//Numero es igual 
for(int i=10;i<n*10;i=i*10){//Condicionar
System.out.print(((n%i)/(i/10))*(i/10));//Imprimir
if ((i<n))System.out.print(" + ");
}
System.out.println("");
}
}
