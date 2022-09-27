package repository;

import entity.StatusEnum;
import entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Long> {

    @Query("select p from ProductEntity p where p.categoryEnum = ?1")
    Optional<ProductEntity> findByStatus(StatusEnum statusEnum);

    @Query("select p from ProductEntity p where p.title = ?1")
    Optional<ProductEntity> findByTitle(String title);

}
