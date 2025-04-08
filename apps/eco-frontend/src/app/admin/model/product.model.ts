export type ProductSize = 'XS' | 'S' | 'M' | 'L' | 'XL' | 'XXL';
export const sizes: ProductSize[] = ['XS', 'S', 'M', 'L', 'XL', 'XXL'];

export interface ProductCategory {
    publicId?: string,
    name?: string
}

export interface ProductPicture {
    file: File,
    mimeType: string
}

export interface BaseProduct {
    brand: string,
    color: string,
    description: string,
    name: string,
    price: number,
    size: ProductSize,
    category: ProductCategory,
    featured: boolean,
    pictures: ProductPicture[],
    nbInstock: number,
}

export interface Product extends BaseProduct {
    publicId: string
}