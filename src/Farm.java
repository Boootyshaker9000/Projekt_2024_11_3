import java.util.ArrayList;

public class Farm {

    private ArrayList<Plant> plants;
    private ArrayList<Animal> animals;
    private double farm_area;

    public Farm(){
        farm_area = 100;
        plants = new ArrayList<>();
        animals = new ArrayList<>();
    }

    public ArrayList<Plant> getFlowers() {
        return plants;
    }

    public void setFlowers(ArrayList<Plant> plants) {
        this.plants = plants;
    }

    public double getFarm_area() {
        return farm_area;
    }

    public void setFarm_area(double farm_area) {
        this.farm_area = farm_area;
    }

    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(ArrayList<Animal> animals) {
        this.animals = animals;
    }

    public void plant(Plant plant){
        plants.add(plant);
    }

    public void water(Plant plant){
        plant.chanceOfGrowth++;
    }
}
