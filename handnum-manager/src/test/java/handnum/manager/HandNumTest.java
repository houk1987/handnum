package handnum.manager;

import org.junit.Assert;
import org.junit.Test;

public class HandNumTest {

    @Test
    public void testIsMatch(){
        Demand demand = new Demand("1","12","1",12);
        HandNum handNum = new HandNum("12",12);
        Assert.assertEquals(handNum.isMatch(demand),true);
    }

    @Test
    public void testIsMatchForDemandIsNull(){
        HandNum handNum = new HandNum("12",12);
        Assert.assertEquals(handNum.isMatch(null),false);
    }

    @Test
    public void testMatch(){
        Demand demand = new Demand("1","12","1",12);
        HandNum handNum = new HandNum("12",12);
        handNum.match(demand);
        Assert.assertTrue(demand.getNum()==0);
    }

    @Test
    public void testMatch1(){
        Demand demand = new Demand("1","12","1",13);
        HandNum handNum = new HandNum("12",12);
        handNum.match(demand);
        Assert.assertTrue(demand.getNum()==1);
    }


    @Test
    public void testMatch2(){
        Demand demand = new Demand("1","12","1",6);
        HandNum handNum = new HandNum("12",12);
        handNum.match(demand);
        Assert.assertTrue(demand.getNum()==0);
        Assert.assertTrue(handNum.getNum()==6);
    }

    @Test
    public void testMatchForDemandIsNull(){
        HandNum handNum = new HandNum("12",12);
        handNum.match(null);
        Assert.assertTrue(handNum.getNum()==12);
    }
}
