/**
 * 
 */
package com.myprojects.examples.java.basic;

/**
 * @author shiva koduri
 *
 */
public class BindingExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		BindingExample binding = new BindingExample();
		
		A a1 = binding.new A();
		a1.method();
		
		A a2 = binding.new B();
		a2.method();

	}
	
	class A{
		
		void method(){
			System.out.println("From class A");
		}
	}
	
	class B extends A{
		@Override
		void method() {
			System.out.println("From class B");
		}
	}

}
