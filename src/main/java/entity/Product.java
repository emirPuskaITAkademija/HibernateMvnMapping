package entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class Product implements Serializable {
    private Integer productId;
    private String name;
    private Integer quantityInStock;
    private BigDecimal unitPrice;

    public Product() {
        super();
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(Integer quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", name='" + name + '\'' +
                ", quantityInStock=" + quantityInStock +
                ", unitPrice=" + unitPrice.toPlainString() +
                '}';
    }
}
