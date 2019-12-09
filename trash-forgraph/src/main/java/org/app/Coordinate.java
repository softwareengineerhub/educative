/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.app;

/**
 *
 * @author DProkopiuk
 */
public class Coordinate {

    private int i;
    private int j;
    private int value;

    public Coordinate(int i, int j, int value) {
        this.i = i;
        this.j = j;
        this.value = value;
    }

    public Coordinate() {
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

}
