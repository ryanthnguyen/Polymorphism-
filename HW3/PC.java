//Ryan Nguyen
//PC Class
public class PC extends Computer
{
   private double videoRam = 0;
   private double PCCost = 0;
   public PC(String s, String processor, int ram, int hardDrive, int vRam)
   {
    super(s,processor,ram,hardDrive);
    videoRam = vRam;
   }
<<<<<<< HEAD
   public double getCost()
   {
      PCCost = 150 + 6.50 * this.RAM + 0.15 * this.hardDrive + 0.48 * videoRam;
      return PCCost;
   }
  public String toString()
   {
       return ("Desktop:" + "\n" + "--------" + "\n" + "CPU: " + this.getProcessor() + "\n" + "RAM: " + this.RAM + " GB" + "\n" + "HDD: " + this.hardDrive + " GB" + "\n" + "VRAM: " + videoRam  + " MB" + "\n" + "Cost: $" + this.getCost());
=======
   private void setPCCost()
   {
         PCCost = 150 + 6.50 * this.RAM + 0.15 * this.hardDrive + 0.48 * videoRam;
   }
   public String toString()
   {
       return ("Desktop:" + "\n" + "-------" + "\n" + "CPU: " + this.processor + "\n" + "RAM: " + this.RAM + "\n" + "HDD: " + this. hardDrive + "\n" + "VRAM: " + videoRam + "\n" + "Cost: " + this.getCost());
   }
   public double getCost()
   {
      return PCCost;
>>>>>>> 2cd74ac0b3d16214dd4aa117d707adacab9663a4
   }
}