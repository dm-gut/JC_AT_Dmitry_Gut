package main.java.tasks.day5.stringtask;

public class LogsPars {
    public static void main(String[] args) {

        String toParse = "access_log.2020.09.07 212.168.101.5 granted\n" +
                "access_log.2020.09.07 212.168.101.6 granted\n" +
                "access_log.2020.09.07 212.168.101.5 granted\n" +
                "access_log.2020.09.07 212.168.101.6 denied";

        String[] st = toParse.split("\\n");
        String[][] second = new String[st.length][2];

        for (int i = 0; i < st.length; i++) {
            String[] med = st[i].split(" ");
            second[i][0] = med[1];
            second[i][1] = med[2];
        }

        Object[][] fin = new Object[second.length][3];

        int position = 0;
        boolean next = false;

        for (int i = 0; i < st.length; i++) {

            next = false;
            for (Object[] el : fin) {
                if (null != el[0] && el[0].equals(second[i][0])) {
                    if (second[i][1].equalsIgnoreCase("granted")) {
                        int x = (int) el[1];
                        x += 1;
                        el[1] = x;
                    } else {
                        int x = (int) el[2];
                        x += 1;
                        el[2] = x;
                    }
                    next = true;
                }
            }

            if (next) {
                continue;
            }

            fin[position][0] = second[i][0];
            if (second[i][1].equalsIgnoreCase("granted")) {
                fin[position][1] = 1;
                fin[position][2] = 0;
            } else {
                fin[position][1] = 0;
                fin[position][2] = 1;
            }
            position++;
        }
        for (Object[] el : fin) {
            System.out.println(String.format("ip %s: ok - %s, failed - %s", el[0], el[1], el[2]));
        }
    }
}
