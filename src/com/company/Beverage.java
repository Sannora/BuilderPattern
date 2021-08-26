package com.company;

public abstract class Beverage implements Product{
    @Override
    public String name() {
        return null;
    }

    @Override
    public Packing packing() {
        return new PlasticCup();
    }

    @Override
    public float price() {
        return 0;
    }
}
