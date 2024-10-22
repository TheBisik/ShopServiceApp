package prv.bisik.domain;

import jakarta.persistence.*;
import prv.bisik.enums.GeneralProductType;

@Entity
public class CategoryType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, unique = true)
    @Enumerated(EnumType.STRING)
    private GeneralProductType generalProductType;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "categoryType")
    private Category category;

    public CategoryType() {
    }

    public CategoryType(long id, GeneralProductType generalProductType, Category category) {
        this.id = id;
        this.generalProductType = generalProductType;
        this.category = category;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public GeneralProductType getGeneralProductType() {
        return generalProductType;
    }

    public void setGeneralProductType(GeneralProductType generalProductType) {
        this.generalProductType = generalProductType;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
