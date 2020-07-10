/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;


public class Baitapjava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        float s=1;
        Scanner so= new Scanner(System.in);
        System.out.print("nhap so n");
         n= so.nextInt();
         for (int i = 2; i < n; i++) {
             s +=1/(float)i; 
        }
        System.out.print("Tong la:"+(float)s);
    }
    }
    











