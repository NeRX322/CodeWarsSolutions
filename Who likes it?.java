class Solution {
    public static String whoLikesIt(String... names) {
        int length = names.length;
        if (length == 0) {
            return "no one likes this";
        }
        if (length == 1) {
            return names[0] + " likes this";
        }
        if (length == 2) {
            return names[0] + " and " + names[1] + " like this";
        }
        if (length == 3) {
            return names[0] + ", " + names[1] + " and " + names[2] + " like this";
        }
        if (length > 3) {
            int trueLength = length - 2;
            return names[0] + ", " + names[1] + " and " + trueLength + " others like this";
        }
        return "";
    }
}
