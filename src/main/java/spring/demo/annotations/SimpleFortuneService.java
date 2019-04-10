package spring.demo.annotations;

import org.springframework.stereotype.Component;

@Component
public class SimpleFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "Work hard for all Day!";
    }

}
