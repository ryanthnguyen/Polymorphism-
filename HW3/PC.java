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
   public double getCost()
   {
      PCCost = 150 + 6.50 * this.RAM + 0.15 * this.hardDrive + 0.48 * videoRam;
      return PCCost;
   }
  public String toString()
   {
       return ("Desktop:" + "\n" + "--------" + "\n" + "CPU: " + this.getProcessor() + "\n" + "RAM: " + this.RAM + " GB" + "\n" + "HDD: " + this.hardDrive + " GB" + "\n" + "VRAM: " + videoRam  + " MB" + "\n" + "Cost: $" + this.getCost());
   }
}