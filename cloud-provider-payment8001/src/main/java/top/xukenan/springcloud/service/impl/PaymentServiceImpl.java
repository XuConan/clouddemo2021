package top.xukenan.springcloud.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import top.xukenan.springcloud.dao.PaymentMapper;
import top.xukenan.springcloud.entity.Payment;
import top.xukenan.springcloud.service.PaymentService;
.PaymentMapper;
import org.springframework.stereotype.Service;

/**
 *
 */
@Service
public class PaymentServiceImpl extends ServiceImpl<PaymentMapper, Payment>
    implements PaymentService{

}



