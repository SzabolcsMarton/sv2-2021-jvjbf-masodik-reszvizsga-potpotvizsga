package railwaystation;

public abstract class Train {

    public static final int LENGTH_OF_WAGON = 15;

    private String name;
    private final int numberOfWagons;

    public Train(int numberOfWagons) {
        this.numberOfWagons = numberOfWagons;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getTotalLength(){
        return numberOfWagons * LENGTH_OF_WAGON;
    }

    abstract public int calculateTravellingPeople();

    public String getName() {
        return name;
    }

    public int getNumberOfWagons() {
        return numberOfWagons;
    }

}
