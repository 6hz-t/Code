#pragma once
#include <string>
using namespace std;

typedef struct tree
{
	string data="";
	tree* subtree[3] = {nullptr};
	tree(string data):data(data){
		subtree[0] = nullptr;
		subtree[1] = nullptr;
		subtree[2] = nullptr;
	};
}tree;
tree* createtree();
void printtree(tree* p);
