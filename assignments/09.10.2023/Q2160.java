public class Q2160 {
    public int minimumSum(int num) {
        // char[] ch = (num + "").toCharArray();
        // Arrays.sort(ch);
        // int n = Integer.parseInt(""+ch[0]+ch[2]);
        // int m = Integer.parseInt(""+ch[1]+ch[3]);
        // return n + m;

        int[] digits = getDigits(num);
        quickSort(digits, 0, digits.length - 1);
        int n = digits[0] * 10 + digits[2];
        int m = digits[1] * 10 + digits[3];
        return n + m;
    }
    public static int[] getDigits(int num) {
        int[] digits = new int[4];
        for (int i = 0; i < 4; i++) {
            digits[i] = num % 10;
            num /= 10;
        }
        return digits;
    }
    public static void quickSort(int[] nums, int low, int high) {
        if (low < high) {
            int partitionIndex = partition(nums, low, high);
            quickSort(nums, low, partitionIndex - 1);
            quickSort(nums, partitionIndex + 1, high);
        }
    }

    public static int partition(int[] nums, int low, int high) {
        int pivot = nums[high];
        int i = (low - 1);

        for (int j = low; j < high; j++) {
            if (nums[j] <= pivot) {
                i++;
                swap(nums, i, j);
            }
        }

        swap(nums, i + 1, high);
        return i + 1;
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
