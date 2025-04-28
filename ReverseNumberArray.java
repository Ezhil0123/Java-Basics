package myproject;

import java.util.*;

public class ReverseNumberArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        int arr[]=new int[10];
        int i,len=0;
        for(i=0;num>0;i++) {
        	arr[i]=num%10;
        	num=num/10;
        	len++;
        }
        System.out.print("Reversed number: ");
        for(i=0;i<len;i++) {
        	System.out.print(arr[i]);
        }
    }
}
