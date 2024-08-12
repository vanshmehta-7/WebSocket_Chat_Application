package com.example.app.user;
import lombok.RequiredArgsConstructor;
import java.util.List;

@RequiredArgsConstructor
public class UserService {

    private final UserRepository repository;

    public void saveUser( User user){
         user.setStatus(Status.ONLINE);
         repository.save(user);
    }

    public void disconnect(User user){
        var storedUser = repository.findById(user.getNickname()).orElse(null);
        if(storedUser != null){
            storedUser.setStatus(Status.OFFLINE);
            repository.save(storedUser);
        }
    }

    public List<User> findConnectedUsers(){
        return repository.findAllByStatus(Status.ONLINE);
    }
}
