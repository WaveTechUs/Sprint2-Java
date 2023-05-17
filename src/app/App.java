package app;

import java.time.LocalDate;

import models.feedback.Feedback;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Feedback fd = new Feedback(1,"sf", LocalDate.now());
		
		System.out.println();
	}

}
