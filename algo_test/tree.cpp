#include "tree.h"
#include <iostream>
tree* createtree() 
{
	tree* head=new tree("head");
	head->subtree[0] = new tree("layer1.1");
	head->subtree[1] = new tree("layer1.2");
	head->subtree[2] = new tree("layer1.3");
	tree* p = head->subtree[2];
	p->subtree[0] = new tree("layer2.1");
	p->subtree[1] = new tree("layer2.2");
	p->subtree[2] = new tree("layer3.3");
	return head;
};
void printtree(tree* p)
{	

};