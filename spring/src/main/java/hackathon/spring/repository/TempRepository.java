package hackathon.spring.repository;

import hackathon.spring.domain.Temp;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TempRepository extends JpaRepository<Temp, Long> {
}
