public class SumOfElements {
    public static void main(String[] args) {
        int[] intarray = {1,2,3,4,5,6,7,9};
        int sum = 0;
        for(int i=0; i<intarray.length; i++){
            sum += intarray[i];
        }
        System.out.println("The sum is "+sum + ".");
    }
}
