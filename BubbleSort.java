package com.lxy.prepare;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * 		ð������
		 * ��n���������n-1������,a[0]��a[1]�Ƚ�,���a[0]>a[1]�򽻻�a[0]��a[1],��֮������;
		 * �ٽ�����Ǹ�ֵ����һλ���бȽϣ��ظ�����ֱ��a[n-2]��a[n-1]�ıȽϽ���
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
