public class Snake extends Animal {

    public Snake(String name, int weightKG) {
        super(name, weightKG);
        this.setFoodType(FoodType.ORMPELLETS);
        this.setPortionSize(20);
    }
}
