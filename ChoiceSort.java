package com.lxy.prepare;

public class ChoiceSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * 		ѡ������
		 * ��n���������n-1������,�Ȱ�a[0]���������ݽ��бȽϣ��ҵ���С�����ݲ���index�����±�,��a[0]��a[index]���н���
		 * �����ظ������ҵ�index,��a[i]��a[index]���н���
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
