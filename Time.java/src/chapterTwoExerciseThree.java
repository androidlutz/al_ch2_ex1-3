//HEADER
//Program Name: Chapter 2 Exercise 3
//Author: Andrew Lutz
//Class: CS160 Fall 2019
//Date: 10/12/2019
//Description: An exercise concerning the calculation of time in seconds.


public class chapterTwoExerciseThree {

	public static void main(String[] args) {
	//Seconds since Midnight
		
		int hour = 13;
		int minute = 30;
		int seconds = 30;
		int secondsIn30Minutes = (minute * 60);
		int secondsIn13Hours = (hour * 3600);
		int secondsSinceMidnight = (secondsIn30Minutes + secondsIn13Hours + seconds);
		System.out.println("Seconds Since Midnight " + secondsSinceMidnight);
	
		
	//Seconds Remaining in the Day 
		double secondsInADay = 86400;
		double secondsRemainingInTheDay = (secondsInADay -secondsSinceMidnight );
		System.out.println("Seconds Remaining In The Day " + secondsRemainingInTheDay);
		
	//Percent Value of Time Remaining in The Day		
		double percentageOfTheDayThatHasPassed = ((secondsSinceMidnight / secondsInADay)  * 100);
		System.out.println("Percentage of the Day That Has Passed " + ("%")+ percentageOfTheDayThatHasPassed);
		
	//Time Elapsed in Seconds Since Beginning This Exercise
			
		int currentHour = 14;
		int currentminute = 55;
		int currentseconds = 30;
		int currentsecondsIn55Minutes = (currentminute * 60);
		int currentsecondsIn14Hours = (currentHour * 3600);
		int currentsecondsSinceMidnight = (currentsecondsIn55Minutes + currentsecondsIn14Hours + currentseconds);
		;
		double currenSsecondsRemainingInTheDay = (secondsInADay - currentsecondsSinceMidnight );
		System.out.println("Seconds since I started " + (currentsecondsSinceMidnight - secondsSinceMidnight));
		
		
/*		
Footer
		
Seconds Since Midnight 48630
Seconds Remaining In The Day 37770.0
Percentage of the Day That Has Passed %56.28472222222223
Seconds since I started 5100


		
	*/	
	}

}
