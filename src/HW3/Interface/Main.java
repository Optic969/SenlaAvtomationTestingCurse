package HW3.Interface;

public class Main {
    public static void main(String[] args) {
        FactoryWorkers workers = new FactoryWorkers();
        TankBuilder tankBuilderParts = new TankBuilderParts();


        workers.setTankBuilder(tankBuilderParts);
        workers.constructTank();

        Tank tank = workers.getTank();
        System.out.println("Tank was created with : ");
        System.out.println("Hull " +  tank.getHull());
        System.out.println("Engine" + tank.getEngine());
        System.out.println("Gun" + tank.getGun());
        System.out.println("Tracks" + tank.getTracks());
        //OR TO GET DETAILS
        System.out.println("" + tank );
    }
}



