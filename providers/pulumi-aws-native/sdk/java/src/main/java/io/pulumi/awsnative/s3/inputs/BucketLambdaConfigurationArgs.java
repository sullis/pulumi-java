// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.inputs;

import io.pulumi.awsnative.s3.inputs.BucketNotificationFilterArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes the AWS Lambda functions to invoke and the events for which to invoke them.
 * 
 */
public final class BucketLambdaConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketLambdaConfigurationArgs Empty = new BucketLambdaConfigurationArgs();

    /**
     * The Amazon S3 bucket event for which to invoke the AWS Lambda function.
     * 
     */
    @Import(name="event", required=true)
      private final Output<String> event;

    public Output<String> event() {
        return this.event;
    }

    /**
     * The filtering rules that determine which objects invoke the AWS Lambda function.
     * 
     */
    @Import(name="filter")
      private final @Nullable Output<BucketNotificationFilterArgs> filter;

    public Output<BucketNotificationFilterArgs> filter() {
        return this.filter == null ? Codegen.empty() : this.filter;
    }

    /**
     * The Amazon Resource Name (ARN) of the AWS Lambda function that Amazon S3 invokes when the specified event type occurs.
     * 
     */
    @Import(name="function", required=true)
      private final Output<String> function;

    public Output<String> function() {
        return this.function;
    }

    public BucketLambdaConfigurationArgs(
        Output<String> event,
        @Nullable Output<BucketNotificationFilterArgs> filter,
        Output<String> function) {
        this.event = Objects.requireNonNull(event, "expected parameter 'event' to be non-null");
        this.filter = filter;
        this.function = Objects.requireNonNull(function, "expected parameter 'function' to be non-null");
    }

    private BucketLambdaConfigurationArgs() {
        this.event = Codegen.empty();
        this.filter = Codegen.empty();
        this.function = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketLambdaConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> event;
        private @Nullable Output<BucketNotificationFilterArgs> filter;
        private Output<String> function;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketLambdaConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.event = defaults.event;
    	      this.filter = defaults.filter;
    	      this.function = defaults.function;
        }

        public Builder event(Output<String> event) {
            this.event = Objects.requireNonNull(event);
            return this;
        }
        public Builder event(String event) {
            this.event = Output.of(Objects.requireNonNull(event));
            return this;
        }
        public Builder filter(@Nullable Output<BucketNotificationFilterArgs> filter) {
            this.filter = filter;
            return this;
        }
        public Builder filter(@Nullable BucketNotificationFilterArgs filter) {
            this.filter = Codegen.ofNullable(filter);
            return this;
        }
        public Builder function(Output<String> function) {
            this.function = Objects.requireNonNull(function);
            return this;
        }
        public Builder function(String function) {
            this.function = Output.of(Objects.requireNonNull(function));
            return this;
        }        public BucketLambdaConfigurationArgs build() {
            return new BucketLambdaConfigurationArgs(event, filter, function);
        }
    }
}
