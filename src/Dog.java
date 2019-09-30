public class Dog extends Animal implements IMammals {

    public Dog(String name, int weightKG) {
        super(name, weightKG);
        this.setFoodType(FoodType.HUNDFODER);
        this.setPortionSize(calculatePortionSize());
    }

    /**
     * Klassen Dog som ärver från Animal och implementerar ett Interface med metoden som räknar ut foder
     * @return
     */


    @Override
    public double calculatePortionSize() {
        int portionSize = this.getWeight() * 1000 / 100;
        return portionSize;
    }
}
