package collection5;

import java.util.LinkedList;
import java.util.Queue;
 
public class Mainq {

	public static void main(String[] args) {
		
		// FIFO - 구조
		// 입출력을 동시에 할 수 있음
		Queue<Integer> q = new LinkedList<>();

		q.offer(100);
		q.offer(70);
		q.offer(45);
		
		System.out.println(q);
		// 큐에서 내보내기 - 먼저 들어온 순서대로
		q.poll();
		System.out.println(q);
	}

}
