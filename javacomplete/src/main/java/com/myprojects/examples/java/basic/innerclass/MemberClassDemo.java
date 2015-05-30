/**
 * 
 */
package com.myprojects.examples.java.basic.innerclass;

/**
 * @author Admin
 *
 *         A member class is defined at the top level of the class. It may have
 *         the same access modifiers as variables (public, protected, package,
 *         static, final), and is accessed in much the same way as variables of
 *         that class.
 *
 */
public class MemberClassDemo {
	
	int outerVariable = 100;
	
	class InnerMemberClass{
		int innerVariable = 20;
		
		int getSum(int parameter){
			return innerVariable+outerVariable+parameter;
		}
	}
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MemberClassDemo outer = new MemberClassDemo();
		InnerMemberClass inner = outer.new InnerMemberClass();
		System.out.println(inner.getSum(3));
		outer.run();
	}
	
	
	void run(){
		InnerMemberClass localInner = new InnerMemberClass();
		System.out.println(localInner.getSum(5));
	}

}
