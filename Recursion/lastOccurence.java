public class lastOccurence {
    public static int lastOccurenceOfElement(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
      
        int isFound= lastOccurenceOfElement(arr, key, i+1);
        if(isFound==-1 && arr[i]==key) {
            return i;
        }
        return isFound;
       
    }
    public static void main(String args[]){
        int arr[] ={1,2,5,3,4,5,6,8};
        int key =5;
        System.out.println(lastOccurenceOfElement(arr, key, 0));

    }
    
}
