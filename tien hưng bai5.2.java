
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class bai52 {
    
    public static void main(String[] args) {
        // TODO code application logic here  public static void main (String[] args) {
         int n,s=0;
         System.out.print("nhap n");
         Scanner nhap = new Scanner(System.in);
          n =nhap.nextInt();
         for (int i = 0; i<= n; i++) {
             s=s+i;
         }
         System.out.print("tong la:"+s);
    
    }
}



