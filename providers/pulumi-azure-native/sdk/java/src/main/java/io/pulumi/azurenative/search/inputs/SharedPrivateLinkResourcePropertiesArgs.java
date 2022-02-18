// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.search.inputs;

import io.pulumi.azurenative.search.enums.SharedPrivateLinkResourceProvisioningState;
import io.pulumi.azurenative.search.enums.SharedPrivateLinkResourceStatus;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes the properties of an existing Shared Private Link Resource managed by the Azure Cognitive Search service.
 * 
 */
public final class SharedPrivateLinkResourcePropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final SharedPrivateLinkResourcePropertiesArgs Empty = new SharedPrivateLinkResourcePropertiesArgs();

    /**
     * The group id from the provider of resource the shared private link resource is for.
     * 
     */
    @InputImport(name="groupId")
    private final @Nullable Input<String> groupId;

    public Input<String> getGroupId() {
        return this.groupId == null ? Input.empty() : this.groupId;
    }

    /**
     * The resource id of the resource the shared private link resource is for.
     * 
     */
    @InputImport(name="privateLinkResourceId")
    private final @Nullable Input<String> privateLinkResourceId;

    public Input<String> getPrivateLinkResourceId() {
        return this.privateLinkResourceId == null ? Input.empty() : this.privateLinkResourceId;
    }

    /**
     * The provisioning state of the shared private link resource. Can be Updating, Deleting, Failed, Succeeded or Incomplete.
     * 
     */
    @InputImport(name="provisioningState")
    private final @Nullable Input<SharedPrivateLinkResourceProvisioningState> provisioningState;

    public Input<SharedPrivateLinkResourceProvisioningState> getProvisioningState() {
        return this.provisioningState == null ? Input.empty() : this.provisioningState;
    }

    /**
     * The request message for requesting approval of the shared private link resource.
     * 
     */
    @InputImport(name="requestMessage")
    private final @Nullable Input<String> requestMessage;

    public Input<String> getRequestMessage() {
        return this.requestMessage == null ? Input.empty() : this.requestMessage;
    }

    /**
     * Optional. Can be used to specify the Azure Resource Manager location of the resource to which a shared private link is to be created. This is only required for those resources whose DNS configuration are regional (such as Azure Kubernetes Service).
     * 
     */
    @InputImport(name="resourceRegion")
    private final @Nullable Input<String> resourceRegion;

    public Input<String> getResourceRegion() {
        return this.resourceRegion == null ? Input.empty() : this.resourceRegion;
    }

    /**
     * Status of the shared private link resource. Can be Pending, Approved, Rejected or Disconnected.
     * 
     */
    @InputImport(name="status")
    private final @Nullable Input<SharedPrivateLinkResourceStatus> status;

    public Input<SharedPrivateLinkResourceStatus> getStatus() {
        return this.status == null ? Input.empty() : this.status;
    }

    public SharedPrivateLinkResourcePropertiesArgs(
        @Nullable Input<String> groupId,
        @Nullable Input<String> privateLinkResourceId,
        @Nullable Input<SharedPrivateLinkResourceProvisioningState> provisioningState,
        @Nullable Input<String> requestMessage,
        @Nullable Input<String> resourceRegion,
        @Nullable Input<SharedPrivateLinkResourceStatus> status) {
        this.groupId = groupId;
        this.privateLinkResourceId = privateLinkResourceId;
        this.provisioningState = provisioningState;
        this.requestMessage = requestMessage;
        this.resourceRegion = resourceRegion;
        this.status = status;
    }

    private SharedPrivateLinkResourcePropertiesArgs() {
        this.groupId = Input.empty();
        this.privateLinkResourceId = Input.empty();
        this.provisioningState = Input.empty();
        this.requestMessage = Input.empty();
        this.resourceRegion = Input.empty();
        this.status = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SharedPrivateLinkResourcePropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> groupId;
        private @Nullable Input<String> privateLinkResourceId;
        private @Nullable Input<SharedPrivateLinkResourceProvisioningState> provisioningState;
        private @Nullable Input<String> requestMessage;
        private @Nullable Input<String> resourceRegion;
        private @Nullable Input<SharedPrivateLinkResourceStatus> status;

        public Builder() {
    	      // Empty
        }

        public Builder(SharedPrivateLinkResourcePropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groupId = defaults.groupId;
    	      this.privateLinkResourceId = defaults.privateLinkResourceId;
    	      this.provisioningState = defaults.provisioningState;
    	      this.requestMessage = defaults.requestMessage;
    	      this.resourceRegion = defaults.resourceRegion;
    	      this.status = defaults.status;
        }

        public Builder setGroupId(@Nullable Input<String> groupId) {
            this.groupId = groupId;
            return this;
        }

        public Builder setGroupId(@Nullable String groupId) {
            this.groupId = Input.ofNullable(groupId);
            return this;
        }

        public Builder setPrivateLinkResourceId(@Nullable Input<String> privateLinkResourceId) {
            this.privateLinkResourceId = privateLinkResourceId;
            return this;
        }

        public Builder setPrivateLinkResourceId(@Nullable String privateLinkResourceId) {
            this.privateLinkResourceId = Input.ofNullable(privateLinkResourceId);
            return this;
        }

        public Builder setProvisioningState(@Nullable Input<SharedPrivateLinkResourceProvisioningState> provisioningState) {
            this.provisioningState = provisioningState;
            return this;
        }

        public Builder setProvisioningState(@Nullable SharedPrivateLinkResourceProvisioningState provisioningState) {
            this.provisioningState = Input.ofNullable(provisioningState);
            return this;
        }

        public Builder setRequestMessage(@Nullable Input<String> requestMessage) {
            this.requestMessage = requestMessage;
            return this;
        }

        public Builder setRequestMessage(@Nullable String requestMessage) {
            this.requestMessage = Input.ofNullable(requestMessage);
            return this;
        }

        public Builder setResourceRegion(@Nullable Input<String> resourceRegion) {
            this.resourceRegion = resourceRegion;
            return this;
        }

        public Builder setResourceRegion(@Nullable String resourceRegion) {
            this.resourceRegion = Input.ofNullable(resourceRegion);
            return this;
        }

        public Builder setStatus(@Nullable Input<SharedPrivateLinkResourceStatus> status) {
            this.status = status;
            return this;
        }

        public Builder setStatus(@Nullable SharedPrivateLinkResourceStatus status) {
            this.status = Input.ofNullable(status);
            return this;
        }

        public SharedPrivateLinkResourcePropertiesArgs build() {
            return new SharedPrivateLinkResourcePropertiesArgs(groupId, privateLinkResourceId, provisioningState, requestMessage, resourceRegion, status);
        }
    }
}
