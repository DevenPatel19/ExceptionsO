import java.util.ArrayList;

class ListOfExceptions {
    public static void main(String[] args) {
		// create array list
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("13");
        myList.add("hello world");
		// already an int and will not trigger Class Cast Exception
        myList.add(48);
        myList.add("Goodbye World");

        for(int i = 0; i < myList.size(); i++) {
			// try catch block to handle exception
            try {
                Integer castedValue = (Integer) myList.get(i);
				// specific Exception
            } catch(ClassCastException e ) {
                System.out.println(e);
                // System.out.println(myList.get(i));

            }
        }
        System.out.println("Finished");
    }
}