package com.xcy.layuilearn.service;



import com.xcy.layuilearn.vo.BarVO;
import com.xcy.layuilearn.vo.DataVO;
import com.xcy.layuilearn.vo.PieVO;
import com.xcy.layuilearn.vo.ProductVO;

import java.util.List;

public interface ProductService {
    public DataVO<ProductVO> findData(Integer page, Integer limit);
    public BarVO getBarVO();
    public List<PieVO> getPieVO();
}
