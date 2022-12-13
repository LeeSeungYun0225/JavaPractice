package com.singleton;


public class Singletone {
	private static Singletone instance = new Singletone();
	
	private Singletone() {}
	
	public static Singletone getInstance()
	{
		return instance;
	}
}
