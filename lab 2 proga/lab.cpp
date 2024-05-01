#include <iostream>
#include <bits/stdc++.h>
using namespace std;

// 1
/*
int main()
{
    float x, y;
    cout << "Lab 2 ";
    cout << '\n';
    cout << "Enter x: ";
    cin >> x;
    cout << '\n';
    if (x > -2 && x < 5)
    {
        y = 5 * x * x + 6;
    }
    else if (x >= 5)
    {
        y = x * x * x + 7;
    }
    cout << "y= " << y;
    return 0;
}
*/

// 2
/*
int main()
{
    float x, y;
    cout << "Enter x: ";
    cin >> x;
    cout << '\n';
    if (x >= 0)
    {
        y = sqrt(pow(x, 3) + 5);
    }
    else if (x > -3 && x < 0)
    {
        y = 3 * pow(x, 4) + 9;
    }
    cout << "y= " << y;
    return 0;
}
*/

// 3
/*
int main()
{
    float x, y;
    cout << "Enter x: ";
    cin >> x;
    cout << '\n';
    if (x < 1.5)
    {
        y = x * tan(x);
    }
    else if (x >= 1.5 && x < 2.5)
    {
        y = pow(x, 3) + sin(x);
    }
    else if (x >= 2.5)
    {
        y = 3 * x * x * x + 5;
    }
    cout << "y= " << y;
    return 0;
}
*/

// 4
/*
int main()
{
    float x, y;
    cout << "Enter x: ";
    cin >> x;
    cout << '\n';
    if (x < 1.22)
    {
        y = x * cos(x);
    }
    if (x >= 1.22)
    {
        y = 5 * pow(x, 3) + 1.7;
    }
    cout << "y= " << y;
    return 0;
}
*/

// 5
/*
int main()
{
    float x, y;
    cout << "Enter x: ";
    cin >> x;
    cout << '\n';
    if (x < 0 && x < 2)
    {
        y = pow(x, 3) * cos(x);
    }
    if (x > 5 && x <= 9)
    {
        y = sqrt((5 * pow(x, 2) + 1.6));
    }
    if (x >= 2)
    {
        y = 3*pow(x,4) + 7;
    }
    cout << "y= " << y;
    return 0;
}
*/

// 6
/*
int main()
{
    float x, y;
    cout << "Enter x: ";
    cin >> x;
    cout << '\n';
    if (x < 1.5)
    {
        y = x * tan(x);
    }
    else if (x >= 1.5 && x < 2.5)
    {
        y = pow(x, 3) + sin(x);
    }
    else if (x >= 2.5)
    {
        y = 3 * x * x * x + 5;
    }
    cout << "y= " << y;
    return 0;
}
*/

// 7
/*
int main()
{
    float x, y;
    cout << "Enter x: ";
    cin >> x;
    cout << '\n';
    if (x > 0 && x < 1)
    {
        y = sqrt(3 * pow(x, 3) + 4 + cos(x));
    }
    if (x >= 1)
    {
        y = 5 - pow(sin(x),2)* pow(x,9) ;
    }
    cout << "y= " << y;
    return 0;
}
*/

// 8

/*
int main()
{
    float x, y;
    cout << "Enter x: ";
    cin >> x;
    cout << '\n';
    if (x > -5 && x < 0)
    {
        y = sqrt(pow(x, 2) + fabs(x));
    }
    if (x >= 0 && x < 2)
    {
        y = 5 * pow(x, 3) + cos(x);
    }
    cout << "y= " << y;
    return 0;
}
*/

// 9
/*
int main()
{
    float x, y;
    cout << "Enter x: ";
    cin >> x;
    cout << '\n';
    if (x >= 0 && x < 1)
    {
        y = x * pow(cos(x), 2) + sin(x);
    }
    if (x >= 1 && x <= 2)
    {
        y = sqrt(x * x + 6 * sin(x));
    }
    if (x > 2)
    {
        y = 1.7 * pow(x, 3) + 7;
    }
    cout << "y= " << y;
    return 0;
}
*/

// 10

/*
int main()
{
    float x, y;
    cout << "Enter x: ";
    cin >> x;
    cout << '\n';
    if (x > 0)
    {
        y = x * x * sin(x) + sqrt((x * x + 1.2));
    }
    if (x > 2 && x <= 6)
    {
        y = pow(tan(x), 2) + cos(x) + 3.5;
    }
    cout << "y= " << y;
    return 0;
}
*/

// 11
/*
int main()
{
    float x, y;
    float pi = 3.14;
    cout << "Enter x: ";
    cin >> x;
    cout << '\n';
    if (x > 0 && x <= 4)
    {
        y = sin(pi * x) + sqrt((x * x + 6));
    }
    if (x > 4)
    {
        y = log10(x) + sqrt(3 * x + 7);
    }
    cout << "y= " << y;
    return 0;
}
*/
// 12
/*
int main()
{
    float x, y;
    float pi = 3.14;
    cout << "Enter x: ";
    cin >> x;
    cout << '\n';
    if (x > 0 && x <= 2)
    {
        y = sqrt(1.7 * x + sin(x));
    }
    if (x > 2 && x <= 6)
    {
        y = cos(pi * x) + tan(x);
    }
    cout << "y= " << y;
    return 0;
}
*/

// 13

/*
int main()
{
    float x, y;
    cout << "Enter x: ";
    cin >> x;
    cout << '\n';
    if (x > 1 && x <= 3)
    {
        y = sin(5) * x * (sqrt(1 + pow(x, 2) + pow(log(x), 2) * x));
    }
    if (x > 3 && x <= 5)
    {
        y = pow(exp(1), x) * sqrt(x + pow(exp(1), 2 * x));
    }
    cout << "y= " << y;
    return 0;
}
*/

// 14
/*
int main()
{
    float x, y;
    cout << "Enter x: ";
    cin >> x;
    cout << '\n';
    if (x > -1 && x <= 1)
    {
        y = sqrt(fabs(x) + pow(x, 4));
    }
    if (x > 1 && x <= 4)
    {
        y = pow(tan(x), 2) * 3 * x + log10(5 * x);
        cout << "y= " << y;
        return 0;
    }
    */

// 15
/*
int main()
{
    float x, y;
    cout << "Enter x: ";
    cin >> x;
    cout << '\n';
    if (x > -1 && x < 7)
    {
        y = 7 * x * x + 8.1;
    }
    if (x >= 7)
    {
        y = x * x + cos(x);
    }
    cout << "y= " << y;
    return 0;
}
*/

// 16
/*
int main()
{
    float x, y;
    cout << "Enter x: ";
    cin >> x;
    cout << '\n';
    if (x >= 0)
    {
        y = sqrt(x * x + 3);
    }
    if (x > -5 && x < 0)
    {
        y = 4 * pow(x, 4) + 1;
    }
    cout << "y= " << y;
    return 0;
}
*/

// 17
/*
int main()
{
    float x, y;
    cout << "Enter x: ";
    cin >> x;
    cout << '\n';
    if (x < 1.5)
    {
        y = x * cos(x);
    }
    if (x >= 1.5 && x < 7.5)
    {
        y = x * x * x + sin(x);
    }
    if (x >= 7.5)
    {
        y = 9 * x * x * x + 8;
    }
    cout << "y= " << y;
    return 0;
}
*/

// 18
/*
int main()
{
    float x, y;
    cout << "Enter x: ";
    cin >> x;
    cout << '\n';
    if (x < 3.28)
    {
        y = x * sin(x);
    }
    if (x >= 3.28)
    {
        y = 2 * x * x * x + 1.9;
    }
    cout << "y= " << y;
    return 0;
}
*/

// 19
/*
int main()
{
    float x, y;
    cout << "Enter x: ";
    cin >> x;
    cout << '\n';
    if (x > 0 && x < 8)
    {
        y = x * x * sin(x);
    }
    if (x >= 8)
    {
        y = 2 * x * x * x * x + 6;
    }
    if (x > 5 && x <= 6)
    {
        y = sqrt(3 * x * x + 2.3);
    }
    cout << "y= " << y;
    return 0;
}
*/

// 20
/*
int main()
{
    float x, y;
    cout << "Enter x: ";
    cin >> x;
    cout << '\n';
    if (x < 1.7)
    {
        y = x * cos(x);
    }
    if (x >= 1.7 && x < 9.5)
    {
        y = x * x * x + sin(x);
    }
    if (x > +9.5)
    {
        y = 2 * x * x * x + 2;
    }
    cout << "y= " << y;
    return 0;
}
*/