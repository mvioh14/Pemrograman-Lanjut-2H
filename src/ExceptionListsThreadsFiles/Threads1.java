package ExceptionListsThreadsFiles;

public class Threads1 {
    class A extends Threads1 {
        public void run() {
            System.out.println("hello");
        }

        public void main(String[] args) {
            A object = new A();
            object.Start();
        }

        private void Start() {
        }
    }
}