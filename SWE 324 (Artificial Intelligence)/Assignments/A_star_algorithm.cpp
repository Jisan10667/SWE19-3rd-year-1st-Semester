//
//  main.cpp
//  A star search assignment
//
//  Created by JisanAhmed on 24/3/23.
//

#include <iostream>
#include <queue>
#include <set>
#include <iostream>
#include <algorithm>
#include <cmath>
#include <vector>
#include <map>
#include <cstdio>
#include <string>
#include<unordered_map>
 
 
#define PI acos(-1)
#define F first
#define S second
#define debug(x)  cout<<'>'<<#x<<":"<<x<<endl
#define tara ios_base::sync_with_stdio(false);cin.tie(0);cout.tie(0)
#define Y printf("YES\n")
#define N printf("NO\n")
#define ll long long
#define lll __int128
#define ull unsigned long long
#define pii pair<int,int>
#define pll pair<long,long>
#define eb emplace_back
#define pb push_back
#define sc scanf
#define pf printf
#define endl '\n'
#define INF 1<<30
#define ll_INF 1LL<<60
#define mod 998244353
 
const ll M=3e5+10 ;


using namespace std;

struct Node {
    char id;
    int f;
    int g;
    int h;

    Node(char i, int f_val, int g_val, int h_val) : id(i), f(f_val), g(g_val), h(h_val) {}

    bool operator<(const Node& other) const {
        return f > other.f;
    }
};

void AStarSearch(unordered_map<char, vector<pair<char, int>>> graph, char start, char goal, unordered_map<char, int> heuristic) {

    priority_queue<Node> open_list;

    unordered_map<char, bool> closed_list;

    unordered_map<char, int> g_values;

    open_list.push(Node(start, 0, 0, heuristic[start]));

    g_values[start] = 0;

    while (!open_list.empty()) {

        Node current_node = open_list.top();
        open_list.pop();

        vector<char> path;
        if (current_node.id == goal) {
            cout<<"Goal found!  Total cost is :  "<<current_node.f<<endl;
            cout << "Path found: " << endl;
            char node = current_node.id;
            path.push_back(node);
            while (node != start) {
                for (auto& neighbor : graph[node]) {
                    if (g_values[neighbor.first] == current_node.g - neighbor.second) {
                        path.push_back(neighbor.first);
                        current_node = Node(neighbor.first, current_node.f, g_values[neighbor.first], heuristic[neighbor.first]);
                        node = neighbor.first;
                        break;
                    }
                }
            }
            reverse(path.begin(),path.end());
            int i;
            for(i = 0; i < path.size()-1; i++)
            {
                cout<<path[i]<<" -> ";
            }
            cout << path[i]<<endl;
            return;
        }

        closed_list[current_node.id] = true;

        for (auto& neighbor : graph[current_node.id]) {

            if (closed_list[neighbor.first]) {
                continue;
            }


            int tentative_g = g_values[current_node.id] + neighbor.second;

            if (!g_values.count(neighbor.first) || tentative_g < g_values[neighbor.first]) {

                int f_val = tentative_g + heuristic[neighbor.first];

                Node neighbor_node = Node(neighbor.first, f_val, tentative_g, heuristic[neighbor.first]);

                open_list.push(neighbor_node);

                g_values[neighbor.first] = tentative_g;
            }
        }
    }


    cout << "No path found." << endl;
}

int main() {

    int n,e;
    cin>>n>>e;

    char start, goal;
    start = 'A';
    unordered_map<char, int> heuristic;
    for(int i = 0; i<n; i++)
    {
        char c;
        int hi;
        cin>>c>>hi;
        heuristic[c] = hi;
        if(hi==0){
            goal = c;
        }
    }

    unordered_map<char, vector<pair<char, int>>> graph;

    for(int i = 0; i<e; i++){
        char c1, c2;
        int ct;
        cin>>c1>>c2>>ct;
        graph[c1].push_back(make_pair(c2,ct));
        graph[c2].push_back(make_pair(c1,ct));
    }

    AStarSearch(graph, start, goal, heuristic);

    return 0;
}


/*
Input 1:
20 23
Arad 366
Bucharest 0
Craiova 160
Drobeta 242
Eforie 161
Fagaras 178
Giurgiu 77
Hirsova 151
Iasi 226
Lugoj 244
Mehadia 241
Neamt 234
Oradiea 380
Pitesti 98
Rimnicu-Vilcea 193
Sibiu 253
Timisoara 329
Urziceni 80
Vaslui 199
Zering 374
 
Arad Zering 75
Arad Sibiu 140
Arad Timisoara 118
Zering Oradiea 71
Sibiu Fagaras 99
Sibiu Rimnicu-Vilcea 80
Sibiu Oradiea 151
Timisoara Lugoj 111
Lugoj Mehadi 70
Mehadia Drobeta 75
Drobeta Craiova 120
Craiova Rimnicu-Vilcea 146
Pitesti Rimnicu-Vilcea 97
Pitesti Craiova 138
Pitesti Bucharest 101
Bucharest Giurgiu 90
Bucharest Fagaras 211
Buchares Urziceni 85
Urziceni Hirsova 98
Hirsova Eforie 86
Urziceni Vaslui 142
Vaslui Iasi 92
Iasi Neamt 87
*/
