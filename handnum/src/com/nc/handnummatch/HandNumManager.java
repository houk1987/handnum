package com.nc.handnummatch;

import java.util.ArrayList;
import java.util.List;

class HandNumManager {

    private List<Match>  tyHandNum;

    private List<Match>  zyHandNum;


     List<Match> getTyHandNum() {
        if (this.tyHandNum==null){
            this.initTyHandNum();
        }
        return tyHandNum;
    }

     List<Match> getZyHandNum() {
        if (this.zyHandNum==null){
            this.initZyHandNum();
        }
        return zyHandNum;
    }

    private void initTyHandNum() {
        this.tyHandNum = new ArrayList<>();
        this.tyHandNum.add(new HandNum("1",2));
        this.tyHandNum.add(new HandNum("2",1));
    }

    private void initZyHandNum() {
        this.zyHandNum = new ArrayList<>();
        this.zyHandNum.add(new ProjectHandNum(new HandNum("1",2),"a"));
        this.zyHandNum.add(new ProjectHandNum(new HandNum("1",2),"b"));
    }
}
