package com.nc.handnummatch;

import java.util.List;

public class Required {

    private String material;

    private String project;

    private double num;

    public Required(String material, String project) {
        this.material = material;
        this.project = project;
    }

    String getMaterial() {
        return material;
    }

    String getProject() {
        return project;
    }


    double getNum() {
        return num;
    }

    void match(List<Match> matches){
        for (Match match: matches) {
            if (this.num<=0){
                return;
            }

            if (match.isMatch(this)){
                this.num=match.match(this);
            }
        }
    }
}
