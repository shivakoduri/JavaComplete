/**
 * 
 */
package com.myprojects.examples.java.basic.innerclass;

/**
 * @author Admin 
 *         A static member class is defined like a member class, but with
 *         the keyword static. Despite its position inside another class, a
 *         static member class is actually an "outer" class--it has no special
 *         access to names in its containing class. To refer to the static inner
 *         class from a class outside the containing class, use the syntax
 *         OuterClassName.InnerClassName. A static member class may contain
 *         static fields and methods.
 *
 */
public class StaticMemeberClassDemo {
	int outerVariable = 100;
	static int staticOuterVariable = 200;
	
	static class StaticMemberInnerClass{
		int innerVariable = 20;
		
		int getSum(int parameter){
			//cannot access outerVariable here
			return innerVariable+staticOuterVariable+parameter;
		}
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StaticMemeberClassDemo outer = new StaticMemeberClassDemo();
		StaticMemberInnerClass inner = new StaticMemberInnerClass();
		System.out.println(inner.getSum(3));
		outer.run();

	}

	void run(){
		StaticMemberInnerClass localInner = new StaticMemberInnerClass();
		System.out.println(localInner.getSum(5));
	}
}
