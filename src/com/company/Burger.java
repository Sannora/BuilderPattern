package com.company;

public abstract class Burger implements Product{
    @Override
    public String name() {
        return null;
    }

    @Override
    public Packing packing() {
        return new PaperWrap();
    }

    @Override
    public float price() {
        return 0;
    }
}
