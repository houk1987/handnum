package handnum.manager;

/**
 * 需求信息
 * @author hk
 * @version 1.0
 */
public class Demand {

    private String number;

    private String material;

    private String project;

    private double num;

    public Demand(String number, String material, String project, double num) {
        this.number = number;
        this.material = material;
        this.project = project;
        this.num = num;
    }

    public String getNumber() {
        return number;
    }

    public String getMaterial() {
        return material;
    }

    public String getProject() {
        return project;
    }

    public double getNum() {
        return num;
    }
}
