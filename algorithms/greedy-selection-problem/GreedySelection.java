public class GreedySelection {
    static void printArray(int array[]) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.print("\n");
    }

    static void sorting(int start[], int finish[]) {

        for (int i = 0; i < finish.length; i++) {
            for (int j = i + 1; j < finish.length; j++) {
                if (finish[i] > finish[j]) {
                    int temp = finish[i];
                    finish[i] = finish[j];
                    finish[j] = temp;

                    int temp1 = start[i];
                    start[i] = start[j];
                    start[j] = temp1;
                }
            }
        }
    }

    static void greedySelection(int[] start, int[] finish) {

        int i = 0;
        System.out.print("\nActivity:  ");
        System.out.print(i + " ");
        for (int j = i + 1; j < start.length; j++) {
            if (start[j] >= finish[i]) {
                i = j;
                System.out.print(j + " ");
            }

        }
        System.out.println();
    }

    public static void main(String... input) {
        int activity = Integer.parseInt(input[0]);
        int start[] = new int[activity];
        int finish[] = new int[activity];

        for (int s = 0; s < activity; s++) {
            start[s] = (int) (Math.random() * 100 + 1);
        }
        System.out.print("Starting time: ");
        printArray(start);
        for (int s = 0; s < activity; s++) {
            finish[s] = (int) (Math.random() * 100 + 1);
        }
        System.out.print("Finishing time: ");
        printArray(finish);

        sorting(start, finish);

        System.out.print("\nSorted starting time: ");
        for (int s = 0; s < activity; s++) {
            System.out.print(start[s] + " ");
        }
        System.out.print("\nSorted Finishing time: ");
        for (int s = 0; s < activity; s++) {
            System.out.print(finish[s] + " ");
        }
        System.out.println();
        greedySelection(start, finish);
    }
}