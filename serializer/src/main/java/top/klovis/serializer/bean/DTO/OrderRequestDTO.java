package top.klovis.serializer.bean.DTO;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;
import top.klovis.serializer.bean.DTO.content.OrderRequestContent;
import top.klovis.serializer.utils.OrderRequestContentSerializer;

/**
 * @program: spring-boot-tutorial
 * @description: OrderRequestDTO
 * @author: klovis
 * @create: 2018-04-14 10:28
 **/
@Data
public class OrderRequestDTO {
    @JsonSerialize(using = OrderRequestContentSerializer.class)
    private OrderRequestContent content;
}
