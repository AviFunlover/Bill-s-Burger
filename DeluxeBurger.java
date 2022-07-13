public class DeluxeBurger extends Hamburger{
    private double priceOfChips = 2.75;
    private double priceOfDrink = 1.81;

    public DeluxeBurger() {
        super("Deluxe", "Sausage & Bacon", 14.54, "White");
        System.out.println("Added Chips for an extra " + priceOfChips);
        System.out.println("Added Drink for an extra " + priceOfDrink);
    }
    @Override
    public void addHamburgerAddition1(String additionName, double additionPrice) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }
    @Override
    public void addHamburgerAddition2(String additionName, double additionPrice) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }
    @Override
    public void addHamburgerAddition3(String additionName, double additionPrice) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }
    @Override
    public void addHamburgerAddition4(String additionName, double additionPrice) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public double itemizeHamburger() {
        return (super.itemizeHamburger() + this.priceOfDrink + this.priceOfChips);
    }
}
