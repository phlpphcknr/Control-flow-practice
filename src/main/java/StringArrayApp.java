public class StringArrayApp {

    public static String[] arrayCreation(int arraySize){
        String [] students = new String [arraySize];
        for (int i = 0; i < arraySize; i++) {
            students[i] = "Student " + (i+1);
        }
        return students;
    }

}
