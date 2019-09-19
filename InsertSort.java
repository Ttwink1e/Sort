package com.lxy.prepare;

public class InsertSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * 		选择排序
		 * 类似整理扑克牌的操作，定义temp存放当前要插入的元素值，定义index存放当前元素的下标，
		 * 假设arr[0]元素已经放到正确位置上，从arr[1]开始，将arr[index]之前的元素从后向前进行扫描，
		 * 如果arr[index] < arr[index-1], 将arr[index-1]向后移动一位即arr[index] = arr[index-1],
		 * index--;再将arr[index]与arr[index-1]进行比较重复操作，直到arr[index] >= arr[index-1],
		 * 此时的arr[index]比前一项大,说明已经是有序的数列,最后再将temp赋值给arr[index]
		 */
		
		int[] arr = {6,2,8,1,9};
		for (int i = 1; i < arr.length; i++) {
			int index = i;
			int temp = arr[i];
			while(index > 0&&temp < arr[index-1]){
				arr[index] = arr[index-1];
				index--;
			}
			arr[index] = temp;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
