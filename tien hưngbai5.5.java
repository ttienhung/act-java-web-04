
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class bai55 {
    public static void main(String[] args) {
        // TODO code application logic here  public static void main (String[] args) {
         float n,Tong=0;
         System.out.print("nhap n");
         Scanner nhap = new Scanner(System.in);
          n =nhap.nextInt();
         for (int i =0 ; i<= n; i++) {
           Tong+=(float)1/(2*i+1);
         }
         System.out.print("tong la:"+Tong);
}
}



