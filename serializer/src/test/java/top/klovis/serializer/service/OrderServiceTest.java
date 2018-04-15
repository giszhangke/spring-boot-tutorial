package top.klovis.serializer.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;
import top.klovis.serializer.SerializerApplication;
import top.klovis.serializer.bean.DTO.OrderRequestDTO;
import top.klovis.serializer.bean.DTO.OrderResponseDTO;
import top.klovis.serializer.bean.DTO.common.Product;
import top.klovis.serializer.bean.DTO.content.OrderRequestContent;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SerializerApplication.class)
public class OrderServiceTest {
    @Autowired
    private ObjectMapper objectMapper;

    @Test
    public void order() throws Exception {
        OrderRequestDTO request = new OrderRequestDTO();
        OrderRequestContent content = new OrderRequestContent();
        content.setId("1");
        content.setSumPrice("10000");
        List<Product> products = new ArrayList<>();
        Product product1 = new Product();
        Product product2 = new Product();
        Product product3 = new Product();
        product1.setId("p1");
        product1.setName("computer");
        product1.setPrice("9000");
        product2.setId("p2");
        product2.setName("mouse");
        product2.setPrice("200");
        product3.setId("p3");
        product3.setName("keyboard");
        product3.setPrice("800");
        products.add(product1);
        products.add(product2);
        products.add(product3);
        content.setProducts(products);
        request.setContent(content);

        String json = objectMapper.writeValueAsString(request);
        OrderResponseDTO response = objectMapper.readValue(json, OrderResponseDTO.class);
    }

}