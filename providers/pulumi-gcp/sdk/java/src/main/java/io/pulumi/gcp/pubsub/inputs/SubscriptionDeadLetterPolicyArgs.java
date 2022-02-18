// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.pubsub.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SubscriptionDeadLetterPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final SubscriptionDeadLetterPolicyArgs Empty = new SubscriptionDeadLetterPolicyArgs();

    /**
     * The name of the topic to which dead letter messages should be published.
     * Format is `projects/{project}/topics/{topic}`.
     * The Cloud Pub/Sub service account associated with the enclosing subscription's
     * parent project (i.e.,
     * service-{project_number}@gcp-sa-pubsub.iam.gserviceaccount.com) must have
     * permission to Publish() to this topic.
     * The operation will fail if the topic does not exist.
     * Users should ensure that there is a subscription attached to this topic
     * since messages published to a topic with no subscriptions are lost.
     * 
     */
    @InputImport(name="deadLetterTopic")
    private final @Nullable Input<String> deadLetterTopic;

    public Input<String> getDeadLetterTopic() {
        return this.deadLetterTopic == null ? Input.empty() : this.deadLetterTopic;
    }

    /**
     * The maximum number of delivery attempts for any message. The value must be
     * between 5 and 100.
     * The number of delivery attempts is defined as 1 + (the sum of number of
     * NACKs and number of times the acknowledgement deadline has been exceeded for the message).
     * A NACK is any call to ModifyAckDeadline with a 0 deadline. Note that
     * client libraries may automatically extend ack_deadlines.
     * This field will be honored on a best effort basis.
     * If this parameter is 0, a default value of 5 is used.
     * 
     */
    @InputImport(name="maxDeliveryAttempts")
    private final @Nullable Input<Integer> maxDeliveryAttempts;

    public Input<Integer> getMaxDeliveryAttempts() {
        return this.maxDeliveryAttempts == null ? Input.empty() : this.maxDeliveryAttempts;
    }

    public SubscriptionDeadLetterPolicyArgs(
        @Nullable Input<String> deadLetterTopic,
        @Nullable Input<Integer> maxDeliveryAttempts) {
        this.deadLetterTopic = deadLetterTopic;
        this.maxDeliveryAttempts = maxDeliveryAttempts;
    }

    private SubscriptionDeadLetterPolicyArgs() {
        this.deadLetterTopic = Input.empty();
        this.maxDeliveryAttempts = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubscriptionDeadLetterPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> deadLetterTopic;
        private @Nullable Input<Integer> maxDeliveryAttempts;

        public Builder() {
    	      // Empty
        }

        public Builder(SubscriptionDeadLetterPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deadLetterTopic = defaults.deadLetterTopic;
    	      this.maxDeliveryAttempts = defaults.maxDeliveryAttempts;
        }

        public Builder setDeadLetterTopic(@Nullable Input<String> deadLetterTopic) {
            this.deadLetterTopic = deadLetterTopic;
            return this;
        }

        public Builder setDeadLetterTopic(@Nullable String deadLetterTopic) {
            this.deadLetterTopic = Input.ofNullable(deadLetterTopic);
            return this;
        }

        public Builder setMaxDeliveryAttempts(@Nullable Input<Integer> maxDeliveryAttempts) {
            this.maxDeliveryAttempts = maxDeliveryAttempts;
            return this;
        }

        public Builder setMaxDeliveryAttempts(@Nullable Integer maxDeliveryAttempts) {
            this.maxDeliveryAttempts = Input.ofNullable(maxDeliveryAttempts);
            return this;
        }

        public SubscriptionDeadLetterPolicyArgs build() {
            return new SubscriptionDeadLetterPolicyArgs(deadLetterTopic, maxDeliveryAttempts);
        }
    }
}
