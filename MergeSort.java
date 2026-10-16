public class MergeSort {
    public static void main(String[] args) {
        return;
    }

    public static void merge(int[] randomList, int[] aux, int lo, int mid, int hi) {
        for (int i = lo; i < hi; i++) aux[i] = randomList[i];

        int i = lo, j = mid, k = lo;

        while (k < hi) {

            if (i < mid && ( j == hi || aux[i] < aux[j] )) {
                randomList[k++] = aux[i++];
            } else {
                randomList[k++] = aux[j++];
            }

        }

    }

    public static void mergeSort(int[] randomList, int[] aux, int lo, int hi) {
        if (hi - lo <= 1) return;

        int mid = lo + (hi - lo) / 2;
        mergeSort(randomList, aux, lo, mid);
        mergeSort(randomList, aux, mid + 1, hi);
        merge(randomList, aux, lo, mid, hi);
    }

    public static void mergeSort(int[] randomList) {
        int n = randomList.length;
        int[] aux = new int[n];
        int mid = n / 2;
        mergeSort(randomList, aux, 0, n);
    }
}
