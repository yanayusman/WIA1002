public abstract class Vehicle {
    private double maxSpeed;
    protected double currentSpeed;

    public Vehicle(double maxspeed){
        this.maxSpeed = maxspeed;
    }

    public abstract void accelerate();

    public double getCurrentSpeed(){
        return this.currentSpeed;
    }

    public double getMaxSpeed(){
        return this.maxSpeed;
    }

    public void pedalToTheMetal(){
        while(currentSpeed < maxSpeed){
            accelerate();
        }
    }
}
