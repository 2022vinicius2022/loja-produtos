package controller;

import entity.StatusEnum;
import entity.ProductEntity;
import entity.dto.ProductDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import service.ProductService;

import java.util.List;

@RestController
@RequestMapping("api/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public List<ProductEntity> findAll(){
        return productService.findAll();
    }

    @GetMapping("/{id}")
    public ProductEntity findById(@PathVariable  Long id){
        return productService.findById(id);
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public ProductEntity save(@RequestBody ProductDTO dto){
        return productService.save(dto);
    }

    @PutMapping
    public ProductEntity updateProduct(@RequestBody ProductDTO dto, @PathVariable Long id){
        ProductEntity productEntity = productService.findById(id);
        return productService.update(productEntity, dto);
    }

    @GetMapping("/{status}")
    public ProductEntity findByStatus(@PathVariable StatusEnum status){
        return productService.findByStatus(status);
    }

    @GetMapping("/{titulo}")
    public ProductEntity findByTitle(@PathVariable String titulo){
        return productService.findByTitle(titulo);
    }

}
