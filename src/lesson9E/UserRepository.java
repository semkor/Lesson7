package lesson9E;


public class UserRepository {
    private User[] users;
    String[] strings = new String[users.length];
    Long[] longs = new Long[users.length];
    String[] arraySessionId = new String[users.length];

    private UserRepository(User[] users) {
        this.users = users;
    }

    public User[] getUsers() {
        return users;
    }

    public void setUsers(User[] users) {
        UserRepository userRepository = new UserRepository(users);
    }

    public String[] getUserNames() {
        for (int i = 0; i < users.length; i++) {
            strings[i] = users[i].getName();
        }
        return strings;
    }

    public Long[] getUserIds() {
        for (int i = 0; i < users.length; i++) {
            longs[i] = users[i].getId();
        }
        return longs;
    }

    public String getUserNameById(long id) {
        int count = 0;
        for (int i = 0; i < users.length; i++) {
            if (id == longs[i]) {
                break;
            }
            count++;
        }
        return strings[count];
    }

    public String getUserByName(String name) {
        int count = 0;
        String result = null;
        for (int i = 0; i < users.length; i++) {
            if (name == strings[i]) {
                result = strings[count];
                break;
            }
            count++;
        }
        return result;
    }

    public String getUserBySessionId(String sessionId) {
        for (int i = 0; i < users.length; i++) {
            arraySessionId[i] = users[i].getSessionId();
        }
        int count = 0;
        String result = null;
        for (int i = 0; i < users.length; i++) {
            if (sessionId == arraySessionId[i]) {
                result = strings[count];
                break;
            }
            count++;
        }
        return result;
    }

    public String findById(long id) {
        int count = 0;
        String result = null;
        for (int i = 0; i < users.length; i++) {
            if (id == longs[i]) {
                result = strings[count];
                break;
            }
            count++;
        }
        return result;
    }

    public User save(User user) {
        if (findById(user.getId()) == null)
            return null;

        for (int i = 0; i < users.length; i++) {
            if (strings[i] == null) {
                strings[i] = user.getName();
                return user;
            }
        }
        return null;
    }

    public User updater(User user){
        if (findById(user.getId()) == null)
            return null;

        String nowName=findById(user.getId());
        nowName=user.getName();
            return user;
    }

    public void delete(long id){
        String delete=findById(id);
        delete=null;
    }
}