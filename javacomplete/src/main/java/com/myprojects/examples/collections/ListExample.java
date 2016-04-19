/**
 * 
 */
package com.myprojects.examples.collections;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

/**
 * @author shiva koduri
 *
 */
public class ListExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		//TEST 1
//		String str = "Forget CVs..Save time . x x";
//		String str = "We test coders. Give us a try?";
		
//		String str = "We test coders. Give us a try?";
//		String str = "We test coders. Give us a try?And also me too add!";
//		String str = "We test coders? Give us a try?And also me too add!";
		String str = "Forget CVs!.Save time . x x ? to get this need some logic! oh yes.. well done!. . !";
		System.out.println(count(str));
//		
		
		//TEST 3
//			String s = "form";
//			String t = "from";
//			
//			System.out.println("SWAP o r".equals(solution(s,t)));
//			System.out.println(solution(s,t));
			
	    //TEST 4
//		String str =  "00:01:07,400-234-090\n"+
//				       "00:05:01,701-080-080\n"+
////				       "00:06:01,801-234-090\n"+
//				       "00:05:00,400-234-090";
////				       "00:02:04,200-234-090\n";
//		
//		System.out.println(solution(str));
	}
	
	public static int solution(String S){
		String[] callArry = S.split("\n");
		Map<String, Integer> callRateMap = new HashMap<String,Integer>();
		for(int i=0;i<callArry.length;i++){
			String[] arry2 = callArry[i].split("\\,");
			SimpleDateFormat printFormat = new SimpleDateFormat("HH:mm:ss");
			Date date;
			int rate=0;
			try {
				date = printFormat.parse(arry2[0]);
				rate = calRate(date.getHours(), date.getMinutes(), date.getSeconds());
				if(callRateMap.containsKey(arry2[1])){
					Integer nwRate = callRateMap.get(arry2[1]);
					callRateMap.put(arry2[1], rate+nwRate);
				}else{
					callRateMap.put(arry2[1], rate);
				}
			} catch (ParseException e) {
				System.out.println("Exception while retrieving the date from given source..");
			}
		}
		
		System.out.println(callRateMap);
		
		List<Integer> list = new ArrayList<Integer>();;
		for(String key: callRateMap.keySet()){
			list.add(callRateMap.get(key));
		}
		Collections.sort(list);
		
		return list.get(0);
	}
	
	private static int calRate(int hr, int min, int sec){
		if(min<5){
			return 3*((60*60*hr)+(60*min)+sec);
		}else if(min>=5){
			if(sec>0){
				return (min+1)*150;
			}else{
				return min*150;
			}
		}
		return 0;
	}
	
	//old code for task1
	public int solutions(String S) {
	       StringTokenizer str = new StringTokenizer(S, ".");
			List<String> list = new ArrayList<String>();
			while(str.hasMoreTokens()){
				list.add(str.nextToken());
			}
			System.out.println(list);
			Map<Integer, String> map = new HashMap<Integer,String>();
			
			for(String s1 : list){
				Integer count1 = 0;
				String[] ary = s1.split(" ");
				for(int i=0;i<ary.length;i++){
					count1++;
				}
				map.put(count1, s1);
			}
			
			Set<Integer> set = map.keySet();
			List<Integer> list1 = new ArrayList<Integer>(set);
			Collections.sort(list1);
			Collections.reverse(list1);
			
			return list1.get(0)-1;
	    }
	
	public static void getTime(String timeStamp){
		
		try {
			SimpleDateFormat parseFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SS");
			SimpleDateFormat printFormat = new SimpleDateFormat("HH:mm:ss");
			Date date = parseFormat.parse(timeStamp);
			System.out.println(date.getTime());
			System.out.println(printFormat.format(date)); // prints 09:30:51
			
			
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			String string = "2011-03-09T03:02:10.823Z";
			String pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";
			Date date = new SimpleDateFormat(pattern).parse(string);
			System.out.println(date); // Wed Mar 09 03:02:10 BOT 2011
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static int count(String str){
        String[] temp1;
        temp1 = str.split("\\.");
        List<String> sentences = new ArrayList<String>();
        for(int i = 0 ;i<temp1.length;i++){
        	if(temp1[i].indexOf("?")>0){
        		String[] temp2 = temp1[i].split("\\?");
        		for(int j=0;j<temp2.length;j++){
        			if(temp2[j].indexOf("!")>0){
        				String[] temp3 = temp2[j].split("\\!");
        				for(int k=0;k<temp3.length;k++){
        					sentences.add(temp3[k]);
        				}
        			}else{
        				sentences.add(temp2[j]);
        			}
        		}
        	}else if(temp1[i].indexOf("!")>0){
        		String[] temp2 = temp1[i].split("\\!");
        		for(int j=0;j<temp2.length;j++){
        			if(temp2[j].indexOf("?")>0){
        				String[] temp3 = temp2[j].split("\\?");
        				for(int k=0;k<temp3.length;k++){
        					sentences.add(temp3[k]);
        				}
        			}else{
        				sentences.add(temp2[j]);
        			}
        		}
        	}else{
        		sentences.add(temp1[i]);
        	}
        };
          
       Iterator<String> itr = sentences.iterator();
       int count=0;
       while(itr.hasNext()){
    	   String sen = itr.next().trim();
    	   if(!"".equals(sen)){
    		   System.out.println(sen);
    		   StringTokenizer st = new StringTokenizer(sen);
        	   if(st.countTokens()>count){
        		   count=st.countTokens();
        	   }
    	   }
    	   
       }
       
       return count;
	}
	
	
	public static int counts(String s){

		StringTokenizer str = new StringTokenizer(s, ".");
		List<String> list = new ArrayList<String>();
		while(str.hasMoreTokens()){
			if(str.nextToken().contains("?")){
			}
			list.add(str.nextToken());
			
		}
		System.out.println(list);
		Map<Integer, String> map = new HashMap<Integer,String>();
		
		for(String s1 : list){
			Integer count1 = 0;
			String[] ary = s1.split(" ");
			for(int i=0;i<ary.length;i++){
				count1++;
			}
			map.put(count1, s1);
		}
		
		
		
		
		
		
		Set<Integer> set = map.keySet();
		List<Integer> list1 = new ArrayList<Integer>(set);
		Collections.sort(list1);
		Collections.reverse(list1);
		
		return list1.get(0)-1;
	}
	

	
	public static String solution(String S, String T){
		int slength = S.length();
		int tlength = T.length();
		
		//SWAP
		if(slength == tlength){
			if(!S.equals(T)){
				char[] sCh = S.toCharArray();
				char[] tCh = T.toCharArray();
				char[] arr = new char[sCh.length];
				int j=0;
				
				for(int i =0 ; i<sCh.length ; i++){
					if(!(sCh[i] == tCh[i])){
						arr[j]=sCh[i];
						j++;
					}
				}
				String str ="";
				if(arr.length != 0){
					
					for(int i=0;i<j;i++){
						str += " ";
						str += arr[i];
						
					}
					
					return "SWAP" + str;
				}
			}else{
				return "NOTHING";
			}
			
		}else if(slength < tlength){ //INSERT
			char[] sCh = S.toCharArray();
			char[] tCh = T.toCharArray();
			
			if((tlength - slength)>1){
				return "IMPOSSIBLE";
			}
			
			for(int i =0 ; i<tCh.length; i++){
				if(!(sCh[i] == tCh[i])){
					return "INSERT " + tCh[i];
				}
			}
		}else if(slength > tlength){ //DELETE
			char[] sCh = S.toCharArray();
			char[] tCh = T.toCharArray();
			
			for(int i =0 ; i<sCh.length; i++){
				if(!(sCh[i] == tCh[i])){
					return "DELETE " + sCh[i];
				}
			}
		}
		return "";
	}
	

}
