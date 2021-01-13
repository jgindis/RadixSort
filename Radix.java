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
    for (int i = 0; i < buckets.length; i ++) {
      original.extend(buckets[i]);
    }
  }

  public static void radixSortSimple(SortableLinkedList data) {
    int maxLength = 1;
    SortableLinkedList[] buckets = new SortableLinkedList[10];
    for (int i = 0; i < buckets.length; i++) {
        buckets[i] = new SortableLinkedList();
    }
    while (data.size() > 0) {
        int foo = data.remove(0);
        maxLength = Math.max(maxLength, length(foo));
        int var = nth(foo, 0);
        buckets[var].add(foo);
    }
    merge(data, buckets);
    for (int i = 1; i < maxLength; i++) {
        while (data.size() > 0) {
            int foo = data.remove(0);
            int var = nth(foo, i);
            buckets[var].add(foo);
        }
        merge(data, buckets);
    }
  }

  public static void radixSort(SortableLinkedList data) {
    radixSortSimple(data);
        SortableLinkedList negs = new SortableLinkedList();
        SortableLinkedList poss = new SortableLinkedList();
        while (data.size() > 0 == true) {
            int var = data.remove(0);
            if (var < 0) negs.add(0, value);
            else poss.add(var);
        }
        data.extend(negs);
        data.extend(poss);
  }

}
