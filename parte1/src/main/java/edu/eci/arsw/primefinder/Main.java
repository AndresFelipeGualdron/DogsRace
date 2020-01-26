package edu.eci.arsw.primefinder;

import java.util.Scanner;

public class Main {
	private static PrimeFinderThread pft;
	private static PrimeFinderThread pft2;
	private static PrimeFinderThread pft3;


	public static void main(String[] args) {
		try{
			pft=new PrimeFinderThread(0, 10000000);
			pft2=new PrimeFinderThread(10000001,20000000);
			pft3=new PrimeFinderThread(20000001,30000000);
			pft.start();
			pft2.start();
			pft3.start();
			while(true){
				Thread.sleep(5000);
				pararBusqueda();
				imprimirEncontrados();
				System.out.println("Porfavor oprima enter para continuar con la busqueda.");
				Scanner scanner = new Scanner(System.in);
				scanner.nextLine();
				continuarBusqueda();
				if(pft.getTerminado() && pft2.getTerminado() && pft3.getTerminado()) break;
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}


	}


	private static void pararBusqueda() throws InterruptedException {
		pft.pausar();
		pft2.pausar();
		pft3.pausar();
	}

	private static void continuarBusqueda(){
		pft.continuar();
		pft2.continuar();
		pft3.continuar();
	}

	private static void imprimirEncontrados(){
		for(Integer i : pft.getPrimes()){
			System.out.println(i);
		}
		for(Integer i : pft2.getPrimes()){
			System.out.println(i);
		}
		for(Integer i : pft3.getPrimes()){
			System.out.println(i);
		}
	}
}
