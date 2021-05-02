package com.tranjt.springdemo;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;	
	
	public TrackCoach() {
		
	}
	
	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {	
		return "Just do it: " + fortuneService.getFortune();
	}
	
	// add an init method
	public void doMyStartupStuff() {
		System.out.println("TrackCoach: inside method doMyStartupMethod");
	}
	
	// add a destroy method
	public void doMyDestroyStuff() {
		System.out.println("TrackCoach: inside method doMyDestroyStuff");
	}
}
