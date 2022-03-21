// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BucketNotificationLambdaFunctionArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketNotificationLambdaFunctionArgs Empty = new BucketNotificationLambdaFunctionArgs();

    /**
     * [Event](http://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html#notification-how-to-event-types-and-destinations) for which to send notifications.
     * 
     */
    @Import(name="events", required=true)
      private final Output<List<String>> events;

    public Output<List<String>> getEvents() {
        return this.events;
    }

    /**
     * Object key name prefix.
     * 
     */
    @Import(name="filterPrefix")
      private final @Nullable Output<String> filterPrefix;

    public Output<String> getFilterPrefix() {
        return this.filterPrefix == null ? Output.empty() : this.filterPrefix;
    }

    /**
     * Object key name suffix.
     * 
     */
    @Import(name="filterSuffix")
      private final @Nullable Output<String> filterSuffix;

    public Output<String> getFilterSuffix() {
        return this.filterSuffix == null ? Output.empty() : this.filterSuffix;
    }

    /**
     * Unique identifier for each of the notification configurations.
     * 
     */
    @Import(name="id")
      private final @Nullable Output<String> id;

    public Output<String> getId() {
        return this.id == null ? Output.empty() : this.id;
    }

    /**
     * Lambda function ARN.
     * 
     */
    @Import(name="lambdaFunctionArn")
      private final @Nullable Output<String> lambdaFunctionArn;

    public Output<String> getLambdaFunctionArn() {
        return this.lambdaFunctionArn == null ? Output.empty() : this.lambdaFunctionArn;
    }

    public BucketNotificationLambdaFunctionArgs(
        Output<List<String>> events,
        @Nullable Output<String> filterPrefix,
        @Nullable Output<String> filterSuffix,
        @Nullable Output<String> id,
        @Nullable Output<String> lambdaFunctionArn) {
        this.events = Objects.requireNonNull(events, "expected parameter 'events' to be non-null");
        this.filterPrefix = filterPrefix;
        this.filterSuffix = filterSuffix;
        this.id = id;
        this.lambdaFunctionArn = lambdaFunctionArn;
    }

    private BucketNotificationLambdaFunctionArgs() {
        this.events = Output.empty();
        this.filterPrefix = Output.empty();
        this.filterSuffix = Output.empty();
        this.id = Output.empty();
        this.lambdaFunctionArn = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketNotificationLambdaFunctionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<String>> events;
        private @Nullable Output<String> filterPrefix;
        private @Nullable Output<String> filterSuffix;
        private @Nullable Output<String> id;
        private @Nullable Output<String> lambdaFunctionArn;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketNotificationLambdaFunctionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.events = defaults.events;
    	      this.filterPrefix = defaults.filterPrefix;
    	      this.filterSuffix = defaults.filterSuffix;
    	      this.id = defaults.id;
    	      this.lambdaFunctionArn = defaults.lambdaFunctionArn;
        }

        public Builder events(Output<List<String>> events) {
            this.events = Objects.requireNonNull(events);
            return this;
        }
        public Builder events(List<String> events) {
            this.events = Output.of(Objects.requireNonNull(events));
            return this;
        }
        public Builder events(String... events) {
            return events(List.of(events));
        }
        public Builder filterPrefix(@Nullable Output<String> filterPrefix) {
            this.filterPrefix = filterPrefix;
            return this;
        }
        public Builder filterPrefix(@Nullable String filterPrefix) {
            this.filterPrefix = Output.ofNullable(filterPrefix);
            return this;
        }
        public Builder filterSuffix(@Nullable Output<String> filterSuffix) {
            this.filterSuffix = filterSuffix;
            return this;
        }
        public Builder filterSuffix(@Nullable String filterSuffix) {
            this.filterSuffix = Output.ofNullable(filterSuffix);
            return this;
        }
        public Builder id(@Nullable Output<String> id) {
            this.id = id;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = Output.ofNullable(id);
            return this;
        }
        public Builder lambdaFunctionArn(@Nullable Output<String> lambdaFunctionArn) {
            this.lambdaFunctionArn = lambdaFunctionArn;
            return this;
        }
        public Builder lambdaFunctionArn(@Nullable String lambdaFunctionArn) {
            this.lambdaFunctionArn = Output.ofNullable(lambdaFunctionArn);
            return this;
        }        public BucketNotificationLambdaFunctionArgs build() {
            return new BucketNotificationLambdaFunctionArgs(events, filterPrefix, filterSuffix, id, lambdaFunctionArn);
        }
    }
}
