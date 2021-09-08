package inheritance;

public interface FireBreather {
        default public String identifyMyself() {
            return "I am able to breathe fire.";
        }
}
