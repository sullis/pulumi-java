// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.customerinsights.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConnectorMappingAvailabilityResponse {
    /**
     * @return The frequency to update.
     * 
     */
    private final @Nullable String frequency;
    /**
     * @return The interval of the given frequency to use.
     * 
     */
    private final Integer interval;

    @CustomType.Constructor
    private ConnectorMappingAvailabilityResponse(
        @CustomType.Parameter("frequency") @Nullable String frequency,
        @CustomType.Parameter("interval") Integer interval) {
        this.frequency = frequency;
        this.interval = interval;
    }

    /**
     * @return The frequency to update.
     * 
     */
    public Optional<String> frequency() {
        return Optional.ofNullable(this.frequency);
    }
    /**
     * @return The interval of the given frequency to use.
     * 
     */
    public Integer interval() {
        return this.interval;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorMappingAvailabilityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String frequency;
        private Integer interval;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectorMappingAvailabilityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.frequency = defaults.frequency;
    	      this.interval = defaults.interval;
        }

        public Builder frequency(@Nullable String frequency) {
            this.frequency = frequency;
            return this;
        }
        public Builder interval(Integer interval) {
            this.interval = Objects.requireNonNull(interval);
            return this;
        }        public ConnectorMappingAvailabilityResponse build() {
            return new ConnectorMappingAvailabilityResponse(frequency, interval);
        }
    }
}
