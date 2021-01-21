public class ForLoopApp {

    public static void main(String[] args) {
        System.out.println();
    }

    /*
    public static int facultyRec(int num){
        if(num==0){
            return 1;
        }
        return facultyRec(num-1)*num;
    }

     */
    public static int facultyRec(int num){
        int i=1;
        int res = 1;
        while(i <= num){
            res *= i;
            i++;
        }
        return res;
    }



}
