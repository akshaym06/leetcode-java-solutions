package stack;

public class CrawlerLogFolder {
    public static int minOperations(String[] logs) {
        int res = 0;
        for (int i = 0; i < logs.length; i++) {
            if (res < 0) res = 0;

            if (logs[i].equals("../")) {
                res -= 1;
            } else if (logs[i].equals("./")) {
                continue;
            } else {
                res += 1;
            }
        }

        if (res < 0)
            return 0;
        return res;
    }

    public static void main(String[] args) {
        String[] logs1 = {"d1/", "d2/", "./", "d3/", "../", "d31/"};
        System.out.println(minOperations(logs1));

        String[] logs2 = {"d1/", "../", "../", "../"};
        System.out.println(minOperations(logs2));
    }
}
