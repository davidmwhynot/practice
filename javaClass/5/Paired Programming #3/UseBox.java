public class UseBox
// This class uses the DebugBox class to instantiate two Box objects
// it contains errors

{
   public static void main(String args[])
   {
      int width = 12,
      length = 10,
      height = 8;
	  // box1 should be created with the no-arg constructor
      DebugBox box1 = new DebugBox();
      DebugBox box2 = new DebugBox(width, length, height);
      System.out.println("The dimensions of the first box are");
      box1.showData();
      System.out.println("The volume of the first box is");
      showVolume(box1);
      System.out.println("The dimensions of the second box are");
      box2.showData();
      System.out.println("The volume of the second box is");
      showVolume(box2);
   }
   public static void showVolume(DebugBox aBox)
   {
      double vol = aBox.getVolume();
      System.out.println(vol);
   }
}
