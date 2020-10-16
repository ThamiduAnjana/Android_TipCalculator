package com.example.tipcalculator;

public class TipCalculator {
    private float tip;
    private float bill;

    public TipCalculator (float tip, float bill){
        setTip(tip);
        setBill(bill);
    }

    public float getTip() {
        return tip;
    }

    public void setTip(float tip) {
        this.tip = tip;
    }

    public float getBill() {
        return bill;
    }

    public void setBill(float bill) {
        this.bill = bill;
    }

    public float tipAmount(){
        return (bill * tip);
    }

    public float totalAmount(){
        return (bill + tipAmount());
    }

}
