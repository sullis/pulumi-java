// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.pubsub.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SubscriptionRetryPolicy {
    /**
     * The maximum delay between consecutive deliveries of a given message. Value should be between 0 and 600 seconds. Defaults to 600 seconds.
     * A duration in seconds with up to nine fractional digits, terminated by 's'. Example: "3.5s".
     * 
     */
    private final @Nullable String maximumBackoff;
    /**
     * The minimum delay between consecutive deliveries of a given message. Value should be between 0 and 600 seconds. Defaults to 10 seconds.
     * A duration in seconds with up to nine fractional digits, terminated by 's'. Example: "3.5s".
     * 
     */
    private final @Nullable String minimumBackoff;

    @OutputCustomType.Constructor({"maximumBackoff","minimumBackoff"})
    private SubscriptionRetryPolicy(
        @Nullable String maximumBackoff,
        @Nullable String minimumBackoff) {
        this.maximumBackoff = maximumBackoff;
        this.minimumBackoff = minimumBackoff;
    }

    /**
     * The maximum delay between consecutive deliveries of a given message. Value should be between 0 and 600 seconds. Defaults to 600 seconds.
     * A duration in seconds with up to nine fractional digits, terminated by 's'. Example: "3.5s".
     * 
     */
    public Optional<String> getMaximumBackoff() {
        return Optional.ofNullable(this.maximumBackoff);
    }
    /**
     * The minimum delay between consecutive deliveries of a given message. Value should be between 0 and 600 seconds. Defaults to 10 seconds.
     * A duration in seconds with up to nine fractional digits, terminated by 's'. Example: "3.5s".
     * 
     */
    public Optional<String> getMinimumBackoff() {
        return Optional.ofNullable(this.minimumBackoff);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubscriptionRetryPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String maximumBackoff;
        private @Nullable String minimumBackoff;

        public Builder() {
    	      // Empty
        }

        public Builder(SubscriptionRetryPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maximumBackoff = defaults.maximumBackoff;
    	      this.minimumBackoff = defaults.minimumBackoff;
        }

        public Builder setMaximumBackoff(@Nullable String maximumBackoff) {
            this.maximumBackoff = maximumBackoff;
            return this;
        }

        public Builder setMinimumBackoff(@Nullable String minimumBackoff) {
            this.minimumBackoff = minimumBackoff;
            return this;
        }

        public SubscriptionRetryPolicy build() {
            return new SubscriptionRetryPolicy(maximumBackoff, minimumBackoff);
        }
    }
}
