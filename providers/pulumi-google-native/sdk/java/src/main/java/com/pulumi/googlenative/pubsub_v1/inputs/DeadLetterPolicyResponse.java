// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.pubsub_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * Dead lettering is done on a best effort basis. The same message might be dead lettered multiple times. If validation on any of the fields fails at subscription creation/updation, the create/update subscription request will fail.
 * 
 */
public final class DeadLetterPolicyResponse extends com.pulumi.resources.InvokeArgs {

    public static final DeadLetterPolicyResponse Empty = new DeadLetterPolicyResponse();

    /**
     * The name of the topic to which dead letter messages should be published. Format is `projects/{project}/topics/{topic}`.The Cloud Pub/Sub service account associated with the enclosing subscription&#39;s parent project (i.e., service-{project_number}@gcp-sa-pubsub.iam.gserviceaccount.com) must have permission to Publish() to this topic. The operation will fail if the topic does not exist. Users should ensure that there is a subscription attached to this topic since messages published to a topic with no subscriptions are lost.
     * 
     */
    @Import(name="deadLetterTopic", required=true)
    private String deadLetterTopic;

    /**
     * @return The name of the topic to which dead letter messages should be published. Format is `projects/{project}/topics/{topic}`.The Cloud Pub/Sub service account associated with the enclosing subscription&#39;s parent project (i.e., service-{project_number}@gcp-sa-pubsub.iam.gserviceaccount.com) must have permission to Publish() to this topic. The operation will fail if the topic does not exist. Users should ensure that there is a subscription attached to this topic since messages published to a topic with no subscriptions are lost.
     * 
     */
    public String deadLetterTopic() {
        return this.deadLetterTopic;
    }

    /**
     * The maximum number of delivery attempts for any message. The value must be between 5 and 100. The number of delivery attempts is defined as 1 + (the sum of number of NACKs and number of times the acknowledgement deadline has been exceeded for the message). A NACK is any call to ModifyAckDeadline with a 0 deadline. Note that client libraries may automatically extend ack_deadlines. This field will be honored on a best effort basis. If this parameter is 0, a default value of 5 is used.
     * 
     */
    @Import(name="maxDeliveryAttempts", required=true)
    private Integer maxDeliveryAttempts;

    /**
     * @return The maximum number of delivery attempts for any message. The value must be between 5 and 100. The number of delivery attempts is defined as 1 + (the sum of number of NACKs and number of times the acknowledgement deadline has been exceeded for the message). A NACK is any call to ModifyAckDeadline with a 0 deadline. Note that client libraries may automatically extend ack_deadlines. This field will be honored on a best effort basis. If this parameter is 0, a default value of 5 is used.
     * 
     */
    public Integer maxDeliveryAttempts() {
        return this.maxDeliveryAttempts;
    }

    private DeadLetterPolicyResponse() {}

    private DeadLetterPolicyResponse(DeadLetterPolicyResponse $) {
        this.deadLetterTopic = $.deadLetterTopic;
        this.maxDeliveryAttempts = $.maxDeliveryAttempts;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeadLetterPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeadLetterPolicyResponse $;

        public Builder() {
            $ = new DeadLetterPolicyResponse();
        }

        public Builder(DeadLetterPolicyResponse defaults) {
            $ = new DeadLetterPolicyResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param deadLetterTopic The name of the topic to which dead letter messages should be published. Format is `projects/{project}/topics/{topic}`.The Cloud Pub/Sub service account associated with the enclosing subscription&#39;s parent project (i.e., service-{project_number}@gcp-sa-pubsub.iam.gserviceaccount.com) must have permission to Publish() to this topic. The operation will fail if the topic does not exist. Users should ensure that there is a subscription attached to this topic since messages published to a topic with no subscriptions are lost.
         * 
         * @return builder
         * 
         */
        public Builder deadLetterTopic(String deadLetterTopic) {
            $.deadLetterTopic = deadLetterTopic;
            return this;
        }

        /**
         * @param maxDeliveryAttempts The maximum number of delivery attempts for any message. The value must be between 5 and 100. The number of delivery attempts is defined as 1 + (the sum of number of NACKs and number of times the acknowledgement deadline has been exceeded for the message). A NACK is any call to ModifyAckDeadline with a 0 deadline. Note that client libraries may automatically extend ack_deadlines. This field will be honored on a best effort basis. If this parameter is 0, a default value of 5 is used.
         * 
         * @return builder
         * 
         */
        public Builder maxDeliveryAttempts(Integer maxDeliveryAttempts) {
            $.maxDeliveryAttempts = maxDeliveryAttempts;
            return this;
        }

        public DeadLetterPolicyResponse build() {
            $.deadLetterTopic = Objects.requireNonNull($.deadLetterTopic, "expected parameter 'deadLetterTopic' to be non-null");
            $.maxDeliveryAttempts = Objects.requireNonNull($.maxDeliveryAttempts, "expected parameter 'maxDeliveryAttempts' to be non-null");
            return $;
        }
    }

}
