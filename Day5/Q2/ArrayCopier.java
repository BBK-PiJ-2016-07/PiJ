public class ArrayCopier{
   public void copy(int[] src, int[] des)
    {
        if(src.length == des.length)
        {
            copyEqualSize(src, des);
        }
        else if(src.length > des.length)
        {
            copyLongerSoruce(src, des);
        }
        else
        {
            copyShorterSource(src, des);
        }
    }

    public void copyEqualSize(int[] src, int[] des)
    {
        for(int i = 0; i < src.length; i++)
        {
            des[i] = src[i];
        }
    }

    public void copyLongerSoruce(int[] src, int[] des)
    {
        for(int i = 0; i < src.length; i++)
        {
            des[i] = src[i];
        }
    }

    public void copyShorterSource(int[] src, int[] des)
        {
            for(int i = 0; i < src.length; i++)
            {
                des[i] = src[i];
            }
            for(int i = src.length; i < des.length; i++)
            {
                des[i] = 0;
            }
        }
}
