public class MyClass {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) { //Corrected: loop terminates before exceeding array bounds
            arr[i] = i * 2;
        }
        for (int num : arr) {
            System.out.println(num);
        }
    }
}