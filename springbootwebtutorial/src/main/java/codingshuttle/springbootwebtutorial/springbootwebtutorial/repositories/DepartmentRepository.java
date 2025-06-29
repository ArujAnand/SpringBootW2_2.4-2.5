package codingshuttle.springbootwebtutorial.springbootwebtutorial.repositories;

import codingshuttle.springbootwebtutorial.springbootwebtutorial.entities.DepartmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<DepartmentEntity, Long> {
}
