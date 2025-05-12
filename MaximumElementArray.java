package myproject;

public class MaximumElementArray {

	public static void main(String[] args) {
        int arr[]= {12,34,56,43,23,16,2,1};
        int max=arr[0];
        for(int i=1;i<arr.length;i++) {
        	if(arr[i]>max) {
        		max=arr[i];
        	}
        }
        System.out.println("Maximum Element: "+max);
	}
}
