
public class IntegerDuplicateDeleter extends DuplicateDeleter<Integer>{
    public IntegerDuplicateDeleter(Integer [] array){
        super(array);
    }

    public int counterArray(int num) {
        int count = 0;
        for(int x: array){
            if(x == num){
                count++;
            }
        }
        return count;
    } 

    

    public Integer[] removeDuplicates(int num){ 
        Integer[] newArray = new Integer[array.length];
        int y = 0;
        for (int x : array) {
            int occurences = counterArray(x);
            if (occurences < num) {
                newArray[y] = x;
                y++;
            }
        }
        Integer[] finalArray = new Integer[y];
        System.arraycopy(newArray, 0, finalArray, 0, y);
        return finalArray;
    }
    
    public Integer [] removeDuplicatesExactly(int num){
        Integer[] newArray = new Integer[array.length];
        int y = 0;
        for (int j: array) {
            int occurences = counterArray(j);
            if (occurences != num){
                newArray[y] = j;
                y++;
            }
        }
        Integer [] finalArray = new Integer[y];
        System.arraycopy(newArray, 0, finalArray, 0, y);
        return finalArray;
    }

}

