// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.labservices;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class UserArgs extends io.pulumi.resources.ResourceArgs {

    public static final UserArgs Empty = new UserArgs();

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
    @InputImport(name="labName", required=true)
    private final Input<String> labName;

    public Input<String> getLabName() {
        return this.labName;
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
     * The name of the user.
     * 
     */
    @InputImport(name="userName")
    private final @Nullable Input<String> userName;

    public Input<String> getUserName() {
        return this.userName == null ? Input.empty() : this.userName;
    }

    public UserArgs(
        Input<String> labAccountName,
        Input<String> labName,
        @Nullable Input<String> location,
        @Nullable Input<String> provisioningState,
        Input<String> resourceGroupName,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<String> uniqueIdentifier,
        @Nullable Input<String> userName) {
        this.labAccountName = Objects.requireNonNull(labAccountName, "expected parameter 'labAccountName' to be non-null");
        this.labName = Objects.requireNonNull(labName, "expected parameter 'labName' to be non-null");
        this.location = location;
        this.provisioningState = provisioningState;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
        this.uniqueIdentifier = uniqueIdentifier;
        this.userName = userName;
    }

    private UserArgs() {
        this.labAccountName = Input.empty();
        this.labName = Input.empty();
        this.location = Input.empty();
        this.provisioningState = Input.empty();
        this.resourceGroupName = Input.empty();
        this.tags = Input.empty();
        this.uniqueIdentifier = Input.empty();
        this.userName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> labAccountName;
        private Input<String> labName;
        private @Nullable Input<String> location;
        private @Nullable Input<String> provisioningState;
        private Input<String> resourceGroupName;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<String> uniqueIdentifier;
        private @Nullable Input<String> userName;

        public Builder() {
    	      // Empty
        }

        public Builder(UserArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.labAccountName = defaults.labAccountName;
    	      this.labName = defaults.labName;
    	      this.location = defaults.location;
    	      this.provisioningState = defaults.provisioningState;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
    	      this.uniqueIdentifier = defaults.uniqueIdentifier;
    	      this.userName = defaults.userName;
        }

        public Builder setLabAccountName(Input<String> labAccountName) {
            this.labAccountName = Objects.requireNonNull(labAccountName);
            return this;
        }

        public Builder setLabAccountName(String labAccountName) {
            this.labAccountName = Input.of(Objects.requireNonNull(labAccountName));
            return this;
        }

        public Builder setLabName(Input<String> labName) {
            this.labName = Objects.requireNonNull(labName);
            return this;
        }

        public Builder setLabName(String labName) {
            this.labName = Input.of(Objects.requireNonNull(labName));
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

        public Builder setUserName(@Nullable Input<String> userName) {
            this.userName = userName;
            return this;
        }

        public Builder setUserName(@Nullable String userName) {
            this.userName = Input.ofNullable(userName);
            return this;
        }

        public UserArgs build() {
            return new UserArgs(labAccountName, labName, location, provisioningState, resourceGroupName, tags, uniqueIdentifier, userName);
        }
    }
}
