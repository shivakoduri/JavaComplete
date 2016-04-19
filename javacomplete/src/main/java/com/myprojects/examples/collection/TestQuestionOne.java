/**
 * 
 */
package com.myprojects.examples.collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * @author shiva koduri
 *
 */
public class TestQuestionOne {
	
	public static final Logger LOGGER = LoggerFactory.getLogger(TestQuestionOne.class);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		int n=5, m=3, l=2;
//		System.out.println(passCount(5,3,2));
		System.out.println(uniqueValue(4,new int[]{2,1,1,0}));

	}
	
	/**
	 * 
	 * The point first height1 person tells he 2,which means there are 2 tallest persons to his left
	 * height2 person tells 1, 1 person to left, hegith 3 person tells 1, 1 person to left
	 * height 4 person tell 0 , no persons to left
	 * 
	 */
	//{2,1,1,0}  {4,2,1,3} 
	public static int[] uniqueValue(int input1, int[] input2){
		System.out.println("given input:" + input1);
		int[] emp = new int[input1];
		int[][] empGrtIndx = new int[input1][input1];
		
		int index=1;
		for(int i=0;i<input2.length;i++){
			emp[i]=index;
			++index;
		} 
		
//		for(int i=0;i<input1;i++){
//			int tmp = emp[i];
//			int cnt =0;
//			for(int j=0;j<input1;j++){
//				if(tmp<emp[j]){
//					++cnt;
//				}
//			}
//			empGrtIndx[i]=cnt;
//		}
		
//		int[] temp = new int[input1];
//		for(int i=0;i<input2.length;i++){
//			temp[input2[i]]=emp[i];
//		}
//		
//		
//		for(int i=0;i<input2.length;i++){
//			System.out.println(emp[i]+","+temp[i]);
//		}
		
		
		for(int i=0;i<input2.length;i++){
			int temp = emp[i];
			empGrtIndx[i][0]=temp;
			for(int j=1;j<input2.length&&temp<input2.length;j++){
				empGrtIndx[i][j]=++temp;
			}
		}
		
		
		for (int i = 0; i < input2.length; i++) {
			for (int j = 1; j < input2.length; j++) {
				if (empGrtIndx[i][j] != 0) {
					System.out.println(emp[i] + "->" + empGrtIndx[i][j]);
				}

			}
		}

		
		
		return input2;
	}
	
//	public static int passCount(int n, int m, int l){
	public static int passCount(int input1, int input2, int input3){
		int[] numArry = new int[input1];
		int[] cntArry = new int[input1];
		int p; // check if p is even or odd
		//l is the increment count, m is the final count 
		
		for(int i=0;i<input1;i++){
			numArry[i] = i+1;
		}
		
		for(int i=0;i<input1;i++){
			cntArry[i]=0;
		}
		
		
		int finalVal=0;
		int i=1;
		int totalCnt = 0;
		int strtPoint;
		cntArry[0]=1;
		int index=1;
		
		int strtCnt = 1;
		System.out.println("Right Side:strtCnt:"+strtCnt+",index:"+index);
		while(!(finalVal == input2)){
			if(strtCnt%2 == 0){ //even number
				index-=input3;
				if(index<0){
					index=input1-1;
				}
				strtPoint = numArry[index];
				cntArry[index] = cntArry[index]+1;
				if(cntArry[i] == input2){
					finalVal =cntArry[i];
				}
				strtCnt = strtPoint;
				totalCnt+=cntArry[index];
				for(i=0;i<input1;i++){
					if(strtCnt==numArry[i]){
						index = i;
						break;
					}
				}
				totalCnt+=cntArry[index];
			}else{ //odd number
				index+=input3;
				if(index>input1-1){
					index=input1-1;
				}
				strtPoint = numArry[index];
				cntArry[index] = cntArry[index]+1;
				if(cntArry[i] == input2){
					finalVal =cntArry[i];
				}
				strtCnt = strtPoint;
				totalCnt+=cntArry[index];
				for(i=1;i<=input1;i++){
					if(strtCnt==numArry[i]){
						index = i;
						break;
					}
				}
			}
		}
		
		
		return totalCnt > 0 ? totalCnt : -1;
	}

}
