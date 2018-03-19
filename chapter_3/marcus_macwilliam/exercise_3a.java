class TestArrays {
    private static void exercise() {
        String[] islands = new String[4];
        islands[0] = "Bermuda";
        islands[1] = "Fiji";
        islands[2] = "Azores";
        islands[3] = "Cozumel";

        int[] index = new int[4];
        index[0] = 1;
        index[1] = 3;
        index[2] = 0;
        index[3] = 2;

        int y = 0;
        int ref;
        while (y < 4) {
            ref = index[y];
            System.out.print("island = ");
            System.out.println(islands[ref]);
            y = y + 1;
        }
    }

    private static final void mine() {
        final String[] islands = getIslands();
        final int[] index = getReferences();
        assert islands.length == index.length;

        for (int y = 0; y < islands.length; y++) {
            System.out.println(String.format("island = %s", islands[index[y]]));
        }
    }

    private static final String[] getIslands() {
        return new String[] { "Bermuda", "Fiji", "Azores", "Cozumel" };
    }

    private static final int[] getReferences() {
        return new int[] { 1, 3, 0, 2 };
    }

    public static void main(String[] args) {
        exercise();
        mine();
    }
}