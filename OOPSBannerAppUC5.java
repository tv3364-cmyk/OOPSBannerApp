public class OOPSBannerAppUC5 {

    public static void main(String[] args) {

        // Array declaration + initialization in single statement
        String[] banner = {
                String.join(" ", " ***** ", " ***** ", " ***** ", " ***** "),
                String.join(" ", "*     *", "*     *", "*     *", "*     *"),
                String.join(" ", "*     *", "*     *", " ***** ", " ***** "),
                String.join(" ", "*     *", "*     *", "*       ", "*       "),
                String.join(" ", " ***** ", " ***** ", "*       ", " ***** ")
        };

        // Enhanced for-loop to print
        for (String line : banner) {
            System.out.println(line);
        }
    }
}