// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A2A Network Mapping fabric specific settings.
 * 
 */
public final class AzureToAzureNetworkMappingSettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final AzureToAzureNetworkMappingSettingsResponse Empty = new AzureToAzureNetworkMappingSettingsResponse();

    /**
     * Gets the Instance type.
     * Expected value is 'AzureToAzure'.
     * 
     */
    @InputImport(name="instanceType", required=true)
    private final String instanceType;

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * The primary fabric location.
     * 
     */
    @InputImport(name="primaryFabricLocation")
    private final @Nullable String primaryFabricLocation;

    public Optional<String> getPrimaryFabricLocation() {
        return this.primaryFabricLocation == null ? Optional.empty() : Optional.ofNullable(this.primaryFabricLocation);
    }

    /**
     * The recovery fabric location.
     * 
     */
    @InputImport(name="recoveryFabricLocation")
    private final @Nullable String recoveryFabricLocation;

    public Optional<String> getRecoveryFabricLocation() {
        return this.recoveryFabricLocation == null ? Optional.empty() : Optional.ofNullable(this.recoveryFabricLocation);
    }

    public AzureToAzureNetworkMappingSettingsResponse(
        String instanceType,
        @Nullable String primaryFabricLocation,
        @Nullable String recoveryFabricLocation) {
        this.instanceType = Objects.requireNonNull(instanceType, "expected parameter 'instanceType' to be non-null");
        this.primaryFabricLocation = primaryFabricLocation;
        this.recoveryFabricLocation = recoveryFabricLocation;
    }

    private AzureToAzureNetworkMappingSettingsResponse() {
        this.instanceType = null;
        this.primaryFabricLocation = null;
        this.recoveryFabricLocation = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureToAzureNetworkMappingSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String instanceType;
        private @Nullable String primaryFabricLocation;
        private @Nullable String recoveryFabricLocation;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureToAzureNetworkMappingSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceType = defaults.instanceType;
    	      this.primaryFabricLocation = defaults.primaryFabricLocation;
    	      this.recoveryFabricLocation = defaults.recoveryFabricLocation;
        }

        public Builder setInstanceType(String instanceType) {
            this.instanceType = Objects.requireNonNull(instanceType);
            return this;
        }

        public Builder setPrimaryFabricLocation(@Nullable String primaryFabricLocation) {
            this.primaryFabricLocation = primaryFabricLocation;
            return this;
        }

        public Builder setRecoveryFabricLocation(@Nullable String recoveryFabricLocation) {
            this.recoveryFabricLocation = recoveryFabricLocation;
            return this;
        }

        public AzureToAzureNetworkMappingSettingsResponse build() {
            return new AzureToAzureNetworkMappingSettingsResponse(instanceType, primaryFabricLocation, recoveryFabricLocation);
        }
    }
}
