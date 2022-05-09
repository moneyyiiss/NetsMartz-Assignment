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