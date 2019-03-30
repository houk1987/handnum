package com.nc.handnummatch;

public class HandNum implements Match {

    private String material;

    private double num;


    HandNum(String material, double num) {
        this.material = material;
        this.num = num;
    }


    @Override
    public boolean isMatch(Required required) {
        return this.material.equals(required.getMaterial());
    }

    @Override
    public double match(Required required) {
        final double mxq = required.getNum();
        if (mxq <= this.num) {
            this.num = this.num - mxq;
            this.transfer(mxq);
            return 0;
        }

        this.transfer(this.num);
        final double result = mxq - this.num;
        this.num = 0;
        return result;
    }

    private void transfer(double num) {
        if (num == 0) return;
    }
}
