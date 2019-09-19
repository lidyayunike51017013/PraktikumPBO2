/**
 * @(#)GanjilGenap.java
 *
 *
 * @author 
 * @version 1.00 2019/9/19
 */

import java.util.Scanner;
public class GanjilGenap {

    public static void main (String[] args){
    	Scanner input = new Scanner (System.in);
    	
    	int nilai;
    	
    	System.out.print("masukkan nilai = ");
    	nilai = input.nextInt();
    if(nilai % 2 == 0){
    	System.out.println("angka yang dimasukkan adalah Genap");
    }
    else
    	System.out.println("angka yang dimasukkan adalah Ganjil");
    }    
}