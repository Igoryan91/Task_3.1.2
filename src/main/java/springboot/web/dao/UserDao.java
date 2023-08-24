package springboot.web.dao;


import springboot.web.model.User;

import java.util.List;

public interface UserDao {
    public void saveUser(User user);

    public User getUser(int id);

    public List<User> getAllUsers();

    public void updateUser(int id, User updatedUser);

    public void removeUser(int id);
}
