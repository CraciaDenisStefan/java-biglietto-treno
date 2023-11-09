package org.lessons.java;

import java.util.Scanner;

public class CalcolaBiglietto {

		public static void main(String[] args) {
			
			Scanner in = new Scanner(System.in);
			
			System.out.print("Inserisci km da percorrere:");
			String chilometri = in.nextLine();
			int km =  Integer.valueOf(chilometri);
			
			System.out.print("Inserisci la tua età:");
			String anni = in.nextLine();
			int eta =  Integer.valueOf(anni);
			
			double prezzoBase = km * 0.21;
	        double sconto = 0;
	        
	        if(eta < 18){
	        	
	            sconto = prezzoBase * 0.20;
	            
	        } else if(eta >= 65){
	        	
	            sconto = prezzoBase * 0.40;
	            
	        }

	     
	        double prezzoTotale = prezzoBase - sconto;

	    
	        System.out.println("Il prezzo totale del viaggio è: " + prezzoTotale + "€");

	       
	        in.close();
		}
		
		
}
