package me.jcala.eureka.event.producer.domain;

import io.choerodon.event.producer.execute.BasePayload;

/**
 * @author flyleft
 * @date 2018/4/9
 */
public class RepertoryPayload extends BasePayload {

    private String type;

    private int reduceNum;

    private long orderId;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getReduceNum() {
        return reduceNum;
    }

    public void setReduceNum(int reduceNum) {
        this.reduceNum = reduceNum;
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public RepertoryPayload() {
    }

    public RepertoryPayload(String type, int reduceNum) {
        this.type = type;
        this.reduceNum = reduceNum;
    }
}