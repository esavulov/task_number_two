public class Main {
    public static void main(String[] args) {
        long[] arr = {10, 20, 40, 50};
        SalesManager salesManager = new SalesManager(arr);

        long max = salesManager.max();
        System.out.println(max);
    }
}