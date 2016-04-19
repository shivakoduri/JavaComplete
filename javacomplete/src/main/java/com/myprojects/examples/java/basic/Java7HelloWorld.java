/**
 * 
 */
package com.myprojects.examples.java.basic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author shiva koduri
 *
 */
class Java7HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Java7HelloWorld().testDinamond();
	}

	public void testStringInSwitch(String param) {

		final String JAVA5 = "Java 5";
		final String JAVA6 = "Java 6";
		final String JAVA7 = "Java 7";

		if (param.equals(JAVA5)) {
			System.out.println(JAVA5);
		} else if (param.equals(JAVA6)) {
			System.out.println(JAVA6);
		} else if (param.equals(JAVA7)) {
			System.out.println(JAVA7);
		}

		// ---Same as---

		switch (param) {
		case JAVA5:
			System.out.println(JAVA5);
			break;
		case JAVA6:
			System.out.println(JAVA6);
			break;
		case JAVA7:
			System.out.println(JAVA7);
			break;
		}
	}

	public void testBinaryIntegralLiterals(){
        
        int binary = 0b1000; //2^3 = 8
        int number = 8;
        
        if (binary == number){
            System.out.println(true);
        } else{
            System.out.println(false);
        }
    }

	public void testUnderscoresNumericLiterals() {
    
        int oneMillion_ = 1_000_000;
        int oneMillion = 1000000;
        
        if (oneMillion_ == oneMillion){
            System.out.println(true);
        } else{
            System.out.println(false);
        }
    }

	public void testBinaryIntegralLiterals2(){
        
        int number = 8;
        
        if (0b1000 == number){
            System.out.println(true);
        } else{
            System.out.println(false);
        }
    }

	public void testMultiCatch(){
        
        try {
            throw new FileNotFoundException("FileNotFoundException");
        } catch (FileNotFoundException fnfo) {
            fnfo.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        
         //---Same as---
//        
//        try {
//            throw new FileNotFoundException("FileNotFoundException");
//        } catch (FileNotFoundException | IOException fnfo) {
//            fnfo.printStackTrace();
//        }
    }

	public void testDinamond(){
        
        List<String> list1 = new ArrayList<String>();
        Map<String, List<String>> map1 = new HashMap<String, List<String>>();
        System.out.println(map1);
        
        
         //---Same as---
        
        List<String> list = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        System.out.println(map);
    }

	public void testTryWithResourcesStatement() throws FileNotFoundException, IOException{
        
         FileInputStream in1 = null;
        try {
            in1 = new FileInputStream("java7.txt");
            
            System.out.println(in1.read());
            
        } finally {
            if (in1 != null) {
                in1.close();
            }
        }
        
         //---Same as---
        
        try (FileInputStream in = new FileInputStream("java7.txt")) {
            
            System.out.println(in.read());
            
        }
    }
}
