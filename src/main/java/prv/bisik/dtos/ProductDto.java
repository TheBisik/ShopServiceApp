package prv.bisik.dtos;

import java.math.BigDecimal;

public class ProductDto {

    private long id;

    private String name;

    private BigDecimal price;

    private CategoryDto categoryDto;

    private String description;

    public ProductDto(long id, String name, BigDecimal price, CategoryDto categoryDto, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.categoryDto = categoryDto;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public CategoryDto getCategory() {
        return categoryDto;
    }

    public String getDescription() {
        return description;
    }
}
// fix