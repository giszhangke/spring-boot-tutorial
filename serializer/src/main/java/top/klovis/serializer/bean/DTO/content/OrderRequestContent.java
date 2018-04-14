package top.klovis.serializer.bean.DTO.content;

import lombok.Data;
import top.klovis.serializer.bean.DTO.common.Product;

import java.util.List;

/**
 * @program: spring-boot-tutorial
 * @description: OrderRequestContent
 * @author: klovis
 * @create: 2018-04-14 10:18
 **/
@Data
public class OrderRequestContent extends BaseDTOContent {
    private String id;
    private String sumPrice;
    private List<Product> products;
}
