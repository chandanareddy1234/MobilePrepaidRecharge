package com.web.mobilePrepaidRecharge.Repository;

import com.web.mobilePrepaidRecharge.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>{

	User findByMobileNumber(String mobileNumber);

}
