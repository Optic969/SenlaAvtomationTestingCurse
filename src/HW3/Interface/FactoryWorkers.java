package HW3.Interface;

public class FactoryWorkers {

    private TankBuilder tankBuilder;

    public void setTankBuilder(TankBuilder tankBuilder) {
        this.tankBuilder = tankBuilder;
    }

    public Tank getTank() {
        return tankBuilder.getTank();
    }

    public void constructTank() {
        tankBuilder.createNewTank();
        tankBuilder.buildHull();
        tankBuilder.buildEngine();
        tankBuilder.buildGun();
        tankBuilder.buildTracks();
    }
}
