// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.labservices;

import io.pulumi.azurenative.labservices.enums.LabUserAccessMode;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LabArgs extends io.pulumi.resources.ResourceArgs {

    public static final LabArgs Empty = new LabArgs();

    /**
     * The name of the lab Account.
     * 
     */
    @InputImport(name="labAccountName", required=true)
      private final Input<String> labAccountName;

    public Input<String> getLabAccountName() {
        return this.labAccountName;
    }

    /**
     * The name of the lab.
     * 
     */
    @InputImport(name="labName")
      private final @Nullable Input<String> labName;

    public Input<String> getLabName() {
        return this.labName == null ? Input.empty() : this.labName;
    }

    /**
     * The location of the resource.
     * 
     */
    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * Maximum number of users allowed in the lab.
     * 
     */
    @InputImport(name="maxUsersInLab")
      private final @Nullable Input<Integer> maxUsersInLab;

    public Input<Integer> getMaxUsersInLab() {
        return this.maxUsersInLab == null ? Input.empty() : this.maxUsersInLab;
    }

    /**
     * The provisioning status of the resource.
     * 
     */
    @InputImport(name="provisioningState")
      private final @Nullable Input<String> provisioningState;

    public Input<String> getProvisioningState() {
        return this.provisioningState == null ? Input.empty() : this.provisioningState;
    }

    /**
     * The name of the resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The tags of the resource.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * The unique immutable identifier of a resource (Guid).
     * 
     */
    @InputImport(name="uniqueIdentifier")
      private final @Nullable Input<String> uniqueIdentifier;

    public Input<String> getUniqueIdentifier() {
        return this.uniqueIdentifier == null ? Input.empty() : this.uniqueIdentifier;
    }

    /**
     * Maximum duration a user can use an environment for in the lab.
     * 
     */
    @InputImport(name="usageQuota")
      private final @Nullable Input<String> usageQuota;

    public Input<String> getUsageQuota() {
        return this.usageQuota == null ? Input.empty() : this.usageQuota;
    }

    /**
     * Lab user access mode (open to all vs. restricted to those listed on the lab).
     * 
     */
    @InputImport(name="userAccessMode")
      private final @Nullable Input<Either<String,LabUserAccessMode>> userAccessMode;

    public Input<Either<String,LabUserAccessMode>> getUserAccessMode() {
        return this.userAccessMode == null ? Input.empty() : this.userAccessMode;
    }

    public LabArgs(
        Input<String> labAccountName,
        @Nullable Input<String> labName,
        @Nullable Input<String> location,
        @Nullable Input<Integer> maxUsersInLab,
        @Nullable Input<String> provisioningState,
        Input<String> resourceGroupName,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<String> uniqueIdentifier,
        @Nullable Input<String> usageQuota,
        @Nullable Input<Either<String,LabUserAccessMode>> userAccessMode) {
        this.labAccountName = Objects.requireNonNull(labAccountName, "expected parameter 'labAccountName' to be non-null");
        this.labName = labName;
        this.location = location;
        this.maxUsersInLab = maxUsersInLab;
        this.provisioningState = provisioningState;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
        this.uniqueIdentifier = uniqueIdentifier;
        this.usageQuota = usageQuota;
        this.userAccessMode = userAccessMode;
    }

    private LabArgs() {
        this.labAccountName = Input.empty();
        this.labName = Input.empty();
        this.location = Input.empty();
        this.maxUsersInLab = Input.empty();
        this.provisioningState = Input.empty();
        this.resourceGroupName = Input.empty();
        this.tags = Input.empty();
        this.uniqueIdentifier = Input.empty();
        this.usageQuota = Input.empty();
        this.userAccessMode = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LabArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> labAccountName;
        private @Nullable Input<String> labName;
        private @Nullable Input<String> location;
        private @Nullable Input<Integer> maxUsersInLab;
        private @Nullable Input<String> provisioningState;
        private Input<String> resourceGroupName;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<String> uniqueIdentifier;
        private @Nullable Input<String> usageQuota;
        private @Nullable Input<Either<String,LabUserAccessMode>> userAccessMode;

        public Builder() {
    	      // Empty
        }

        public Builder(LabArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.labAccountName = defaults.labAccountName;
    	      this.labName = defaults.labName;
    	      this.location = defaults.location;
    	      this.maxUsersInLab = defaults.maxUsersInLab;
    	      this.provisioningState = defaults.provisioningState;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
    	      this.uniqueIdentifier = defaults.uniqueIdentifier;
    	      this.usageQuota = defaults.usageQuota;
    	      this.userAccessMode = defaults.userAccessMode;
        }

        public Builder setLabAccountName(Input<String> labAccountName) {
            this.labAccountName = Objects.requireNonNull(labAccountName);
            return this;
        }

        public Builder setLabAccountName(String labAccountName) {
            this.labAccountName = Input.of(Objects.requireNonNull(labAccountName));
            return this;
        }

        public Builder setLabName(@Nullable Input<String> labName) {
            this.labName = labName;
            return this;
        }

        public Builder setLabName(@Nullable String labName) {
            this.labName = Input.ofNullable(labName);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setMaxUsersInLab(@Nullable Input<Integer> maxUsersInLab) {
            this.maxUsersInLab = maxUsersInLab;
            return this;
        }

        public Builder setMaxUsersInLab(@Nullable Integer maxUsersInLab) {
            this.maxUsersInLab = Input.ofNullable(maxUsersInLab);
            return this;
        }

        public Builder setProvisioningState(@Nullable Input<String> provisioningState) {
            this.provisioningState = provisioningState;
            return this;
        }

        public Builder setProvisioningState(@Nullable String provisioningState) {
            this.provisioningState = Input.ofNullable(provisioningState);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setUniqueIdentifier(@Nullable Input<String> uniqueIdentifier) {
            this.uniqueIdentifier = uniqueIdentifier;
            return this;
        }

        public Builder setUniqueIdentifier(@Nullable String uniqueIdentifier) {
            this.uniqueIdentifier = Input.ofNullable(uniqueIdentifier);
            return this;
        }

        public Builder setUsageQuota(@Nullable Input<String> usageQuota) {
            this.usageQuota = usageQuota;
            return this;
        }

        public Builder setUsageQuota(@Nullable String usageQuota) {
            this.usageQuota = Input.ofNullable(usageQuota);
            return this;
        }

        public Builder setUserAccessMode(@Nullable Input<Either<String,LabUserAccessMode>> userAccessMode) {
            this.userAccessMode = userAccessMode;
            return this;
        }

        public Builder setUserAccessMode(@Nullable Either<String,LabUserAccessMode> userAccessMode) {
            this.userAccessMode = Input.ofNullable(userAccessMode);
            return this;
        }
        public LabArgs build() {
            return new LabArgs(labAccountName, labName, location, maxUsersInLab, provisioningState, resourceGroupName, tags, uniqueIdentifier, usageQuota, userAccessMode);
        }
    }
}