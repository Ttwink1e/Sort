package com.lxy.prepare;

public class InsertSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * 		ѡ������
		 * ���������˿��ƵĲ���������temp��ŵ�ǰҪ�����Ԫ��ֵ������index��ŵ�ǰԪ�ص��±꣬
		 * ����arr[0]Ԫ���Ѿ��ŵ���ȷλ���ϣ���arr[1]��ʼ����arr[index]֮ǰ��Ԫ�شӺ���ǰ����ɨ�裬
		 * ���arr[index] < arr[index-1], ��arr[index-1]����ƶ�һλ��arr[index] = arr[index-1],
		 * index--;�ٽ�arr[index]��arr[index-1]���бȽ��ظ�������ֱ��arr[index] >= arr[index-1],
		 * ��ʱ��arr[index]��ǰһ���,˵���Ѿ������������,����ٽ�temp��ֵ��arr[index]
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
