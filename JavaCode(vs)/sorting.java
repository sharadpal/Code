public class sorting {
    public static void bubbleSort(int arr[]){
        for(int term=0;term<arr.length-1;term++){
            for(int j=0;j<=arr.length-2-term;j++){
                if(arr[j]>arr[j+1]){
                    // SWAP
                    int temp= arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]= temp;

                }
            }
        }

    }
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }


    // ----->>>>>>>>>>> SELECTIONsORT

    public static void selectionSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minPos=0;
            for(int j=0;j<arr.length;j++){
                if(arr[minPos]>arr[j]){
                    minPos=j;
                }
            }
            // swap
            int temp= arr[minPos];
            arr[minPos]=arr[i];
            arr[i]= temp;
        }
    }

    //------>>>    INSERTION SORT

    public static void insertionSort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int curt= arr[i];
            int prev= i-1;
            while(prev>=0 && arr[prev]>curt){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]= arr[curt];

        }

    }

    public static void countingSort(int arr[]){
        int largest= Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            largest= Math.max(largest,arr[i]);
        }
        int count[]= new int[largest+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        // sortint
        int j=0;
        for(int i=0;i<arr.length;i++){
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
    }


    public static void main(String[] args) {
        int arr[]= {5,4,1,3,2};

//        bubbleSort(arr);

//        selectionSort(arr);
//        insertionSort(arr);
        countingSort(arr);
        printArr(arr);
    }
}
