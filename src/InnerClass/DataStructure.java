public class DataStructure {
    //create an array
    private final static int SIZE= 15;
    private int[] arrayOfInts = new int[SIZE];
    public DataStructure(){
        for (int i =0; i<SIZE; i++){
            arrayOfInts[i] = i;
        }
    }
        public void printEven(){
            //print out values of even indices of the array
            DataStructureIterator iterator = this.new EvenIterator();
            while(iterator.hasNext()){
                System.out.print(iterator.next() + " ");
            }
            System.out.println();
        }
    interface DataStructureIterator extends java.util.Iterator<Integer>{}
    //Inner class implements the DatastructureIterator interface,
    //which extends the Iterator<Integer> interface
    private class EvenIterator implements DataStructureIterator{
        //start stepping through the arrary from the beginning
        private int nextIndex =0;
        public boolean hasNext(){
            //check if the current element is the last in the array
            return (nextIndex <=SIZE-1);
        }
        public Integer next(){
            Integer retvalue = Integer.valueOf(arrayOfInts[nextIndex]);
            nextIndex +=2;
            return retvalue;
        }
    }
    public static void main(String[] args) {
        //fill the array with integer values and print out only
        //values of even indices
        DataStructure ds = new DataStructure();
        ds.printEven();
    }

    
}
