public class Main {
    public static void main(String[] args){
        int[] mass = new int[1000];

        for (int i = 0; i < mass.length; i++) {
            mass[i] = i+1;
        }
        int count = 0;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] % 3 ==0 || mass[i] % 5 ==0 && mass[i] != 1000){
                count = count + mass[i];
            }
        }
        System.out.println(count);
    }
}