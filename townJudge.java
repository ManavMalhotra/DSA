class townJudge {
    public static int findJudge(int n, int[][] trust) {
        int[] trusts = new int[n+1];
        int[] trustedBy = new int[n+1];

        for (int i = 0; i < trust.length; i++) {
            trusts[trust[i][0]]++;
            trustedBy[trust[i][1]]++;
        }

        for (int i = 1; i <= n; i++) {
            if (trusts[i] == 0 && trustedBy[i] == n-1) {
                return i;
            }
        }
            
        return -1;
    }
    public static void main(String[] args) {
        int n = 2;
        int[][] trust = {{1,2}};
        int a = findJudge(n,trust);
        System.out.print(a);

    }

}