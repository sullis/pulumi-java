// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.pubsub_v1beta2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.pubsub_v1beta2.outputs.PushConfigResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetSubscriptionResult {
    /**
     * This value is the maximum time after a subscriber receives a message before the subscriber should acknowledge the message. After message delivery but before the ack deadline expires and before the message is acknowledged, it is an outstanding message and will not be delivered again during that time (on a best-effort basis). For pull subscriptions, this value is used as the initial value for the ack deadline. To override this value for a given message, call `ModifyAckDeadline` with the corresponding `ack_id` if using pull. The maximum custom deadline you can specify is 600 seconds (10 minutes). For push delivery, this value is also used to set the request timeout for the call to the push endpoint. If the subscriber never acknowledges the message, the Pub/Sub system will eventually redeliver the message. If this parameter is 0, a default value of 10 seconds is used.
     * 
     */
    private final Integer ackDeadlineSeconds;
    /**
     * The name of the subscription. It must have the format `"projects/{project}/subscriptions/{subscription}"`. `{subscription}` must start with a letter, and contain only letters (`[A-Za-z]`), numbers (`[0-9]`), dashes (`-`), underscores (`_`), periods (`.`), tildes (`~`), plus (`+`) or percent signs (`%`). It must be between 3 and 255 characters in length, and it must not start with `"goog"`.
     * 
     */
    private final String name;
    /**
     * If push delivery is used with this subscription, this field is used to configure it. An empty `pushConfig` signifies that the subscriber will pull and ack messages using API methods.
     * 
     */
    private final PushConfigResponse pushConfig;
    /**
     * The name of the topic from which this subscription is receiving messages. The value of this field will be `_deleted-topic_` if the topic has been deleted.
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
     * This value is the maximum time after a subscriber receives a message before the subscriber should acknowledge the message. After message delivery but before the ack deadline expires and before the message is acknowledged, it is an outstanding message and will not be delivered again during that time (on a best-effort basis). For pull subscriptions, this value is used as the initial value for the ack deadline. To override this value for a given message, call `ModifyAckDeadline` with the corresponding `ack_id` if using pull. The maximum custom deadline you can specify is 600 seconds (10 minutes). For push delivery, this value is also used to set the request timeout for the call to the push endpoint. If the subscriber never acknowledges the message, the Pub/Sub system will eventually redeliver the message. If this parameter is 0, a default value of 10 seconds is used.
     * 
    */
    public Integer getAckDeadlineSeconds() {
        return this.ackDeadlineSeconds;
    }
    /**
     * The name of the subscription. It must have the format `"projects/{project}/subscriptions/{subscription}"`. `{subscription}` must start with a letter, and contain only letters (`[A-Za-z]`), numbers (`[0-9]`), dashes (`-`), underscores (`_`), periods (`.`), tildes (`~`), plus (`+`) or percent signs (`%`). It must be between 3 and 255 characters in length, and it must not start with `"goog"`.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * If push delivery is used with this subscription, this field is used to configure it. An empty `pushConfig` signifies that the subscriber will pull and ack messages using API methods.
     * 
    */
    public PushConfigResponse getPushConfig() {
        return this.pushConfig;
    }
    /**
     * The name of the topic from which this subscription is receiving messages. The value of this field will be `_deleted-topic_` if the topic has been deleted.
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