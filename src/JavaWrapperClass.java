

public class JavaWrapperClass {
	//래퍼 클래스는 일반변수 
	// byte / short / int / long / float/ double / boolean / char 타입에 대해
	// 객체로 처리해야 할 상황이 필요할 때 사용하는 클래스를 의미함.
	// Byte / Short / Integer / Long / Float / Double / Boolean / Character가 있음
	
	
	
	//박싱(Boxing) 
	//기본타입을 래퍼 클래스에 담아서 포장하는 과정
	
	//언박싱(Unboxing)
	//기본타입을 래퍼클래스로부터 꺼내오는 작업 
	
	
	// .equals(@@)로 동등비교 가능
	// 참조변수이기 때문에 ==를 사용해 래퍼클래스간 동등비교 불가
	// 일반변수와 래퍼클래스간 ==를 사용해 동등비교 가능 ( 자동 언박싱 해주기 때문) 
	
	
	//문자열로 타입 변환하는데 사용 가능
	//Integer.parseInt(@@) 4byte 
	//Short.parseShort(@@) 2byte
	//Long.parseLong(@@) 8byte 
	//Float.parseFloat(@@) 4byte
	//Double.parseDouble(@@) 8byte 
	//Boolean.parseBoolean(@@) 1byte 
	//Byte.parseByte(@@) byte
	
	
	
	public static void main(String[] args)
	{
		intEx();
	}
	
	
	
	public static void intEx()
	{
		
		Integer intger = 4;
		Integer intger2 = 10;
		
		int number = intger + intger2;
		System.out.println(number);
		
		
		//Intger intger = new Intger(4);
		int temp = 7;
	
		

		
		//intg = intger.intValue();
		//자동 언박싱 - 객체로부터 변수를 꺼내어 일반 변수에 저장 

		
		intger = temp;
		//자동 박싱 - 객체에 일반변수를 담아 저장 
		System.out.println(intger);
		
	}
}
