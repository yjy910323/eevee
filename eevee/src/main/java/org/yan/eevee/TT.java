package org.yan.eevee;

public class TT {
	  public static void main(String[] args) {
		    permutation(3);
		    System.out.println();
		    permutation(4);
		  }
		 
		  public static void permutation(int n) {
		    permutation(new int[n], 0);
		  }
		 
		  private static void permutation(int[] a, int i) {
		    if (i == a.length) {
		      print(a);
		      return;
		    }
		    a[i] = 0;
		    permutation(a, i + 1);
		    a[i] = 1;
		    permutation(a, i + 1);
		  }
		 
		  private static void print(int[] a) {
		    for (int i = 0; i < a.length; i++) {
		      System.out.print(a[i]);
		    }
		    System.out.println();
		  }
}
