package inheritance;

public interface EggLayer {
    default public SuperClass identifyMyself(int i) {
        return new SuperClass();
    }
}
