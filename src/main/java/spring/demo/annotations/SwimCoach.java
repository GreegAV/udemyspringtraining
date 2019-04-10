package spring.demo.annotations;

public class SwimCoach implements Coach {
    private FortuneService fortuneService;

    public SwimCoach(FortuneService theFortuneService) {
        fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Swim 1km as a worm up.";
    }

    @Override
    public String getFortune() {
        return fortuneService.getFortune();
    }
}
