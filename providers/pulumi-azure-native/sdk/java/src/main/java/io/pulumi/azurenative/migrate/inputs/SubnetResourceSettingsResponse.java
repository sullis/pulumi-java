// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate.inputs;

import io.pulumi.azurenative.migrate.inputs.NsgReferenceResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Defines the virtual network subnets resource settings.
 * 
 */
public final class SubnetResourceSettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final SubnetResourceSettingsResponse Empty = new SubnetResourceSettingsResponse();

    /**
     * Gets or sets address prefix for the subnet.
     * 
     */
    @InputImport(name="addressPrefix")
    private final @Nullable String addressPrefix;

    public Optional<String> getAddressPrefix() {
        return this.addressPrefix == null ? Optional.empty() : Optional.ofNullable(this.addressPrefix);
    }

    /**
     * Gets or sets the Subnet name.
     * 
     */
    @InputImport(name="name")
    private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * Defines reference to NSG.
     * 
     */
    @InputImport(name="networkSecurityGroup")
    private final @Nullable NsgReferenceResponse networkSecurityGroup;

    public Optional<NsgReferenceResponse> getNetworkSecurityGroup() {
        return this.networkSecurityGroup == null ? Optional.empty() : Optional.ofNullable(this.networkSecurityGroup);
    }

    public SubnetResourceSettingsResponse(
        @Nullable String addressPrefix,
        @Nullable String name,
        @Nullable NsgReferenceResponse networkSecurityGroup) {
        this.addressPrefix = addressPrefix;
        this.name = name;
        this.networkSecurityGroup = networkSecurityGroup;
    }

    private SubnetResourceSettingsResponse() {
        this.addressPrefix = null;
        this.name = null;
        this.networkSecurityGroup = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubnetResourceSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String addressPrefix;
        private @Nullable String name;
        private @Nullable NsgReferenceResponse networkSecurityGroup;

        public Builder() {
    	      // Empty
        }

        public Builder(SubnetResourceSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addressPrefix = defaults.addressPrefix;
    	      this.name = defaults.name;
    	      this.networkSecurityGroup = defaults.networkSecurityGroup;
        }

        public Builder setAddressPrefix(@Nullable String addressPrefix) {
            this.addressPrefix = addressPrefix;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setNetworkSecurityGroup(@Nullable NsgReferenceResponse networkSecurityGroup) {
            this.networkSecurityGroup = networkSecurityGroup;
            return this;
        }

        public SubnetResourceSettingsResponse build() {
            return new SubnetResourceSettingsResponse(addressPrefix, name, networkSecurityGroup);
        }
    }
}
