package study.maven.thanhcong.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import study.maven.thanhcong.model.entity.User.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
/*    User findByUseremail(String email);

    User findByToken(String token);*/
}
