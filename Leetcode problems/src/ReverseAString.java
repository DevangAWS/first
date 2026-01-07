void main() {
    reverse("", "Devang");
}

public static void reverse(String p, String up) {
    if (up.isEmpty()) {
        IO.println(p);
        return;
    }
    reverse(p + up.charAt(up.length() - 1), up.substring(0,up.length()-1));

}