package top.klovis.serializer.utils;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import top.klovis.serializer.bean.DTO.content.BaseDTOContent;

import javax.annotation.PostConstruct;
import java.io.IOException;

/**
 * @program: spring-boot-tutorial
 * @description: ResponseDeserializer
 * @author: klovis
 * @create: 2018-04-14 10:55
 **/
public class ResponseDeserializer<T extends BaseDTOContent> extends JsonDeserializer<T> {
    private static ObjectMapper OBJECT_MAPPER;
    @Autowired
    private ObjectMapper objectMapper;

    @PostConstruct
    public void init() {
        OBJECT_MAPPER = objectMapper;
    }

    public Class<?> getClazz() {
        return null;
    }

    @Override
    public T deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        String json = jsonParser.getText();
        OBJECT_MAPPER.readValue(json, getClazz());
        return null;
    }
}
