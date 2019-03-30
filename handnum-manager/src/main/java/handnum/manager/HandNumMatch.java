package handnum.manager;

public interface HandNumMatch {

    boolean isMatch(Demand demand);

    double match(Demand demand);
}
