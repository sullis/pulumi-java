// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.eventarc.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TriggerTransportPubsubArgs extends io.pulumi.resources.ResourceArgs {

    public static final TriggerTransportPubsubArgs Empty = new TriggerTransportPubsubArgs();

    /**
     * - 
     * Output only. The name of the Pub/Sub subscription created and managed by Eventarc system as a transport for the event delivery. Format: `projects/{PROJECT_ID}/subscriptions/{SUBSCRIPTION_NAME}`.
     * 
     */
    @InputImport(name="subscription")
      private final @Nullable Input<String> subscription;

    public Input<String> getSubscription() {
        return this.subscription == null ? Input.empty() : this.subscription;
    }

    /**
     * Optional. The name of the Pub/Sub topic created and managed by Eventarc system as a transport for the event delivery. Format: `projects/{PROJECT_ID}/topics/{TOPIC_NAME You may set an existing topic for triggers of the type google.cloud.pubsub.topic.v1.messagePublished` only. The topic you provide here will not be deleted by Eventarc at trigger deletion.
     * 
     */
    @InputImport(name="topic")
      private final @Nullable Input<String> topic;

    public Input<String> getTopic() {
        return this.topic == null ? Input.empty() : this.topic;
    }

    public TriggerTransportPubsubArgs(
        @Nullable Input<String> subscription,
        @Nullable Input<String> topic) {
        this.subscription = subscription;
        this.topic = topic;
    }

    private TriggerTransportPubsubArgs() {
        this.subscription = Input.empty();
        this.topic = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TriggerTransportPubsubArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> subscription;
        private @Nullable Input<String> topic;

        public Builder() {
    	      // Empty
        }

        public Builder(TriggerTransportPubsubArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.subscription = defaults.subscription;
    	      this.topic = defaults.topic;
        }

        public Builder setSubscription(@Nullable Input<String> subscription) {
            this.subscription = subscription;
            return this;
        }

        public Builder setSubscription(@Nullable String subscription) {
            this.subscription = Input.ofNullable(subscription);
            return this;
        }

        public Builder setTopic(@Nullable Input<String> topic) {
            this.topic = topic;
            return this;
        }

        public Builder setTopic(@Nullable String topic) {
            this.topic = Input.ofNullable(topic);
            return this;
        }
        public TriggerTransportPubsubArgs build() {
            return new TriggerTransportPubsubArgs(subscription, topic);
        }
    }
}