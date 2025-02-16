using namespace std;
#include <iostream>
class Bsorttreenode
{
public:
	int data;
	Bsorttreenode* lsub=nullptr;
	Bsorttreenode* rsub=nullptr;
	Bsorttreenode(int t)
	{
		data = t;
	}
};

void adddata(int t, Bsorttreenode* root);
Bsorttreenode* init(int t);
void Btreeprint(Bsorttreenode* root);
void deletedata(int t, Bsorttreenode* &root);