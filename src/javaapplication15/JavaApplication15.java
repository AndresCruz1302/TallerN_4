
package javaapplication15;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class JavaApplication15 {

    public static void main(String[] args) {
         // TODO code application logic here
        clave();
        
    }
    public static void primero(){
        Scanner numeros=new Scanner(System.in);
        System.out.println("digite el primer numero");
        int num1=numeros.nextInt();
        System.out.println("digite el segundo numero");
        int num2=numeros.nextInt();
        int sum;
        int res;
        int resi;
        sum=num1+num2;
        res=num1-num2;
        resi=num1%num2;
        
      System.out.println("la suma de los numeros "+num1+"+"+num2+"="+sum);
      System.out.println("la resta de los numeros "+num1+"-"+num2+"="+res);
      System.out.println("el residuo de los numeros "+num1+"%"+num2+"="+resi);
    }
    public static void animales(){
        Scanner animales=new Scanner(System.in);
        System.out.println("escriba un ser vivo");
         String espe=animales.nextLine();
         if ("cocodrilo".equalsIgnoreCase(espe)){
             System.out.println("pertenece al reino animal");
         }else{ 
             if("caña de azucar".equalsIgnoreCase(espe)){
                 System.out.println("pertenece al reino vegetal");             
             }else{
                 if("amanita muscaria".equalsIgnoreCase(espe)){
                     System.out.println("pertenece al reino fungui"); 
                  }else{
                     if("ceratium".equalsIgnoreCase(espe)){
                         System.out.println("pertenece al reino protista");
                     }else{
                         if("brucella".equalsIgnoreCase(espe)){
                             System.out.println("pertenece al reino monera");
                              }
                          }
                        }
                  } 
             }         
     }
     public static void musica(){
         int mus;
         mus=Integer.parseInt(JOptionPane.showInputDialog(null,"digite un numero"
                 +" "+"entre 1 y 7"));
         int a;
         switch (mus){
             case 1:
                 JOptionPane.showMessageDialog(null, "la nota musical es: "
                         + ""+" "+"do");
                 break;
             case 2:
                 JOptionPane.showMessageDialog(null, "la nota musical es: "+" "+
                         "re");
                 break;
             case 3:
                 JOptionPane.showMessageDialog(null, "la nota musical es: "+" "+
                         "mi");
                 break;
             case 4:
                 JOptionPane.showMessageDialog(null, "la nota musical es: "+" "+
                         "fa");
                 break;
             case 5:
                 JOptionPane.showMessageDialog(null, "la nota musical es: "+" "+
                         "sol");
                 break;
             case 6:
                 JOptionPane.showMessageDialog(null, "la nota musical es: "+" "+
                         "la");
                 break;
             case 7:
                 JOptionPane.showMessageDialog(null, "la nota musical es: "+" "+
                         "si");
                 break;
             default:
                 JOptionPane.showMessageDialog(null, "no hay nota musical");
         }
     }
     public static void numeros(){
         int num;
         num=Integer.parseInt(JOptionPane.showInputDialog(null, 
                 "digite un numero"));
         for(int i=0;i<=num;i++){
             JOptionPane.showMessageDialog(null, i);
         }
     }
     public static void num(){
         int num;
         num=Integer.parseInt(JOptionPane.showInputDialog(null, 
                 "digite un numero"));
         for(int i=0;i<=num;i=i+3){
             JOptionPane.showMessageDialog(null, i);
         }
     }
     public static void par(){
         int numP;
         numP=Integer.parseInt(JOptionPane.showInputDialog(null,
                 "digite cualquier numero"));
         if(numP%2==0){
             JOptionPane.showMessageDialog(null, numP+" "+"es par");
         }else{
             JOptionPane.showMessageDialog(null, numP+" "+"no es par");
         }
     }
     public static void serie(){
         int num;
         int sum;
         int i=0;
         int b=0;
         int c=1;
         num=Integer.parseInt(JOptionPane.showInputDialog(null,"digite un numero"));
         while(c<num){
             sum=b;         
             b=c+b;
             c=sum;
             i++;
             JOptionPane.showMessageDialog(null, c);
         }      
      }
          public static void clave(){
         int contraseña=1245;
         int usuario;
         int i=0;
         String acceso="acceso denegado";

         while(i<3){
         usuario=Integer.parseInt(JOptionPane.showInputDialog(null, 
                 "digite el numero"));             
         if(contraseña==usuario){
             acceso="acceso permitido";
             JOptionPane.showMessageDialog(null, acceso);
             break;
         }
         if(contraseña!=usuario){
            JOptionPane.showMessageDialog(null, acceso);
            
         }
         i++; 
       }
         if (i==3){
             JOptionPane.showMessageDialog(null, "clave bloqueada");
         }
     }
     public static void helados(){
         int sabor;
         String sab[]={"Digite el sabor "
                 + "segun corresponda","1. fresa ", "2.vainilla ","3.chocolate","4. ron con pasas",
         "5.con chips"};
         int i;
         for(i=0;i<=5;i++){
         JOptionPane.showMessageDialog(null, sab[i]);
         }
         sabor=Integer.parseInt(JOptionPane.showInputDialog(null, 
                 "escriba el sabor"));
         switch(sabor){
             case 1:
                 JOptionPane.showMessageDialog(null, "eligio el sabor: fresa");
                 break;
             case 2:
                 JOptionPane.showMessageDialog(null, "eligio el sabor: vainilla");
                 break;
             case 3:
                 JOptionPane.showMessageDialog(null, "eligio el sabor: chocolate");
                 break;
             case 4:
                 JOptionPane.showMessageDialog(null, "eligio el sabor: ron con pasas");
                 break;
             case 5:
                 JOptionPane.showMessageDialog(null, "eligio el sabor: con chips");
                 break;
         }
             
    }
    
}
