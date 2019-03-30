package com.nc.handnummatch;

public class ProjectHandNum implements Match {

    private final String project;

    private Match match;

     ProjectHandNum(Match match, String project) {
        this.match = match;
        this.project = project;
    }


    @Override
    public boolean isMatch(Required required) {
        return this.match.isMatch(required)&&this.project.equals(required.getProject());
    }

    @Override
    public double match(Required required) {
       return this.match.match(required);
    }
}
