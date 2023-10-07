package com.practicejava2;

import java.util.Scanner;

public class RahulWeaks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter number between 1 to 7");
		int num = scn.nextInt();
		
		switch(num) {
		case 1 : System.out.println("Monday is Selected");
		break;
		
		case 2 : System.out.println("Tuesday is Selected");
		break;
		
		case 3 : System.out.println("Wednesday is Selected");
		break;
		
		case 4 : System.out.println("Thursday is Selected");
		break;
		
		case 5 : System.out.println("Friday is Selected");
		break;
		
		case 6 : System.out.println("Saturday is Selected");
		break;
		
		case 7 : System.out.println("Sunday is Selected");
		break;
		
		default : System.out.println("Enter Right number ... Between 1 to 10");
		break;
		 
		}
	}
	}
