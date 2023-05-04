package study.maven.thanhcong.service;

import study.maven.thanhcong.model.entity.User.User;

import java.util.Optional;

public interface IUserService {
    User saveAndUpdate (User user);
}
