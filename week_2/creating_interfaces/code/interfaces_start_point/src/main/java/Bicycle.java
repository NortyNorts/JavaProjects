public class Bicycle implements IMove implements IStar implments IStop{
    private int distanceTravelled;

    public Bicycle() {
        this.distanceTravelled = 0;
    }

    public int getDistanceTravelled() {
        return distanceTravelled;
    }

    public void move(int distance){
        distanceTravelled += distance;
    }

    public void start(String message){
         message;
    }

}
