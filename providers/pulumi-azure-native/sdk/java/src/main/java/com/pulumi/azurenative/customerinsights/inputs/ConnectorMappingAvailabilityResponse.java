// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.customerinsights.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Connector mapping property availability.
 * 
 */
public final class ConnectorMappingAvailabilityResponse extends com.pulumi.resources.InvokeArgs {

    public static final ConnectorMappingAvailabilityResponse Empty = new ConnectorMappingAvailabilityResponse();

    /**
     * The frequency to update.
     * 
     */
    @Import(name="frequency")
    private @Nullable String frequency;

    /**
     * @return The frequency to update.
     * 
     */
    public Optional<String> frequency() {
        return Optional.ofNullable(this.frequency);
    }

    /**
     * The interval of the given frequency to use.
     * 
     */
    @Import(name="interval", required=true)
    private Integer interval;

    /**
     * @return The interval of the given frequency to use.
     * 
     */
    public Integer interval() {
        return this.interval;
    }

    private ConnectorMappingAvailabilityResponse() {}

    private ConnectorMappingAvailabilityResponse(ConnectorMappingAvailabilityResponse $) {
        this.frequency = $.frequency;
        this.interval = $.interval;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectorMappingAvailabilityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectorMappingAvailabilityResponse $;

        public Builder() {
            $ = new ConnectorMappingAvailabilityResponse();
        }

        public Builder(ConnectorMappingAvailabilityResponse defaults) {
            $ = new ConnectorMappingAvailabilityResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param frequency The frequency to update.
         * 
         * @return builder
         * 
         */
        public Builder frequency(@Nullable String frequency) {
            $.frequency = frequency;
            return this;
        }

        /**
         * @param interval The interval of the given frequency to use.
         * 
         * @return builder
         * 
         */
        public Builder interval(Integer interval) {
            $.interval = interval;
            return this;
        }

        public ConnectorMappingAvailabilityResponse build() {
            $.interval = Objects.requireNonNull($.interval, "expected parameter 'interval' to be non-null");
            return $;
        }
    }

}
