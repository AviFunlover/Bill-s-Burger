public class Hamburger {
    private String  name,
                    meat;
    private double price;
    private String breadRollType;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
        System.out.println(name + " hamburger on a " + breadRollType + "roll with " + meat +", price is " + price);
    }
    private String  addition1Name="NIL",
                    addition2Name="NIL",
                    addition3Name="NIL",
                    addition4Name="NIL";
    private double  addition1Price=0.0,
                    addition2Price=0.0,
                    addition3Price=0.0,
                    addition4Price=0.0;

    public void addHamburgerAddition1(String additionName , double additionPrice) {
        this.addition1Name = additionName;
        this.addition1Price = additionPrice;
        System.out.println("Added " + additionName + " for an extra " + additionPrice);
    }
    public void addHamburgerAddition2(String additionName , double additionPrice) {
        this.addition2Name = additionName;
        this.addition2Price = additionPrice;
        System.out.println("Added " + additionName + " for an extra " + additionPrice);
    }
    public void addHamburgerAddition3(String additionName , double additionPrice) {
        this.addition3Name = additionName;
        this.addition3Price = additionPrice;
        System.out.println("Added " + additionName + " for an extra " + additionPrice);
    }
    public void addHamburgerAddition4(String additionName , double additionPrice) {
        this.addition4Name = additionName;
        this.addition4Price = additionPrice;
        System.out.println("Added " + additionName + " for an extra " + additionPrice);
    }

    public double itemizeHamburger() {
        return (this.price + this.addition1Price + this.addition2Price + this.addition3Price + this.addition4Price);
    }
}
