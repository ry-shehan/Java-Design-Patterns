package org.shehan.ry.facade;

public final class RaceFacade {

    private final Sprinter sprinter;
    private final RoadRunner roadRunner;

    public RaceFacade() {
        this.sprinter = new Sprinter();
        this.roadRunner = new RoadRunner();
    }

    public void prepareRace() {
        sprinter.prepare();
        sprinter.ready();
        roadRunner.breathe();
    }

    public void startRace() {
        sprinter.run();
        roadRunner.run();
    }

}
