package kitchenpos.domain;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface ProductJpaRepository extends JpaRepository<Product, UUID>, ProductRepository {
    List<Product> findAllByIdIn(List<UUID> ids);
}
