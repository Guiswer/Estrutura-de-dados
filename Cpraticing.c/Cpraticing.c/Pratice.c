#include <stdio.h>
#include <stdlib.h>

void cres(int arrayy[], int size) {

		for (int i = 0; i < size - 1; i++) {
			for (int j = 0; j < size - 1; j++) {

				if (arrayy[j] > arrayy[j + 1]) {
					int aux;

					aux = arrayy[j];
					arrayy[j] = arrayy[j + 1];
					arrayy[j + 1] = aux;
				}
			}
		}
	}

	void desc(int arrayy[], int size) {

		for (int i = 0; i < size - 1; i++) {
			for (int j = 0; j < size - 1; j++) {

				if (arrayy[j] < arrayy[j + 1]) {
					int aux;

					aux = arrayy[j];
					arrayy[j] = arrayy[j + 1];
					arrayy[j + 1] = aux;
				}
			}
		}
	}

int main(void) {

	int vetor[5] = { 4,6,3,2,8 };

	int size = sizeof(vetor) / 4;

	
	cres(vetor, size);

	for (int x = 0; x < size; x++) {
		printf("%d, ", vetor[x]);
	}
	
	printf("\n\n");
	desc(vetor, size);

	for (int x = 0; x < size; x++) {
		printf("%d, ", vetor[x]);
	}
}