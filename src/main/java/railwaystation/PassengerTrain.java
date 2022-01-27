package railwaystation;

public class PassengerTrain extends Train {

    public static final int PEOPLE_PER_WAGON = 70;

    private final boolean hasDiningCar;

    public PassengerTrain(int numberOfWagons) {
        super(numberOfWagons);
        this.hasDiningCar = false;
    }

    public PassengerTrain(String name, int numberOfWagons) {
        super(numberOfWagons);
        super.setName(name);
        this.hasDiningCar = true;
    }

    public boolean hasDiningCar() {
        return hasDiningCar;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getNumberOfWagons() {
        return super.getNumberOfWagons();
    }

    @Override
    public int calculateTravellingPeople() {
        if (hasDiningCar) {
            return (super.getNumberOfWagons() - 1) * PEOPLE_PER_WAGON;
        }
        return super.getNumberOfWagons() * PEOPLE_PER_WAGON;
    }

}
