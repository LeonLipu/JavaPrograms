package datastructrue.sorting;

/**
 * Created by brkar on 2/14/2017.
 */


public class mergesort {

    public static void main(String[] args) {

     int arr[]={2,5,3,5,6,2};
        devide(arr,0,arr.length);

        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }


    public static void merge(int [] arr,int mid ,int i,int j){

        int start =i;
        int last=j;
        int narr[]=new int [j-i];
         int k=0;
        while (k<=narr.length){

            if(arr[i]>arr[j]){
                narr[k++]=arr[j--];
            }
            else{
                narr[k++]=arr[i++];
            }
        }

        for(i=start;i<last;i++){
            arr[i]=narr[start-i];
        }



}
    public static void devide (int [] arr,int i,int j){

       if(j<=i)
           return ;

       int mid =(i+j)/2;
       devide(arr,i,mid);
       devide(arr,mid+1,j);
       merge(arr,mid,i,j);





    }

}
