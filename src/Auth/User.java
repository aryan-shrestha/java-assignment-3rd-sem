package Auth;

abstract class User {

    protected String name, username, email, phoneNo, password, post;
    
   
    abstract boolean login(String username, String password);
    
    abstract void register();
    
    public String getUsername(){
        return this.username;
    }
    
    public String getPassword(){
        return this.password;
    }

}
