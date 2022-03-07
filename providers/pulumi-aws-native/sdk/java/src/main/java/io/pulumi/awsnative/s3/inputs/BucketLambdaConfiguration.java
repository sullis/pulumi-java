// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.inputs;

import io.pulumi.awsnative.s3.inputs.BucketNotificationFilter;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes the AWS Lambda functions to invoke and the events for which to invoke them.
 * 
 */
public final class BucketLambdaConfiguration extends io.pulumi.resources.InvokeArgs {

    public static final BucketLambdaConfiguration Empty = new BucketLambdaConfiguration();

    /**
     * The Amazon S3 bucket event for which to invoke the AWS Lambda function.
     * 
     */
    @InputImport(name="event", required=true)
      private final String event;

    public String getEvent() {
        return this.event;
    }

    /**
     * The filtering rules that determine which objects invoke the AWS Lambda function.
     * 
     */
    @InputImport(name="filter")
      private final @Nullable BucketNotificationFilter filter;

    public Optional<BucketNotificationFilter> getFilter() {
        return this.filter == null ? Optional.empty() : Optional.ofNullable(this.filter);
    }

    /**
     * The Amazon Resource Name (ARN) of the AWS Lambda function that Amazon S3 invokes when the specified event type occurs.
     * 
     */
    @InputImport(name="function", required=true)
      private final String function;

    public String getFunction() {
        return this.function;
    }

    public BucketLambdaConfiguration(
        String event,
        @Nullable BucketNotificationFilter filter,
        String function) {
        this.event = Objects.requireNonNull(event, "expected parameter 'event' to be non-null");
        this.filter = filter;
        this.function = Objects.requireNonNull(function, "expected parameter 'function' to be non-null");
    }

    private BucketLambdaConfiguration() {
        this.event = null;
        this.filter = null;
        this.function = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketLambdaConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String event;
        private @Nullable BucketNotificationFilter filter;
        private String function;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketLambdaConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.event = defaults.event;
    	      this.filter = defaults.filter;
    	      this.function = defaults.function;
        }

        public Builder setEvent(String event) {
            this.event = Objects.requireNonNull(event);
            return this;
        }

        public Builder setFilter(@Nullable BucketNotificationFilter filter) {
            this.filter = filter;
            return this;
        }

        public Builder setFunction(String function) {
            this.function = Objects.requireNonNull(function);
            return this;
        }
        public BucketLambdaConfiguration build() {
            return new BucketLambdaConfiguration(event, filter, function);
        }
    }
}