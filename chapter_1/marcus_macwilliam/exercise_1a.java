class Shuffle1 {
    public static final void main(String... args) {
        main1();
        main2();
    }

    public static void main1() {
        int x = 3;
        while (x > 0) {
            if (x > 2) {
                System.out.print("a");
            }
            x = x - 1;
            System.out.print("-");
            if (x == 2) {
                System.out.print("b c");
            }
            x = x - 1;
            System.out.print("-");
            if (x == 1) {
                System.out.print("d");
                x = x - 1;
            }
        }
        System.out.println();
    }

    public static final String SEPARATOR = "-";

    public static final void main2() {
        final StringBuffer buffer = new StringBuffer()
            .append("a")
            .append(SEPARATOR)
            .append("b c")
            .append(SEPARATOR)
            .append("d");
        System.out.println(buffer.toString());
    }
}
