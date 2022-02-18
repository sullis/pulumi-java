// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.azurenative.recoveryservices.inputs.AzureToAzureCreateNetworkMappingInputArgs;
import io.pulumi.azurenative.recoveryservices.inputs.VmmToAzureCreateNetworkMappingInputArgs;
import io.pulumi.azurenative.recoveryservices.inputs.VmmToVmmCreateNetworkMappingInputArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Common input details for network mapping operation.
 * 
 */
public final class CreateNetworkMappingInputPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final CreateNetworkMappingInputPropertiesArgs Empty = new CreateNetworkMappingInputPropertiesArgs();

    /**
     * Fabric specific input properties.
     * 
     */
    @InputImport(name="fabricSpecificDetails")
    private final @Nullable Input<Object> fabricSpecificDetails;

    public Input<Object> getFabricSpecificDetails() {
        return this.fabricSpecificDetails == null ? Input.empty() : this.fabricSpecificDetails;
    }

    /**
     * Recovery fabric Name.
     * 
     */
    @InputImport(name="recoveryFabricName")
    private final @Nullable Input<String> recoveryFabricName;

    public Input<String> getRecoveryFabricName() {
        return this.recoveryFabricName == null ? Input.empty() : this.recoveryFabricName;
    }

    /**
     * Recovery network Id.
     * 
     */
    @InputImport(name="recoveryNetworkId")
    private final @Nullable Input<String> recoveryNetworkId;

    public Input<String> getRecoveryNetworkId() {
        return this.recoveryNetworkId == null ? Input.empty() : this.recoveryNetworkId;
    }

    public CreateNetworkMappingInputPropertiesArgs(
        @Nullable Input<Object> fabricSpecificDetails,
        @Nullable Input<String> recoveryFabricName,
        @Nullable Input<String> recoveryNetworkId) {
        this.fabricSpecificDetails = fabricSpecificDetails;
        this.recoveryFabricName = recoveryFabricName;
        this.recoveryNetworkId = recoveryNetworkId;
    }

    private CreateNetworkMappingInputPropertiesArgs() {
        this.fabricSpecificDetails = Input.empty();
        this.recoveryFabricName = Input.empty();
        this.recoveryNetworkId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CreateNetworkMappingInputPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Object> fabricSpecificDetails;
        private @Nullable Input<String> recoveryFabricName;
        private @Nullable Input<String> recoveryNetworkId;

        public Builder() {
    	      // Empty
        }

        public Builder(CreateNetworkMappingInputPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fabricSpecificDetails = defaults.fabricSpecificDetails;
    	      this.recoveryFabricName = defaults.recoveryFabricName;
    	      this.recoveryNetworkId = defaults.recoveryNetworkId;
        }

        public Builder setFabricSpecificDetails(@Nullable Input<Object> fabricSpecificDetails) {
            this.fabricSpecificDetails = fabricSpecificDetails;
            return this;
        }

        public Builder setFabricSpecificDetails(@Nullable Object fabricSpecificDetails) {
            this.fabricSpecificDetails = Input.ofNullable(fabricSpecificDetails);
            return this;
        }

        public Builder setRecoveryFabricName(@Nullable Input<String> recoveryFabricName) {
            this.recoveryFabricName = recoveryFabricName;
            return this;
        }

        public Builder setRecoveryFabricName(@Nullable String recoveryFabricName) {
            this.recoveryFabricName = Input.ofNullable(recoveryFabricName);
            return this;
        }

        public Builder setRecoveryNetworkId(@Nullable Input<String> recoveryNetworkId) {
            this.recoveryNetworkId = recoveryNetworkId;
            return this;
        }

        public Builder setRecoveryNetworkId(@Nullable String recoveryNetworkId) {
            this.recoveryNetworkId = Input.ofNullable(recoveryNetworkId);
            return this;
        }

        public CreateNetworkMappingInputPropertiesArgs build() {
            return new CreateNetworkMappingInputPropertiesArgs(fabricSpecificDetails, recoveryFabricName, recoveryNetworkId);
        }
    }
}
