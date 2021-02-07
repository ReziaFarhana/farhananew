package learnFinally;

public class LearnTryCatch {

    public static void main(String[] args) {
        //try..catch "Something went wrong")
        try{
          int [] myNumbers= {1,2,3,4};
            System.out.println(myNumbers[10]);
        } catch (Exception e){
            //e.printStackTrace(); printStrackTrace is for showing error msg. so if we don't have
            //this line there is an error but we will not see it. so we will print our own customized
            //msg.
            System.out.println("This is Arithmetic Exception");
        } finally {

            System.out.println("The 'try catch' is finished");
        }
        //finally


    }
}
