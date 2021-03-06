package cn.linter.oasys.chat;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 聊天服务启动类
 *
 * @author wangxiaoyang
 * @since 2020/11/17
 */
@SpringCloudApplication
@EnableFeignClients
public class ChatApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChatApplication.class, args);
    }

}
