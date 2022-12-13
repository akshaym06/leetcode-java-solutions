package greedy;

public class CanPlaceFlowers {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int planted = 0;
        int len = flowerbed.length;

        for (int i = 0; i < len; i++) {
            if (flowerbed[i] == 0) {
                boolean prev = i == 0 || flowerbed[i - 1] == 0;
                boolean next = i == len - 1 || flowerbed[i + 1] == 0;

                if (prev && next) {
                    flowerbed[i] = 1;
                    planted++;
                }
            }
        }

        return planted >= n;
    }

    public static void main(String[] args) {
        int[] flowerbed = {1, 0, 0, 0, 1};
        int n = 1;
        System.out.println(canPlaceFlowers(flowerbed, n));

        int[] flowerbed2 = {1, 0, 0, 0, 1};
        int n2 = 2;
        System.out.println(canPlaceFlowers(flowerbed2, n2));
    }
}
