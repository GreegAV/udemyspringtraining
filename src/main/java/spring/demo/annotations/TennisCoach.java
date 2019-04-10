package spring.demo.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

    @Autowired
    @Qualifier("simpleFortuneService")
    private FortuneService fortuneService;

//    public TennisCoach(FortuneService theFortuneService) {
//        fortuneService = theFortuneService;
//    }
//
    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley!";
    }

    @Override
    public String getFortune() {
        return fortuneService.getFortune();
    }
}
