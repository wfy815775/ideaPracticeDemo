import java.nio.charset.StandardCharsets;

public class Base64 {
    public static void main(String[] args) {
        final String text = "刘云鹏";
        final String encoded = java.util.Base64.getEncoder().encodeToString(text.getBytes(StandardCharsets.UTF_8));
        System.out.println(encoded);

        final String decoded = new String(java.util.Base64.getDecoder().decode(encoded),StandardCharsets.UTF_8);
        System.out.println(decoded);
    }
}
