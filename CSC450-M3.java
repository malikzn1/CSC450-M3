#include <iostream>
using namespace std;

int main() {
    // Declare integer variables
    int int1, int2, int3;

    // Ask user for three integer inputs
    cout << "Enter the first integer: ";
    cin >> int1;
    cout << "Enter the second integer: ";
    cin >> int2;
    cout << "Enter the third integer: ";
    cin >> int3;

    // Dynamically allocate memory for integer pointers
    int* ptr1 = new int;
    int* ptr2 = new int;
    int* ptr3 = new int;

    // Assign the values to dynamically allocated memory
    *ptr1 = int1;
    *ptr2 = int2;
    *ptr3 = int3;

    // Display the values using variables
    cout << "\nValues stored in variables:" << endl;
    cout << "int1 = " << int1 << ", int2 = " << int2 << ", int3 = " << int3 << endl;

    // Display the values using pointers
    cout << "\nValues stored in pointers (dereferenced):" << endl;
    cout << "*ptr1 = " << *ptr1 << ", *ptr2 = " << *ptr2 << ", *ptr3 = " << *ptr3 << endl;

    // Free dynamically allocated memory
    delete ptr1;
    delete ptr2;
    delete ptr3;

    cout << "\nMemory has been deallocated.\n";

    return 0;
}
