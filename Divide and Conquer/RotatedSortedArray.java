 // sorted , rotated array with distinct number (in ascending order), it is rotated at a pivot point . FInd the index of the given element

 // target = 0;

 //Output= 4;
 //array = 4,5,6,7,0,1,2
public class RotatedSortedArray {

    public static int search(int arr[],int target,int si, int ei){

        if(si>ei){ // base case 
            return -1;
        }
        int mid = (si+ei)/2;

        //case found
      if(arr[mid]==target){
        return mid;

      }

      // mid on line 1

      if(si<=arr[mid]){
        //case a: search in left
        if(arr[si]<=target && target<=arr[mid]){
            return search(arr, target, si, ei);

        }
        else{
            //case b: search in right
            return search(arr, target, mid+1, ei);
        }

      }

      //mid on line 2
      else{
        // case a:  search in right
        if(arr[mid]<=target && target <=arr[ei]){
            return search(arr, target, si, ei);

        }
        else{
            return search(arr, target, si, mid-1);
        }       

      }
    }
    public static void main(String[] args) {
        int arr[]= {4,5,6,7,0,1,2};
        int target =0;
        int tarIdx= search(arr,target,0,arr.length-1);
        System.out.println(tarIdx);


        
    }
    
}
