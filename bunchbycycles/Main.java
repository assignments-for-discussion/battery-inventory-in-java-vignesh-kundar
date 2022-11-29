package bunchbycycles;

public class Main {
  static class CountsByUsage {
    public int lowCount = 0;
    public int mediumCount = 0;
    public int highCount = 0;
  };

  static CountsByUsage countBatteriesByUsage(int[] cycles) {
    CountsByUsage counts = new CountsByUsage();
    
        //Solution Starts
        for (int i : cycles)
        {
            if ( i > Integer.MIN_VALUE && i  < 410) //Battries less than 410
                counts.lowCount++;
            else if (i >= 410 && i <= 949) //Battries in range of 410 to 949
                counts.mediumCount++;
            else if ( i > 949 && i < Integer.MAX_VALUE)// Rest of the Battries that is more than 949
                counts.highCount++;
        }
        //Solution Ends Here.
    
    return counts;
  }

  static void testBucketingByNumberOfCycles() {
    System.out.println("Counting batteries by usage cycles...\n");
    CountsByUsage counts = countBatteriesByUsage(new int[] {100, 300, 500, 600, 900, 1000});
    assert(counts.lowCount == 2);
    assert(counts.mediumCount == 3);
    assert(counts.highCount == 1);
    System.out.println("Done counting :)\n");
  }

  public static void main(String[] args) {
    testBucketingByNumberOfCycles();
  }
}
