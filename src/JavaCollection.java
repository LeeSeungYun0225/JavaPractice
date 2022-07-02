

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.Vector;

public class JavaCollection {
	public static void main(String[] args)
	{
	
		queueEx();
	}
	
	
	
	public static void queueEx()
	{
		Queue<Integer> queue= new LinkedList<Integer>(); // 큐 객체는 LinkedList로 인스턴스화 
		///add / offer
		//poll / remove / clear 
		// peek / toString 
		
		
		queue.add(5);
		queue.add(1);
		queue.add(9);
		queue.offer(11);
		// add와 offer는 동일하게 데이터 추가 역할
		// add는 데이터 공간이 부족해서 추가하지 못할때 예외(IllegerStateException) 던짐 
		
		System.out.println("////큐////");
		System.out.println(queue.toString());
		System.out.println(queue.remove());// queue.poll과 같음, remove는 큐가 비어있으면 NosuchElementException 발생 
		System.out.println(queue.peek()); // queue.element와 같음 
		System.out.println(queue.toString());
		while(queue.iterator().hasNext())
		{
			System.out.println(queue.poll());
		}
		System.out.println(queue.toString());
		
		System.out.println("////큐////");
		
		
		
		PriorityQueue<Integer> pqueue = new PriorityQueue<Integer>();
		System.out.println("////우선순위큐////");
		pqueue.offer(6);
		pqueue.offer(1);
		pqueue.offer(3);
		pqueue.offer(122);
		pqueue.offer(111);
		pqueue.offer(123);
		
		System.out.println(pqueue.toString());
		System.out.println(pqueue.peek());
		System.out.println(pqueue.remove());
		System.out.println(pqueue.poll());
		System.out.println(pqueue.toString());
		while(pqueue.iterator().hasNext())
		{
			System.out.println(pqueue.poll());
		}
		System.out.println(pqueue.toString());
		System.out.println("////우선순위큐////");
		
		
		
		Deque<Integer> deque = new LinkedList<Integer>();//연결리스트 덱 
		Deque<String> deque_a = new ArrayDeque<String>();//배열 덱
		// front / rear 양방향으로 삽입 , 삭제 가능한 자료구조 
		System.out.println("////덱////");
		deque.offer(1);
		deque.offer(2);
		deque.offerFirst(7);//첫번쨰 요소로 삽입
		deque.offerLast(3);//마지막 요소로 삽입
		
		System.out.println(deque.toString());
		
		deque.remove(); // remove는 가장 앞 요소 삭제+반환 
		
		System.out.println(deque.toString());
		System.out.println(deque.peekFirst());
		System.out.println(deque.peekLast());
		deque.removeFirst();
		deque.removeLast();
		//deque.poll();
		//deque.pollFirst();
		//deque.pollLast();
		
		
		System.out.println(deque.toString());
		System.out.println("////덱////");
	}
	
	public static void stackEx()
	{
		Stack<Integer> stack = new Stack<Integer>();
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(999);
		
		System.out.println("///스택///");
		System.out.println(stack.toString()); // 요소들을 출력 
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		
		if(stack.contains(3))
		{
			System.out.println("3이 스택에 존재");
		}
		System.out.println("////스택////");
	}
	
	
	
	public static void mapEx()
	{
		
	}
	
	public static void setEx()
	{
		
	}
	
	
	public static void ListEx()
	{
		
		// ArrayLIst와 Vector 
		// >> 둘다 동적 배열의 역할을 한다.
		// Vector는 스레드가 단일 스레드여도 동기화하기때문에(한번에 하나의 스레드만 백터 객체에 접근 가능) 성능이 떨어진다
		// ArrayList는 동기화가 자동으로 되지 않으므로 여러 스레드에서 접근시 동기화 코드를 직접 구성해야 한다
		// 동기화가 된다는 말은 Thread-safe하다는 이야기, (Thread-safe는 멀티 스레드 환경에서 동작해도 문제가 없음을 의미)
		// 동적 배열 확장시 Vector는 현재 크기의 2배, ArrayList는 1.5배 확장 
		// 멀티스레드 환경이 아닌이상 ArrayList를 사용하는것을 기본으로 하자.
		// linkedList의 경우 참조 변수 형태로 구성되어 조회시 인덱스로 즉각 참조되는것이 아니기때문에 arrayList/Vector보다 성능상 좋지 않지만
		// 자료를 확장하여 재구성하는 일이 발생하지 않는다.
		//또한 중간에 값을 삽입하거나 삭제 후 데이터를 앞당기는 등의 데이터 이동이 적다는 장점이있다.
		// 다만 데이터가 많을수록 접근성이 떨어진다.
		
		//List클래스를 상속받는 ArrayList / LinkedList / Vector 
		// 
		
		List<String> a_list = new ArrayList<String>(Arrays.asList("첫번째 데이터","두번째 데이터","세번째 데이터"));
		List<String> l_list = new LinkedList<String>();
		List<String> v_list = new Vector<String>();
		
		
		
		l_list.add("첫번째 데이터");
		l_list.add("두번째 데이터");
		l_list.add("세번째 데이터");
		v_list.add("첫번째 데이터");
		v_list.add("두번째 데이터");
		v_list.add("세번째 데이터"); // boolean타입 반환
		
		a_list.add(0,"맨 앞 데이터");
		l_list.add(0,"맨 앞 데이터");
		v_list.add(0,"맨 앞 데이터"); // 반환타입 없음, 원하는 인덱스에 데이터 삽입 가능 
		
		a_list.set(1, "새로운 1인덱스 데이터");
		l_list.set(1, "새로운 1인덱스 데이터");//인덱스의 값을 대체함 
		v_list.set(1, "새로운 1인덱스 데이터");
		
		System.out.println(a_list);
		System.out.println(l_list);
		System.out.println(v_list);
		
		System.out.println(a_list.contains("맨 앞 데터") ? "있음" : "없음" );
		System.out.println(l_list.contains("맨 앞 데이터") ? "있음" : "없음" );
		System.out.println(v_list.contains("맨 앞 데이터") ? "있음" : "없음" ); // 데이터가 존재하면 true 
		System.out.println(a_list.get(1));
		System.out.println(v_list.isEmpty() ? "비어있음" : "안비어있음");
		System.out.println(l_list.size()); // 데이터 갯수 반환 
		l_list.remove(2);//인덱스 값 삭제
		System.out.println(l_list);
		v_list.clear(); // 리스트 값 모두삭제 
		System.out.println(v_list);
		a_list.remove("맨 앞 데이터");
		System.out.println(a_list);
		
	}
}
