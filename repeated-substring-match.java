class Solution {
    public int repeatedStringMatch(String A, String B) {
        int count = 1;
        StringBuilder S = new StringBuilder(A);
        for (; S.length() < B.length(); count++) S.append(A);
        if (S.indexOf(B) >= 0) return count;
        if (S.append(A).indexOf(B) >= 0) return count+1;
        return -1;
    }
}
