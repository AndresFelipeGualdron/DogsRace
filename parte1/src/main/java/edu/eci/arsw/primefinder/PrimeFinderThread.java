package edu.eci.arsw.primefinder;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PrimeFinderThread extends Thread{

	
	int a,b;
	
	private List<Integer> primes=new LinkedList<Integer>();

	private boolean suspender, pausar, terminado = false;
	
	public PrimeFinderThread(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	public void run(){
		try{
			for (int i=a;i<=b;i++){
				if (isPrime(i)){
					primes.add(i);
					//System.out.println(i);
				}

				synchronized (this) {
					while(pausar){
						this.wait();
					}
					if (pausar) break;
				}
			}
		}catch (InterruptedException e) {
			e.printStackTrace();
		}

		this.terminado = true;


	}
	
	boolean isPrime(int n) {
	    if (n%2==0) return false;
	    for(int i=3;i*i<=n;i+=2) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}

	public List<Integer> getPrimes() {
		return primes;
	}

	public void pausar() {
		this.pausar = true;
		this.suspender = false;
		synchronized (this){
			this.notify();
		}

	}

	public void continuar(){
		this.pausar = false;
		synchronized (this){
			this.notify();
		}
	}

	public void parar(){
		this.suspender = true;
	}

	public boolean getTerminado(){
		return this.terminado;
	}
	
	
	
	
}
