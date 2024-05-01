#include <iostream>
using namespace std;

int main()
{
	for (int i = 0; i <= 10; i++) {
		cout << i << " ";
}
	cout << endl;


	for (int q = 0; q <= 10; q=q+2) {
		cout << q << " ";
	}
	cout << endl;
	int j=5;

	while (j<=50)
	{
		cout << j << " ";
		j = j + 100 - 97;

	}
	cout << endl;
	
	int w = 100;
	
	do {
		cout << w << " ";
		w = w + 10;
	} while (w <= 1000);


	cout << endl;

	int w1 = 1050;

	do {
		cout << w1 << " ";
		w1 = w1 + 10;
	} while (w1 <= 1000);// cycle while
}
