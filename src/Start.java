public class Start {
    public static void main(String[] args){
        String veryLongString = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
        String replace1 = veryLongString.replaceAll("um", "HUM");
        System.out.println(replace1);
        int divide = veryLongString.indexOf("\saliquip");
        String sub1 = veryLongString.substring(0,divide+1);
        String sub2 = veryLongString.substring(divide+1);
        System.out.println(sub1 + sub2);

        boolean search1 = (sub1.contains("est"));
        boolean search2 = (sub2.contains("est"));
        System.out.println(search1 ^ search2);
    }
}
