package task2;

public class StringTask2 {
    public static void main(String[] args) {
        getOutput(getData(provideDate()));
    }

    public static String[] provideDate() {
        return new String[]{"orange", "plum", "tomato", "onion", "grape", "onion"};
    }

    public static String getData(String[] items) {
        StringBuilder stringBuilder = new StringBuilder();
        int count = 0;
        for (String name : items) {
            if (!"onion".equals(name)) {
                count++;
                stringBuilder
                        .append(count)
                        .append(") ")
                        .append(name)
                        .append("\n");
            }
        }
        return  stringBuilder.toString();
    }

    public static void getOutput(String output) {
        System.out.println(output);
    }
}