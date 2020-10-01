package asst1;

public class OnlineUser implements Comparable<OnlineUser> {

    /**
     * nickname policy will be used as hashcode so maximum letters allowed in
     * nickname would be only 4.
     */
    private final String nickname;

    public OnlineUser() {
        this.nickname = null;
    }

    @Override
    public int compareTo(OnlineUser o) {
        // Not implemented yet
        return 0;
    }

    @Override
    public int hashCode() {
        byte[] bytes = this.nickname.getBytes();
        int val = 0;
        for (int i = 0; i < bytes.length; i++) {
            val += (Math.pow(255, (bytes.length - i - 1)) * bytes[i]);
        }
        return val;
    }

    public static String titleCase(String input) {
        StringBuilder titleCase = new StringBuilder(input.length());
        boolean nextTitleCase = true;
        for (char c : input.toLowerCase().toCharArray()) {
            if (Character.isSpaceChar(c)) {
                nextTitleCase = true;
            } else if (nextTitleCase) {
                c = Character.toTitleCase(c);
                nextTitleCase = false;
            }
            titleCase.append(c);
        }
        return titleCase.toString();
    }
}
