
public class Admin extends User{
    public Admin(){
        this(0, "", "", "", "", "");
    }
    public Admin(int id, String username, String password, String fullname, String email, String role){
        super(id, username, password, fullname, email, "Admin");
    }
}
