package top.klovis.serializer.bean.DTO;

import lombok.Data;

import java.security.Timestamp;

/**
 * @program: spring-boot-tutorial
 * @description: BaseDTO
 * @author: klovis
 * @create: 2018-04-14 10:23
 **/
@Data
public class BaseDTO {
    private String code;
    private String message;
    private Timestamp timestamp;
}
