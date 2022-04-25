// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LoadBalancingSettingsModelResponse {
    /**
     * @return The additional latency in milliseconds for probes to fall into the lowest latency bucket
     * 
     */
    private final @Nullable Integer additionalLatencyMilliseconds;
    /**
     * @return Resource ID.
     * 
     */
    private final @Nullable String id;
    /**
     * @return Resource name.
     * 
     */
    private final @Nullable String name;
    /**
     * @return Resource status.
     * 
     */
    private final String resourceState;
    /**
     * @return The number of samples to consider for load balancing decisions
     * 
     */
    private final @Nullable Integer sampleSize;
    /**
     * @return The number of samples within the sample period that must succeed
     * 
     */
    private final @Nullable Integer successfulSamplesRequired;
    /**
     * @return Resource type.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private LoadBalancingSettingsModelResponse(
        @CustomType.Parameter("additionalLatencyMilliseconds") @Nullable Integer additionalLatencyMilliseconds,
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("resourceState") String resourceState,
        @CustomType.Parameter("sampleSize") @Nullable Integer sampleSize,
        @CustomType.Parameter("successfulSamplesRequired") @Nullable Integer successfulSamplesRequired,
        @CustomType.Parameter("type") String type) {
        this.additionalLatencyMilliseconds = additionalLatencyMilliseconds;
        this.id = id;
        this.name = name;
        this.resourceState = resourceState;
        this.sampleSize = sampleSize;
        this.successfulSamplesRequired = successfulSamplesRequired;
        this.type = type;
    }

    /**
     * @return The additional latency in milliseconds for probes to fall into the lowest latency bucket
     * 
     */
    public Optional<Integer> additionalLatencyMilliseconds() {
        return Optional.ofNullable(this.additionalLatencyMilliseconds);
    }
    /**
     * @return Resource ID.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return Resource name.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return Resource status.
     * 
     */
    public String resourceState() {
        return this.resourceState;
    }
    /**
     * @return The number of samples to consider for load balancing decisions
     * 
     */
    public Optional<Integer> sampleSize() {
        return Optional.ofNullable(this.sampleSize);
    }
    /**
     * @return The number of samples within the sample period that must succeed
     * 
     */
    public Optional<Integer> successfulSamplesRequired() {
        return Optional.ofNullable(this.successfulSamplesRequired);
    }
    /**
     * @return Resource type.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoadBalancingSettingsModelResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer additionalLatencyMilliseconds;
        private @Nullable String id;
        private @Nullable String name;
        private String resourceState;
        private @Nullable Integer sampleSize;
        private @Nullable Integer successfulSamplesRequired;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(LoadBalancingSettingsModelResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalLatencyMilliseconds = defaults.additionalLatencyMilliseconds;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.resourceState = defaults.resourceState;
    	      this.sampleSize = defaults.sampleSize;
    	      this.successfulSamplesRequired = defaults.successfulSamplesRequired;
    	      this.type = defaults.type;
        }

        public Builder additionalLatencyMilliseconds(@Nullable Integer additionalLatencyMilliseconds) {
            this.additionalLatencyMilliseconds = additionalLatencyMilliseconds;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder resourceState(String resourceState) {
            this.resourceState = Objects.requireNonNull(resourceState);
            return this;
        }
        public Builder sampleSize(@Nullable Integer sampleSize) {
            this.sampleSize = sampleSize;
            return this;
        }
        public Builder successfulSamplesRequired(@Nullable Integer successfulSamplesRequired) {
            this.successfulSamplesRequired = successfulSamplesRequired;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public LoadBalancingSettingsModelResponse build() {
            return new LoadBalancingSettingsModelResponse(additionalLatencyMilliseconds, id, name, resourceState, sampleSize, successfulSamplesRequired, type);
        }
    }
}
