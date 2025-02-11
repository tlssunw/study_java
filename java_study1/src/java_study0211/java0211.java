package java_study0211;

import java.util.Arrays;
import java.util.Collections;

public class java0211 {

	public static void main(String[] args) {
		
//		int[] number = new int[] {10,20,30,44,55,66,100,2323};
//		
//		// number 인덱스에 있는 데이터를 순차적으로 저장함
//		for(int num : number) {
//			System.out.println(num);
//		}
//		// 배열의 인덱스 사용 불가
//		// 배열의 데이터를 변경하거나 삭제 불가
		
//		// 문제 
//		// tall의 배열은 A반 학생들의 키를 저장한것이다.
//		// A반 평균키보다 큰 키를 찾아서 출력하세요.
//		float[] tall = new float[] { 167.2f ,163.3f,175.7f,173.8f,158.3f};
//		
//		float avg=0, sum=0;
//		for(float t : tall) {
//			sum=sum+t; //총합 구하기
//		}
//		avg= sum/tall.length; //평균 구하기
//		
//		// tall의 데이터를 순차적으로 t에 저장함
//		for (float t : tall) {
//			if(avg <= t) {
//				System.out.println(t);
//			}
//		}
		
		// 배열 관련 메소드
		int[] num=new int[] {10,20,30,40,50,60,70};
		System.out.println(Arrays.toString(num));
		// 자바에서 데이터 출력 메서드 이름은 toString이라고 한다.
		
		int[] a = new int[7];
		System.out.println(Arrays.toString(a));
		// 배열에 데이터가 없기 때문에 콘솔창에는 0이 나온다.
		
		
		// 배열 복사
		// arraycopy(복사배열, 복사배열 시작 인덱스, 저장배열, 저장시작인덱스, 크기);
		System.arraycopy(num, 0, a, 0, 5);
		System.arraycopy(num, 0, a, 0, num.length);
		// ㄴ 모든 배열 출력
		System.out.println(Arrays.toString(a));
		
		
		// 배열 비교
		boolean isSame = Arrays.equals(num, a);
		System.out.println(isSame);
		
		
		// 배열 정렬
		int[] arr = new int[] {4553,232,546,2,54,612};
		System.out.println("----정렬전-----");
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("----정렬후----");
		System.out.println(Arrays.toString(arr));
		
		//역방향(오름차순)
		Integer[] arr2 = {5,4,1,2,3};
		
		Arrays.sort(arr2, Collections.reverseOrder()); 
		// comparator 구현 필요
		
		String[] names= {"이순신", "이성계", "김춘추","정약용","문익점"};
		System.out.println(Arrays.toString(names));
		
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));
		
		//역방향 정렬
		Arrays.sort(names, Collections.reverseOrder());
		System.out.println(Arrays.toString(names));

	}

}
