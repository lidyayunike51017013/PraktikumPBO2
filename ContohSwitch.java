/**
 * @(#)ContohSwitch.java
 *
 *
 * @author 
 * @version 1.00 2019/9/19
 */


public class ContohSwitch {

    public static void main (String args []){
    	char hurufAwal = 'a';
    	System.out.print ("Masukkan huruf awal nama Anda : ");
    	try{
    		hurufAwal = (char)System.in.read();
    	}catch(Exception e){
    		System.out.println ("Salah ko menginput cess!!!");
    	}
    	switch(hurufAwal){
    	case (char)-1 : System.out.println("bukan huruf depan !!!");break;
    	case 'a' : System.out.println("apa namaku amin?"); break;
    	case 'b' : System.out.println ("apa namaku bambang?"); break;
    	case 'c' : System.out.println("apa namaku ceceo?");break;
    	case 'd' : System.out.println ("apa namaku daud?");break;
    	case 'e' : System.out.println ("apa namaku endang?");break;
    	default : System.out.println ("aku tidak bisa menebak lagi");
    	}
  	}
}
    