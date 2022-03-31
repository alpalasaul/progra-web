package com.krypton.webstore22.domain;

import java.io.Serializable;
import java.math.BigDecimal;

public class Product implements Serializable {

    private static final long serialVersionUID = 3678107792576131001L;
    private String productId;
    private String name;
    private BigDecimal unitPrice;
    private String description;
    private String manufacturer;
    private String category;
    private long unitsInStock;
    private long unitsInOrder;
    private boolean discontinued;
    private String condition;

    public Product() {
        super();
    }

    public Product(String productId, String name, BigDecimal unitPrice) {
        this.productId = productId;
        this.name = name;
        this.unitPrice = unitPrice;
    }

// add setters and getters for all the fields here
    public void setProductId(String ProductId) {
        this.productId = ProductId;
    }

    public String getProductId() {
        return productId;
    }

    public void setName(String Name) {
        this.name = Name;
    }

    public String getName() {
        return name;
    }

    public void setUnitPrice(BigDecimal UnitPrice) {
        this.unitPrice = UnitPrice;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setDescription(String Description) {
        this.description = Description;
    }

    public String getDescription() {
        return description;
    }

    public void setManufacturer(String Manufacturer) {
        this.manufacturer = Manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setCategory(String Category) {
        this.category = Category;
    }

    public String getCategory() {
        return category;
    }

    public void setUnitsInStock(long UnitsInStock) {
        this.unitsInStock = UnitsInStock;
    }

    public long getUnitsInStock() {
        return unitsInStock;
    }

    public void setUnitsInOrder(long UnitsInOrder) {
        this.unitsInOrder = UnitsInOrder;
    }

    public long getUnitsInOrder() {
        return unitsInOrder;
    }

    public void setDiscontinued(boolean Discontinued) {
        this.discontinued = Discontinued;
    }

    public boolean getDiscontinued() {
        return discontinued;
    }

    public void setCondition(String Condition) {
        this.condition = Condition;
    }

    public String getCondition() {
        return condition;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Product other = (Product) obj;
        if (productId == null) {
            if (other.productId != null) {
                return false;
            }
        } else if (!productId.equals(other.productId)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result
                + ((productId == null) ? 0
                        : productId.hashCode());
        return result;
    }
}
