package ExceptionListsThreadsFiles.vio;

import java.io.File;

public class WorkingWithFiles {
        class A {
            public void main(String[] args) {
                File file = new File("a.txt");
                if(file.exists()) {
                    System.out.println("Yes");
                }
            }
        }
    }

