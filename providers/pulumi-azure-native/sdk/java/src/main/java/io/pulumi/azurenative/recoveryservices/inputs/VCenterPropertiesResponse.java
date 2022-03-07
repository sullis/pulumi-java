// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.azurenative.recoveryservices.inputs.HealthErrorResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * vCenter properties.
 * 
 */
public final class VCenterPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final VCenterPropertiesResponse Empty = new VCenterPropertiesResponse();

    /**
     * The VCenter discovery status.
     * 
     */
    @InputImport(name="discoveryStatus")
      private final @Nullable String discoveryStatus;

    public Optional<String> getDiscoveryStatus() {
        return this.discoveryStatus == null ? Optional.empty() : Optional.ofNullable(this.discoveryStatus);
    }

    /**
     * The ARM resource name of the fabric containing this VCenter.
     * 
     */
    @InputImport(name="fabricArmResourceName")
      private final @Nullable String fabricArmResourceName;

    public Optional<String> getFabricArmResourceName() {
        return this.fabricArmResourceName == null ? Optional.empty() : Optional.ofNullable(this.fabricArmResourceName);
    }

    /**
     * Friendly name of the vCenter.
     * 
     */
    @InputImport(name="friendlyName")
      private final @Nullable String friendlyName;

    public Optional<String> getFriendlyName() {
        return this.friendlyName == null ? Optional.empty() : Optional.ofNullable(this.friendlyName);
    }

    /**
     * The health errors for this VCenter.
     * 
     */
    @InputImport(name="healthErrors")
      private final @Nullable List<HealthErrorResponse> healthErrors;

    public List<HealthErrorResponse> getHealthErrors() {
        return this.healthErrors == null ? List.of() : this.healthErrors;
    }

    /**
     * The infrastructure Id of vCenter.
     * 
     */
    @InputImport(name="infrastructureId")
      private final @Nullable String infrastructureId;

    public Optional<String> getInfrastructureId() {
        return this.infrastructureId == null ? Optional.empty() : Optional.ofNullable(this.infrastructureId);
    }

    /**
     * VCenter internal ID.
     * 
     */
    @InputImport(name="internalId")
      private final @Nullable String internalId;

    public Optional<String> getInternalId() {
        return this.internalId == null ? Optional.empty() : Optional.ofNullable(this.internalId);
    }

    /**
     * The IP address of the vCenter.
     * 
     */
    @InputImport(name="ipAddress")
      private final @Nullable String ipAddress;

    public Optional<String> getIpAddress() {
        return this.ipAddress == null ? Optional.empty() : Optional.ofNullable(this.ipAddress);
    }

    /**
     * The time when the last heartbeat was received by vCenter.
     * 
     */
    @InputImport(name="lastHeartbeat")
      private final @Nullable String lastHeartbeat;

    public Optional<String> getLastHeartbeat() {
        return this.lastHeartbeat == null ? Optional.empty() : Optional.ofNullable(this.lastHeartbeat);
    }

    /**
     * The port number for discovery.
     * 
     */
    @InputImport(name="port")
      private final @Nullable String port;

    public Optional<String> getPort() {
        return this.port == null ? Optional.empty() : Optional.ofNullable(this.port);
    }

    /**
     * The process server Id.
     * 
     */
    @InputImport(name="processServerId")
      private final @Nullable String processServerId;

    public Optional<String> getProcessServerId() {
        return this.processServerId == null ? Optional.empty() : Optional.ofNullable(this.processServerId);
    }

    /**
     * The account Id which has privileges to discover the vCenter.
     * 
     */
    @InputImport(name="runAsAccountId")
      private final @Nullable String runAsAccountId;

    public Optional<String> getRunAsAccountId() {
        return this.runAsAccountId == null ? Optional.empty() : Optional.ofNullable(this.runAsAccountId);
    }

    public VCenterPropertiesResponse(
        @Nullable String discoveryStatus,
        @Nullable String fabricArmResourceName,
        @Nullable String friendlyName,
        @Nullable List<HealthErrorResponse> healthErrors,
        @Nullable String infrastructureId,
        @Nullable String internalId,
        @Nullable String ipAddress,
        @Nullable String lastHeartbeat,
        @Nullable String port,
        @Nullable String processServerId,
        @Nullable String runAsAccountId) {
        this.discoveryStatus = discoveryStatus;
        this.fabricArmResourceName = fabricArmResourceName;
        this.friendlyName = friendlyName;
        this.healthErrors = healthErrors;
        this.infrastructureId = infrastructureId;
        this.internalId = internalId;
        this.ipAddress = ipAddress;
        this.lastHeartbeat = lastHeartbeat;
        this.port = port;
        this.processServerId = processServerId;
        this.runAsAccountId = runAsAccountId;
    }

    private VCenterPropertiesResponse() {
        this.discoveryStatus = null;
        this.fabricArmResourceName = null;
        this.friendlyName = null;
        this.healthErrors = List.of();
        this.infrastructureId = null;
        this.internalId = null;
        this.ipAddress = null;
        this.lastHeartbeat = null;
        this.port = null;
        this.processServerId = null;
        this.runAsAccountId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VCenterPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String discoveryStatus;
        private @Nullable String fabricArmResourceName;
        private @Nullable String friendlyName;
        private @Nullable List<HealthErrorResponse> healthErrors;
        private @Nullable String infrastructureId;
        private @Nullable String internalId;
        private @Nullable String ipAddress;
        private @Nullable String lastHeartbeat;
        private @Nullable String port;
        private @Nullable String processServerId;
        private @Nullable String runAsAccountId;

        public Builder() {
    	      // Empty
        }

        public Builder(VCenterPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.discoveryStatus = defaults.discoveryStatus;
    	      this.fabricArmResourceName = defaults.fabricArmResourceName;
    	      this.friendlyName = defaults.friendlyName;
    	      this.healthErrors = defaults.healthErrors;
    	      this.infrastructureId = defaults.infrastructureId;
    	      this.internalId = defaults.internalId;
    	      this.ipAddress = defaults.ipAddress;
    	      this.lastHeartbeat = defaults.lastHeartbeat;
    	      this.port = defaults.port;
    	      this.processServerId = defaults.processServerId;
    	      this.runAsAccountId = defaults.runAsAccountId;
        }

        public Builder setDiscoveryStatus(@Nullable String discoveryStatus) {
            this.discoveryStatus = discoveryStatus;
            return this;
        }

        public Builder setFabricArmResourceName(@Nullable String fabricArmResourceName) {
            this.fabricArmResourceName = fabricArmResourceName;
            return this;
        }

        public Builder setFriendlyName(@Nullable String friendlyName) {
            this.friendlyName = friendlyName;
            return this;
        }

        public Builder setHealthErrors(@Nullable List<HealthErrorResponse> healthErrors) {
            this.healthErrors = healthErrors;
            return this;
        }

        public Builder setInfrastructureId(@Nullable String infrastructureId) {
            this.infrastructureId = infrastructureId;
            return this;
        }

        public Builder setInternalId(@Nullable String internalId) {
            this.internalId = internalId;
            return this;
        }

        public Builder setIpAddress(@Nullable String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }

        public Builder setLastHeartbeat(@Nullable String lastHeartbeat) {
            this.lastHeartbeat = lastHeartbeat;
            return this;
        }

        public Builder setPort(@Nullable String port) {
            this.port = port;
            return this;
        }

        public Builder setProcessServerId(@Nullable String processServerId) {
            this.processServerId = processServerId;
            return this;
        }

        public Builder setRunAsAccountId(@Nullable String runAsAccountId) {
            this.runAsAccountId = runAsAccountId;
            return this;
        }
        public VCenterPropertiesResponse build() {
            return new VCenterPropertiesResponse(discoveryStatus, fabricArmResourceName, friendlyName, healthErrors, infrastructureId, internalId, ipAddress, lastHeartbeat, port, processServerId, runAsAccountId);
        }
    }
}