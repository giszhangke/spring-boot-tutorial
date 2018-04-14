package top.klovis.serializer.utils;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import top.klovis.serializer.bean.DTO.content.BaseDTOContent;

import java.io.IOException;

/**
 * @program: spring-boot-tutorial
 * @description: RequestSerializer
 * @author: klovis
 * @create: 2018-04-14 10:30
 **/
public class RequestSerializer<T extends BaseDTOContent> extends JsonSerializer<T> {
    @Override
    public void serialize(T t, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {

    }
}
