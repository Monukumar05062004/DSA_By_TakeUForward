package learnCodeWithDurgaSoftwareSolution;


    class A {
        protected void process() {
            System.out.print("A,");
        }
    }

    public class PredefineTypeArray extends A {
        // <-- ERROR: trying to override a protected method with default (package‐private) access
         public void process() {
            System.out.print("B,");
        }

        public static void main(String[] args) throws Exception {
            new PredefineTypeArray().process();
        }
    }
