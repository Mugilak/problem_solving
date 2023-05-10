package codeChef;

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class AudibleRange
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		String[] b= new String[t];
		for(int i=0; i<t; i++){
		    int a=s.nextInt();
		    if(a>=67 && a<=45000){
		        b[i] = "yes";
		    }
		    else
		    b[i] = "no";
		}
		for(String c : b){
		    System.out.println(c);
		}
	}
}

