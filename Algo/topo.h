#pragma once
#include <list>
#include <queue>
#include <iostream>
using namespace std;
class Graph
{
private:
	int n;
	list <int> *l;		//�ڽӱ�
public:
	Graph();
	~Graph();
	void addedge(int f, int t);	//���
	bool toposort();			//�����㷨
};