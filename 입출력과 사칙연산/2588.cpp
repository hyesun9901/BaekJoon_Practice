#include <iostream>
using namespace std;
#include<string>
//string연습
int main()
{
	string strNum1, strNum2, strNum3, strNum4, strNum5;
	cin >> strNum1;
	cin >> strNum2;
	int nFirstNum = atoi(strNum1.c_str());
	int nSecondNum = atoi(strNum2.c_str());
	int Num1, Num2, Num3;
	Num1 = atoi(strNum2.substr(0, 1).c_str());
	Num2 = atoi(strNum2.substr(1, 1).c_str());
	Num3 = atoi(strNum2.substr(2, 1).c_str());
	
	cout << nFirstNum * Num3 << endl;
	cout << nFirstNum * Num2 << endl;
	cout << nFirstNum * Num1 << endl;
	cout << nFirstNum * nSecondNum << endl;
}
