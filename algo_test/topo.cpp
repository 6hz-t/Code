#include "topo.h"
Graph::Graph()
{
	this->n = 5;
	this->l = new list<int>[n];
}

Graph::~Graph()
{
	delete [] l;
}
void Graph::addedge(int f,int t)
{
	l[f - 1].push_back(t - 1);
};
bool Graph::toposort()
{
    cout << "邻接表:" << endl;
    for (int i = 0; i < 5; i++)
    {
        cout <<"node" << i+1 << ":";
        for (int t : l[i])
            cout << t+1 << " " ;
        cout << endl;

    }
    cout <<"拓扑序列:"<<endl;
    queue<int> q;
    int indegree[5] = {0,0,0,0,0};
    for (int i = 0; i < 5; ++i)
    {
        for (int t : l[i])
        {
            indegree[t]++;
        }
    }  
    for (int i = 0; i < 5; i++) // 将所有入度为0的顶点入队
    {
        if (indegree[i] == 0)
        {
            indegree[i] = -1;
            q.push(i + 1);
        }
    }
    while (!q.empty())
    { 
        int v = q.front();      
        q.pop();
        cout << v << " ";                      
        for (int t : l[v-1])// 将所有v指向的顶点的入度减1，并将入度减为0的顶点入栈
        {
            indegree[t]--;
        }
        l[v - 1].clear();
         for (int i = 0; i < 5; i++) // 将所有入度为0的顶点入队
        {
            if (indegree[i] == 0)
            {
                indegree[i] = -1;
                q.push(i + 1);
            }  
        }
    } 

    return true;
}