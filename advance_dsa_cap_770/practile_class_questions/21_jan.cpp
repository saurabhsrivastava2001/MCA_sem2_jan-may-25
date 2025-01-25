#include <iostream>
using namespace std;
void search (int arr[],int num ,int n){
    for (int i=0;i<n;i++){
        if (num==arr[i]){
            cout<<"item found at position " <<i<<endl;
            break;
        }
    }
}
void presente(int present[],int stud ,int n){
    bool found=0;
    for (int i=0;i<n;i++){

        if (stud==present[i]){
            cout<<"student is present "<<endl;
            found=true;
            break;
        }
    }
    if(!found){
        cout<<"not present"<<endl;
    }
}
int binsearch(int arr[],int num,int n){
    int s=0,e=n-1,mid;
    while(s<e){
        mid=e-(e-s)/2;
        if(num==arr[mid]){
            return mid;
        }
        else if (num>arr[mid]){
            s+=1;
        }
        else {
            e-=1;
        }
    }
    cout<<"not found"<<endl;
    return -1;
}

int binsByRec(int arr[],int s,int e,int num){
    int mid=e-(e-s)/2;
    while(s<e){
        if(arr[mid]==num){
            return mid;
        }
        else if(num>arr[mid]){
           return binsByRec(arr,mid+1,e,num);
        }
        else{
           return binsByRec(arr,s,mid-1,num);
        }
    }
    return -1;
}

int main(){
    /*int n;
    cin>>n;
    int arr[n];
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }*/
    int present[5]={2,5,24,23,50};
    //search(arr,33,n);
    cout<<binsearch(present,24,5)<<endl;
    cout<<binsByRec(present,0,4,50)<<endl;

}
