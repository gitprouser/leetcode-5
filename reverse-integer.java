public int reverse(int x) {
        int res = 0;
        while (x != 0) {
            int t = res * 10 + x % 10;
            if (t / 10 != res) return 0;
            res = t;
            x /= 10;
        }
        return res;
    }
