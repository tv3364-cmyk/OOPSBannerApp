import java.util.HashMap;
import java.util.Map;

public class OOPSBannerAppUC8 {

    public static void main(String[] args) {

        // Create Map to store patterns
        Map<Character, String[]> patternMap = new HashMap<>();

        patternMap.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        patternMap.put('P', new String[]{
                " ***** ",
                "*     *",
                " ***** ",
                "*       ",
                "*       "
        });

        patternMap.put('S', new String[]{
                " ***** ",
                "*       ",
                " ***** ",
                "       *",
                " ***** "
        });

        // Word to display
        String word = "OOPS";

        // Call render function
        renderBanner(word, patternMap);
    }

    // Function to render banner
    public static void renderBanner(String word, Map<Character, String[]> patternMap) {

        int rows = 5;

        for (int i = 0; i < rows; i++) {

            StringBuilder line = new StringBuilder();

            for (char c : word.toCharArray()) {

                String[] pattern = patternMap.get(c);

                if (pattern != null) {
                    line.append(pattern[i]).append("  ");
                }
            }

            System.out.println(line);
        }
    }
}