package com.codechef;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// traversal means visiting all the elements of the array once;
    Scanner sc = new Scanner(System.in);
    int size;
    size = sc.nextInt();
    int[] arr = new int[size];
    for (int i=0;i<arr.length;i++){
        arr[i] = sc.nextInt();
    }
    for (int i=0;i< arr.length;i++){
        System.out.println(arr[i]);
    }
    }
}
