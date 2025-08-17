package org.shehan.ry.facade;

public class Main {

    public static void main(String[] args) {

        RaceFacade raceFacade = new RaceFacade();
        raceFacade.prepareRace();
        raceFacade.startRace();
    }
}
