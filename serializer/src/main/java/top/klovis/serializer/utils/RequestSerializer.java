package top.klovis.serializer.utils;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import org.springframework.beans.factory.annotation.Autowired;
import top.klovis.serializer.bean.DTO.content.BaseDTOContent;

import java.io.IOException;

/**
 * @program: spring-boot-tutorial
 * @description: RequestSerializer
 * @author: klovis
 * @create: 2018-04-14 10:30
 **/
public class RequestSerializer<T extends BaseDTOContent> extends JsonSerializer<T> {
    @Autowired
    private ObjectMapper objectMapper;

    @Override
    public void serialize(T t, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        String json = objectMapper.writeValueAsString(t);
        json = "WRAPPER" + json + "WRAPPER";
        System.out.println("[serialize json]" + json);
        jsonGenerator.writeString(json);
    }
}
