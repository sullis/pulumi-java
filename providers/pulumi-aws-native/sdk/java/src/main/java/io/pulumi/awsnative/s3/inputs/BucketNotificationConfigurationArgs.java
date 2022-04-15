// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.inputs;

import io.pulumi.awsnative.s3.inputs.BucketEventBridgeConfigurationArgs;
import io.pulumi.awsnative.s3.inputs.BucketLambdaConfigurationArgs;
import io.pulumi.awsnative.s3.inputs.BucketQueueConfigurationArgs;
import io.pulumi.awsnative.s3.inputs.BucketTopicConfigurationArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes the notification configuration for an Amazon S3 bucket.
 * 
 */
public final class BucketNotificationConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketNotificationConfigurationArgs Empty = new BucketNotificationConfigurationArgs();

    @Import(name="eventBridgeConfiguration")
      private final @Nullable Output<BucketEventBridgeConfigurationArgs> eventBridgeConfiguration;

    public Output<BucketEventBridgeConfigurationArgs> eventBridgeConfiguration() {
        return this.eventBridgeConfiguration == null ? Codegen.empty() : this.eventBridgeConfiguration;
    }

    @Import(name="lambdaConfigurations")
      private final @Nullable Output<List<BucketLambdaConfigurationArgs>> lambdaConfigurations;

    public Output<List<BucketLambdaConfigurationArgs>> lambdaConfigurations() {
        return this.lambdaConfigurations == null ? Codegen.empty() : this.lambdaConfigurations;
    }

    @Import(name="queueConfigurations")
      private final @Nullable Output<List<BucketQueueConfigurationArgs>> queueConfigurations;

    public Output<List<BucketQueueConfigurationArgs>> queueConfigurations() {
        return this.queueConfigurations == null ? Codegen.empty() : this.queueConfigurations;
    }

    @Import(name="topicConfigurations")
      private final @Nullable Output<List<BucketTopicConfigurationArgs>> topicConfigurations;

    public Output<List<BucketTopicConfigurationArgs>> topicConfigurations() {
        return this.topicConfigurations == null ? Codegen.empty() : this.topicConfigurations;
    }

    public BucketNotificationConfigurationArgs(
        @Nullable Output<BucketEventBridgeConfigurationArgs> eventBridgeConfiguration,
        @Nullable Output<List<BucketLambdaConfigurationArgs>> lambdaConfigurations,
        @Nullable Output<List<BucketQueueConfigurationArgs>> queueConfigurations,
        @Nullable Output<List<BucketTopicConfigurationArgs>> topicConfigurations) {
        this.eventBridgeConfiguration = eventBridgeConfiguration;
        this.lambdaConfigurations = lambdaConfigurations;
        this.queueConfigurations = queueConfigurations;
        this.topicConfigurations = topicConfigurations;
    }

    private BucketNotificationConfigurationArgs() {
        this.eventBridgeConfiguration = Codegen.empty();
        this.lambdaConfigurations = Codegen.empty();
        this.queueConfigurations = Codegen.empty();
        this.topicConfigurations = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketNotificationConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<BucketEventBridgeConfigurationArgs> eventBridgeConfiguration;
        private @Nullable Output<List<BucketLambdaConfigurationArgs>> lambdaConfigurations;
        private @Nullable Output<List<BucketQueueConfigurationArgs>> queueConfigurations;
        private @Nullable Output<List<BucketTopicConfigurationArgs>> topicConfigurations;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketNotificationConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eventBridgeConfiguration = defaults.eventBridgeConfiguration;
    	      this.lambdaConfigurations = defaults.lambdaConfigurations;
    	      this.queueConfigurations = defaults.queueConfigurations;
    	      this.topicConfigurations = defaults.topicConfigurations;
        }

        public Builder eventBridgeConfiguration(@Nullable Output<BucketEventBridgeConfigurationArgs> eventBridgeConfiguration) {
            this.eventBridgeConfiguration = eventBridgeConfiguration;
            return this;
        }
        public Builder eventBridgeConfiguration(@Nullable BucketEventBridgeConfigurationArgs eventBridgeConfiguration) {
            this.eventBridgeConfiguration = Codegen.ofNullable(eventBridgeConfiguration);
            return this;
        }
        public Builder lambdaConfigurations(@Nullable Output<List<BucketLambdaConfigurationArgs>> lambdaConfigurations) {
            this.lambdaConfigurations = lambdaConfigurations;
            return this;
        }
        public Builder lambdaConfigurations(@Nullable List<BucketLambdaConfigurationArgs> lambdaConfigurations) {
            this.lambdaConfigurations = Codegen.ofNullable(lambdaConfigurations);
            return this;
        }
        public Builder lambdaConfigurations(BucketLambdaConfigurationArgs... lambdaConfigurations) {
            return lambdaConfigurations(List.of(lambdaConfigurations));
        }
        public Builder queueConfigurations(@Nullable Output<List<BucketQueueConfigurationArgs>> queueConfigurations) {
            this.queueConfigurations = queueConfigurations;
            return this;
        }
        public Builder queueConfigurations(@Nullable List<BucketQueueConfigurationArgs> queueConfigurations) {
            this.queueConfigurations = Codegen.ofNullable(queueConfigurations);
            return this;
        }
        public Builder queueConfigurations(BucketQueueConfigurationArgs... queueConfigurations) {
            return queueConfigurations(List.of(queueConfigurations));
        }
        public Builder topicConfigurations(@Nullable Output<List<BucketTopicConfigurationArgs>> topicConfigurations) {
            this.topicConfigurations = topicConfigurations;
            return this;
        }
        public Builder topicConfigurations(@Nullable List<BucketTopicConfigurationArgs> topicConfigurations) {
            this.topicConfigurations = Codegen.ofNullable(topicConfigurations);
            return this;
        }
        public Builder topicConfigurations(BucketTopicConfigurationArgs... topicConfigurations) {
            return topicConfigurations(List.of(topicConfigurations));
        }        public BucketNotificationConfigurationArgs build() {
            return new BucketNotificationConfigurationArgs(eventBridgeConfiguration, lambdaConfigurations, queueConfigurations, topicConfigurations);
        }
    }
}
