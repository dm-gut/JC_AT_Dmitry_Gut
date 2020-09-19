package main.java.tasks.day6.generics;

public class ObjectConteiner {

    Object[] arr = new Object[10];

    int position = 0;

    public void add(Object o) {
        arr[position] = o;
        position++;
    }

    public Object removeLast() {
        Object ret;
        ret = (int) arr[position - 1];
        arr[position - 1] = null;
        position--;
        return ret;
    }


    public boolean isEmpty() {
        boolean empty;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
            }
        }
        return false;
    }
}
