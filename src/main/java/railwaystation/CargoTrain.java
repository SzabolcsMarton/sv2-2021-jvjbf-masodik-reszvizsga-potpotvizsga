package railwaystation;

public class CargoTrain extends Train{

    public CargoTrain(int numberOfWagon){
        super(numberOfWagon);

    }

    @Override
    public int calculateTravellingPeople() {
        int numberOfTravellingPeople = (int)(super.getNumberOfWagons() /10);
        if(numberOfTravellingPeople == 0){
            return 1;
        }
        return numberOfTravellingPeople;
    }
}
