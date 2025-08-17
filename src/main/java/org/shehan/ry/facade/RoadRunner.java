package org.shehan.ry.facade;

public class RoadRunner implements Runner {

    public void breathe(){
        System.out.println("Road Runner : Getting long breath");
    }

    @Override
    public void run() {
        System.out.println("Road Runner : I'm road running");
    }
}
