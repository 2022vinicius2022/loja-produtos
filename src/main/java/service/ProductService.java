package service;

import entity.StatusEnum;
import entity.ProductEntity;
import entity.dto.ProductDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.ProductRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<ProductEntity> findAll(){
        return productRepository.findAll();
    }

    public ProductEntity findById(Long id){
        Optional<ProductEntity> entity = productRepository.findById(id);

        if (entity.isPresent()) {
            return entity.get();
        }

        throw new RuntimeException();

    }

    public ProductEntity findByStatus(StatusEnum status){
        Optional<ProductEntity> entity = productRepository.findByStatus(status);

        if (entity.isPresent()) {
            return entity.get();
        }

        throw new RuntimeException();

    }

    public ProductEntity findByTitle(String title){
        Optional<ProductEntity> entity = productRepository.findByTitle(title);

        if (entity.isPresent()) {
            return entity.get();
        }

        throw new RuntimeException();

    }

    public ProductEntity save(ProductDTO dto){

        ProductEntity entity = new ProductEntity();

        entity.setTitle(dto.getTitle());
        entity.setStatusEnum(dto.getCategoryEnum().ACTIVE);
        entity.setDescription(dto.getDescription());
        entity.setMidia(dto.getMidia());
        entity.setTags(dto.getTags());
        entity.setPrice(dto.getPrice());
        entity.setComparationPrice(dto.getComparationPrice());
        entity.setProductCategory(dto.getProductCategory());

        return productRepository.save(entity);
    }

    public ProductEntity update(ProductEntity entity, ProductDTO dto){

        entity.setTitle(dto.getTitle());
        entity.setStatusEnum(dto.getCategoryEnum().ACTIVE);
        entity.setDescription(dto.getDescription());
        entity.setMidia(dto.getMidia());
        entity.setTags(dto.getTags());
        entity.setPrice(dto.getPrice());
        entity.setComparationPrice(dto.getComparationPrice());

        return productRepository.save(entity);
    }

}
