
package HW_2.Exercise3_1;

public class ListFilter {
   public static void main(String[] args) {
      // read in a small file called valid.txt
      In in = new In(
            "CIS 2168\\HW_2\\Exercise3_1\\valid.txt");
      int[] a = in.readAllInts();

      IntCollection collection = new IntCollection(a); // uses linear-search under
      // the hood (SLOW)

      // read in a small file called contenders.txt
      in = new In(
            "CIS 2168\\HW_2\\Exercise3_1\\contenders.txt");
      int[] keys = in.readAllInts();

      // Now filter the list by relying on the CollectionOfInts API
      final long startTime = System.currentTimeMillis(); // start timer
      for (int key : keys)
         if (!collection.contains(key))
            System.out.println(key);
      final long endTime = System.currentTimeMillis(); // end timer
      System.out.println("Total execution time: " + (endTime - startTime));
   }
}
