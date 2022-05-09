// 4. Write a program for the following
//        1. Example for call by value.
//        2. Example for call by reference.
class Main4{
    int data=5;

    void change(int k){

        data = data +2;
    }


    public static void main(String args[]){
        Main4 op=new Main4();
        op.change(5);
        System.out.println(op.data);

    }
}
// There are no call by reference in java