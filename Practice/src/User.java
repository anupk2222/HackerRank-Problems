public class User
{
   
 
    private User(UserBuilder builder) {
       System.out.println("hello");
    }
 
    //All getter, and NO setter to provde immutability
   
 
    public static class UserBuilder
    {
        
 
        public UserBuilder() {
           System.out.println("Bye");
        }
          public User build() {
            User user =  new User(this);
            return user;
        }
       
    }

public static void main(String[] args) {
    User user1 =  new User.UserBuilder().build();
    
 

}
}