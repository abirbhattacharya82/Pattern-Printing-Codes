#include <bits/stdc++.h>
using namespace std;
#define vi vector<int>
#define vvi vector<vi>
#define pii pair<int, int>
#define vii vector<pii>
#define si stack<int>
#define qi queue<int>
#define ll long long
#define rep(i, a, b) for (int i = a; i < b; i++)

struct node
{
  int data;
  node *left, *right;
  node(int val)
  {
    data = val;
    left = NULL;
    right = NULL;
  }
};

void zig_zag_traversal(node *root)
{
  if (root == NULL)
  {
    return;
  }
  stack<node *> curr_level;
  stack<node *> next_level;

  bool Left_To_Right = true;
  curr_level.push(root);
  while (!curr_level.empty())
  {
    node *temp = curr_level.top();
    curr_level.pop();

    if (temp != NULL)
    {
      cout << temp->data << " ";

      if (Left_To_Right)
      {
        if (temp->left)
        {
          next_level.push(temp->left);
        }
        if (temp->right)
        {
          next_level.push(temp->right);
        }
      }
      //Right_To_Left
      else
      {
        if (temp->right)
        {
          next_level.push(temp->right);
        }
        if (temp->left)
        {
          next_level.push(temp->left);
        }
      }
    }

    if (curr_level.empty())
    {
      Left_To_Right != Left_To_Right;
      swap(curr_level, next_level);
    }
  }
}

int main()
{
  node *root = new node(1);
  root->left = new node(2);
  root->left->right = new node(4);
  root->left->right->left = new node(6);
  root->left->right->right = new node(7);
  root->right = new node(3);
  root->right->right = new node(5);

  zig_zag_traversal(root);
  cout << endl;
  return 0;
}