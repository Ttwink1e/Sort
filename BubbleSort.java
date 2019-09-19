package com.lxy.prepare;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * 		冒泡排序
		 * 有n个数则进行n-1轮排序,a[0]与a[1]比较,如果a[0]>a[1]则交换a[0]与a[1],反之不交换;
		 * 再将大的那个值与下一位进行比较，重复操作直到a[n-2]与a[n-1]的比较结束
		 */
		int[] arr = {6,2,8,1,3};
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-1-i ; j++) {
				if(arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
