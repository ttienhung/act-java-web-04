
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapjava2;
import java.util.Scanner;


public class bai53 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here  public static void main (String[] args) {
         int n,Tong=0;
         System.out.print("nhap n");
         Scanner nhap = new Scanner(System.in);
          n =nhap.nextInt();
         for (int i =1 ; i<= n; i++) {
           Tong=Tong+i*i;
         }
         System.out.print("tong la:"+Tong);
    
    }
    
}






