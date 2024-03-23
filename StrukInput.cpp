#include <iostream>

using namespace std;

struct mahasiswa {
	string nama,alamat,hobi;
	int umur;
}mahasiswa1,mahasiswa2;

int main(){
	cout << "===========\n";
	
	cout << "Masukan nama anda : ";
	cin >> mahasiswa1.nama;
	cout << "Masukan Alamat Anda : ";
	cin >> mahasiswa1.alamat;
	cout << "Masukan Hobi Anda ";
	cin >> mahasiswa1.hobi;
	cout << "Masukan Umur Anda : ";
	cin >> mahasiswa1.umur;
	cout << "===================="<<endl;
	cout << "Nama aku adalah : " << mahasiswa1.nama << endl;
	cout << "Alamat Aku Adalah : " << mahasiswa1.alamat << endl;
	cout << "Hobi Aku Adalah : " << mahasiswa1.hobi << endl;
	cout << "Umur Aku Adalah : " << mahasiswa1.umur <<endl;
}