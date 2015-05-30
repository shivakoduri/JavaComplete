/**
 * 
 */
package com.myprojects.examples.java.basic.innerclass;

/**
 * @author Admin
 *
 *         A local inner class is defined within a method, and the usual scope
 *         rules apply to it. It is only accessible within that method,
 *         therefore access restrictions (public, protected, package) do not
 *         apply. However, because objects (and their methods) created from this
 *         class may persist after the method returns, a local inner class may
 *         not refer to parameters or non-final local variables of the method.
 */
public class LocalInnerClassDemo {
	
	int outerVaraiable = 100;
	static int staticOuterVariable = 2000;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LocalInnerClassDemo outer = new LocalInnerClassDemo();
		System.out.println(outer.run());

	}
	
	Object run(){
		int localVariable = 666;
		final int finalLocalVariable = 300;
		
		class LocalClass{
			int innerVariable = 40;
			int getSum(int parameter){
				//cannot access localVariable here
				return outerVaraiable+staticOuterVariable+finalLocalVariable+innerVariable+parameter;
			}
		}
		
		LocalClass local = new LocalClass();
		System.out.println(local.getSum(5));
		return local;
		
		
	}

}
