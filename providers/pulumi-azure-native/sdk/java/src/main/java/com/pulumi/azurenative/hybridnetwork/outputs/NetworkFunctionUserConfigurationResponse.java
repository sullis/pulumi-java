// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.hybridnetwork.outputs;

import com.pulumi.azurenative.hybridnetwork.outputs.NetworkFunctionUserConfigurationResponseOsProfile;
import com.pulumi.azurenative.hybridnetwork.outputs.NetworkInterfaceResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NetworkFunctionUserConfigurationResponse {
    /**
     * @return The network interface configuration.
     * 
     */
    private final @Nullable List<NetworkInterfaceResponse> networkInterfaces;
    /**
     * @return Specifies the operating system settings for the role instance.
     * 
     */
    private final @Nullable NetworkFunctionUserConfigurationResponseOsProfile osProfile;
    /**
     * @return The name of the network function role.
     * 
     */
    private final @Nullable String roleName;
    /**
     * @return The user data parameters from the customer.
     * 
     */
    private final @Nullable Object userDataParameters;

    @CustomType.Constructor
    private NetworkFunctionUserConfigurationResponse(
        @CustomType.Parameter("networkInterfaces") @Nullable List<NetworkInterfaceResponse> networkInterfaces,
        @CustomType.Parameter("osProfile") @Nullable NetworkFunctionUserConfigurationResponseOsProfile osProfile,
        @CustomType.Parameter("roleName") @Nullable String roleName,
        @CustomType.Parameter("userDataParameters") @Nullable Object userDataParameters) {
        this.networkInterfaces = networkInterfaces;
        this.osProfile = osProfile;
        this.roleName = roleName;
        this.userDataParameters = userDataParameters;
    }

    /**
     * @return The network interface configuration.
     * 
     */
    public List<NetworkInterfaceResponse> networkInterfaces() {
        return this.networkInterfaces == null ? List.of() : this.networkInterfaces;
    }
    /**
     * @return Specifies the operating system settings for the role instance.
     * 
     */
    public Optional<NetworkFunctionUserConfigurationResponseOsProfile> osProfile() {
        return Optional.ofNullable(this.osProfile);
    }
    /**
     * @return The name of the network function role.
     * 
     */
    public Optional<String> roleName() {
        return Optional.ofNullable(this.roleName);
    }
    /**
     * @return The user data parameters from the customer.
     * 
     */
    public Optional<Object> userDataParameters() {
        return Optional.ofNullable(this.userDataParameters);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkFunctionUserConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<NetworkInterfaceResponse> networkInterfaces;
        private @Nullable NetworkFunctionUserConfigurationResponseOsProfile osProfile;
        private @Nullable String roleName;
        private @Nullable Object userDataParameters;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkFunctionUserConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.networkInterfaces = defaults.networkInterfaces;
    	      this.osProfile = defaults.osProfile;
    	      this.roleName = defaults.roleName;
    	      this.userDataParameters = defaults.userDataParameters;
        }

        public Builder networkInterfaces(@Nullable List<NetworkInterfaceResponse> networkInterfaces) {
            this.networkInterfaces = networkInterfaces;
            return this;
        }
        public Builder networkInterfaces(NetworkInterfaceResponse... networkInterfaces) {
            return networkInterfaces(List.of(networkInterfaces));
        }
        public Builder osProfile(@Nullable NetworkFunctionUserConfigurationResponseOsProfile osProfile) {
            this.osProfile = osProfile;
            return this;
        }
        public Builder roleName(@Nullable String roleName) {
            this.roleName = roleName;
            return this;
        }
        public Builder userDataParameters(@Nullable Object userDataParameters) {
            this.userDataParameters = userDataParameters;
            return this;
        }        public NetworkFunctionUserConfigurationResponse build() {
            return new NetworkFunctionUserConfigurationResponse(networkInterfaces, osProfile, roleName, userDataParameters);
        }
    }
}
