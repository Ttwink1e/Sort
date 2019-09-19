package com.lxy.prepare;

public class ChoiceSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * 		选择排序
		 * 有n个数则进行n-1轮排序,先把a[0]与后面的数据进行比较，找到最小的数据并用index储存下标,将a[0]与a[index]进行交换
		 * 后面重复操作找到index,将a[i]与a[index]进行交换
		 */
		int[] arr = {6,2,8,1,9};
		for (int i = 0; i < arr.length; i++) {
			int index = i;
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					index = j;
				}
			}
			int temp = 0;
			temp = arr[index];
			arr[index] = arr[i];
			arr[i] = temp;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
