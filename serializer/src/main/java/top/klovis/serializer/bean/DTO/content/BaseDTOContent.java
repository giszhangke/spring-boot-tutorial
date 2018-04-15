package top.klovis.serializer.bean.DTO.content;

import lombok.Data;
import top.klovis.serializer.bean.DTO.common.Product;

import java.util.List;

/**
 * @program: spring-boot-tutorial
 * @description: BaseDTOContent
 * @author: klovis
 * @create: 2018-04-14 10:19
 **/
@Data
public abstract class BaseDTOContent {
    private String id;
    private String sumPrice;
    private List<Product> products;
}
