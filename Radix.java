public class Radix {

  public static int nth(int n, int col) {
    int var = n / ((int)Math.pow(10, col) % 10);
    return var;
  }

  public static int length(int n) {
    if (n == 0) return 1;
    return (int)(Math.log10(Math.abs(n)) + 1);
  }

  public static void merge(SortableLinkedList original, SortableLinkedList[] buckets) {

  }

  public static void radixSortSimple(SortableLinkedList data) {

  }

  public static void radixSort(SortableLinkedList data) {

  }

}
