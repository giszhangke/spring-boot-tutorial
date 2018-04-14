package top.klovis.serializer.bean.DTO.common;

import lombok.Data;

/**
 * @program: spring-boot-tutorial
 * @description: Product
 * @author: klovis
 * @create: 2018-04-14 11:49
 **/
@Data
public class Product {
    private String id;
    private String name;
    private String price;
}
