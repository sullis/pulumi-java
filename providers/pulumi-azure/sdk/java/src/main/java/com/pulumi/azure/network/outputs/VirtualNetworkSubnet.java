// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VirtualNetworkSubnet {
    /**
     * @return The address prefix to use for the subnet.
     * 
     */
    private final String addressPrefix;
    /**
     * @return The ID of DDoS Protection Plan.
     * 
     */
    private final @Nullable String id;
    /**
     * @return The name of the virtual network. Changing this forces a new resource to be created.
     * 
     */
    private final String name;
    /**
     * @return The Network Security Group to associate with the subnet. (Referenced by `id`, ie. `azurerm_network_security_group.example.id`)
     * 
     */
    private final @Nullable String securityGroup;

    @CustomType.Constructor
    private VirtualNetworkSubnet(
        @CustomType.Parameter("addressPrefix") String addressPrefix,
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("securityGroup") @Nullable String securityGroup) {
        this.addressPrefix = addressPrefix;
        this.id = id;
        this.name = name;
        this.securityGroup = securityGroup;
    }

    /**
     * @return The address prefix to use for the subnet.
     * 
     */
    public String addressPrefix() {
        return this.addressPrefix;
    }
    /**
     * @return The ID of DDoS Protection Plan.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return The name of the virtual network. Changing this forces a new resource to be created.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The Network Security Group to associate with the subnet. (Referenced by `id`, ie. `azurerm_network_security_group.example.id`)
     * 
     */
    public Optional<String> securityGroup() {
        return Optional.ofNullable(this.securityGroup);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNetworkSubnet defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String addressPrefix;
        private @Nullable String id;
        private String name;
        private @Nullable String securityGroup;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNetworkSubnet defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addressPrefix = defaults.addressPrefix;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.securityGroup = defaults.securityGroup;
        }

        public Builder addressPrefix(String addressPrefix) {
            this.addressPrefix = Objects.requireNonNull(addressPrefix);
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder securityGroup(@Nullable String securityGroup) {
            this.securityGroup = securityGroup;
            return this;
        }        public VirtualNetworkSubnet build() {
            return new VirtualNetworkSubnet(addressPrefix, id, name, securityGroup);
        }
    }
}
