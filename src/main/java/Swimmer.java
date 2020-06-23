public class Swimmer extends Athlete implements ISwim  {

    @Override
    public void swim(int distance) {
        this.distanceTravelled += distance;
    }
}
