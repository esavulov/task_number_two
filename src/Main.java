public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 20, 40, 50};
        SalesManager salesManager = new SalesManager(arr);

        int max = salesManager.max();
        System.out.println(max);
    }
}