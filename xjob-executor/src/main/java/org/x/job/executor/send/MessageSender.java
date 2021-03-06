package org.x.job.executor.send;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.x.job.commons.transfer.Fenshou;
import org.x.job.executor.receive.MessageReceiver;

/**
 * 分配任务
 * @author Eightmonth
 */
public class MessageSender {

    private MessageReceiver messageReceiver;

    /**
     * 往哪台机器分配任务 （Master -> Slave）
     * @param addr Slave机器地址
     * @param fenshou 任务参数
     * @return 返回true或false，代表成功或失败
     * @throws Exception 发送失败时反馈的异常
     */
    public Boolean doSend(String addr, Fenshou fenshou) throws Exception {
        Boolean flag = false;
        try{
            //此处为伪码
            /* addr. */messageReceiver.doReceive(fenshou);
            flag = true;
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            return flag;
        }
    }
}
