// Hello World.cpp : Defines the entry point for the console application.
//

#include "stdafx.h"
#include <iostream>
#include <time.h>
#include <stdio.h>
#include <stdlib.h>

using namespace std;


int count_down;

void wait ( int seconds ) {
	clock_t endwait;
	endwait = clock () + seconds * CLOCKS_PER_SEC;
	while (clock() < endwait) {}
}
int main()
{
	cout << "Quickly You have 10 seconds to defuse this bomb!\n" << endl;

	count_down=10;

	for (count_down; count_down>=0; count_down--){
		cout << "There are " << count_down << " seconds left.\n" << endl;

		for (int sec=1; sec>0; sec--){
			wait(1);
		}

	}

	cout << "You escaped.....this time!\n";
	return 0;

}

