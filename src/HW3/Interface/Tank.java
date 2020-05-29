package HW3.Interface;

public class Tank {
    private String hull = null;
    private String engine = null;
    private String gun = null;
    private String tracks = null;

    public void setHull(String hull) {
        this.hull = hull;
    }
    public void setEngine(String engine) {
        this.engine = engine;
    }
    public void setGun(String gun) {
        this.gun = gun;
    }
    public void setTracks(String tracks) {
        this.tracks = tracks;
    }

    public String getEngine() {
        return engine;
    }

    public String getGun() {
        return gun;
    }

    public String getHull() {
        return hull;
    }

    public String getTracks() {
        return tracks;
    }

    @Override
    public String toString() {

        String result = "Tank Info: " + "Hull " + getHull() + " Engine " + getEngine() + " Gun " + getGun() + " Tracks " + getTracks();
        return result;
    }
}


