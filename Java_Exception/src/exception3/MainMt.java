package exception3;

public class MainMt {

	public static void main(String[] args) {

		int[] arr = {10,40,50,20};
		
		try {
			System.out.println(arr[5]);
		}catch (Exception e) {
			System.out.println("인덱스범위");
		}
		
		String str = "123ab";
		int num = 0;
		try {
			int num = Integer.parseInt(str); // Integer.parseInt 는 문자열 -> 정수 반환
		}catch (Exception e) {
			System.out.println("정수로 변환불가 - 정수만 입력");
		}
		System.out.println("정수 :"+num);
		
		String word = "Good Bye!!";
		try {
			System.out.println(word.substring(word.indexOf("B")));
		}catch(Exception e) {
			
		}
		
		try {
			System.out.println(word.substring(word.indexOf("m")));
		}catch(Exception e) {
			
		}
		
	}

}
