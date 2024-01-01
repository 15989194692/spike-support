package com.lsz.http.product;

import com.lsz.product.ProductInfoQuery;
import com.lsz.product.command.CreateProductCommand;
import com.lsz.product.dto.CreateProductDto;
import com.lsz.product.dto.ProductInfoDto;
import com.lsz.product.service.ProductApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName ProductController
 * @Description TODO
 * @Author lishuzeng
 * @Date 2024/1/1 下午1:29
 * @Version 1.0.0
 **/
@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductApplicationService productApplicationService;

    @PostMapping("/query")
    public List<ProductInfoDto> query(@RequestBody ProductInfoQuery query) {
        return productApplicationService.queryByCondition(query);
    }

    @PostMapping("/create")
    public CreateProductDto create(@RequestBody CreateProductCommand command) {
        return productApplicationService.create(command);
    }

}
