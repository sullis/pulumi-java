// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.outputs;

import io.pulumi.azurenative.compute.outputs.PublicIPAddressSkuResponse;
import io.pulumi.azurenative.compute.outputs.SubResourceResponse;
import io.pulumi.azurenative.compute.outputs.VirtualMachineScaleSetIpTagResponse;
import io.pulumi.azurenative.compute.outputs.VirtualMachineScaleSetPublicIPAddressConfigurationDnsSettingsResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class VirtualMachineScaleSetPublicIPAddressConfigurationResponse {
    /**
     * Specify what happens to the public IP when the VM is deleted
     * 
     */
    private final @Nullable String deleteOption;
    /**
     * The dns settings to be applied on the publicIP addresses .
     * 
     */
    private final @Nullable VirtualMachineScaleSetPublicIPAddressConfigurationDnsSettingsResponse dnsSettings;
    /**
     * The idle timeout of the public IP address.
     * 
     */
    private final @Nullable Integer idleTimeoutInMinutes;
    /**
     * The list of IP tags associated with the public IP address.
     * 
     */
    private final @Nullable List<VirtualMachineScaleSetIpTagResponse> ipTags;
    /**
     * The publicIP address configuration name.
     * 
     */
    private final String name;
    /**
     * Available from Api-Version 2019-07-01 onwards, it represents whether the specific ipconfiguration is IPv4 or IPv6. Default is taken as IPv4. Possible values are: 'IPv4' and 'IPv6'.
     * 
     */
    private final @Nullable String publicIPAddressVersion;
    /**
     * The PublicIPPrefix from which to allocate publicIP addresses.
     * 
     */
    private final @Nullable SubResourceResponse publicIPPrefix;
    /**
     * Describes the public IP Sku
     * 
     */
    private final @Nullable PublicIPAddressSkuResponse sku;

    @OutputCustomType.Constructor({"deleteOption","dnsSettings","idleTimeoutInMinutes","ipTags","name","publicIPAddressVersion","publicIPPrefix","sku"})
    private VirtualMachineScaleSetPublicIPAddressConfigurationResponse(
        @Nullable String deleteOption,
        @Nullable VirtualMachineScaleSetPublicIPAddressConfigurationDnsSettingsResponse dnsSettings,
        @Nullable Integer idleTimeoutInMinutes,
        @Nullable List<VirtualMachineScaleSetIpTagResponse> ipTags,
        String name,
        @Nullable String publicIPAddressVersion,
        @Nullable SubResourceResponse publicIPPrefix,
        @Nullable PublicIPAddressSkuResponse sku) {
        this.deleteOption = deleteOption;
        this.dnsSettings = dnsSettings;
        this.idleTimeoutInMinutes = idleTimeoutInMinutes;
        this.ipTags = ipTags;
        this.name = Objects.requireNonNull(name);
        this.publicIPAddressVersion = publicIPAddressVersion;
        this.publicIPPrefix = publicIPPrefix;
        this.sku = sku;
    }

    /**
     * Specify what happens to the public IP when the VM is deleted
     * 
    */
    public Optional<String> getDeleteOption() {
        return Optional.ofNullable(this.deleteOption);
    }
    /**
     * The dns settings to be applied on the publicIP addresses .
     * 
    */
    public Optional<VirtualMachineScaleSetPublicIPAddressConfigurationDnsSettingsResponse> getDnsSettings() {
        return Optional.ofNullable(this.dnsSettings);
    }
    /**
     * The idle timeout of the public IP address.
     * 
    */
    public Optional<Integer> getIdleTimeoutInMinutes() {
        return Optional.ofNullable(this.idleTimeoutInMinutes);
    }
    /**
     * The list of IP tags associated with the public IP address.
     * 
    */
    public List<VirtualMachineScaleSetIpTagResponse> getIpTags() {
        return this.ipTags == null ? List.of() : this.ipTags;
    }
    /**
     * The publicIP address configuration name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Available from Api-Version 2019-07-01 onwards, it represents whether the specific ipconfiguration is IPv4 or IPv6. Default is taken as IPv4. Possible values are: 'IPv4' and 'IPv6'.
     * 
    */
    public Optional<String> getPublicIPAddressVersion() {
        return Optional.ofNullable(this.publicIPAddressVersion);
    }
    /**
     * The PublicIPPrefix from which to allocate publicIP addresses.
     * 
    */
    public Optional<SubResourceResponse> getPublicIPPrefix() {
        return Optional.ofNullable(this.publicIPPrefix);
    }
    /**
     * Describes the public IP Sku
     * 
    */
    public Optional<PublicIPAddressSkuResponse> getSku() {
        return Optional.ofNullable(this.sku);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachineScaleSetPublicIPAddressConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String deleteOption;
        private @Nullable VirtualMachineScaleSetPublicIPAddressConfigurationDnsSettingsResponse dnsSettings;
        private @Nullable Integer idleTimeoutInMinutes;
        private @Nullable List<VirtualMachineScaleSetIpTagResponse> ipTags;
        private String name;
        private @Nullable String publicIPAddressVersion;
        private @Nullable SubResourceResponse publicIPPrefix;
        private @Nullable PublicIPAddressSkuResponse sku;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualMachineScaleSetPublicIPAddressConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deleteOption = defaults.deleteOption;
    	      this.dnsSettings = defaults.dnsSettings;
    	      this.idleTimeoutInMinutes = defaults.idleTimeoutInMinutes;
    	      this.ipTags = defaults.ipTags;
    	      this.name = defaults.name;
    	      this.publicIPAddressVersion = defaults.publicIPAddressVersion;
    	      this.publicIPPrefix = defaults.publicIPPrefix;
    	      this.sku = defaults.sku;
        }

        public Builder setDeleteOption(@Nullable String deleteOption) {
            this.deleteOption = deleteOption;
            return this;
        }

        public Builder setDnsSettings(@Nullable VirtualMachineScaleSetPublicIPAddressConfigurationDnsSettingsResponse dnsSettings) {
            this.dnsSettings = dnsSettings;
            return this;
        }

        public Builder setIdleTimeoutInMinutes(@Nullable Integer idleTimeoutInMinutes) {
            this.idleTimeoutInMinutes = idleTimeoutInMinutes;
            return this;
        }

        public Builder setIpTags(@Nullable List<VirtualMachineScaleSetIpTagResponse> ipTags) {
            this.ipTags = ipTags;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPublicIPAddressVersion(@Nullable String publicIPAddressVersion) {
            this.publicIPAddressVersion = publicIPAddressVersion;
            return this;
        }

        public Builder setPublicIPPrefix(@Nullable SubResourceResponse publicIPPrefix) {
            this.publicIPPrefix = publicIPPrefix;
            return this;
        }

        public Builder setSku(@Nullable PublicIPAddressSkuResponse sku) {
            this.sku = sku;
            return this;
        }
        public VirtualMachineScaleSetPublicIPAddressConfigurationResponse build() {
            return new VirtualMachineScaleSetPublicIPAddressConfigurationResponse(deleteOption, dnsSettings, idleTimeoutInMinutes, ipTags, name, publicIPAddressVersion, publicIPPrefix, sku);
        }
    }
}