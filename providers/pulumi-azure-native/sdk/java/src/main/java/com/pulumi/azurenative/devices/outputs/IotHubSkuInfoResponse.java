// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.devices.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class IotHubSkuInfoResponse {
    /**
     * @return The number of provisioned IoT Hub units. See: https://docs.microsoft.com/azure/azure-subscription-service-limits#iot-hub-limits.
     * 
     */
    private final @Nullable Double capacity;
    /**
     * @return The name of the SKU.
     * 
     */
    private final String name;
    /**
     * @return The billing tier for the IoT hub.
     * 
     */
    private final String tier;

    @CustomType.Constructor
    private IotHubSkuInfoResponse(
        @CustomType.Parameter("capacity") @Nullable Double capacity,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("tier") String tier) {
        this.capacity = capacity;
        this.name = name;
        this.tier = tier;
    }

    /**
     * @return The number of provisioned IoT Hub units. See: https://docs.microsoft.com/azure/azure-subscription-service-limits#iot-hub-limits.
     * 
     */
    public Optional<Double> capacity() {
        return Optional.ofNullable(this.capacity);
    }
    /**
     * @return The name of the SKU.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The billing tier for the IoT hub.
     * 
     */
    public String tier() {
        return this.tier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IotHubSkuInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Double capacity;
        private String name;
        private String tier;

        public Builder() {
    	      // Empty
        }

        public Builder(IotHubSkuInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacity = defaults.capacity;
    	      this.name = defaults.name;
    	      this.tier = defaults.tier;
        }

        public Builder capacity(@Nullable Double capacity) {
            this.capacity = capacity;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder tier(String tier) {
            this.tier = Objects.requireNonNull(tier);
            return this;
        }        public IotHubSkuInfoResponse build() {
            return new IotHubSkuInfoResponse(capacity, name, tier);
        }
    }
}
