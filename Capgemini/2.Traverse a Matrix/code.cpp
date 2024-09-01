class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& matrix) {
        int rows = matrix.size();
        int cols = matrix[0].size();
        int top = 0, left = 0;
        int bottom = rows - 1, right = cols - 1;
        int direction = 0;
        vector<int> result;
        while (top <= bottom && left <= right) {
            if (direction == 0) { // left -> right
                for (int i = top; i <= right; i++) {
                    result.push_back(matrix[top][i]);}
                top++;
            } else if (direction == 1) { // top -> bottom
                for (int i = top; i <= bottom; i++) {
                    result.push_back(matrix[i][right]);}
                right--;
            } else if (direction == 2) { // right -> left
                for (int i = right; i >= left; i--) {
                    result.push_back(matrix[bottom][i]);}
                bottom--;
            } else if (direction == 3) { // bottom -> top
                for (int i = bottom; i >= top; i--) {
                    result.push_back(matrix[i][left]);}
                left++;}
            direction = (direction + 1) % 4;}
        return result;}
};
