package udemy.spring.training;

public class TrackCoach implements Coach {

    private FortuneService fortuneService;
    private String email;
    private String team;

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public TrackCoach() {
        System.out.println("Inside no-arg constructor.");
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("Setting HappyFortuneSrvice.");
        this.fortuneService = fortuneService;
    }

    public TrackCoach(HappyFortuneService theFortuneService) {
        System.out.println("Constructor with argument.");
        fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return "Just do it! " + fortuneService.getFortune();
    }
}
