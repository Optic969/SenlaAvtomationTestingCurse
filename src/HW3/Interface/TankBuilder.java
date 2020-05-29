package HW3.Interface;

public abstract class TankBuilder {
    protected Tank tank;

    public Tank getTank() {
        return tank;
    }

    public void createNewTank() {
        tank = new Tank();
    }

    public abstract void buildHull();
    public abstract void buildEngine();
    public abstract void buildGun();
    public abstract void buildTracks();
}
