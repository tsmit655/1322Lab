class Blueprint {
    private final int numOfStories;
    private final int numOfApartments;
    private  float oRate;
    private  boolean isFullyOcc;

    public Blueprint(){
        numOfStories = 10;
        numOfApartments = 20;
        oRate = 1.0f;
        isFullyOcc = true;
    }
    public Blueprint(int numOfStories,int numOfApartments,float oRate){
        this.numOfStories = numOfStories;
        this.numOfApartments = numOfApartments;
        this.oRate = oRate;
        this.isFullyOcc = oRate == 1.0f;
    }
    public int getNumOfStories(){
        return this.numOfStories;
    }
    public int getNumOfApartments(){
        return this.numOfApartments;
    }
    public float getORate(){
        return this.oRate;
    }
    public boolean isFullyOcc(){
        return this.isFullyOcc;
    }
    public void setORate(float oRate){
        this.oRate = oRate;
        this.isFullyOcc = oRate == 1.0f;
    }
}
public class Lab14A {
    public static void main(String[] args){
        Blueprint building1 = new Blueprint();
        Blueprint building2 = new Blueprint(30,30,0.75f);
        System.out.println("Year 2020: ");
        System.out.println("Building 1 has " +building1.getNumOfStories()+ " floors, " +building1.getNumOfApartments()+ " apartments, and is "
                +(float)(building1.getORate() * 100.0)+ "% occupied. Full? " +building1.isFullyOcc());
        System.out.println("Building 2 has " +building2.getNumOfStories()+ " floors, " +building2.getNumOfApartments()+ " apartments, and is "
                +(float)(building2.getORate() * 100.0)+ "% occupied. Full? " +building2.isFullyOcc());
                building1.setORate(0.0f);
                building2.setORate(1.0f);
                System.out.println();
                System.out.println("Many years pass.");
                System.out.println();
                System.out.println("Year 2043: ");
        System.out.println("Building 1 has " +building1.getNumOfStories()+ " floors, " +building1.getNumOfApartments()+ " apartments, and is "
                +(float)(building1.getORate() * 100.0)+ "% occupied. Full? " +building1.isFullyOcc());
        System.out.println("Building 2 has " +building2.getNumOfStories()+ " floors, " +building2.getNumOfApartments()+ " apartments, and is "
                +(float)(building2.getORate() * 100.0)+ "% occupied. Full? " +building2.isFullyOcc());
                System.out.println();

        System.out.println("Looks like people prefer taller buildings. ");

    }
}
