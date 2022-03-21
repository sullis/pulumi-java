// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hybridnetwork.inputs;

import io.pulumi.azurenative.hybridnetwork.inputs.CustomProfileResponse;
import io.pulumi.azurenative.hybridnetwork.inputs.NetworkInterfaceResponse;
import io.pulumi.azurenative.hybridnetwork.inputs.OsProfileResponse;
import io.pulumi.azurenative.hybridnetwork.inputs.StorageProfileResponse;
import io.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Network function role configuration.
 * 
 */
public final class NetworkFunctionRoleConfigurationResponse extends io.pulumi.resources.InvokeArgs {

    public static final NetworkFunctionRoleConfigurationResponse Empty = new NetworkFunctionRoleConfigurationResponse();

    /**
     * Specifies the custom settings for the virtual machine.
     * 
     */
    @Import(name="customProfile")
      private final @Nullable CustomProfileResponse customProfile;

    public Optional<CustomProfileResponse> getCustomProfile() {
        return this.customProfile == null ? Optional.empty() : Optional.ofNullable(this.customProfile);
    }

    /**
     * The network interface configurations.
     * 
     */
    @Import(name="networkInterfaces")
      private final @Nullable List<NetworkInterfaceResponse> networkInterfaces;

    public List<NetworkInterfaceResponse> getNetworkInterfaces() {
        return this.networkInterfaces == null ? List.of() : this.networkInterfaces;
    }

    /**
     * Specifies the operating system settings for the role instance. This value can be updated during the deployment of network function.
     * 
     */
    @Import(name="osProfile")
      private final @Nullable OsProfileResponse osProfile;

    public Optional<OsProfileResponse> getOsProfile() {
        return this.osProfile == null ? Optional.empty() : Optional.ofNullable(this.osProfile);
    }

    /**
     * The name of the network function role.
     * 
     */
    @Import(name="roleName")
      private final @Nullable String roleName;

    public Optional<String> getRoleName() {
        return this.roleName == null ? Optional.empty() : Optional.ofNullable(this.roleName);
    }

    /**
     * Role type.
     * 
     */
    @Import(name="roleType")
      private final @Nullable String roleType;

    public Optional<String> getRoleType() {
        return this.roleType == null ? Optional.empty() : Optional.ofNullable(this.roleType);
    }

    /**
     * Specifies the storage settings for the virtual machine disks.
     * 
     */
    @Import(name="storageProfile")
      private final @Nullable StorageProfileResponse storageProfile;

    public Optional<StorageProfileResponse> getStorageProfile() {
        return this.storageProfile == null ? Optional.empty() : Optional.ofNullable(this.storageProfile);
    }

    /**
     * The user parameters for customers. The format of user data parameters has to be matched with the provided user data template.
     * 
     */
    @Import(name="userDataParameters")
      private final @Nullable Object userDataParameters;

    public Optional<Object> getUserDataParameters() {
        return this.userDataParameters == null ? Optional.empty() : Optional.ofNullable(this.userDataParameters);
    }

    /**
     * The user data template for customers. This is a json schema template describing the format and data type of user data parameters.
     * 
     */
    @Import(name="userDataTemplate")
      private final @Nullable Object userDataTemplate;

    public Optional<Object> getUserDataTemplate() {
        return this.userDataTemplate == null ? Optional.empty() : Optional.ofNullable(this.userDataTemplate);
    }

    /**
     * The size of the virtual machine.
     * 
     */
    @Import(name="virtualMachineSize")
      private final @Nullable String virtualMachineSize;

    public Optional<String> getVirtualMachineSize() {
        return this.virtualMachineSize == null ? Optional.empty() : Optional.ofNullable(this.virtualMachineSize);
    }

    public NetworkFunctionRoleConfigurationResponse(
        @Nullable CustomProfileResponse customProfile,
        @Nullable List<NetworkInterfaceResponse> networkInterfaces,
        @Nullable OsProfileResponse osProfile,
        @Nullable String roleName,
        @Nullable String roleType,
        @Nullable StorageProfileResponse storageProfile,
        @Nullable Object userDataParameters,
        @Nullable Object userDataTemplate,
        @Nullable String virtualMachineSize) {
        this.customProfile = customProfile;
        this.networkInterfaces = networkInterfaces;
        this.osProfile = osProfile;
        this.roleName = roleName;
        this.roleType = roleType;
        this.storageProfile = storageProfile;
        this.userDataParameters = userDataParameters;
        this.userDataTemplate = userDataTemplate;
        this.virtualMachineSize = virtualMachineSize;
    }

    private NetworkFunctionRoleConfigurationResponse() {
        this.customProfile = null;
        this.networkInterfaces = List.of();
        this.osProfile = null;
        this.roleName = null;
        this.roleType = null;
        this.storageProfile = null;
        this.userDataParameters = null;
        this.userDataTemplate = null;
        this.virtualMachineSize = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkFunctionRoleConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable CustomProfileResponse customProfile;
        private @Nullable List<NetworkInterfaceResponse> networkInterfaces;
        private @Nullable OsProfileResponse osProfile;
        private @Nullable String roleName;
        private @Nullable String roleType;
        private @Nullable StorageProfileResponse storageProfile;
        private @Nullable Object userDataParameters;
        private @Nullable Object userDataTemplate;
        private @Nullable String virtualMachineSize;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkFunctionRoleConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customProfile = defaults.customProfile;
    	      this.networkInterfaces = defaults.networkInterfaces;
    	      this.osProfile = defaults.osProfile;
    	      this.roleName = defaults.roleName;
    	      this.roleType = defaults.roleType;
    	      this.storageProfile = defaults.storageProfile;
    	      this.userDataParameters = defaults.userDataParameters;
    	      this.userDataTemplate = defaults.userDataTemplate;
    	      this.virtualMachineSize = defaults.virtualMachineSize;
        }

        public Builder customProfile(@Nullable CustomProfileResponse customProfile) {
            this.customProfile = customProfile;
            return this;
        }
        public Builder networkInterfaces(@Nullable List<NetworkInterfaceResponse> networkInterfaces) {
            this.networkInterfaces = networkInterfaces;
            return this;
        }
        public Builder networkInterfaces(NetworkInterfaceResponse... networkInterfaces) {
            return networkInterfaces(List.of(networkInterfaces));
        }
        public Builder osProfile(@Nullable OsProfileResponse osProfile) {
            this.osProfile = osProfile;
            return this;
        }
        public Builder roleName(@Nullable String roleName) {
            this.roleName = roleName;
            return this;
        }
        public Builder roleType(@Nullable String roleType) {
            this.roleType = roleType;
            return this;
        }
        public Builder storageProfile(@Nullable StorageProfileResponse storageProfile) {
            this.storageProfile = storageProfile;
            return this;
        }
        public Builder userDataParameters(@Nullable Object userDataParameters) {
            this.userDataParameters = userDataParameters;
            return this;
        }
        public Builder userDataTemplate(@Nullable Object userDataTemplate) {
            this.userDataTemplate = userDataTemplate;
            return this;
        }
        public Builder virtualMachineSize(@Nullable String virtualMachineSize) {
            this.virtualMachineSize = virtualMachineSize;
            return this;
        }        public NetworkFunctionRoleConfigurationResponse build() {
            return new NetworkFunctionRoleConfigurationResponse(customProfile, networkInterfaces, osProfile, roleName, roleType, storageProfile, userDataParameters, userDataTemplate, virtualMachineSize);
        }
    }
}
