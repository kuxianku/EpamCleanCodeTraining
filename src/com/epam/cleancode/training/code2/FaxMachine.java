package com.epam.cleancode.training.code2;

class FaxMachine implements IMachine {

    @Override
    public void print() {
        throw new RuntimeException("Opeartion Not Supported!");
    }

    @Override
    public void scan() {
        throw new RuntimeException("Opeartion Not Supported!");
    }

    @Override
    public void fax() {
        // implement fax
    }

    @Override
    public void copy() {
        throw new RuntimeException("Opeartion Not Supported!");
    }
}