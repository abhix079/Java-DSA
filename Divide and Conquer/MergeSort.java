
public class MergeSort {
    public static void printArr(int arr[]){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void mergeSort(int arr[],int si,int ei){
       // base case
        if(si>=ei){
            return;
        }


        int mid = (si+ei)/2;  // r we can write si +(ei-si)/2
        mergeSort(arr, si, mid); // this will recursively sort left part
        mergeSort(arr, mid+1, ei);// this will recrsively sort right part
        merge(arr, si,mid, ei); // this will merge 
        
    }
    public static void merge(int arr[],int si, int mid, int ei){

        int temp[] = new int[ei-si+1]; // this will return the size of the tmep array

        int i = si; // iterator for left part
        int j = mid+1; // iterator for right part
        int k = 0;  // iterator for temp array
         

        while(i<=mid && j<=ei){
                if(arr[i] <arr[j]){
                    temp[k]=arr[i];
                    i++;
                    k++;
                }
                else {
                    temp[k]= arr[j];
                    j++;
                    k++;
                }
        }
        //for left part
        while(i<=mid){
            temp[k++]= arr[i++];

        }
        //right part

        while(j<=ei){
            temp[k++] = arr[j++];
        }
// copy temp to original array
        for(k= 0,i=si;k<temp.length;k++,i++){
            arr[i] = temp[k];

        }


    }
    public static void main(String[] args) {
        int arr[]={6,3,9,5,2,8};
        mergeSort(arr, 0, arr.length-1);
        printArr(arr);
    }
    
}
