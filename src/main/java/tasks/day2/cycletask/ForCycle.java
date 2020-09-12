
/*- используя for вывести каждое нечетное число от 3 до 19 включительно*/

package main.java.tasks.day2.cycletask;

public class ForCycle {
    public static void main(String[] args) {
        for (int i = 3; i <= 19; i++){
            int a = i % 2;
            if (a != 0){
                System.out.println(i);
            }
        }
    }
}
