


//자바의 타입 변환
//1. 자동 타입 변환
// - 내부적으로 허용 가능한 변환으로 값의 허용 범위가 작은 것을 큰 것으로 변환 
// - ex) byte를 int로, float를 double로 변환 
//2. 강제 타입 변환
// - 내부적으로 허용 불가능하기 때문에 강제로 변환하는 방법으로 값의 허용 범위가 큰 것을 작은 것으로 변환
// - ex) int를 byte로, double을 float로 변환
// - 값의 허용 범위가 줄어들기 때문에 손실이 발생할 수 있음 

public class TypeConversion {
	public static void main(String[] args) {
		
		int integer = 10;
		byte bt = (byte) integer;
		// byte타입은 1바이트 허용 범위로 10은 손실 발생 x 
		
		System.out.println(bt);
		
		bt =(byte) 129;
		System.out.println(bt);
		// 127까지는 정상적으로 출력되지만 128부터는 다른 값이 출력됨 ( 값의 손실 발생 ) 
		
		char ch = (char) 65;
		System.out.println(ch); 
		// 정수 65를 char타입으로 강제 형변환시 유니코드 65번 'A'문자가 출력됨
		ch = (char) -65;
		System.out.println(ch);
		// 음수를 허용하지 않는 char타입의 특성상 -65 유니코드 문자가 아닌 다른 문자가 출력됨
		
		integer = (int) 3.14;
		System.out.println(integer);
		// 소수를 정수로 강제 형변환하면 정수부만 가져옴 
		
		
		
		ch = 'B';
		integer = ch;
		System.out.println(integer);
		// char타입은 int타입으로 자동 형변환이 허용되므로 문자 'B'는 숫자 66으로 변환됨
		
		long l = 100000000L;
		float f = l;
		System.out.println(f);
		// float는 4바이트 / long은 8바이트로 저장 크기는 long이 더 크지만, 값의 허용 범위가 실수>정수이므로 
		// long타입은 float로 자동 형변환 가능 
		
		
		//byte b = 65;
		//char chh = b; >> 컴파일 에러
		// 바이트 타입은 음수도 허용하나 char타입은 음수에 대칭되는 문자가 없기 때문 
		
		
		
		
	}
}
