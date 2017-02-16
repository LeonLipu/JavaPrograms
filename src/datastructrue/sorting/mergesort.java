package datastructrue.sorting;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by brkar on 2/14/2017.
 */


public class mergesort {

    public static void main(String[] args) {

        Integer arr[]={2,12,5,3,7,6,10,22,11,99,1,9,8,2,4,6};
        System.out.println(arr.length);
        devide(arr,0,arr.length-1);

        System.out.println(Arrays.asList(arr));


    }


    public static void merge(Integer [] arr,int mid ,int i,int j){

        int start =i;
        int last=j;
        Integer narr[]=new Integer [j-i+1];

         //  j=j+1;
         int k=0;
         int b =i;
         int e=mid+1;

      System.out.println("The range is "+i +" "+j+"  sub array "+Arrays.asList(arr).subList(i,j+1));

      //  System.out.println("the element "+arr[j]);

       System.out.println("first half is "+ Arrays.asList(arr).subList(i,mid+1)+" range "+i+" "+ mid);
      System.out.println("second  half is "+ Arrays.asList(arr).subList(e,j+1)+" range "+e+" "+j);


      //  System.out.println("the element  "+arr[b]+" "+arr[mid]);
        //System.out.println("the element  "+arr[e]+" "+arr[j]);

         while (b<=mid || e<=j)
         {

             if(b<=mid && e<=j){

                 if(arr[b]>arr[e])
                 {
                     narr[k++]=arr[e++];
                 }
                 else{
                     narr[k++]=arr[b++];
                 }

             }else if(b<=mid)
                 narr[k++]=arr[b++];
             else
                 narr[k++]=arr[e++];
         }

        for(i=start;i<=last;i++){
            arr[i]=narr[i-start];
        }
      System.out.println("new  Array "+Arrays.asList(narr));

        System.out.println("*************************");

}
    public static void devide (Integer [] arr,int i,int j){

       if(j<=i)
           return ;

       int mid =(i+j)/2;
       devide(arr,i,mid);
       devide(arr,mid+1,j);
       merge(arr,mid,i,j);

    }

}
