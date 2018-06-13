
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {
    public StringDuplicateDeleter(String [] array){
        super(array);
    }


    public int counterArray(String thisElement) {
        int count = 0;
        for (String x : array)
            if (x == thisElement) {
                count++;
            }
        return count;
    }

        
    public String[] removeDuplicates(int num){ 
        String [] newArray = new String [array.length];
        int y = 0;
        for (String j : array){
            int occurences = counterArray(j);
            if (occurences < num){
                newArray[y] = j;
                y++;
            } 
        }
        String [] finalArray = new String [y];
        System.arraycopy(newArray, 0, finalArray, 0, y);
        return finalArray;  
    }


    public String [] removeDuplicatesExactly(int num){
        String [] newArray = new String [array.length];
        int y = 0;
            for (String x : array){
            int occurences = counterArray(x);    
               if (occurences != num){
                newArray[y] = x;
                y++;
            } 
        }
        String [] finalArray = new String [y];
        System.arraycopy(newArray, 0, finalArray, 0, y);
        return finalArray; 
    }
        

}

