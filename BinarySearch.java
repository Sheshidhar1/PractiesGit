public class BinarySearch {
    public static void main(String args[]) {

        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int key = 5;
        boolean flag = true;
        int l = 0;
        int h = a.length - 1;

        while (l <= h) {
            int mid = l + h / 2;

            if (a[mid] == key) {
                System.out.printf("Element found ");
                flag = true;
                break;
            }
            if (a[mid] < key) {
                l = mid + 1;
            }
            if (a[mid] > key) {
                h = mid - 1;
            }

            // Hello world sup
        }
        if (flag == false)
        {
            System.out.printf("Elecemt not found");
        }

    }
}
