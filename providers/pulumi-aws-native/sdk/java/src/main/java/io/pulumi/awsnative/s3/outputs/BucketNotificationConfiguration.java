// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.outputs;

import io.pulumi.awsnative.s3.outputs.BucketEventBridgeConfiguration;
import io.pulumi.awsnative.s3.outputs.BucketLambdaConfiguration;
import io.pulumi.awsnative.s3.outputs.BucketQueueConfiguration;
import io.pulumi.awsnative.s3.outputs.BucketTopicConfiguration;
import io.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BucketNotificationConfiguration {
    private final @Nullable BucketEventBridgeConfiguration eventBridgeConfiguration;
    private final @Nullable List<BucketLambdaConfiguration> lambdaConfigurations;
    private final @Nullable List<BucketQueueConfiguration> queueConfigurations;
    private final @Nullable List<BucketTopicConfiguration> topicConfigurations;

    @CustomType.Constructor
    private BucketNotificationConfiguration(
        @CustomType.Parameter("eventBridgeConfiguration") @Nullable BucketEventBridgeConfiguration eventBridgeConfiguration,
        @CustomType.Parameter("lambdaConfigurations") @Nullable List<BucketLambdaConfiguration> lambdaConfigurations,
        @CustomType.Parameter("queueConfigurations") @Nullable List<BucketQueueConfiguration> queueConfigurations,
        @CustomType.Parameter("topicConfigurations") @Nullable List<BucketTopicConfiguration> topicConfigurations) {
        this.eventBridgeConfiguration = eventBridgeConfiguration;
        this.lambdaConfigurations = lambdaConfigurations;
        this.queueConfigurations = queueConfigurations;
        this.topicConfigurations = topicConfigurations;
    }

    public Optional<BucketEventBridgeConfiguration> eventBridgeConfiguration() {
        return Optional.ofNullable(this.eventBridgeConfiguration);
    }
    public List<BucketLambdaConfiguration> lambdaConfigurations() {
        return this.lambdaConfigurations == null ? List.of() : this.lambdaConfigurations;
    }
    public List<BucketQueueConfiguration> queueConfigurations() {
        return this.queueConfigurations == null ? List.of() : this.queueConfigurations;
    }
    public List<BucketTopicConfiguration> topicConfigurations() {
        return this.topicConfigurations == null ? List.of() : this.topicConfigurations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketNotificationConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable BucketEventBridgeConfiguration eventBridgeConfiguration;
        private @Nullable List<BucketLambdaConfiguration> lambdaConfigurations;
        private @Nullable List<BucketQueueConfiguration> queueConfigurations;
        private @Nullable List<BucketTopicConfiguration> topicConfigurations;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketNotificationConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eventBridgeConfiguration = defaults.eventBridgeConfiguration;
    	      this.lambdaConfigurations = defaults.lambdaConfigurations;
    	      this.queueConfigurations = defaults.queueConfigurations;
    	      this.topicConfigurations = defaults.topicConfigurations;
        }

        public Builder eventBridgeConfiguration(@Nullable BucketEventBridgeConfiguration eventBridgeConfiguration) {
            this.eventBridgeConfiguration = eventBridgeConfiguration;
            return this;
        }
        public Builder lambdaConfigurations(@Nullable List<BucketLambdaConfiguration> lambdaConfigurations) {
            this.lambdaConfigurations = lambdaConfigurations;
            return this;
        }
        public Builder lambdaConfigurations(BucketLambdaConfiguration... lambdaConfigurations) {
            return lambdaConfigurations(List.of(lambdaConfigurations));
        }
        public Builder queueConfigurations(@Nullable List<BucketQueueConfiguration> queueConfigurations) {
            this.queueConfigurations = queueConfigurations;
            return this;
        }
        public Builder queueConfigurations(BucketQueueConfiguration... queueConfigurations) {
            return queueConfigurations(List.of(queueConfigurations));
        }
        public Builder topicConfigurations(@Nullable List<BucketTopicConfiguration> topicConfigurations) {
            this.topicConfigurations = topicConfigurations;
            return this;
        }
        public Builder topicConfigurations(BucketTopicConfiguration... topicConfigurations) {
            return topicConfigurations(List.of(topicConfigurations));
        }        public BucketNotificationConfiguration build() {
            return new BucketNotificationConfiguration(eventBridgeConfiguration, lambdaConfigurations, queueConfigurations, topicConfigurations);
        }
    }
}
