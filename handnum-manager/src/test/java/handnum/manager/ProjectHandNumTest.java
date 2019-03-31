package handnum.manager;

import org.junit.Assert;
import org.junit.Test;

public class ProjectHandNumTest {

    @Test
    public void testIsMatchForMatchIsNull(){

        Demand demand = new Demand("1","12","123",123);

        ProjectHandNum projectHandNum = new ProjectHandNum(null,"12312");

        Assert.assertEquals(projectHandNum.isMatch(demand),false);
    }

    @Test
    public void testIsMatchForDemandIsNull(){
        HandNum handNum = new HandNum("12",12);
        ProjectHandNum projectHandNum = new ProjectHandNum(handNum,"12312");
        Assert.assertEquals(projectHandNum.isMatch(null),false);
    }

    @Test
    public void testIsMatch(){
        HandNum handNum = new HandNum("12",12);
        ProjectHandNum projectHandNum = new ProjectHandNum(handNum,"123");
        Demand demand = new Demand("1","12","123",123);
        Assert.assertEquals(projectHandNum.isMatch(demand),true);
    }

    @Test
    public void testIsMatchForProject(){
        HandNum handNum = new HandNum("12",12);
        ProjectHandNum projectHandNum = new ProjectHandNum(handNum,"231231231");
        Demand demand = new Demand("1","12","123",123);
        Assert.assertEquals(projectHandNum.isMatch(demand),false);
    }

    @Test
    public void testIsMatchForProjectIsNull(){
        HandNum handNum = new HandNum("12",12);
        ProjectHandNum projectHandNum = new ProjectHandNum(handNum,"231231231");
        Demand demand = new Demand("1","12",null,123);
        Assert.assertEquals(projectHandNum.isMatch(demand),false);
    }
}
