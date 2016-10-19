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
        // TODO code application logic here
int num;
num=pedirNumero();
Desgloce(num);

}
public static int pedirNumero(){
Scanner entrada = new Scanner(System.in);
System.out.print("Ingrese el numero para Desglosar ");
int num=entrada.nextInt();
return num;
}
public static void Desgloce(int n){
System.out.print(n+" = ");
for(int i=10;i<n*10;i=i*10){
System.out.print(((n%i)/(i/10))*(i/10));
if ((i<n))System.out.print(" + ");
}
System.out.println("");
}
}