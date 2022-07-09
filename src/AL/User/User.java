package AL.User;

abstract class User {

    protected String name, username, email, phoneNo, password, post;
    
   
    abstract boolean login(String username, String password);
    
    abstract void register();
    
    public String getUsername(){
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
   
    public String getPassword(){
        return this.password;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    
    public String getEmail(){
        return this.email;
    }

    public void setEmail( String email) {
        this.email = email;
    }
    
    public String getPhoneNo(){
        return this.phoneNo;
    }
    
    public void setPhoneNo(String phoneNo){
        this.phoneNo = phoneNo;
    }
    
    public String getPost(){
        return this.post;
    }
    
    public void setPost(String post){
        this.post = post;
    }
}
