package gt.edu.umg.ingenieria.sistemas.ingenieria_software.parcial2.selection_sort.service;

public class SelectionSortt {

    public void sort (String [] a)
    {
        for (int i = 0 ; i < a.length - 1 ; i++)
        {
            int minPos = minPosition(i,a);
            swap (minPos, i,a);
        }
    }

    private int minPosition(int from, String[]a)
    {
        String holder = a [from];
        int position = from;
        for (int i = from ; i < a.length ; i++)
        {
            if (a [i].compareTo (holder) < 0)
            {
                holder = a [i];
                position = i;
            }
        }
        return position;
    }
    private void swap (int i, int j, String [] a)
    {
        String temp = a [i];
        a [i] = a [j];
        a [j] = temp;
    }
    public void printArray(String arr[]){
        int n=arr.length;
        for (int i=0; i<n; ++i){
            System.out.print(arr[i]+" ");
        }
    }
}

