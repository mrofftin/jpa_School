package co.mr.jpaDemo.repository;

import co.mr.jpaDemo.entity.VisitBook;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VisitRepository extends JpaRepository<VisitBook, Long> {
}
