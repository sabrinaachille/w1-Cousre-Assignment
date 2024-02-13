public class Course {
    //encapsulated data members
    private String ID;
    private String Name;
    private int Code;
    //setter
    public void setID(String id){ this.ID = id;}
    public void setName(String name){this.Name = name;}
    public void setCode(int code){this.Code = code;}
    //getters
    public String getID(){return ID;}
    public String getName(){return Name;}
    public int getCode(){return Code;}
    //constructors
    Course(){
        ID = "Unknown"; Name = "Unknown"; Code = 0;
    }
    Course(String name, String id, int code){
        ID = id; Name = name; Code = code;
    }
    void print(){
        System.out.println(Code + " " + ID + " " + Name);
    }
}
