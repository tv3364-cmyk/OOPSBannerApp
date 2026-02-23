public class OOPSBannerAppUC4 {

    public static void main(String[] args) {

        printBanner();
    }

    public static void printBanner() {

        // Store banner lines inside an array
        String[] banner = {

                String.join(" ",
                        " ***** ", " ***** ", " ***** ", " ***** "),

                String.join(" ",
                        "*     *", "*     *", "*     *", "*     *"),

                String.join(" ",
                        "*     *", "*     *", " ***** ", " ***** "),

                String.join(" ",
                        "*     *", "*     *", "*       ", "*       "),

                String.join(" ",
                        " ***** ", " ***** ", "*       ", " ***** ")
        };

        // Enhanced for-loop to print each line
        for (String line : banner) {
            System.out.println(line);
        }
    }
}