//Ryan Nguyen
//Computer abstract class
public abstract class Computer implements Comparable 
{
   protected String processor = "";
   protected int RAM = 0;
   protected int hardDrive = 0;
   protected int videoRam = 0;
   protected double screenSize = 0;
   protected abstract double getCost();
   public Computer(String kind, String typeProcessor, int ram, int hhd)
   {
       processor = typeProcessor;
       RAM = ram;
       hardDrive = hhd;
   }
   public String getProcessor()
   {
       return processor;
   }
   public double compareTo(Comparable c)
   {
           if (getCost() > ((Computer)c).getCost())
                return 1;
           else if (getCost() < ((Computer)c).getCost())
                return -1;
           else
                return 0;
   }
   }