class RotateArray {
    public static void rotateArray(int v[], int start, int end) {
        while (start < end) {
            int temp = v[start];
            v[start] = v[end];
            v[end] = temp;
            start++;
            end--;
        }
        for (int i : v) {
            System.out.print(i+" ");
        }
        System.out.println();
        return;
    }

    public static void main(String[] args) {

        int v[] = { 1, 2, 3, 4, 5 };
        int k = 2;
        rotateArray(v, 0, 5 - 1);
        rotateArray(v, 0, k - 1);
        rotateArray(v, k, 5 - 1);
        
    }
}