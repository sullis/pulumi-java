// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cdn.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Round-Robin load balancing settings for a backend pool
 * 
 */
public final class LoadBalancingSettingsParametersResponse extends com.pulumi.resources.InvokeArgs {

    public static final LoadBalancingSettingsParametersResponse Empty = new LoadBalancingSettingsParametersResponse();

    /**
     * The additional latency in milliseconds for probes to fall into the lowest latency bucket
     * 
     */
    @Import(name="additionalLatencyInMilliseconds")
    private @Nullable Integer additionalLatencyInMilliseconds;

    /**
     * @return The additional latency in milliseconds for probes to fall into the lowest latency bucket
     * 
     */
    public Optional<Integer> additionalLatencyInMilliseconds() {
        return Optional.ofNullable(this.additionalLatencyInMilliseconds);
    }

    /**
     * The number of samples to consider for load balancing decisions
     * 
     */
    @Import(name="sampleSize")
    private @Nullable Integer sampleSize;

    /**
     * @return The number of samples to consider for load balancing decisions
     * 
     */
    public Optional<Integer> sampleSize() {
        return Optional.ofNullable(this.sampleSize);
    }

    /**
     * The number of samples within the sample period that must succeed
     * 
     */
    @Import(name="successfulSamplesRequired")
    private @Nullable Integer successfulSamplesRequired;

    /**
     * @return The number of samples within the sample period that must succeed
     * 
     */
    public Optional<Integer> successfulSamplesRequired() {
        return Optional.ofNullable(this.successfulSamplesRequired);
    }

    private LoadBalancingSettingsParametersResponse() {}

    private LoadBalancingSettingsParametersResponse(LoadBalancingSettingsParametersResponse $) {
        this.additionalLatencyInMilliseconds = $.additionalLatencyInMilliseconds;
        this.sampleSize = $.sampleSize;
        this.successfulSamplesRequired = $.successfulSamplesRequired;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LoadBalancingSettingsParametersResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LoadBalancingSettingsParametersResponse $;

        public Builder() {
            $ = new LoadBalancingSettingsParametersResponse();
        }

        public Builder(LoadBalancingSettingsParametersResponse defaults) {
            $ = new LoadBalancingSettingsParametersResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param additionalLatencyInMilliseconds The additional latency in milliseconds for probes to fall into the lowest latency bucket
         * 
         * @return builder
         * 
         */
        public Builder additionalLatencyInMilliseconds(@Nullable Integer additionalLatencyInMilliseconds) {
            $.additionalLatencyInMilliseconds = additionalLatencyInMilliseconds;
            return this;
        }

        /**
         * @param sampleSize The number of samples to consider for load balancing decisions
         * 
         * @return builder
         * 
         */
        public Builder sampleSize(@Nullable Integer sampleSize) {
            $.sampleSize = sampleSize;
            return this;
        }

        /**
         * @param successfulSamplesRequired The number of samples within the sample period that must succeed
         * 
         * @return builder
         * 
         */
        public Builder successfulSamplesRequired(@Nullable Integer successfulSamplesRequired) {
            $.successfulSamplesRequired = successfulSamplesRequired;
            return this;
        }

        public LoadBalancingSettingsParametersResponse build() {
            return $;
        }
    }

}
