package main.java.tasks.day6.override;

public class C extends A{

        @Override
        public int foo(int x) {
            int y = x * 5;
            System.out.println(y);
            return y;
    }
}
