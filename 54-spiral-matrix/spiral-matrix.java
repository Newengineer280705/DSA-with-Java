class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int n = matrix.length;
        int m = matrix[0].length;
        int strow = 0;
        int endrow = n-1;
        int stcol = 0;
        int endcol = m-1;

        while(strow<=endrow && stcol<=endcol){

        for(int i=stcol; i<=endcol; i++){
            list.add(matrix[strow][i]);
        }
        strow++;

        for(int i=strow; i<=endrow; i++){
            list.add(matrix[i][endcol]);
        }
        endcol--;

        if(strow<=endrow){
            for(int i=endcol; i>=stcol; i--){
            list.add(matrix[endrow][i]);
        }
        endrow--;
        }
        
        if(stcol<=endcol){
            for(int i=endrow; i>=strow; i--){
            list.add(matrix[i][stcol]);
        }
        stcol++;
        }

        }

        return list;
        
    }
}