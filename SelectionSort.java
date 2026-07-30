public class SelectionSort 
{
    public static void main(String[] args) 
    {
        int arr[]={40,30,5,15,25,20};

        for(int i=0;i<arr.length-1;i++)
        {
            int Smallestelement=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[Smallestelement]>arr[j])
              {
                  Smallestelement=j;
              }
            }

             //swaping

            int temp=arr[Smallestelement];
            arr[Smallestelement]=arr[i];
            arr[i]=temp;
         }
         System.out.print("Sorted Array:");
          for(int num:arr)
         {
           System.out.print(num+" ");
         }
    }
    
}
