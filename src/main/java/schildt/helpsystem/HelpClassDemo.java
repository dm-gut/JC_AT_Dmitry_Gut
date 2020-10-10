package main.java.schildt.helpsystem;

class Help {
    void helpon(int what) {
        switch (what) {
            case '1':
                System.out.println("Инструкция if:\n\nif(условие) инструкция;\nelse инструкция;\n");
                break;
            case '2':
                System.out.println("Инструкция switch:\n\nswitch(выражение) {\n case константа:\n последовательность инструкций\n breake;\n // ...\n}\n");
                break;
            case '3':
                System.out.println("Цикл for:\n\nfor(инициализация; условие; итерация)\n инструкция;\n");
                break;
            case '4':
                System.out.println("Цикл while:\n\nwhile(условие) инструкция;\n");
                break;
            case '5':
                System.out.println("Цикл do-while:\n\ndo {\n инструкция;\n} while (условие);\n");
                break;
            case '6':
                System.out.println("Инструкция breake:\n\nbreake; или breake метка;\n");
                break;
            case '7':
                System.out.println("Инструкция continue:\n\ncontinue; или continue метка;\n");
                break;
        }
        System.out.println();
    }

    void showmenu() {
        System.out.println("Справка\n 1. if\n 2. switch\n 3. for\n 4. while\n 5. do-while\n 6. breake\n 7. continue\nВыберете (q - выход): \n");
    }

    boolean isValid(int ch) {
        return !(ch < '1' | ch > '7' & ch != 'q');
    }
}


class HelpClassDemo {
    public static void main(String[] args)
            throws java.io.IOException {
        char choice, ignore;
        Help hlpobj = new Help();

        for (; ; ) {
            do {
                hlpobj.showmenu();

                choice = (char) System.in.read();

                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');
            } while (!hlpobj.isValid(choice));

            if (choice == 'q')
                break;
            System.out.println("\n");
            hlpobj.helpon(choice);
        }
    }
}
