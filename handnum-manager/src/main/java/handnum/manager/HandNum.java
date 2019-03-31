package handnum.manager;


/**
 * @author hk
 * @version 1.0
 */
public class HandNum implements HandNumMatch {

    private String material;

    private double num;

    public HandNum(String material, double num) {
        this.material = material;
        this.num = num;
    }

    @Override
    public boolean isMatch(Demand demand) {
        if (demand==null)return false;
        return demand.getMaterial().equals(this.material);
    }

    @Override
    public void match(Demand demand){
        if (demand==null || demand.getNum()<=0 || this.num<=0){
            return;
        }
        if (demand.getNum()<=this.num){
            this.num=this.num-demand.getNum();
            demand.setNum(0);
        }else{
            demand.setNum(demand.getNum()-this.num);
            this.num=0;
        }
    }

    public double getNum() {
        return num;
    }
}
