//Ryan Nguyen
//Laptop subclass
public class Laptop extends Computer
{
<<<<<<< HEAD
    private double screenSize = 0;
    private double laptopCost = 0;
    public Laptop(String s, String processor, int ram, int hardDrive, double screen)
=======
    private int screenSize = 0;
    private double laptopCost = 0;
    public Laptop(String s, String processor, int ram, int hardDrive, int screen)
>>>>>>> 2cd74ac0b3d16214dd4aa117d707adacab9663a4
    {
        super(s, processor, ram, hardDrive);
        screenSize = screen;
    }
<<<<<<< HEAD
    public String toString()
    {
         return ("Laptop:" + "\n" + "-------" + "\n" + "CPU: " + this.getProcessor() + "\n" + "RAM: " + this.RAM + " GB" + "\n" + "HDD: " + this. hardDrive + " GB" + "\n" + "Screen: " + this.screenSize + "\"" +"\n" + "Cost: $" + this.getCost());
    }
    public double getCost()
    {
        laptopCost = laptopCost = 300 + 8.00 * this.RAM + 0.19 * this.hardDrive + 13.83 * this.screenSize;
=======
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
>>>>>>> 2cd74ac0b3d16214dd4aa117d707adacab9663a4
        return laptopCost;
    }
}