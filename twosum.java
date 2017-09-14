 public static int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        if (numbers == null || numbers.length < 2) {
            return null;
        }
        HashMap<Integer, Integer> nummap = new HashMap<Integer, Integer>();
        for (int i = 0; i < numbers.length; i++) {
            if (nummap.containsKey(target - numbers[i])) {
                res[0] = nummap.get(target - numbers[i]);
                res[1] = i;
                return res;
            }
            nummap.put(numbers[i], i);
        }
        return null;
    }
