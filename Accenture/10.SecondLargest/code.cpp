#include<bits/stdc++.h>
using namespace std;
int secondSmallest(int arr[],int n)
{
    if(n<2)
        return -1;
    int small = INT_MAX;
    int secondSmallest = INT_MAX;
    int i;
    for(i = 0; i < n; i++) 
    {
       if(arr[i] < small)
       {
          secondSmallest = small;
          small = arr[i];
       }
       else if(arr[i] < secondSmallest && arr[i] != small)
       {
          secondSmallest = arr[i];
       }
    }
   return secondSmallest;     
}
int secondLargest(int arr[],int n)
{
	if(n<2)
	return -1;
    int large=INT_MIN,second_largest=INT_MIN;
    int i;
    for (i = 0; i < n; i++) 
    {
        if (arr[i] > large) 
        {
            second_largest = large;
            large = arr[i];
        }
 
        else if (arr[i] > second_largest && arr[i] != large) 
        {
            second_largest = arr[i];
        }
    }
    return second_largest;                
}

int main() {
    int arr[]={1,2,4,7,7,5};  
    int n=sizeof(arr)/sizeof(arr[0]);
    int sS=secondSmallest(arr,n);
    int sL=secondLargest(arr,n);
    cout<<"Second smallest is "<<sS<<endl;
    cout<<"Second largest is "<<sL<<endl;
    return 0;
}


