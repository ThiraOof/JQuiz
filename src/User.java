
class User {
    private int id;
    private String username;
    private String password;
    private String fullname;
    private String email;
    private String role;
    
    public User(){
        this(0, "", "", "", "", "");
    }
    
    public User(int id, String username, String password, String fullname, String email, String role){
        this.id = id;
        this.username = username;
        this.password = password;
        this.fullname = fullname;
        this.email = email;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getFullname() {
        return fullname;
    }

    public String getEmail() {
        return email;
    }

    public String getRole() {
        return role;
    }
    
    
    
    
}
