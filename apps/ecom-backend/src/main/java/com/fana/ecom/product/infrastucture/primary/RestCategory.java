package com.fana.ecom.product.infrastucture.primary;

import org.jilt.Builder;

import com.fana.ecom.product.domain.aggregate.Category;
import com.fana.ecom.product.domain.aggregate.CategoryBuilder;
import com.fana.ecom.product.domain.vo.CategoryName;
import com.fana.ecom.product.domain.vo.PublicId;
import com.fana.ecom.shared.error.domain.Assert;

import java.util.UUID;

@Builder
public record RestCategory(UUID publicId, String name) {

    public RestCategory {
        Assert.notNull("name", name);
    }

    public static Category toDomain(RestCategory restCategory) {
        CategoryBuilder categoryBuilder = CategoryBuilder.category();

        if(restCategory.name != null) {
        categoryBuilder.name(new CategoryName(restCategory.name));
        }

        if(restCategory.publicId != null) {
        categoryBuilder.publicId(new PublicId(restCategory.publicId));
        }

        return categoryBuilder.build();
    }

    public static RestCategory fromDomain(Category category) {
        RestCategoryBuilder restCategoryBuilder = RestCategoryBuilder.restCategory();

        if(category.getName() != null) {
        restCategoryBuilder.name(category.getName().value());
        }

        return restCategoryBuilder
        .publicId(category.getPublicId().value())
        .build();
    }
}
