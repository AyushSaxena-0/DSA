public class O127Sum_Of_Each_Row_Pascle_Triangle {
    static int sumRow(int n){
        // Every term in Pascal's triangle is:
        // nC0 + nC1 + nC2 + ... + nCn

        // Sum of all elements in row n = 2^n
        // If rows start from 1 instead of 0:
        // Sum of row n = 2^(n-1)
        return 1<<(n-1);
    }

    public static void main(String[] args) {
        System.out.println(sumRow(12));
    }
}
