import java.util.ArrayList;
import java.util.HashSet;

public class Farm {

    private HashSet<Plant> plants;
    private HashSet<Animal> animals;
    private double farm_area;

    public Farm(){
        farm_area = 100;
        plants = new HashSet<>();
        animals = new HashSet<>();
    }

    public HashSet<Plant> getFlowers() {
        return plants;
    }

    public void setFlowers(HashSet<Plant> plants) {
        this.plants = plants;
    }

    public double getFarm_area() {
        return farm_area;
    }

    public void setFarm_area(double farm_area) {
        this.farm_area = farm_area;
    }

    public HashSet<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(HashSet<Animal> animals) {
        this.animals = animals;
    }

    public void plant(Plant plant){
        if (!(plants.size() > 5)){
            plants.add(plant);
        }
    }

    public void water(Plant plant){
        plant.chanceOfGrowth++;
    }

    public void harvest(Plant plant){
        plants.remove(plant);
    }

    public Plant get_flower(int index){
        Plant[] temp = plants.toArray(Plant[]::new);
        return temp[index];
    }
}
