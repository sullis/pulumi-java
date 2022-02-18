// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge;

import io.pulumi.azurenative.databoxedge.enums.RoleStatus;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CloudEdgeManagementRoleArgs extends io.pulumi.resources.ResourceArgs {

    public static final CloudEdgeManagementRoleArgs Empty = new CloudEdgeManagementRoleArgs();

    /**
     * The device name.
     * 
     */
    @InputImport(name="deviceName", required=true)
    private final Input<String> deviceName;

    public Input<String> getDeviceName() {
        return this.deviceName;
    }

    /**
     * Role type.
     * Expected value is 'CloudEdgeManagement'.
     * 
     */
    @InputImport(name="kind", required=true)
    private final Input<String> kind;

    public Input<String> getKind() {
        return this.kind;
    }

    /**
     * The role name.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The resource group name.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Role status.
     * 
     */
    @InputImport(name="roleStatus", required=true)
    private final Input<Either<String,RoleStatus>> roleStatus;

    public Input<Either<String,RoleStatus>> getRoleStatus() {
        return this.roleStatus;
    }

    public CloudEdgeManagementRoleArgs(
        Input<String> deviceName,
        Input<String> kind,
        @Nullable Input<String> name,
        Input<String> resourceGroupName,
        Input<Either<String,RoleStatus>> roleStatus) {
        this.deviceName = Objects.requireNonNull(deviceName, "expected parameter 'deviceName' to be non-null");
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.name = name;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.roleStatus = Objects.requireNonNull(roleStatus, "expected parameter 'roleStatus' to be non-null");
    }

    private CloudEdgeManagementRoleArgs() {
        this.deviceName = Input.empty();
        this.kind = Input.empty();
        this.name = Input.empty();
        this.resourceGroupName = Input.empty();
        this.roleStatus = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloudEdgeManagementRoleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> deviceName;
        private Input<String> kind;
        private @Nullable Input<String> name;
        private Input<String> resourceGroupName;
        private Input<Either<String,RoleStatus>> roleStatus;

        public Builder() {
    	      // Empty
        }

        public Builder(CloudEdgeManagementRoleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deviceName = defaults.deviceName;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.roleStatus = defaults.roleStatus;
        }

        public Builder setDeviceName(Input<String> deviceName) {
            this.deviceName = Objects.requireNonNull(deviceName);
            return this;
        }

        public Builder setDeviceName(String deviceName) {
            this.deviceName = Input.of(Objects.requireNonNull(deviceName));
            return this;
        }

        public Builder setKind(Input<String> kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Input.of(Objects.requireNonNull(kind));
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
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

        public Builder setRoleStatus(Input<Either<String,RoleStatus>> roleStatus) {
            this.roleStatus = Objects.requireNonNull(roleStatus);
            return this;
        }

        public Builder setRoleStatus(Either<String,RoleStatus> roleStatus) {
            this.roleStatus = Input.of(Objects.requireNonNull(roleStatus));
            return this;
        }

        public CloudEdgeManagementRoleArgs build() {
            return new CloudEdgeManagementRoleArgs(deviceName, kind, name, resourceGroupName, roleStatus);
        }
    }
}
