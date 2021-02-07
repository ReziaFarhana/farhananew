package learnExceptionHandling;

public class LearnSingleton {

        private LearnSingleton() {
            String collegeName = "Dhaka College";
        }

        private static LearnSingleton instance =new LearnSingleton();

        public static LearnSingleton getInstance(){
            return instance;
        }

    }

