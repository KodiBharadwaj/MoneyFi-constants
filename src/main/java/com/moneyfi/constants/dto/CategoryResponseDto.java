package com.moneyfi.constants.dto;

import java.io.Serializable;

public class CategoryResponseDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer categoryId;
    private String type;
    private String category;

    public CategoryResponseDto() {
    }

    public CategoryResponseDto(Integer categoryId, String type, String category) {
        this.categoryId = categoryId;
        this.type = type;
        this.category = category;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "CategoryResponseDto{" +
                "categoryId=" + categoryId +
                ", type='" + type + '\'' +
                ", category='" + category + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CategoryResponseDto that = (CategoryResponseDto) o;

        if (categoryId != null ? !categoryId.equals(that.categoryId) : that.categoryId != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        return category != null ? category.equals(that.category) : that.category == null;
    }

    @Override
    public int hashCode() {
        int result = categoryId != null ? categoryId.hashCode() : 0;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (category != null ? category.hashCode() : 0);
        return result;
    }
}
