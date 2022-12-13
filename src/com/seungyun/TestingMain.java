package com.seungyun;

import com.singleton.Singletone;

public class TestingMain {
	public static void main(String[] args)
	{
		Singletone A = Singletone.getInstance();
		Singletone B = Singletone.getInstance();
		
		
		if(A==B)
		{
			System.out.println("같은 객체임");
		}
		
		
	}
}
