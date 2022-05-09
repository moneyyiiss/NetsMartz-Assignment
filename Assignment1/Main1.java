//1. Write a program to create a room class, the attributes of this class is roomno, roomtype, roomarea and ACmachine. In this class the methods are setdata and displaydata.
class room{
    int roomno;
    String roomtype;
    int roomArea;
    int ACmachine;

    void setdata(int r, String rt, int ra, int ac){
        roomno = r;
        roomtype = rt;
        roomArea = ra;
        ACmachine = ac;
    }
    void displaydata(){
        System.out.println(roomArea + " " + roomtype + " " + roomArea + " " + ACmachine);
    }
}
public class Main1 {

    public static void main(String[] args) {
        room r1 = new room();
        r1.setdata(21, "A", 2, 5);
        r1.displaydata();
    }
}
