package academy.belhard.entity;

public class User extends Person {

       private final String email;
       private final String password;

            public User(String firstName,String lastName,String email,String password) {
                super (firstName,lastName);
                this.email = email;
                this.password = password;
        }
         public String getFullInfo(){
             return firstName+ " " +lastName+ "\n" +email;
         }

         public boolean isPasswordCorrect(String password) {
            return   this.password.equals(password);
         }
    }

