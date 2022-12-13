package Collection.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ListTester l1 = new AlTest();
		ListTester l2 = new LlTest();
		
		System.out.println("ArrayList와 LinkedList의 객체 삽입 시간 차이 (milliSeconds) : " + (l1.checkTimes(100000)-l2.checkTimes(100000)));
		
		SyncTestable s1 = new ArrayListTest();
		SyncTestable s2 = new VectorTest();
		
		System.out.println("ArrayList에서 멀티 스레드로 데이터 삽입한 결과, " + s1.getResult() +"개의 엔티티 삽입됨");
		System.out.println("Vector에서 멀티 스레드로 데이터 삽입한 결과, " + s2.getResult() +"개의 엔티티 삽입됨");
		
		
	}

}
