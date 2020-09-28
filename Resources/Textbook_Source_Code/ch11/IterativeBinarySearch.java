
public class IterativeBinarySearch
{
    /**
	 Searches the array a for key. If key is not in the array segment, then -1 is
	 returned. Otherwise returns an index in the segment such that key == a[index].
	 Precondition: a[lowEnd] <= a[lowEnd + 1]<= ... <= a[highEnd]
	*/
	public static int search(int[] a, int lowEnd, int highEnd, int key)
	{
	    int first = lowEnd;
	    int last = highEnd;
	    int mid;

	    boolean found = false; //so far
	    int result = 0; //to keep compiler happy

	    while ( (first <= last) && !(found) )
	    {
	        mid = (first + last)/2;

	        if (key == a[mid])
	        {
	            found = true;
	            result = mid;
	        }
	        else if (key < a[mid])
	        {
	            last = mid - 1;
	        }
	        else if (key > a[mid])
	        {
	            first = mid + 1;
	        }
	    }

	    if (first > last)
	        result = -1;

	    return result;
	}


}
