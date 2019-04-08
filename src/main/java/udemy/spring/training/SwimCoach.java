package udemy.spring.training;

public class SwimCoach implements Coach {
    private FortuneService fortuneService;

    public SwimCoach(FortuneService theFortuneService) {
        fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Swim like a fish!";
    }

    @Override
    public String getDailyFortune() {
        return "Swim better! " + fortuneService.getFortune();
    }
}
