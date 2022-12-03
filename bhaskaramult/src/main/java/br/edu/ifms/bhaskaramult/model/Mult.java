package br.edu.ifms.bhaskaramult.model;

import lombok.Data;

@Data
public class Mult{
    private int x;
    private int y;

     public Long getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

     public Long getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }



}