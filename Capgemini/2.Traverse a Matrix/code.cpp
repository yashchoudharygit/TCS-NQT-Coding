#include<iostream>
using namespace std;
int main() {
    int a[5][4] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16},{17,18,19,20}};
    int rs = 0, re = 5, cs = 0, ce = 4;
    for(int i = 0; i < 5; i++) {
        for(int j = 0; j < 4; j++) {
            cout << a[i][j] << "\t";}
        cout << "\n";}
    cout << "\n";
    while(rs < re && cs < ce) {
        for(int i = cs; i < ce; i++) {
            cout << a[rs][i] << "\t";}
        rs++;
        for(int i = rs; i < re; i++) {
            cout << a[i][ce - 1] << "\t";}
        ce--;
        if(rs < re) {
            for(int i = ce - 1; i >= cs; --i) {
                cout << a[re - 1][i] << "\t";}
            re--;}
        if(cs < ce) {
            for(int i = re - 1; i >= rs; --i) {
                cout << a[i][cs] << "\t";}
            cs++;
        }}
    return 0;
}
