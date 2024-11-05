import java.util.*;
class Quicksort {
static int partition(int array[], int low, int high) {
int pivot = array[high];
int i = (low - 1);
for (int j = low; j < high; j++) {
if (array[j] <= pivot) {
i++;
int temp = array[i];
array[i] = array[j];
array[j] = temp;
}
}
int temp = array[i + 1];
array[i + 1] = array[high];
array[high] = temp;
return (i + 1);
}
static void quickSort(int array[], int low, int high) { if (low < high) {
int pi = partition(array, low, high); quickSort(array, low, pi - 1);
quickSort(array, pi + 1, high);
}
}
public static void main(String args[]) { Scanner sc= new Scanner(System.in); System.out.println("Enter the limit: ");
int n=sc.nextInt();
int [] data=new int[n];
System.out.println("Enter the elements: "); for(int i=0;i<n;i++)
{  data[i]= sc.nextInt();
}
System.out.println("Unsorted Array"); System.out.println(Arrays.toString(data));
int size = data.length;
quickSort(data, 0, size - 1);
System.out.println("Sorted Array in Ascending Order ");
System.out.println(Arrays.toString(data)); }
}

/*Enter the limit: 
5
Enter the elements: 
8
7 
1
9
2
Unsorted Array
[8, 7, 1, 9, 2]
Sorted Array in Ascending Order
[1, 2, 7, 8, 9]/* */