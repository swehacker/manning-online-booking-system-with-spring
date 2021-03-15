package swehacker.playground.salon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import swehacker.playground.salon.entity.SalonServiceDetail;

public interface SalonServiceDetailRepository extends JpaRepository<SalonServiceDetail, Long> {
}
