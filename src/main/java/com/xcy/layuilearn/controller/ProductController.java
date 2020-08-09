package com.xcy.layuilearn.controller;

import com.xcy.layuilearn.mapper.ProductMapper;
import com.xcy.layuilearn.service.ProductService;
import com.xcy.layuilearn.vo.BarVO;
import com.xcy.layuilearn.vo.DataVO;
import com.xcy.layuilearn.vo.ProductBarVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @ClassName ProductController
 * @Description TODO
 * @Author xcy
 * @Date 2020/8/9 14:39
 */
@RestController
@RequestMapping(value = "/product",method={ RequestMethod.GET, RequestMethod.POST})
public class ProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    private ProductMapper productMapper;

    @GetMapping("/list")
    public DataVO queryPage( Integer page,  Integer limit){
        return productService.findData(page,limit);
    }

    @RequestMapping("/barVO")
    public BarVO getBarVO(){
        return productService.getBarVO();
    }

//    @RequestMapping("/pieVO")
//    @ResponseBody
//    public List<PieVO> getPieVO(){
//        return productService.getPieVO();
//    }

    @RequestMapping("/pieVO")
    public List<ProductBarVO> getPieVO(){
        return productMapper.findAllProductBarVO();
    }

}
