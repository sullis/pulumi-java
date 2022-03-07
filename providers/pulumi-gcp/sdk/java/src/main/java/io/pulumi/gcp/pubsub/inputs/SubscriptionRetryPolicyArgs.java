// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.pubsub.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SubscriptionRetryPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final SubscriptionRetryPolicyArgs Empty = new SubscriptionRetryPolicyArgs();

    /**
     * The maximum delay between consecutive deliveries of a given message. Value should be between 0 and 600 seconds. Defaults to 600 seconds.
     * A duration in seconds with up to nine fractional digits, terminated by 's'. Example: "3.5s".
     * 
     */
    @InputImport(name="maximumBackoff")
      private final @Nullable Input<String> maximumBackoff;

    public Input<String> getMaximumBackoff() {
        return this.maximumBackoff == null ? Input.empty() : this.maximumBackoff;
    }

    /**
     * The minimum delay between consecutive deliveries of a given message. Value should be between 0 and 600 seconds. Defaults to 10 seconds.
     * A duration in seconds with up to nine fractional digits, terminated by 's'. Example: "3.5s".
     * 
     */
    @InputImport(name="minimumBackoff")
      private final @Nullable Input<String> minimumBackoff;

    public Input<String> getMinimumBackoff() {
        return this.minimumBackoff == null ? Input.empty() : this.minimumBackoff;
    }

    public SubscriptionRetryPolicyArgs(
        @Nullable Input<String> maximumBackoff,
        @Nullable Input<String> minimumBackoff) {
        this.maximumBackoff = maximumBackoff;
        this.minimumBackoff = minimumBackoff;
    }

    private SubscriptionRetryPolicyArgs() {
        this.maximumBackoff = Input.empty();
        this.minimumBackoff = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubscriptionRetryPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> maximumBackoff;
        private @Nullable Input<String> minimumBackoff;

        public Builder() {
    	      // Empty
        }

        public Builder(SubscriptionRetryPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maximumBackoff = defaults.maximumBackoff;
    	      this.minimumBackoff = defaults.minimumBackoff;
        }

        public Builder setMaximumBackoff(@Nullable Input<String> maximumBackoff) {
            this.maximumBackoff = maximumBackoff;
            return this;
        }

        public Builder setMaximumBackoff(@Nullable String maximumBackoff) {
            this.maximumBackoff = Input.ofNullable(maximumBackoff);
            return this;
        }

        public Builder setMinimumBackoff(@Nullable Input<String> minimumBackoff) {
            this.minimumBackoff = minimumBackoff;
            return this;
        }

        public Builder setMinimumBackoff(@Nullable String minimumBackoff) {
            this.minimumBackoff = Input.ofNullable(minimumBackoff);
            return this;
        }
        public SubscriptionRetryPolicyArgs build() {
            return new SubscriptionRetryPolicyArgs(maximumBackoff, minimumBackoff);
        }
    }
}