package com.test.samples;

/**
 * Hello world!
 *
 */
public class App 
{
	protected App(){
		this("hello");
		System.out.println("In 0 constructor");
		
	}
	
	public App(String x){
		System.out.println("In 1 constructor :"+x);
	}
	
	public App(int x, int y){
		System.out.println("In 2 constructor :"+x+y);
	}
	
    public static void main( String[] args )
    {
    	App ap = new App();
        System.out.println( "Hello World!" );
        
        String s1 = "Hello";
        s1 = "Hello";
    }
}
