// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.outputs;

import io.pulumi.azurenative.recoveryservices.outputs.A2AProtectionContainerMappingDetailsResponse;
import io.pulumi.azurenative.recoveryservices.outputs.HealthErrorResponse;
import io.pulumi.azurenative.recoveryservices.outputs.VMwareCbtProtectionContainerMappingDetailsResponse;
import io.pulumi.core.Either;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ProtectionContainerMappingPropertiesResponse {
    /**
     * Health of pairing.
     * 
     */
    private final @Nullable String health;
    /**
     * Health error.
     * 
     */
    private final @Nullable List<HealthErrorResponse> healthErrorDetails;
    /**
     * Friendly name of replication policy.
     * 
     */
    private final @Nullable String policyFriendlyName;
    /**
     * Policy ARM Id.
     * 
     */
    private final @Nullable String policyId;
    /**
     * Provider specific provider details.
     * 
     */
    private final @Nullable Either<A2AProtectionContainerMappingDetailsResponse,VMwareCbtProtectionContainerMappingDetailsResponse> providerSpecificDetails;
    /**
     * Friendly name of source fabric.
     * 
     */
    private final @Nullable String sourceFabricFriendlyName;
    /**
     * Friendly name of source protection container.
     * 
     */
    private final @Nullable String sourceProtectionContainerFriendlyName;
    /**
     * Association Status
     * 
     */
    private final @Nullable String state;
    /**
     * Friendly name of target fabric.
     * 
     */
    private final @Nullable String targetFabricFriendlyName;
    /**
     * Friendly name of paired container.
     * 
     */
    private final @Nullable String targetProtectionContainerFriendlyName;
    /**
     * Paired protection container ARM ID.
     * 
     */
    private final @Nullable String targetProtectionContainerId;

    @OutputCustomType.Constructor({"health","healthErrorDetails","policyFriendlyName","policyId","providerSpecificDetails","sourceFabricFriendlyName","sourceProtectionContainerFriendlyName","state","targetFabricFriendlyName","targetProtectionContainerFriendlyName","targetProtectionContainerId"})
    private ProtectionContainerMappingPropertiesResponse(
        @Nullable String health,
        @Nullable List<HealthErrorResponse> healthErrorDetails,
        @Nullable String policyFriendlyName,
        @Nullable String policyId,
        @Nullable Either<A2AProtectionContainerMappingDetailsResponse,VMwareCbtProtectionContainerMappingDetailsResponse> providerSpecificDetails,
        @Nullable String sourceFabricFriendlyName,
        @Nullable String sourceProtectionContainerFriendlyName,
        @Nullable String state,
        @Nullable String targetFabricFriendlyName,
        @Nullable String targetProtectionContainerFriendlyName,
        @Nullable String targetProtectionContainerId) {
        this.health = health;
        this.healthErrorDetails = healthErrorDetails;
        this.policyFriendlyName = policyFriendlyName;
        this.policyId = policyId;
        this.providerSpecificDetails = providerSpecificDetails;
        this.sourceFabricFriendlyName = sourceFabricFriendlyName;
        this.sourceProtectionContainerFriendlyName = sourceProtectionContainerFriendlyName;
        this.state = state;
        this.targetFabricFriendlyName = targetFabricFriendlyName;
        this.targetProtectionContainerFriendlyName = targetProtectionContainerFriendlyName;
        this.targetProtectionContainerId = targetProtectionContainerId;
    }

    /**
     * Health of pairing.
     * 
     */
    public Optional<String> getHealth() {
        return Optional.ofNullable(this.health);
    }
    /**
     * Health error.
     * 
     */
    public List<HealthErrorResponse> getHealthErrorDetails() {
        return this.healthErrorDetails == null ? List.of() : this.healthErrorDetails;
    }
    /**
     * Friendly name of replication policy.
     * 
     */
    public Optional<String> getPolicyFriendlyName() {
        return Optional.ofNullable(this.policyFriendlyName);
    }
    /**
     * Policy ARM Id.
     * 
     */
    public Optional<String> getPolicyId() {
        return Optional.ofNullable(this.policyId);
    }
    /**
     * Provider specific provider details.
     * 
     */
    public Optional<Either<A2AProtectionContainerMappingDetailsResponse,VMwareCbtProtectionContainerMappingDetailsResponse>> getProviderSpecificDetails() {
        return Optional.ofNullable(this.providerSpecificDetails);
    }
    /**
     * Friendly name of source fabric.
     * 
     */
    public Optional<String> getSourceFabricFriendlyName() {
        return Optional.ofNullable(this.sourceFabricFriendlyName);
    }
    /**
     * Friendly name of source protection container.
     * 
     */
    public Optional<String> getSourceProtectionContainerFriendlyName() {
        return Optional.ofNullable(this.sourceProtectionContainerFriendlyName);
    }
    /**
     * Association Status
     * 
     */
    public Optional<String> getState() {
        return Optional.ofNullable(this.state);
    }
    /**
     * Friendly name of target fabric.
     * 
     */
    public Optional<String> getTargetFabricFriendlyName() {
        return Optional.ofNullable(this.targetFabricFriendlyName);
    }
    /**
     * Friendly name of paired container.
     * 
     */
    public Optional<String> getTargetProtectionContainerFriendlyName() {
        return Optional.ofNullable(this.targetProtectionContainerFriendlyName);
    }
    /**
     * Paired protection container ARM ID.
     * 
     */
    public Optional<String> getTargetProtectionContainerId() {
        return Optional.ofNullable(this.targetProtectionContainerId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProtectionContainerMappingPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String health;
        private @Nullable List<HealthErrorResponse> healthErrorDetails;
        private @Nullable String policyFriendlyName;
        private @Nullable String policyId;
        private @Nullable Either<A2AProtectionContainerMappingDetailsResponse,VMwareCbtProtectionContainerMappingDetailsResponse> providerSpecificDetails;
        private @Nullable String sourceFabricFriendlyName;
        private @Nullable String sourceProtectionContainerFriendlyName;
        private @Nullable String state;
        private @Nullable String targetFabricFriendlyName;
        private @Nullable String targetProtectionContainerFriendlyName;
        private @Nullable String targetProtectionContainerId;

        public Builder() {
    	      // Empty
        }

        public Builder(ProtectionContainerMappingPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.health = defaults.health;
    	      this.healthErrorDetails = defaults.healthErrorDetails;
    	      this.policyFriendlyName = defaults.policyFriendlyName;
    	      this.policyId = defaults.policyId;
    	      this.providerSpecificDetails = defaults.providerSpecificDetails;
    	      this.sourceFabricFriendlyName = defaults.sourceFabricFriendlyName;
    	      this.sourceProtectionContainerFriendlyName = defaults.sourceProtectionContainerFriendlyName;
    	      this.state = defaults.state;
    	      this.targetFabricFriendlyName = defaults.targetFabricFriendlyName;
    	      this.targetProtectionContainerFriendlyName = defaults.targetProtectionContainerFriendlyName;
    	      this.targetProtectionContainerId = defaults.targetProtectionContainerId;
        }

        public Builder setHealth(@Nullable String health) {
            this.health = health;
            return this;
        }

        public Builder setHealthErrorDetails(@Nullable List<HealthErrorResponse> healthErrorDetails) {
            this.healthErrorDetails = healthErrorDetails;
            return this;
        }

        public Builder setPolicyFriendlyName(@Nullable String policyFriendlyName) {
            this.policyFriendlyName = policyFriendlyName;
            return this;
        }

        public Builder setPolicyId(@Nullable String policyId) {
            this.policyId = policyId;
            return this;
        }

        public Builder setProviderSpecificDetails(@Nullable Either<A2AProtectionContainerMappingDetailsResponse,VMwareCbtProtectionContainerMappingDetailsResponse> providerSpecificDetails) {
            this.providerSpecificDetails = providerSpecificDetails;
            return this;
        }

        public Builder setSourceFabricFriendlyName(@Nullable String sourceFabricFriendlyName) {
            this.sourceFabricFriendlyName = sourceFabricFriendlyName;
            return this;
        }

        public Builder setSourceProtectionContainerFriendlyName(@Nullable String sourceProtectionContainerFriendlyName) {
            this.sourceProtectionContainerFriendlyName = sourceProtectionContainerFriendlyName;
            return this;
        }

        public Builder setState(@Nullable String state) {
            this.state = state;
            return this;
        }

        public Builder setTargetFabricFriendlyName(@Nullable String targetFabricFriendlyName) {
            this.targetFabricFriendlyName = targetFabricFriendlyName;
            return this;
        }

        public Builder setTargetProtectionContainerFriendlyName(@Nullable String targetProtectionContainerFriendlyName) {
            this.targetProtectionContainerFriendlyName = targetProtectionContainerFriendlyName;
            return this;
        }

        public Builder setTargetProtectionContainerId(@Nullable String targetProtectionContainerId) {
            this.targetProtectionContainerId = targetProtectionContainerId;
            return this;
        }

        public ProtectionContainerMappingPropertiesResponse build() {
            return new ProtectionContainerMappingPropertiesResponse(health, healthErrorDetails, policyFriendlyName, policyId, providerSpecificDetails, sourceFabricFriendlyName, sourceProtectionContainerFriendlyName, state, targetFabricFriendlyName, targetProtectionContainerFriendlyName, targetProtectionContainerId);
        }
    }
}
