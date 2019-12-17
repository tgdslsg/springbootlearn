//package com.lsg.rabbitmq.mq;
//
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.amqp.core.Message;
//import org.springframework.amqp.rabbit.annotation.RabbitListener;
//import org.springframework.stereotype.Component;
//
//import java.io.IOException;
//import java.nio.channels.Channel;
//
//
//
///**
// * @Author: lsg
// * @Date: 2019/8/28 14:34
// * @Description: 消息监听器
// */
//
//@Slf4j
//@Component
//public class Receiver {
//
//
//    /**
//     * @param message
//     * @param channel
//     *  direct
//     */
//    @RabbitListener(queues = {"DIRECT_QUEUE"})
//    public void message(Message message, Channel channel) throws IOException{
//        channel.basicAck(message.getMessageProperties().getDeliveryTag(),true);
//        log.info("DIRECT"+new String(message.getBody()));
//    }
//    /**
//     * FANOUT广播队列监听一.
//     * @param message the message
//     * @param channel the channel
//     * @throws IOException the io exception  这里异常需要处理
//     */
//    @RabbitListener(queues = {"FANOUT_QUEUE_A"})
//    public void on(Message message, Channel channel) throws IOException {
//        channel.basicAck(message.getMessageProperties().getDeliveryTag(), true);
//        log.debug("FANOUT_QUEUE_A " + new String(message.getBody()));
//    }
//    /**
//     * FANOUT广播队列监听二.
//     * @param message the message
//     * @param channel the channel
//     * @throws IOException the io exception   这里异常需要处理
//     */
//    @RabbitListener(queues = {"FANOUT_QUEUE_B"})
//    public void t(Message message, Channel channel) throws IOException {
//        channel.basicAck(message.getMessageProperties().getDeliveryTag(), true);
//        log.debug("FANOUT_QUEUE_B " + new String(message.getBody()));
//    }
//
//
//}
