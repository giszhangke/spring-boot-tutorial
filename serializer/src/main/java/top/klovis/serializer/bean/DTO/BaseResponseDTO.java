package top.klovis.serializer.bean.DTO;

import lombok.Data;

import java.sql.Timestamp;


/**
 * @program: spring-boot-tutorial
 * @description: BaseResponseDTO
 * @author: klovis
 * @create: 2018-04-14 10:23
 **/
@Data
public abstract class BaseResponseDTO {
    private String code;
    private String message;
    private Timestamp timestamp;
}
