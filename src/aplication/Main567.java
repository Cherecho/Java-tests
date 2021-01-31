import java.lang.*; 
import java.util.Scanner;
public class Main567 { 
    public static void main(String[] args) 
    { 
        int s[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100}; 
        int d[] = { 15, 25, 35, 45, 55, 65, 75, 85, 95, 105}; 
  
        int source_arr[], sourcePos, dest_arr[], destPos, len; 
        source_arr = s; 
        sourcePos = 3; 
        dest_arr = d; 
        destPos = 5; 
        len = 4; 
        
        //Copiar array 
        System.out.print("source_array : "); 
        for (int i = 0; i < s.length; i++) 
            System.out.print(s[i] + " "); 
        System.out.println(""); 
  
        System.out.println("sourcePos : " + sourcePos); 
         
        System.out.print("dest_array : "); 
        for (int i = 0; i < d.length; i++) 
            System.out.print(d[i] + " "); 
        System.out.println(""); 
         
        System.out.println("destPos : " + destPos); 
         
        System.out.println("len : " + len); 
         
        System.arraycopy(source_arr, sourcePos, dest_arr,  
                                            destPos, len); 
         
        //Enseñar resultado
        System.out.print("final dest_array : "); 
        for (int i = 0; i < d.length; i++) 
            System.out.print(d[i] + " "); 
        
        //Vector dinamico
        int[] elementos = new int[10];
        
        System.out.println("Dime el tamaño del Array");
        try (Scanner reader = new Scanner(System.in)) {
            elementos[4] = 12;
            System.out.println(elementos[4]);
          } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array creado muy pequeño");
          }
    } 
}  