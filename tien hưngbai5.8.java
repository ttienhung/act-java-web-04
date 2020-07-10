
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class bai58 {
       public static void main(String[] args) {
        // TODO code application logic here  public static void main (String[] args) {
         float n,s = 0,gt=1;
         System.out.print("nhap n");
         Scanner nhap = new Scanner(System.in);
          n =nhap.nextInt();
         for (int i = 2; i<=n; i++) {
            gt*=i;
            s+=gt;
                   
         }
         System.out.println("tong la:"+(float)s);
    
}
}








