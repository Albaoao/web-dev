public class MarathonBubble {
    public static void main(String[] args) {
        // Names and their times
        String[] names = {"Alibek", "Almaz", "Nursultan", "Madiyar", "Madiyar2", "Dauren", "Dauren2", "Batyr",
                "Nailya", "Dayana", "Yersultan", "Saltanat", "Aizhan", "Aizhan2", "Arai", "Dana"};
        int[] times = {347, 361, 423, 351, 383, 354, 356, 350, 419, 451, 349, 424, 439, 444, 440, 430};

        bubbleSort(names, times);

        // winners with their places
        System.out.println("Winners:");
        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) + " place: " + names[i] + " (" + times[i] + " minutes)");
        }
    }

    // sort algorithm to names and times
    private static void bubbleSort(String[] names, int[] times) {
        int n = times.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (times[j] > times[j + 1]) {
                    //  times
                    int tempTime = times[j];
                    times[j] = times[j + 1];
                    times[j + 1] = tempTime;

                    //  names
                    String tempName = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = tempName;
                }
            }
        }
    }
}
