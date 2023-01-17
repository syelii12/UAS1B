import java.util.ArrayList;
import java.util.Scanner;

public class ObjectFB {
    private String Fullname;
    private String UserName;
    private String UserID;
    private String Posted;

    public String getFullname() {
        return Fullname;
    }

    public void setFullname(String fullname) {
        Fullname = fullname;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getUserID() {
        return UserID;
    }

    public void setUserID(String userID) {
        UserID = userID;
    }

    public String getPosted() {
        return Posted;
    }

    public void setPosted(String posted) {
        Posted = posted;
    }

    public void ObjectFB(){
        System.out.println("Object FB Process...");
    }

    public static void main(String[] args){
        int jumPot = 4;
        Scanner sc = new Scanner(System.in);
        ObjectFB user1 = new ObjectFB();
        user1.setUserID("0246");
        user1.setFullname("Syeli Mutiatul Hilmy");
        user1.setUserName("btrg");
        ArrayList<String>myPost = new ArrayList<>();
        for (int index=0;index<jumPot;index++){
        myPost.add(sc.nextLine());
        }
        user1.setPosted(myPost);
        System.out.println("Total Posted : " + user1.ShowNumberOfPost());

    }
}
