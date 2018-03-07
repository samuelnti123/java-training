class Exercise1b {
        public static void main(String [] args) {
            int x = 1;
                while ( x < 10 ) {
                    if ( x > 3) {
                            System.out.println("big x");

                            /* This will compile but doesn't output anything as x is not in the range 3-10.

                            If you change the range it will output, however you get into an infinite loop
                             */
            }
        }
    }
}

