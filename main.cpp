#include <iostream>

#define ARRAY_SIZE 15

using namespace std;


void reverseSequence(int* sequence, unsigned int size)
{
    int swap;
    for (unsigned int pos = 0; pos < size/2; pos++)
    {   swap = sequence[pos];
        sequence[pos] = sequence[size-pos-1];
        sequence[size-pos-1] = swap;
    }
}


int main()
{
    int sequence[] = { 90, 80, 70, 60, 50, 40, 30, 20, 10, 8, 6, 4, 3, 2, 1 };

    for (unsigned int pos = 0; pos < ARRAY_SIZE; cout << sequence[pos++] << " ");
    cout << endl;

    reverseSequence(sequence, ARRAY_SIZE);

    for (unsigned int pos = 0; pos < ARRAY_SIZE; cout << sequence[pos++] << " ");
    cout << endl;

    return 0;
}


