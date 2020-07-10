
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class bai512 {
     public static void main(String[] args) {
        // TODO code application logic here  public static void main (String[] args) {
         float n,s = 0,mau=0;
         System.out.print("nhap n");
         Scanner nhap = new Scanner(System.in);
          n =nhap.nextInt();
         for (int i = 1; i<= n; i++) {
             mau+=i;       
            s +=(float)1/(mau);}
         
         System.out.println("tong la:"+(float)s);}
    
}






