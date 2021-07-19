package com.bridgelabz.programs;

import java.util.Scanner;

public class MoodAnalyzer {
	public static void main(String[] args) {

		System.out.println("Welcome To Mood Analyzer Problem");

		MoodAnalyzer obj = new MoodAnalyzer();
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the mood");
		String message = scanner.next();
		String analyzer = obj.analyseMood(message);
		System.out.println(analyzer);
	}

	public String analyseMood(String message) {

		if (message.toLowerCase().contains("sad"))
			return "SAD";

		return "HAPPY";

	}

}
