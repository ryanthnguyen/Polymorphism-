//Ryan Nguyen
//Computer abstract class
public abstract class Computer implements Comparable 
{
<<<<<<< HEAD
   private String kindOfComputer;
=======
   private String kindOfComputer = "";
>>>>>>> 2cd74ac0b3d16214dd4aa117d707adacab9663a4
   protected String processor = "";
   protected int RAM = 0;
   protected int hardDrive = 0;
   protected int videoRam = 0;
   protected double screenSize = 0;
   protected abstract double getCost();
<<<<<<< HEAD
   public Computer(String kind, String typeProcessor, int ram, int hhd)
=======
   public Computer(String kind, String typeProcessor, double ram, double hhd)
>>>>>>> 2cd74ac0b3d16214dd4aa117d707adacab9663a4
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