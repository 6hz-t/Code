#include <iostream>
using namespace std;

int quickSearch(int r[], int left, int right, int key) {
    if (left > right) {
        cout << "not find" << endl;
        return -1;
    }
    
    int pivot = r[left];
    int i = left;
    int j = right;
    
    while (i < j) {
        while (i < j && r[j] >= pivot) j--;
        r[i] = r[j];
        while (i < j && r[i] <= pivot) i++;
        r[j] = r[i];
    }
    r[i] = pivot;
    
    if (r[i] == key) return i;
    else if (r[i] > key) return quickSearch(r, left, i-1, key);
    else return quickSearch(r, i+1, right, key);
}

int main() {
    int r[] = {0, 23, 45, 12, 67, 34, 89, 56, 78};  // 0号位置不用
    int n = sizeof(r)/sizeof(r[0]) - 1;
    int key = 34;
    
    int pos = quickSearch(r, 1, n, key);
    if (pos != -1) {
        cout << "找到key=" << key << "，位置为：" << pos << endl;
    }
    
    return 0;
}


