package org.shehan.ry.facade;

public class Sprinter implements Runner {

    public void prepare() {
        System.out.println("Sprinter : Dynamic warm-up");
    }

    public void ready() {
        System.out.println("Sprinter : Ready to run");
    }

    @Override
    public void run() {
        System.out.println("Sprinter : I'm Sprinter");
    }
}
