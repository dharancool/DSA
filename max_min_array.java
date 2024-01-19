
//Finding maximum and minimum

int max=arr[0];
        int min=arr[0];
        
        //find max
        for(int i=0;i<size;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        
        
        //find min 
        for(int i=0;i<size;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
