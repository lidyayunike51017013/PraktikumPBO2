/**
 * @(#)program1.java
 *
 *
 * @author 
 * @version 1.00 2019/9/19
 */

import java.util.Scanner;
public class program1 {

    public static void main (String [] args) {
    	Scanner input = new Scanner (System.in);
    int nilai;
    
    System.out.println ("Masukkan nilai = ");
    nilai = input.nextInt();
    
    if (nilai == 1) {
    	System.out.println ("Pesawat Garuda");
    }
    else if (nilai == 2) {
    	System.out.println ("Pesawat Batik");
    }
    else if (nilai == 3) {
    	System.out.println ("Pesawat Lion");
    }
    else
    	System.out.println ("Maaf Anda Salah Memasukkan Nilai Pesawat");
    
    }
 
    
    
}