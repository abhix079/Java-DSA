public class firstOccurence {

    public static int firstOccurenceOfElement(int arr[],int i,int key){
        if(arr[i]==key){
            return i;
        }
        else if(i==arr.length){
            return -1;
        }
        else{
            return firstOccurenceOfElement(arr, i+1, key);
        }
    }

    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,3,5,6,7};
        int key = 5;
        System.out.println(firstOccurenceOfElement(arr, 0, key));

    }
    
}
