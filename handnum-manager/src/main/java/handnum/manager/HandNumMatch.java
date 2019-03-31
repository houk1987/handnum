package handnum.manager;

public interface HandNumMatch {

    boolean isMatch(Demand demand);

    void match(Demand demand);
}
