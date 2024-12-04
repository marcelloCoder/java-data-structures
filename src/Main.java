//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {

        double now = System.currentTimeMillis();
        int[] arr = new int[6];

        System.out.println(removeEven(arr));
        int result = findSum(99999);
        System.out.println(result);
        System.out.println("TEMPO USADO - " + (System.currentTimeMillis() - now) + " MILISSEGUNDOS");
        int result2 = findSum2(99999);
        System.out.println(result2);
        System.out.println("TEMPO USADO - " + (System.currentTimeMillis() - now) + " MILISSEGUNDOS");
    }

    private static int[] removeEven(int[] arr) {
        int oddCount = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] % 2 != 0){
                oddCount++;
            }
        }
            int[] result = new int[oddCount];
            int index= 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 != 0){
                    result[index] = arr[i];
                    index++;
                }
            }
            return result;

    }

    public static int findSum2(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) { // 1,2,3,4,5
            sum = sum + i; // 1,3,6,10,15
        }
        return sum;
    }


    public static int findSum(int n) {
        return n * (n + 1) / 2;
    }
}