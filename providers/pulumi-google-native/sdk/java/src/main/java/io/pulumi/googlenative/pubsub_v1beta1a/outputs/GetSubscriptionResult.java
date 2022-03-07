// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.pubsub_v1beta1a.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.pubsub_v1beta1a.outputs.PushConfigResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetSubscriptionResult {
    /**
     * For either push or pull delivery, the value is the maximum time after a subscriber receives a message before the subscriber should acknowledge or Nack the message. If the Ack deadline for a message passes without an Ack or a Nack, the Pub/Sub system will eventually redeliver the message. If a subscriber acknowledges after the deadline, the Pub/Sub system may accept the Ack, but it is possible that the message has been already delivered again. Multiple Acks to the message are allowed and will succeed. For push delivery, this value is used to set the request timeout for the call to the push endpoint. For pull delivery, this value is used as the initial value for the Ack deadline. It may be overridden for each message using its corresponding ack_id with ModifyAckDeadline. While a message is outstanding (i.e. it has been delivered to a pull subscriber and the subscriber has not yet Acked or Nacked), the Pub/Sub system will not deliver that message to another pull subscriber (on a best-effort basis).
     * 
     */
    private final Integer ackDeadlineSeconds;
    /**
     * Name of the subscription.
     * 
     */
    private final String name;
    /**
     * If push delivery is used with this subscription, this field is used to configure it.
     * 
     */
    private final PushConfigResponse pushConfig;
    /**
     * The name of the topic from which this subscription is receiving messages.
     * 
     */
    private final String topic;

    @OutputCustomType.Constructor({"ackDeadlineSeconds","name","pushConfig","topic"})
    private GetSubscriptionResult(
        Integer ackDeadlineSeconds,
        String name,
        PushConfigResponse pushConfig,
        String topic) {
        this.ackDeadlineSeconds = Objects.requireNonNull(ackDeadlineSeconds);
        this.name = Objects.requireNonNull(name);
        this.pushConfig = Objects.requireNonNull(pushConfig);
        this.topic = Objects.requireNonNull(topic);
    }

    /**
     * For either push or pull delivery, the value is the maximum time after a subscriber receives a message before the subscriber should acknowledge or Nack the message. If the Ack deadline for a message passes without an Ack or a Nack, the Pub/Sub system will eventually redeliver the message. If a subscriber acknowledges after the deadline, the Pub/Sub system may accept the Ack, but it is possible that the message has been already delivered again. Multiple Acks to the message are allowed and will succeed. For push delivery, this value is used to set the request timeout for the call to the push endpoint. For pull delivery, this value is used as the initial value for the Ack deadline. It may be overridden for each message using its corresponding ack_id with ModifyAckDeadline. While a message is outstanding (i.e. it has been delivered to a pull subscriber and the subscriber has not yet Acked or Nacked), the Pub/Sub system will not deliver that message to another pull subscriber (on a best-effort basis).
     * 
    */
    public Integer getAckDeadlineSeconds() {
        return this.ackDeadlineSeconds;
    }
    /**
     * Name of the subscription.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * If push delivery is used with this subscription, this field is used to configure it.
     * 
    */
    public PushConfigResponse getPushConfig() {
        return this.pushConfig;
    }
    /**
     * The name of the topic from which this subscription is receiving messages.
     * 
    */
    public String getTopic() {
        return this.topic;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSubscriptionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer ackDeadlineSeconds;
        private String name;
        private PushConfigResponse pushConfig;
        private String topic;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSubscriptionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ackDeadlineSeconds = defaults.ackDeadlineSeconds;
    	      this.name = defaults.name;
    	      this.pushConfig = defaults.pushConfig;
    	      this.topic = defaults.topic;
        }

        public Builder setAckDeadlineSeconds(Integer ackDeadlineSeconds) {
            this.ackDeadlineSeconds = Objects.requireNonNull(ackDeadlineSeconds);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPushConfig(PushConfigResponse pushConfig) {
            this.pushConfig = Objects.requireNonNull(pushConfig);
            return this;
        }

        public Builder setTopic(String topic) {
            this.topic = Objects.requireNonNull(topic);
            return this;
        }
        public GetSubscriptionResult build() {
            return new GetSubscriptionResult(ackDeadlineSeconds, name, pushConfig, topic);
        }
    }
}