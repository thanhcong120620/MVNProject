package study.maven.thanhcong.service.implement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import study.maven.thanhcong.model.entity.User.User;
import study.maven.thanhcong.repository.UserRepository;
import study.maven.thanhcong.service.IUserService;

import java.util.Optional;

@Service
@Transactional
public class UserService implements IUserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public User saveAndUpdate(User user) {
        User enityUser = userRepository.save(user);
        return enityUser;
    }
}
