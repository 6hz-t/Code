#include <iostream>
using namespace std;
typedef struct linkednode
{
	int val;
	linkednode* next;
}linkednode;
void linkednodefunc()
{
	linkednode* head = new linkednode;
	linkednode* p = head, * q;
	for (int i = 1; i < 100; i++)
	{
		q = new linkednode;
		q->val = i;
		q->next = nullptr;
		p->next = q;
		p = q;
	}
	p = head->next;
	for (; p != nullptr;)
	{
		cout << p->val << endl;
		p = p->next;
	}
}
