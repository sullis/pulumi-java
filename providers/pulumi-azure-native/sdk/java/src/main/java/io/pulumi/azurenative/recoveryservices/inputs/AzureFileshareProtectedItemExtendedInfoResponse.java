// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Additional information about Azure File Share backup item.
 * 
 */
public final class AzureFileshareProtectedItemExtendedInfoResponse extends io.pulumi.resources.InvokeArgs {

    public static final AzureFileshareProtectedItemExtendedInfoResponse Empty = new AzureFileshareProtectedItemExtendedInfoResponse();

    /**
     * The oldest backup copy available for this item in the service.
     * 
     */
    @Import(name="oldestRecoveryPoint")
      private final @Nullable String oldestRecoveryPoint;

    public Optional<String> getOldestRecoveryPoint() {
        return this.oldestRecoveryPoint == null ? Optional.empty() : Optional.ofNullable(this.oldestRecoveryPoint);
    }

    /**
     * Indicates consistency of policy object and policy applied to this backup item.
     * 
     */
    @Import(name="policyState")
      private final @Nullable String policyState;

    public Optional<String> getPolicyState() {
        return this.policyState == null ? Optional.empty() : Optional.ofNullable(this.policyState);
    }

    /**
     * Number of available backup copies associated with this backup item.
     * 
     */
    @Import(name="recoveryPointCount")
      private final @Nullable Integer recoveryPointCount;

    public Optional<Integer> getRecoveryPointCount() {
        return this.recoveryPointCount == null ? Optional.empty() : Optional.ofNullable(this.recoveryPointCount);
    }

    /**
     * Indicates the state of this resource. Possible values are from enum ResourceState {Invalid, Active, SoftDeleted, Deleted}
     * 
     */
    @Import(name="resourceState", required=true)
      private final String resourceState;

    public String getResourceState() {
        return this.resourceState;
    }

    /**
     * The resource state sync time for this backup item.
     * 
     */
    @Import(name="resourceStateSyncTime", required=true)
      private final String resourceStateSyncTime;

    public String getResourceStateSyncTime() {
        return this.resourceStateSyncTime;
    }

    public AzureFileshareProtectedItemExtendedInfoResponse(
        @Nullable String oldestRecoveryPoint,
        @Nullable String policyState,
        @Nullable Integer recoveryPointCount,
        String resourceState,
        String resourceStateSyncTime) {
        this.oldestRecoveryPoint = oldestRecoveryPoint;
        this.policyState = policyState;
        this.recoveryPointCount = recoveryPointCount;
        this.resourceState = Objects.requireNonNull(resourceState, "expected parameter 'resourceState' to be non-null");
        this.resourceStateSyncTime = Objects.requireNonNull(resourceStateSyncTime, "expected parameter 'resourceStateSyncTime' to be non-null");
    }

    private AzureFileshareProtectedItemExtendedInfoResponse() {
        this.oldestRecoveryPoint = null;
        this.policyState = null;
        this.recoveryPointCount = null;
        this.resourceState = null;
        this.resourceStateSyncTime = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureFileshareProtectedItemExtendedInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String oldestRecoveryPoint;
        private @Nullable String policyState;
        private @Nullable Integer recoveryPointCount;
        private String resourceState;
        private String resourceStateSyncTime;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureFileshareProtectedItemExtendedInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.oldestRecoveryPoint = defaults.oldestRecoveryPoint;
    	      this.policyState = defaults.policyState;
    	      this.recoveryPointCount = defaults.recoveryPointCount;
    	      this.resourceState = defaults.resourceState;
    	      this.resourceStateSyncTime = defaults.resourceStateSyncTime;
        }

        public Builder oldestRecoveryPoint(@Nullable String oldestRecoveryPoint) {
            this.oldestRecoveryPoint = oldestRecoveryPoint;
            return this;
        }
        public Builder policyState(@Nullable String policyState) {
            this.policyState = policyState;
            return this;
        }
        public Builder recoveryPointCount(@Nullable Integer recoveryPointCount) {
            this.recoveryPointCount = recoveryPointCount;
            return this;
        }
        public Builder resourceState(String resourceState) {
            this.resourceState = Objects.requireNonNull(resourceState);
            return this;
        }
        public Builder resourceStateSyncTime(String resourceStateSyncTime) {
            this.resourceStateSyncTime = Objects.requireNonNull(resourceStateSyncTime);
            return this;
        }        public AzureFileshareProtectedItemExtendedInfoResponse build() {
            return new AzureFileshareProtectedItemExtendedInfoResponse(oldestRecoveryPoint, policyState, recoveryPointCount, resourceState, resourceStateSyncTime);
        }
    }
}
