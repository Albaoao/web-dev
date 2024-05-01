
#include <iostream>
using namespace std;

int main()
{
	setlocale(0, "");
	int a = 2;
	cout << a << endl;
	a = 50;
	cout << a << endl;
	cout << "введите число" << endl;
	cin >> a;
	cout << a << endl;

	string b;
	cout << "введите строку" << endl;
	cin >> b;
	cout << b << endl;

	float c;
	cout << "введите число с плавающей точкой" << endl;
	cin >> c;
	cout << c << endl;
}