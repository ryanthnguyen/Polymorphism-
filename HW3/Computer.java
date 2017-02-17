//Ryan Nguyen
//Computer abstract class
public abstract class Computer
{
   private String checkType = "";
   protected String processor = "";
   protected double RAM = 0;
   protected double hardDrive = 0;
   protected double videoRam = 0;
   protected double screenSize = 0;
   private double pcCost = 0;
   private double laptopCost = 0;
   private void setPCCost()
   {
         pcCost = 150 + 6.50 * this.RAM + 0.15 * this.hardDrive + 0.48 * videoRam;
   }
   private void setLaptopCost()
   {
       laptopCost = 300 + 8.00 * this.RAM + 0.19 * this.hardDrive + 13.83 * this.screenSize;
   }
   private boolean PCOrLaptop(String checkType)
   {
      String species = checkType;
      if (species == "PC")
        return true;
        else
        return false;
       }
   protected abstract int getCost();
   public Computer(String kind, String typeProcessor, double ram, double hhd, double vRam, double screen)
   {
       checkType = kind;
       processor = typeProcessor;
       RAM = ram;
       hardDrive = hhd;
       videoRam = vRam;
       screenSize = screen;
   }
   }