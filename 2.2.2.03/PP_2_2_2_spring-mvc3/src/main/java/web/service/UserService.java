package web.service;


import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDAO;
import web.model.User;
import java.util.List;

public interface UserService {
    void add(User user);
    void update(User user);


    @Transactional(readOnly = true)
    List<User> listUsers();


     User findById(int id);
     void delete (int id);

}