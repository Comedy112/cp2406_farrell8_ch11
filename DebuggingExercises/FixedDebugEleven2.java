// An array for different boat types
public class FixedDebugEleven2
{
   public static void main(String[] args)
   {
      FixedDebugBoat[] ref = new FixedDebugBoat[3];
      //need to include keyword 'new' to instantiate each object
      FixedDebugRowboat blueBoat = new FixedDebugRowboat();
      FixedDebugRowboat redBoat = new FixedDebugRowboat();
      FixedDebugOceanLiner bigBoat = new FixedDebugOceanLiner();
      ref[0] = redBoat;
      ref[1] = blueBoat;
      ref[2] = bigBoat;
      for(int x = 0; x < ref.length; ++x)
      {
         ref[x].setPassengers();
         ref[x].setPower();
         //display the results of toString()
         System.out.println(ref[x].toString());
      }
   }
}