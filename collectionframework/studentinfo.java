public class studentinfo {
    int roll_no;
    String name;
    double percentage;

    public studentinfo( int roll_no,String name,double percentage){
        this.roll_no=roll_no;
        this.name=name;
        this.percentage=percentage;

    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
       return "name of student:"+name+"\nroll_no of student:"+roll_no+"\npercentage of student:"+percentage;
    }
}
