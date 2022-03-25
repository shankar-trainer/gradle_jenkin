package com.capg.beans;


public class FactorialMain {


public static void main(String args[]){
	
	  int n=7;
	  Factorial factorial=new Factorial();
	  
	  int res=factorial.getFactorial(n);
	  
	  System.out.printf("factorial of %d is %d ",n,res);
	  
	
	
}

}