public class arraybound {
    public static void main(String[]arg)
    {
        try{
       int arr[] = new int[3];
       arr[0] = 1;
       arr[1] = 2;
       arr[2] = 3;

        for(int i=0;i<4;i++)
        {
            System.out.println(arr[i]);
        }
    }
    catch(ArrayIndexOutOfBoundsException e)
    {
        System.out.println("array out of bound");
    }
}
}
