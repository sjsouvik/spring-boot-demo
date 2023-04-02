package com.example.springbootdemo.mapper;

import com.example.springbootdemo.dto.ProductDto;
import com.example.springbootdemo.model.ProductModel;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ProductMapper {

  ProductMapper instance = Mappers.getMapper(ProductMapper.class);

  ProductDto productModelToDto(ProductModel productModel);

  ProductModel productDtoToModel(ProductDto productDto);
}
