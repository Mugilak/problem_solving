package codeChef;
/* package codechef; // don't place package name! */

import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class XORddeletions {
	public static void main(String[] args) throws java.lang.Exception {
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
	    int y = s.nextInt();
	    int z = s.nextInt();
	    System.out.println((Math.ceilDiv(y,z)) * x);
//		System.out.println(Math.ceilDiv(4, 4));
		int t = s.nextInt();
		int count = 0;
		for (int i = 0; i < t; i++) {
			int n = s.nextInt();
			int a[] = new int[n];
			for (int j = 0; j < n; j++) {
				a[j] = s.nextInt();
			}
			for (int k = 1; k < n; k++) {
				System.out.println((a[k] ^ a[k - 1]));
				if (((a[k] ^ a[k - 1]) == 0) || ((a[k] ^ a[k - 1]) == 1))
					continue;
				count++;
			}
			System.out.println(count);
		}
	}
}

///* package codechef; // don't place package name! */
//
//import java.util.*;
//import java.io.*;
//import java.util.Map;
//import java.util.Map.Entry;
//import java.util.HashMap;
//
///* Name of the class has to be "Main" only if the class is public. */
//class XORddeletions
//{
//	public static void main (String[] args) throws java.lang.Exception
//	{
//	    Scanner s = new Scanner(System.in);
//	    int t=s.nextInt();
//	    int count=0;
//	    for(int i=0; i<t;i++){
//	        int n= s.nextInt();
//	        HashMap<Integer,Integer> map = new HashMap<>();
//	        new Comparator() {
//	        	public int compare(Entry<Integer, Integer> o1, Entry<Integer,Integer> o2) {
//	        		return o1.getValue().compareTo(o2.getValue());
//	        	}
//	        }.compare(map.entrySet(), map.entrySet());
//	        int a[] = new int[n];
//	        for(int j=0; j<n;j++){
//	            a[j] = s.nextInt();
//	            if(map.containsKey(a[j])){
//	                map.put(a[j],map.get(a[j])+1);
//	            }else map.put(a[j], 1);
//	        }
//	        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());
//	        if(list.get(0).getValue() != 1){
//	           System.out.println(list.get(0).getValue()) ;
//	        }else{
//	            for(int k=1; k<n;k++){
//	                if((a[k]^a[k-1])!=1) count++;
//	            }System.out.println(count) ;
//	        }
//	    }
//	}
//}
