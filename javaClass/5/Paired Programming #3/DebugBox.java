// this class definition is to be utilized by UseBox.java
// it contains errors
public class DebugBox
{
   private int width;
   private int length;
   private int height;

   // this should be the no-arg constructor
   // but it has problems!
   public DebugBox()
   {
     length = 1;
     width = 1;
     height = 1;
   }

   // Constructor that receives data
   public DebugBox(int w, int l, int h)
   {
      width = w;
      length = l;
      height = h;
   }

   public void showData()
   {
     System.out.println("Width: "  + width + "  Length: " +
       length + "  Height: " + height);
   }
   public double getVolume()
   {
     double vol = length * width * height;
     return vol;
   }
}
