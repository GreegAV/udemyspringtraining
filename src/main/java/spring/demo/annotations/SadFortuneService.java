package spring.demo.annotations;

public class SadFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "It's bad day today!";
    }
}
