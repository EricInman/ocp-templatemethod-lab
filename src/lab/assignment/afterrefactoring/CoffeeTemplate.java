package lab.assignment.afterrefactoring;

public abstract class CoffeeTemplate {

    public final void prepareCoffee(){
        boilWater();
        brewEspresso();
        addIngredients();
        finalTouch();
        System.out.println(">>Serving coffee");
    }

    private void boilWater()
    {
        System.out.println("Boiling water");
    }

    private void brewEspresso()
    {
        System.out.println("Brewing expresso");
    }

    protected abstract void addIngredients();
    protected abstract void finalTouch();
}
