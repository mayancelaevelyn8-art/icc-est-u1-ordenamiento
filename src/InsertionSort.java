public class InsertionSort {
    public void sort(int[] nums){
        for(int i = 1; i < nums.length; i++){
            int aux = nums[i];
            int j = i - 1;
            while(j >= 0 && nums[j] < aux){
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = aux;
            if(j + 1 != i){
                System.out.println("El aux= " + aux + " se inserta en pos " + (j + 1));
            }
        }
    }
}