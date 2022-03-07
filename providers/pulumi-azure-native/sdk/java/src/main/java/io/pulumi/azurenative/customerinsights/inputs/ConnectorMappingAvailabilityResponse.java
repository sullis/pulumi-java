// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.customerinsights.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Connector mapping property availability.
 * 
 */
public final class ConnectorMappingAvailabilityResponse extends io.pulumi.resources.InvokeArgs {

    public static final ConnectorMappingAvailabilityResponse Empty = new ConnectorMappingAvailabilityResponse();

    /**
     * The frequency to update.
     * 
     */
    @InputImport(name="frequency")
      private final @Nullable String frequency;

    public Optional<String> getFrequency() {
        return this.frequency == null ? Optional.empty() : Optional.ofNullable(this.frequency);
    }

    /**
     * The interval of the given frequency to use.
     * 
     */
    @InputImport(name="interval", required=true)
      private final Integer interval;

    public Integer getInterval() {
        return this.interval;
    }

    public ConnectorMappingAvailabilityResponse(
        @Nullable String frequency,
        Integer interval) {
        this.frequency = frequency;
        this.interval = Objects.requireNonNull(interval, "expected parameter 'interval' to be non-null");
    }

    private ConnectorMappingAvailabilityResponse() {
        this.frequency = null;
        this.interval = null;
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

        public Builder setFrequency(@Nullable String frequency) {
            this.frequency = frequency;
            return this;
        }

        public Builder setInterval(Integer interval) {
            this.interval = Objects.requireNonNull(interval);
            return this;
        }
        public ConnectorMappingAvailabilityResponse build() {
            return new ConnectorMappingAvailabilityResponse(frequency, interval);
        }
    }
}