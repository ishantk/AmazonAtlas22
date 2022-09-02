package com.amazon.atlas22.collections;

import java.util.Random;

public class RandomDemo {

	public static void main(String[] args) {
		
		
		Random random = new Random(12001L);
		int otp1 = random.nextInt();
		int otp2 = random.nextInt();
		
		double otp3 = random.nextDouble();
		
		double otp4 = random.nextGaussian();
		
		System.out.println("OTP1 is: "+otp1);
		System.out.println("OTP2 is: "+otp2);
		System.out.println("OTP3 is: "+otp3);
		System.out.println("OTP4 is: "+otp4);
		
		// Explore a way how to generate an OTP of 6 digits :)
		
		int otp5 = random.nextInt(999999);
		System.out.println("OTP5 is: "+otp5);

	}

}
