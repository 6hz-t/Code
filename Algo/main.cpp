#include <iostream>
#include <vector>
#include <stack>
using namespace std;

// 检查在指定位置填入指定数字是否有效
bool isValid(vector<vector<int>>& board, int row, int col, int num) {
    // 检查行
    for (int i = 0; i < 9; i++) {
        if (board[row][i] == num) {
            return false;
        }
    }

    // 检查列
    for (int i = 0; i < 9; i++) {
        if (board[i][col] == num) {
            return false;
        }
    }

    // 检查3x3小方块
    int startRow = (row / 3) * 3;
    int startCol = (col / 3) * 3;
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            if (board[startRow + i][startCol + j] == num) {
                return false;
            }
        }
    }

    return true;
}

// 使用非递归回溯算法解决数独问题
bool solveSudoku(vector<vector<int>>& board) {
    struct State {
        int row, col;
        int nextNum; // 下一个尝试的数字
    };

    stack<State> cellStack;
    int row = 0, col = 0;

    while (true) {
        // 找到下一个待填的空格
        while (row < 9 && board[row][col] != 0) {
            col++;
            if (col == 9) {
                col = 0;
                row++;
            }
            if (row == 9) {
                return true; // 所有单元格都已填满
            }
        }

        // 尝试填入数字
        bool found = false;
        for (int num = 1; num <= 9; num++) {
            if (isValid(board, row, col, num)) {
                board[row][col] = num;
                cellStack.push({ row, col, num + 1 }); // 记录下一个要尝试的数字
                // 移动到下一个单元格
                col = 0;  
                row++;
                found = true;
                break;
            }
        }

        if (!found) {
            // 回溯
            if (cellStack.empty()) {
                return false; // 无解
            }

            // 恢复上一个单元格的状态
            State prev = cellStack.top();
            cellStack.pop();
            row = prev.row;
            col = prev.col;
            board[row][col] = 0; // 重置为空格

            // 继续尝试prev.nextNum到9之间的数字
            found = false;
            for (int num = prev.nextNum; num <= 9; num++) {
                if (isValid(board, row, col, num)) {
                    board[row][col] = num;
                    cellStack.push({ row, col, num + 1 });
                    // 移动到下一个单元格
                    col = 0;  // 重置列，从下一行开始搜索
                    row++;
                    found = true;
                    break;
                }
            }

            if (!found) {
                // 该位置所有数字都尝试过了，继续回溯
                // 不需要continue，会自动进入下一次循环
            }
        }
    }
}

// 打印数独棋盘
void printBoard(const vector<vector<int>>& board) {
    for (int i = 0; i < 9; i++) {
        if (i % 3 == 0 && i != 0) {
            cout << "---------------------" << endl;
        }
        for (int j = 0; j < 9; j++) {
            if (j % 3 == 0 && j != 0) {
                cout << "| ";
            }
            cout << board[i][j] << " ";
        }
        cout << endl;
    }
}

int main() {
    // 示例数独，0表示空格
    vector<vector<int>> sudoku = {
        {0, 0, 5, 3, 0, 0, 0, 0, 0},
        {8, 0, 0, 0, 0, 0, 0, 2, 0},
        {0, 7, 0, 0, 1, 0, 5, 0, 0},
        {4, 0, 0, 0, 0, 5, 3, 0, 0},
        {0, 1, 0, 0, 7, 0, 0, 0, 6},
        {0, 0, 3, 2, 0, 0, 0, 8, 0},
        {0, 6, 0, 5, 0, 0, 0, 0, 9},
        {0, 0, 4, 0, 0, 0, 0, 3, 0},
        {0, 0, 0, 0, 0, 9, 7, 0, 0}
    };

    cout << "原始数独:" << endl;
    printBoard(sudoku);

    if (solveSudoku(sudoku)) {
        cout << "\n解出的数独:" << endl;
        printBoard(sudoku);
    }
    else {
        cout << "\n此数独无解" << endl;
    }

    return 0;
}