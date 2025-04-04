package com.fana.ecom.product.domain.aggregate;

import org.jilt.Builder;

import com.fana.ecom.product.domain.vo.ProductSize;
import com.fana.ecom.product.domain.vo.PublicId;

import java.util.List;

@Builder
public record FilterQuery(PublicId categoryId, List<ProductSize> sizes) {

}
