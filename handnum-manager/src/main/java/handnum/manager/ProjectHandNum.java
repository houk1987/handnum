package handnum.manager;

/**
 * @author hk
 * @version 1.0
 */
public class ProjectHandNum implements HandNumMatch{

    private final HandNumMatch match;

    private final String project;

    public ProjectHandNum(HandNumMatch match, String project) {
        this.match = match;
        this.project = project;
    }

    @Override
    public boolean isMatch(Demand demand) {
        if (this.match==null)return false;
        if (this.project==null)return false;
        return this.match.isMatch(demand)&&this.project.equals(demand.getProject());
    }

    @Override
    public void match(Demand demand) {
        this.match.match(demand);
    }
}
