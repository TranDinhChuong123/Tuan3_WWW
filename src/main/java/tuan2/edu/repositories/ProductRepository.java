package tuan2.edu.repositories;

import tuan2.edu.models.Product;

public class ProductRepository extends GenericCRUD<Product>{
    public ProductRepository() {
    }

    @Override
    public Product findOfId(Long id, Class<Product> clazz) {

        return super.findOfId(id, clazz);
    }
}
