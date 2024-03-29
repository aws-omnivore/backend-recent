package omnivore.recent.repository;

import omnivore.recent.entity.User;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@EnableScan
@Repository
public interface UserRepository extends CrudRepository<User, String> {
    Optional<User> findByEmail(String email);
}
