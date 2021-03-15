package swehacker.playground.salon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import swehacker.playground.salon.entity.Slot;

public interface SlotRepository extends JpaRepository<Slot, Long> {
}
