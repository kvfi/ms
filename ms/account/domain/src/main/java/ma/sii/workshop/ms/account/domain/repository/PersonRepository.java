package ma.sii.workshop.ms.account.domain.repository;

import ma.sii.workshop.ms.account.domain.entity.Person;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
    Page<Person> findAll(Pageable pageable);
}
