using namespace std;
#include "bsorttree.h"

void adddata(int t,Bsorttreenode*root)
{
	Bsorttreenode* tp = root;
	while (tp != nullptr)
	{
		if (t < tp->data)
		{
			if (tp->lsub == nullptr)
			{
				tp->lsub = new Bsorttreenode(t);
				return;
			}
			else
				tp = tp->lsub;
		}
		else
		{
			if (tp->rsub == nullptr)
			{
				tp->rsub = new Bsorttreenode(t);
				return;
			}
			else
				tp = tp->rsub;
		}
			
	}

}
Bsorttreenode* init(int t)
{
	Bsorttreenode* root = new Bsorttreenode(t);
	return root;
}
void Btreeprint(Bsorttreenode* root)
{
	if (root == nullptr)
	{
		return;
	}
	Btreeprint(root->lsub);
	cout << root->data<<" ";
	Btreeprint(root->rsub);

}
void deletedata(int t, Bsorttreenode* &root)
{
	Bsorttreenode* &tp = root;
	if (tp->data == t)
	{
		Bsorttreenode* rtp = tp->rsub;
		if (rtp == nullptr)
		{
			Bsorttreenode* ltp = tp->lsub;
			delete tp;
			tp = ltp;
			return;
		}
		else
		{
			Bsorttreenode* minp = rtp;
			while (minp->lsub != nullptr)
			{
				minp = minp->lsub;
			}
			tp->data = minp->data;
			deletedata(minp->data, rtp);
			return;
		}		
		free(tp);
		tp = nullptr;
		return;
	}
	else if (tp->data < t)
	{
		deletedata(t, tp->rsub);
		return;
	}
	else
		deletedata(t, tp->rsub);
	return;

	
};