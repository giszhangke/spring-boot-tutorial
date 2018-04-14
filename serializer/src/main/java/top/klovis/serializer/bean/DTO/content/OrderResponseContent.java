package top.klovis.serializer.bean.DTO.content;

import lombok.Data;
import top.klovis.serializer.bean.DTO.common.Product;

import java.util.List;

/**
 * @program: spring-boot-tutorial
 * @description: OrderResponseContent
 * @author: klovis
 * @create: 2018-04-14 10:20
 **/
@Data
public class OrderResponseContent extends BaseDTOContent {
    private String id;
    private String status;
    private String sumPrice;
    private List<Product> products;
}
