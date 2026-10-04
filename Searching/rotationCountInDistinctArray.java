 static int rotationCountInDistinctArray(int []arr){
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;
            if(end!=mid && arr[mid] > arr[mid+1]){
                return mid+1;
            }
            if(start!=mid && arr[mid]<arr[mid-1]){
                return mid;
            }
            if(arr[start]>=arr[mid]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return 0;
    }
