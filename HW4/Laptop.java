//Ryan Nguyen
//Laptop subclass
public class Laptop extends Computer
{
    private double screenSize = 0;
    private double laptopCost = 0;
    public Laptop(String s, String processor, int ram, int hardDrive, double screen)
    {
        super(s, processor, ram, hardDrive);
        screenSize = screen;
    }
    public String toString()
    {
         return ("Laptop:" + "\n" + "-------" + "\n" + "CPU: " + this.getProcessor() + "\n" + "RAM: " + this.RAM + " GB" + "\n" + "HDD: " + this. hardDrive + " GB" + "\n" + "Screen: " + this.screenSize + "\"" +"\n" + "Cost: $" + this.getCost());
    }
    public double getCost()
    {
        laptopCost = laptopCost = 300 + 8.00 * this.RAM + 0.19 * this.hardDrive + 13.83 * this.screenSize;
        return laptopCost;
    }
}