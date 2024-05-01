#include <iostream>
#include <bits/stdc++.h>
using namespace std;

// 1
/*
int main()
{
    int n, i;
    double x, k, product1, product2, product3;
    cout << "Enter x and n: ";
    cin >> x;
    cin >> n;
    i = 1;
    product1 = 1;
    product2 = 1;
    product3 = 1;
    do
    {
        k = x / i;
        product1 = product1 * k;
        i++;
    } while (i <= n);
    for (i = 1; i <= n; i++)
    {
        k = x / i;
        product2 = product2 * k;
    }
    i = 1;
    while (i <= n)
    {
        k = x / i;
        product3 = product3 * k;
        i++;
    }
    cout << "Your product1: " << product1 << endl;
    cout << "Your product2: " << product2 << endl;
    cout << "Your product3: " << product3 << endl;
    return 0;
}
*/

// 2
/*
int main()
{
    int n, i;
    double x, k, product1, product2, product3;
    cout << "Enter x and n: ";
    cin >> x;
    cin >> n;
    i = 1;
    product1 = 1;
    product2 = 1;
    product3 = 1;
    do
    {
        k = (x + cos(i*x)) / 2;
        product1 = product1 * k;
        i++;
    } while (i <= n);
    for (i = 1; i <= n; i++)
    {
        k = (x + cos(i*x)) / 2;
        product2 = product2 * k;
    }
    i = 1;
    while (i <= n)
    {
        k = (x + cos(i*x)) / 2;
        product3 = product3 * k;
        i++;
    }
    cout << "Your product1: " << product1 << endl;
    cout << "Your product2: " << product2 << endl;
    cout << "Your product3: " << product3 << endl;
    return 0;
}
*/

// 3
/*
int main()
{
    int n, k;
    double x, k, product1, product2, product3;
    cout << "Enter x and n: ";
    cin >> x;
    cin >> n;
    k = 1;
    product1 = 1;
    product2 = 1;
    product3 = 1;
    do
    {
        k = 1 + (sin(k * x) / k);
        product1 = product1 * k;
        k++;
    } while (k <= n);
    for (k = 1; k <= n; k++)
    {
        k = 1 + (sin(k * x) / k);
        product2 = product2 * k;
    }
    k = 1;
    while (k <= n)
    {
        k = 1 + (sin(k * x) / k);
        product3 = product3 * k;
        k++;
    }
    cout << "Your product1: " << product1 << endl;
    cout << "Your product2: " << product2 << endl;
    cout << "Your product3: " << product3 << endl;
    return 0;
}
*/

// 4
/*
int main()
{
    int n, k;
    double x, k, product1, product2, product3;
    cout << "Enter x and n: ";
    cin >> x;
    cin >> n;
    k = 1;
    product1 = 1;
    product2 = 1;
    product3 = 1;
    do
    {
        k = (k/(k+1)- cos(fabs(x)));
        product1 = product1 * k;
        k++;
    } while (k <= n);
    for (k = 1; k <= n; k++)
    {
        k = (k/(k+1)- cos(fabs(x)));
        product2 = product2 * k;
    }
    k = 1;
    while (k <= n)
    {
        k = (k/(k+1)- cos(fabs(x)));
        product3 = product3 * k;
        k++;
    }
    cout << "Your product1: " << product1 << endl;
    cout << "Your product2: " << product2 << endl;
    cout << "Your product3: " << product3 << endl;
    return 0;
}
*/

// 5
/*
int main()
{
    int n, k;
    double x, k, product1, product2, product3;
    cout << "Enter x and n: ";
    cin >> x;
    cin >> n;
    k = 1;
    product1 = 1;
    product2 = 1;
    product3 = 1;
    do
    {
        k = ((1 - x) + 1) / pow(((k - 1) + 1), 2);
        product1 = product1 * k;
        k++;
    } while (k <= n);
    for (k = 1; k <= n; k++)
    {
        k = ((1 - x) + 1) / pow(((k - 1) + 1), 2);
        product2 = product2 * k;
    }
    k = 1;
    while (k <= n)
    {
        k = ((1 - x) + 1) / pow(((k - 1) + 1), 2);
        product3 = product3 * k;
        k++;
    }
    cout << "Your product1: " << product1 << endl;
    cout << "Your product2: " << product2 << endl;
    cout << "Your product3: " << product3 << endl;
    return 0;
}
*/

// 6
/*
int main()
{
    int n, i;
    double x, k, product1, product2, product3;
    cout << "enter x and n: ";
    cin >> x;
    cin >> n;
    i = 1;
    product1 = 1;
    product2 = 1;
    product3 = 1;
    do
    {
        k = 1 / i + sqrt(fabs(x));
        product1 = product1 * k;
        i++;

    } while (i <= n);
    for (i = 1; i <= n; i++)

    {
        k = 1 / i + sqrt(fabs(x));
        product2 = product2 * k;
    }

    i = 1;
    while (i <= n)
    {
        k = 1 / i + sqrt(fabs(x));
        product3 = product3 * k;
        i++;
    }
    cout << "Your product1: " << product1 << endl;
    cout << "Your product2: " << product2 << endl;
    cout << "Your product3: " << product3 << endl;
    return 0;
}
*/

// 7
/*
int main()
{
    int n, i;
    double x, k, product1, product2, product3;
    cout << "enter x and n: ";
    cin >> x;
    cin >> n;
    i = 1;
    product1 = 1;
    product2 = 1;
    product3 = 1;
    do
    {
        k = (x + sin(i * x)) / 3;
        product1 = product1 * k;
        i++;

    } while (i <= n);
    for (i = 1; i <= n; i++)

    {
        k = (x + sin(i * x)) / 3;
        product2 = product2 * k;
    }

    i = 1;
    while (i <= n)
    {
        k = (x + sin(i * x)) / 3;
        product3 = product3 * k;
        i++;
    }
    cout << "Your product1: " << product1 << endl;
    cout << "Your product2: " << product2 << endl;
    cout << "Your product3: " << product3 << endl;
    return 0;
}
*/

// 8
/*
int main()
{
    int n, i;
    double x, k, product1, product2, product3;
    cout << "enter x and n: ";
    cin >> x;
    cin >> n;
    i = 1;
    product1 = 1;
    product2 = 1;
    product3 = 1;
    do
    {
        k = (1 + sqrt(fabs(x) + pow(x, 3))) / i;
        product1 = product1 * k;
        i++;

    } while (i <= n);
    for (i = 1; i <= n; i++)

    {
        k = (1 + sqrt(fabs(x) + pow(x, 3))) / i;
        product2 = product2 * k;
    }

    i = 1;
    while (i <= n)
    {
        k = (1 + sqrt(fabs(x) + pow(x, 3))) / i;
        product3 = product3 * k;
        i++;
    }
    cout << "Your product1: " << product1 << endl;
    cout << "Your product2: " << product2 << endl;
    cout << "Your product3: " << product3 << endl;
    return 0;
}
*/

// 9
/*
int main()
{
    int n, k;
    double x, k, product1, product2, product3;
    cout << "Enter x and n: ";
    cin >> x;
    cin >> n;
    k = 1;
    product1 = 1;
    product2 = 1;
    product3 = 1;
    do
    {
        k = ((2 * k) / (3 * k + 1) - pow(cos(x), 2));
        product1 = product1 * k;
        k++;
    } while (k <= n);
    for (k = 1; k <= n; k++)
    {
        k = ((2 * k) / (3 * k + 1) - pow(cos(x), 2));
        product2 = product2 * k;
    }
    k = 1;
    while (k <= n)
    {
        k = ((2 * k) / (3 * k + 1) - pow(cos(x), 2));
        product3 = product3 * k;
        k++;
    }
    cout << "Your product1: " << product1 << endl;
    cout << "Your product2: " << product2 << endl;
    cout << "Your product3: " << product3 << endl;
    return 0;
}
*/

// 10
/*
int main()
{
    int n, k;
    double x, k, product1, product2, product3;
    cout << "Enter x and n: ";
    cin >> x;
    cin >> n;
    k = 1;
    product1 = 1;
    product2 = 1;
    product3 = 1;
    do
    {
        k = (1 + (x + 1)) / pow(((k - 1) + 3), 2);
        product1 = product1 * k;
        k++;
    } while (k <= n);
    for (k = 1; k <= n; k++)
    {
        k = (1 + (x + 1)) / pow(((k - 1) + 3), 2);
        product2 = product2 * k;
    }
    k = 1;
    while (k <= n)
    {
        k = (1 + (x + 1)) / pow(((k - 1) + 3), 2);
        product3 = product3 * k;
        k++;
    }
    cout << "Your product1: " << product1 << endl;
    cout << "Your product2: " << product2 << endl;
    cout << "Your product3: " << product3 << endl;
    return 0;
}
*/

// 11
/*
int main()
{
    int n, i;
    double x, k, product1, product2, product3;
    cout << "Enter x and n: ";
    cin >> x;
    cin >> n;
    i = 1;
    product1 = 1;
    product2 = 1;
    product3 = 1;
    do
    {
        k = 2*x / i;
        product1 = product1 * k;
        i++;
    } while (i <= n);
    for (i = 1; i <= n; i++)
    {
        k = 2*x / i;
        product2 = product2 * k;
    }
    i = 1;
    while (i <= n)
    {
        k = 2*x / i;
        product3 = product3 * k;
        i++;
    }
    cout << "Your product1: " << product1 << endl;
    cout << "Your product2: " << product2 << endl;
    cout << "Your product3: " << product3 << endl;
    return 0;
}
*/

// 12
/*
int main()
{
    int n, i;
    double x, k, product1, product2, product3;
    cout << "Enter x and n: ";
    cin >> x;
    cin >> n;
    i = 1;
    product1 = 1;
    product2 = 1;
    product3 = 1;
    do
    {
        k = (3 * x + sin(i * x)) / 3;
        product1 = product1 * k;
        i++;
    } while (i <= n);
    for (i = 1; i <= n; i++)
    {
        k = (3 * x + sin(i * x)) / 3;
        product2 = product2 * k;
    }
    i = 1;
    while (i <= n)
    {
        k = (3 * x + sin(i * x)) / 3;
        product3 = product3 * k;
        i++;
    }
    cout << "Your product1: " << product1 << endl;
    cout << "Your product2: " << product2 << endl;
    cout << "Your product3: " << product3 << endl;
    return 0;
}
*/

// 13
/*
int main()
{
    int n, k;
    double x, k, product1, product2, product3;
    cout << "Enter x and n: ";
    cin >> x;
    cin >> n;
    k = 1;
    product1 = 1;
    product2 = 1;
    product3 = 1;
    do
    {
        k = (1 + ((cos(k * x)) / 2 * k));
        product1 = product1 * k;
        k++;
    } while (k <= n);
    for (k = 1; k <= n; k++)
    {
        k = (1 + ((cos(k * x)) / 2 * k));
        product2 = product2 * k;
    }
    k = 1;
    while (k <= n)
    {
        k = (1 + ((cos(k * x)) / 2 * k));
        product3 = product3 * k;
        k++;
    }
    cout << "Your product1: " << product1 << endl;
    cout << "Your product2: " << product2 << endl;
    cout << "Your product3: " << product3 << endl;
    return 0;
}
*/

// 14
/*
int main()
{
    int n, k;
    double x, k, product1, product2, product3;
    cout << "Enter x and n: ";
    cin >> x;
    cin >> n;
    k = 1;
    product1 = 1;
    product2 = 1;
    product3 = 1;
    do
    {
        k = ((2*k)/(k+8)-sin(fabs(x)));
        product1 = product1 * k;
        k++;
    } while (k <= n);
    for (k = 1; k <= n; k++)
    {
        k = ((2*k)/(k+8)-sin(fabs(x)));
        product2 = product2 * k;
    }
    k = 1;
    while (k <= n)
    {
        k = ((2*k)/(k+8)-sin(fabs(x)));
        product3 = product3 * k;
        k++;
    }
    cout << "Your product1: " << product1 << endl;
    cout << "Your product2: " << product2 << endl;
    cout << "Your product3: " << product3 << endl;
    return 0;
}
*/

// 15
/*
int main()
{
    int n, k;
    double x, k, product1, product2, product3;
    cout << "Enter x and n: ";
    cin >> x;
    cin >> n;
    k = 1;
    product1 = 1;
    product2 = 1;
    product3 = 1;
    do
    {
        k = ((2 - x) + 8) / pow(((k - 1) + 3), 2);
        product1 = product1 * k;
        k++;
    } while (k <= n);
    for (k = 1; k <= n; k++)
    {
        k = ((2 - x) + 8) / pow(((k - 1) + 3), 2);
        product2 = product2 * k;
    }
    k = 1;
    while (k <= n)
    {
        k = ((2 - x) + 8) / pow(((k - 1) + 3), 2);
        product3 = product3 * k;
        k++;
    }
    cout << "Your product1: " << product1 << endl;
    cout << "Your product2: " << product2 << endl;
    cout << "Your product3: " << product3 << endl;
    return 0;
}
*/

// 16
/*
int main()
{
    int n, i;
    double x, k, product1, product2, product3;
    cout << "Enter x and n: ";
    cin >> x;
    cin >> n;
    i = 1;
    product1 = 1;
    product2 = 1;
    product3 = 1;
    do
    {
        k = ((2 * k) / (k + 8) - sin(fabs(x)));
        product1 = product1 * k;
        i++;
    } while (i <= n);
    for (i = 1; i <= n; i++)
    {
        k = ((2 * k) / (k + 8) - sin(fabs(x)));
        product2 = product2 * k;
    }
    i = 1;
    while (i <= n)
    {
        k = ((2 * k) / (k + 8) - sin(fabs(x)));
        product3 = product3 * k;
        i++;
    }
    cout << "Your product1: " << product1 << endl;
    cout << "Your product2: " << product2 << endl;
    cout << "Your product3: " << product3 << endl;
    return 0;
}
*/

// 17
/*
int main()
{
    int n, i;
    double x, k, product1, product2, product3;
    cout << "Enter x and n: ";
    cin >> x;
    cin >> n;
    i = 1;
    product1 = 1;
    product2 = 1;
    product3 = 1;
    do
    {
        k = (2 * x + sin(i * x)) / 5;
        product1 = product1 * k;
        i++;
    } while (i <= n);
    for (i = 1; i <= n; i++)
    {
        k = (2 * x + sin(i * x)) / 5;
        product2 = product2 * k;
    }
    i = 1;
    while (i <= n)
    {
        k = (2 * x + sin(i * x)) / 5;
        product3 = product3 * k;
        i++;
    }
    cout << "Your product1: " << product1 << endl;
    cout << "Your product2: " << product2 << endl;
    cout << "Your product3: " << product3 << endl;
    return 0;
    }
    */

// 18
/*
int main()
{
    int n, i;
    double x, k, product1, product2, product3;
    cout << "Enter x and n: ";
    cin >> x;
    cin >> n;
    i = 1;
    product1 = 1;
    product2 = 1;
    product3 = 1;
    do
    {
        k = (8 + sqrt(fabs(x) + pow(x, 3))) / i;
        product1 = product1 * k;
        i++;
    } while (i <= n);
    for (i = 1; i <= n; i++)
    {
        k = (8 + sqrt(fabs(x) + pow(x, 3))) / i;
        product2 = product2 * k;
    }
    i = 1;
    while (i <= n)
    {
        k = (8 + sqrt(fabs(x) + pow(x, 3))) / i;
        product3 = product3 * k;
        i++;
    }
    cout << "Your product1: " << product1 << endl;
    cout << "Your product2: " << product2 << endl;
    cout << "Your product3: " << product3 << endl;
    return 0;
}
*/

// 19
/*
int main()
{
    int n, k;
    double x, k, product1, product2, product3;
    cout << "Enter x and n: ";
    cin >> x;
    cin >> n;
    k = 1;
    product1 = 1;
    product2 = 1;
    product3 = 1;
    do
    {
        k = ((4 * k) / (2 * k + 1) - pow(sin(fabs(x)), 2));
        product1 = product1 * k;
        k++;
    } while (k <= n);
    for (k = 1; k <= n; k++)
    {
        k = ((4 * k) / (2 * k + 1) - pow(sin(fabs(x)), 2));
        product2 = product2 * k;
    }
    k = 1;
    while (k <= n)
    {
        k = ((4 * k) / (2 * k + 1) - pow(sin(fabs(x)), 2));
        product3 = product3 * k;
        k++;
    }
    cout << "Your product1: " << product1 << endl;
    cout << "Your product2: " << product2 << endl;
    cout << "Your product3: " << product3 << endl;
    return 0;
}
*/

// 20
/*
int main()
{
    int n, k;
    double x, k, product1, product2, product3;
    cout << "Enter x and n: ";
    cin >> x;
    cin >> n;
    k = 1;
    product1 = 1;
    product2 = 1;
    product3 = 1;
    do
    {
        k = (7 + (x + 1)) / pow(((k - 1) + 2), 2);
        product1 = product1 * k;
        k++;
    } while (k <= n);
    for (k = 1; k <= n; k++)
    {
        k = (7 + (x + 1)) / pow(((k - 1) + 2), 2);
        product2 = product2 * k;
    }
    k = 1;
    while (k <= n)
    {
        k = (7 + (x + 1)) / pow(((k - 1) + 2), 2);
        product3 = product3 * k;
        k++;
    }
    cout << "Your product1: " << product1 << endl;
    cout << "Your product2: " << product2 << endl;
    cout << "Your product3: " << product3 << endl;
    return 0;
}

*/

// questions on second document(word file)