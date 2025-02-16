#pragma once
#include <list>
#include <queue>
#include <iostream>
using namespace std;
class Graph
{
private:
	int n;
	list <int> *l;		//邻接表
public:
	Graph();
	~Graph();
	void addedge(int f, int t);	//入度
	bool toposort();			//拓扑算法
};