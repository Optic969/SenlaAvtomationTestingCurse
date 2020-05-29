package HW3.Interface;

public class TankBuilderParts extends TankBuilder {

    @Override
    public void buildHull() {
        tank.setHull("Robotank");
    }

    @Override
    public void buildEngine() {
        tank.setEngine("LadaEngine");
    }

    @Override
    public void buildGun() {
        tank.setGun("BigFuckingGan9000");
    }

    @Override
    public void buildTracks() {
        tank.setTracks("MausTR");
    }
}
