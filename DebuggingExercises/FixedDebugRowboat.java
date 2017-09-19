public class FixedDebugRowboat extends FixedDebugBoat
{
   public FixedDebugRowboat()
   {
      super("row");
      // include setPassengers() and setPower() methods
      // in class constructor
      setPassengers();
      setPower();
   }
   public void setPassengers()
   {
      super.passengers = 2;
   }
   public void setPower()
   {
      super.power = "oars";
   }
}