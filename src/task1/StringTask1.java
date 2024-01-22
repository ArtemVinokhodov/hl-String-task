package task1;

public class StringTask1 {
    public static void main(String[] args) {
        getOutput(getData(provideDate()));
    }

    public static String[] provideDate() {
        return new String[]{"brange", "plum", "tomato", "onibn", "grape" };
    }

    public static String getData(String[] items) {
    StringBuilder stringBuilder = new StringBuilder();
    int count = 0;

        for (String name : items) {
            count++;
            stringBuilder
                    .append(count)
                    .append(") ")
                    .append(name)
                    .append("\n");
        }
    return  stringBuilder.toString().replaceAll("b", "o");
    }

    public static void getOutput(String output) {
        System.out.println(output);
    }
}


