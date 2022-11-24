package faq;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class GenerateRandomNumber {

	public static void main(String[] args) {
		
		//Approach 1 using Random class
//		Random ran=new Random();
//		int ran_num=ran.nextInt(1000);
//		System.out.println(ran_num);
		
//		Approach 2 using MAth class
		int ran=(int) (Math.random()*9000)+100000;
		System.out.println(ran);
		
//		Appraoch 3 using commons-lang api
//		String ran=RandomStringUtils.randomNumeric(5);
//		System.out.println(ran);
	}

}
