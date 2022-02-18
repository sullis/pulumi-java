// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.labservices.outputs;

import io.pulumi.azurenative.labservices.outputs.LatestOperationResultResponse;
import io.pulumi.azurenative.labservices.outputs.NetworkInterfaceResponse;
import io.pulumi.azurenative.labservices.outputs.ResourceSetResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetEnvironmentResult {
    /**
     * The name or email address of the user who has claimed the environment
     * 
     */
    private final String claimedByUserName;
    /**
     * The AAD object Id of the user who has claimed the environment
     * 
     */
    private final String claimedByUserObjectId;
    /**
     * The user principal Id of the user who has claimed the environment
     * 
     */
    private final String claimedByUserPrincipalId;
    /**
     * The identifier of the resource.
     * 
     */
    private final String id;
    /**
     * Is the environment claimed or not
     * 
     */
    private final Boolean isClaimed;
    /**
     * Last known power state of the environment
     * 
     */
    private final String lastKnownPowerState;
    /**
     * The details of the latest operation. ex: status, error
     * 
     */
    private final LatestOperationResultResponse latestOperationResult;
    /**
     * The location of the resource.
     * 
     */
    private final @Nullable String location;
    /**
     * The name of the resource.
     * 
     */
    private final String name;
    /**
     * Network details of the environment
     * 
     */
    private final NetworkInterfaceResponse networkInterface;
    /**
     * When the password was last reset on the environment.
     * 
     */
    private final String passwordLastReset;
    /**
     * The provisioning status of the resource.
     * 
     */
    private final @Nullable String provisioningState;
    /**
     * The set of a VM and the setting id it was created for
     * 
     */
    private final @Nullable ResourceSetResponse resourceSets;
    /**
     * The tags of the resource.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * How long the environment has been used by a lab user
     * 
     */
    private final String totalUsage;
    /**
     * The type of the resource.
     * 
     */
    private final String type;
    /**
     * The unique immutable identifier of a resource (Guid).
     * 
     */
    private final @Nullable String uniqueIdentifier;

    @OutputCustomType.Constructor({"claimedByUserName","claimedByUserObjectId","claimedByUserPrincipalId","id","isClaimed","lastKnownPowerState","latestOperationResult","location","name","networkInterface","passwordLastReset","provisioningState","resourceSets","tags","totalUsage","type","uniqueIdentifier"})
    private GetEnvironmentResult(
        String claimedByUserName,
        String claimedByUserObjectId,
        String claimedByUserPrincipalId,
        String id,
        Boolean isClaimed,
        String lastKnownPowerState,
        LatestOperationResultResponse latestOperationResult,
        @Nullable String location,
        String name,
        NetworkInterfaceResponse networkInterface,
        String passwordLastReset,
        @Nullable String provisioningState,
        @Nullable ResourceSetResponse resourceSets,
        @Nullable Map<String,String> tags,
        String totalUsage,
        String type,
        @Nullable String uniqueIdentifier) {
        this.claimedByUserName = Objects.requireNonNull(claimedByUserName);
        this.claimedByUserObjectId = Objects.requireNonNull(claimedByUserObjectId);
        this.claimedByUserPrincipalId = Objects.requireNonNull(claimedByUserPrincipalId);
        this.id = Objects.requireNonNull(id);
        this.isClaimed = Objects.requireNonNull(isClaimed);
        this.lastKnownPowerState = Objects.requireNonNull(lastKnownPowerState);
        this.latestOperationResult = Objects.requireNonNull(latestOperationResult);
        this.location = location;
        this.name = Objects.requireNonNull(name);
        this.networkInterface = Objects.requireNonNull(networkInterface);
        this.passwordLastReset = Objects.requireNonNull(passwordLastReset);
        this.provisioningState = provisioningState;
        this.resourceSets = resourceSets;
        this.tags = tags;
        this.totalUsage = Objects.requireNonNull(totalUsage);
        this.type = Objects.requireNonNull(type);
        this.uniqueIdentifier = uniqueIdentifier;
    }

    /**
     * The name or email address of the user who has claimed the environment
     * 
     */
    public String getClaimedByUserName() {
        return this.claimedByUserName;
    }
    /**
     * The AAD object Id of the user who has claimed the environment
     * 
     */
    public String getClaimedByUserObjectId() {
        return this.claimedByUserObjectId;
    }
    /**
     * The user principal Id of the user who has claimed the environment
     * 
     */
    public String getClaimedByUserPrincipalId() {
        return this.claimedByUserPrincipalId;
    }
    /**
     * The identifier of the resource.
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * Is the environment claimed or not
     * 
     */
    public Boolean getIsClaimed() {
        return this.isClaimed;
    }
    /**
     * Last known power state of the environment
     * 
     */
    public String getLastKnownPowerState() {
        return this.lastKnownPowerState;
    }
    /**
     * The details of the latest operation. ex: status, error
     * 
     */
    public LatestOperationResultResponse getLatestOperationResult() {
        return this.latestOperationResult;
    }
    /**
     * The location of the resource.
     * 
     */
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    /**
     * The name of the resource.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Network details of the environment
     * 
     */
    public NetworkInterfaceResponse getNetworkInterface() {
        return this.networkInterface;
    }
    /**
     * When the password was last reset on the environment.
     * 
     */
    public String getPasswordLastReset() {
        return this.passwordLastReset;
    }
    /**
     * The provisioning status of the resource.
     * 
     */
    public Optional<String> getProvisioningState() {
        return Optional.ofNullable(this.provisioningState);
    }
    /**
     * The set of a VM and the setting id it was created for
     * 
     */
    public Optional<ResourceSetResponse> getResourceSets() {
        return Optional.ofNullable(this.resourceSets);
    }
    /**
     * The tags of the resource.
     * 
     */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * How long the environment has been used by a lab user
     * 
     */
    public String getTotalUsage() {
        return this.totalUsage;
    }
    /**
     * The type of the resource.
     * 
     */
    public String getType() {
        return this.type;
    }
    /**
     * The unique immutable identifier of a resource (Guid).
     * 
     */
    public Optional<String> getUniqueIdentifier() {
        return Optional.ofNullable(this.uniqueIdentifier);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEnvironmentResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String claimedByUserName;
        private String claimedByUserObjectId;
        private String claimedByUserPrincipalId;
        private String id;
        private Boolean isClaimed;
        private String lastKnownPowerState;
        private LatestOperationResultResponse latestOperationResult;
        private @Nullable String location;
        private String name;
        private NetworkInterfaceResponse networkInterface;
        private String passwordLastReset;
        private @Nullable String provisioningState;
        private @Nullable ResourceSetResponse resourceSets;
        private @Nullable Map<String,String> tags;
        private String totalUsage;
        private String type;
        private @Nullable String uniqueIdentifier;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEnvironmentResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.claimedByUserName = defaults.claimedByUserName;
    	      this.claimedByUserObjectId = defaults.claimedByUserObjectId;
    	      this.claimedByUserPrincipalId = defaults.claimedByUserPrincipalId;
    	      this.id = defaults.id;
    	      this.isClaimed = defaults.isClaimed;
    	      this.lastKnownPowerState = defaults.lastKnownPowerState;
    	      this.latestOperationResult = defaults.latestOperationResult;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.networkInterface = defaults.networkInterface;
    	      this.passwordLastReset = defaults.passwordLastReset;
    	      this.provisioningState = defaults.provisioningState;
    	      this.resourceSets = defaults.resourceSets;
    	      this.tags = defaults.tags;
    	      this.totalUsage = defaults.totalUsage;
    	      this.type = defaults.type;
    	      this.uniqueIdentifier = defaults.uniqueIdentifier;
        }

        public Builder setClaimedByUserName(String claimedByUserName) {
            this.claimedByUserName = Objects.requireNonNull(claimedByUserName);
            return this;
        }

        public Builder setClaimedByUserObjectId(String claimedByUserObjectId) {
            this.claimedByUserObjectId = Objects.requireNonNull(claimedByUserObjectId);
            return this;
        }

        public Builder setClaimedByUserPrincipalId(String claimedByUserPrincipalId) {
            this.claimedByUserPrincipalId = Objects.requireNonNull(claimedByUserPrincipalId);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setIsClaimed(Boolean isClaimed) {
            this.isClaimed = Objects.requireNonNull(isClaimed);
            return this;
        }

        public Builder setLastKnownPowerState(String lastKnownPowerState) {
            this.lastKnownPowerState = Objects.requireNonNull(lastKnownPowerState);
            return this;
        }

        public Builder setLatestOperationResult(LatestOperationResultResponse latestOperationResult) {
            this.latestOperationResult = Objects.requireNonNull(latestOperationResult);
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setNetworkInterface(NetworkInterfaceResponse networkInterface) {
            this.networkInterface = Objects.requireNonNull(networkInterface);
            return this;
        }

        public Builder setPasswordLastReset(String passwordLastReset) {
            this.passwordLastReset = Objects.requireNonNull(passwordLastReset);
            return this;
        }

        public Builder setProvisioningState(@Nullable String provisioningState) {
            this.provisioningState = provisioningState;
            return this;
        }

        public Builder setResourceSets(@Nullable ResourceSetResponse resourceSets) {
            this.resourceSets = resourceSets;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTotalUsage(String totalUsage) {
            this.totalUsage = Objects.requireNonNull(totalUsage);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUniqueIdentifier(@Nullable String uniqueIdentifier) {
            this.uniqueIdentifier = uniqueIdentifier;
            return this;
        }

        public GetEnvironmentResult build() {
            return new GetEnvironmentResult(claimedByUserName, claimedByUserObjectId, claimedByUserPrincipalId, id, isClaimed, lastKnownPowerState, latestOperationResult, location, name, networkInterface, passwordLastReset, provisioningState, resourceSets, tags, totalUsage, type, uniqueIdentifier);
        }
    }
}
