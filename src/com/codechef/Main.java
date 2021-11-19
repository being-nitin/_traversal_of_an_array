package com.codechef;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// traversal means visiting all the elements of the array once;
    Scanner sc = new Scanner(System.in);
    int size1;
    size1 = sc.nextInt();
    int[] arr = new int[size1];
    for (int i=0;i<arr.length;i++){
        arr[i] = sc.nextInt();
    }
    for (int i=0;i< arr.length;i++){
        System.out.println(arr[i]);
    }
    }
}
