package top.xukenan.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.xukenan.springcloud.service.PaymentService;
import top.xukenan.springcloud.entity.Payment;
import top.xukenan.springcloud.web.JsonResult;

/**
 * For the brave souls who get this far: You are the chosen ones,
 * the valiant knights of programming who toil away, without rest,
 * fixing our most awful code. To you, true saviors, kings of men,
 * I say this: never gonna give you up, never gonna let you down,
 * never gonna run around and desert you. Never gonna make you cry,
 * never gonna say goodbye. Never gonna tell a lie and hurt you.
 * 致终于来到这里的勇敢的人：
 * 你是被上帝选中的人，是英勇的、不敌辛苦的、不眠不休的来修改我们这最棘手的代码的编程骑士。
 * 你，我们的救世主，人中之龙，我要对你说：永远不要放弃，永远不要对自己失望，永远不要逃走，
 * 辜负了自己，永远不要哭啼，永远不要说再见，永远不要说谎来伤害自己。
 *
 * @author: Conan
 * @DateTime: 2021/12/21 15:34
 */
@RestController
@Slf4j
@RequestMapping("payment")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;


    @GetMapping("detail/{id}")
    public JsonResult Detail(@PathVariable("id") Long id) {
        return JsonResult.success(paymentService.getById(id));
    }

    @PostMapping("/save")
    public JsonResult save(@RequestBody Payment payment) {
        if (paymentService.save(payment)) {
            return JsonResult.success();
        } else {
            return JsonResult.failMessage("插入失败");
        }
    }
}
