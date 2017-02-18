//Ryan Nguyen
//Laptop subclass
public class Laptop extends Computer
{
    private int screenSize = 0;
    private double laptopCost = 0;
    public Laptop(String s, String processor, int ram, int hardDrive, int screen)
    {
        super(s, processor, ram, hardDrive);
        screenSize = screen;
    }
    private void setLaptopCost()
    {
        laptopCost = laptopCost = 300 + 8.00 * this.RAM + 0.19 * this.hardDrive + 13.83 * this.screenSize;
    }
    public String toString()
    {
         return ("Desktop:" + "\n" + "-------" + "\n" + "CPU: " + this.processor + "\n" + "RAM: " + this.RAM + "\n" + "HDD: " + this. hardDrive + "\n" + "Screen size: " + this.screenSize + "\n" + "Cost: " + this.getCost());
    }
    public double getCost()
    {
        return laptopCost;
    }
}