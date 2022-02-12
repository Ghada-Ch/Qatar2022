package isi.tn.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import isi.tn.entities.User;
@Repository
public interface userRepository extends JpaRepository<User,Long> {

}
