package com.tranjt.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	private String emailAdress;
	private String team;

	public CricketCoach() {
		System.out.println("CricketCoach from no arg constructor");
	}

	public CricketCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach from setter setFortuneService");
		this.fortuneService = fortuneService;
	}

	public String getEmailAdress() {
		return emailAdress;
	}

	public void setEmailAdress(String emailAdress) {
		System.out.println("CricketCoach from setter emailAdress");
		this.emailAdress = emailAdress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach from setter team");
		this.team = team;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
