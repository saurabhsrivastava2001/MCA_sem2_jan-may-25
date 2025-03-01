//enchanted forest
#include<iostream>
using namespace std;

class Step{
public:
    int step_val;
    Step * next;
    Step(int step_val){
        this->step_val=step_val;
        this->next=NULL;
    }
    
    
};

void insertAtTail(Step* &tail, int d){
    Step* temp = new Step(d);
    tail->next = temp;
    tail = temp;
}

void insertAtHead(Step* &head, int d){
    Step* temp = new Step(d);
    temp->next = head;
    head = temp;
}

void insertAtPosition(Step* &tail, Step* &head, int position, int d){
    if(position == 1) {
        insertAtHead(head, d);
        return;
    }
    Step* temp = head;
    int cnt = 1;
    while(cnt < position-1) {
        temp = temp->next;
        cnt++;
    }
    if(temp->next == NULL) {
        insertAtTail(tail, d);
        return;
    }
    Step* nodeToInsert = new Step(d);
    nodeToInsert->next = temp->next;
    temp->next = nodeToInsert;
}

void deleteNode(int position, Step* &head, Step* &tail) {
    if(position == 1) {
        Step* temp = head;
        head = head->next;
        temp->next = NULL;
        delete temp;
    } else {
        Step* curr = head;
        Step* prev = NULL;
        int cnt = 1;
        while(cnt < position) {
            prev = curr;
            curr = curr->next;
            cnt++;
        }
        if(curr->next == NULL) {
            prev->next = NULL;
            tail = prev;
            delete curr;
            return;
        }
        prev->next = curr->next;
        curr->next = NULL;
        delete curr;
    }
}

int findMissing(Step* head) {
    Step* temp = head;
    
    while (temp != nullptr && temp->next != nullptr) {
        if (temp->next->step_val - temp->step_val > 10) { 
            cout << "Missing number: " << temp->step_val + 10 << endl;
            return temp->step_val+10; // Assuming only one missing number
        }
        temp = temp->next;
    }
}

void print(Step* &head){
    if(head == NULL){
        cout << "List is empty" << endl;
        return;
    }
    Step* temp = head;
    while(temp != NULL){
        cout << temp->step_val << "->";
        temp = temp->next;
    }
    cout <<"NULL"<< endl;
}

int findHiddenGate(int val, Step * head){
    Step * tra=head;
    int cnt=1;
    while(tra!=NULL){
        if (tra->step_val==val){
            cout<<"found the hidden gate at position : "<<cnt<<endl;
            cout<<"AArmmmy Chhaaarrrrggggeee  !!!!!";
            return cnt ;
        }
        tra=tra->next;
        cnt++;
    }
}

int main(){
    Step * first=new Step (10);
    Step * head= first;
    Step * tail= first;


    insertAtTail(tail,20);
    //insertAtTail(tail,30);
    insertAtTail(tail,40);
    insertAtTail(tail,50);

    // level 1


    //now the path is -
    print(head);
    cout<< " detecting a missing step"<<endl;
    int missing =findMissing(head);
    int pos=missing/head->step_val;
    insertAtPosition(tail,head,pos,missing);
    print(head);
    cout<<"crossed the forest ! hurrreeey XD XD"<<endl;

    //level 2

    int location=findHiddenGate(40,head);
}