package udemy.spring.training;

public class SwimCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Swim like a fish!";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
