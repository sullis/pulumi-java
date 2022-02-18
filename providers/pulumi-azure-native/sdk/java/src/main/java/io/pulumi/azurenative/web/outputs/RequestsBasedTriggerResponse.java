// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RequestsBasedTriggerResponse {
    /**
     * Request Count.
     * 
     */
    private final @Nullable Integer count;
    /**
     * Time interval.
     * 
     */
    private final @Nullable String timeInterval;

    @OutputCustomType.Constructor({"count","timeInterval"})
    private RequestsBasedTriggerResponse(
        @Nullable Integer count,
        @Nullable String timeInterval) {
        this.count = count;
        this.timeInterval = timeInterval;
    }

    /**
     * Request Count.
     * 
     */
    public Optional<Integer> getCount() {
        return Optional.ofNullable(this.count);
    }
    /**
     * Time interval.
     * 
     */
    public Optional<String> getTimeInterval() {
        return Optional.ofNullable(this.timeInterval);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RequestsBasedTriggerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer count;
        private @Nullable String timeInterval;

        public Builder() {
    	      // Empty
        }

        public Builder(RequestsBasedTriggerResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.timeInterval = defaults.timeInterval;
        }

        public Builder setCount(@Nullable Integer count) {
            this.count = count;
            return this;
        }

        public Builder setTimeInterval(@Nullable String timeInterval) {
            this.timeInterval = timeInterval;
            return this;
        }

        public RequestsBasedTriggerResponse build() {
            return new RequestsBasedTriggerResponse(count, timeInterval);
        }
    }
}
