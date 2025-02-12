package java_study0212;

public class java0212 {

	public static void main(String[] args) {

		// 1차원 배열 : 같은 타입의 변수가 연속적으로 이루어진 구조
		// 2차원 배열 : 같은 타입의 1차원 배열이 여러개로 이루어진 구조
	
		
		int[] a = new int[] {3,4,5}; //1차원 배열 - 3의 크기를 가진
		int[] b = new int[] {1,20,60}; //1차원 배열 - 3의 크기를 가진
		int[] c = new int[]	{23,565,78}; //1차원 배열 - 3의 크기
		// A반 학생의 성적 -> 1차원 배열 
		// 1학년 전체 학생 성적 - 2차원 배열
		
//		int[][] abc = new int[2][3];
//		int[][] abc = new int[][] {{1,2},{3,4}};
		int[][] abc = new int[][] {a,b,c};
		System.out.println(abc[0][0]);
		System.out.println(abc[0]);
		
		int[][] arr = new int[3][4];
		arr[0][0]=10;
		arr[0][1]=20;
		arr[0][2]=30;
		arr[1][0]=50;
		arr[1][3]=100;
		arr[2][1]=40;
		
		for(int i=0; i<arr.length; i++) {
			for(int k=0; k<arr[i].length; k++) {
				System.out.println(arr[i][k]);
			}
		}
		// 1차원 배열 -> 향상된 for문 : for(int a : array){} 
		
		for(int i=0; i<arr.length; i++) {
			for(int num:arr[i]) {
				System.out.println(num);
			}
		}
		
		for(int[] tmp : arr) {
			for(int num:tmp) {
				
			}
		}
		
		
		
		
	}

}
