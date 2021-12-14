package lesson9A;

public class UserRepository {
    private User[] users;
    String[] strings=new String[users.length];
    Long[] longs=new Long[users.length];

    private UserRepository(User[] users) {
        this.users=users;
    }

    public User[] getUsers() {
        return users;
    }

    public void setUsers(User[] users){
        UserRepository userRepository=new UserRepository(users);
    }


    public String[] getUserNames(){
       for (int i=0;i<users.length;i++){
           strings[i]=users[i].getName();;
       }
    return strings;
    }

    public Long[] getUserIds(){
        for (int i=0;i<users.length;i++){
            longs[i]=users[i].getId();;
        }
        return longs;
    }

    public String getUserNameById(long id){
        int count=0;
        for(int i=0;i<users.length;i++){
            if(id==longs[i]){
                break;}
         count++;
        }
        return strings[count];
    }
}