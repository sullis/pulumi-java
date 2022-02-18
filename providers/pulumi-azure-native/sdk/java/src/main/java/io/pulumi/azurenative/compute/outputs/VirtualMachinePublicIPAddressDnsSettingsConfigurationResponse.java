// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class VirtualMachinePublicIPAddressDnsSettingsConfigurationResponse {
    /**
     * The Domain name label prefix of the PublicIPAddress resources that will be created. The generated name label is the concatenation of the domain name label and vm network profile unique ID.
     * 
     */
    private final String domainNameLabel;

    @OutputCustomType.Constructor({"domainNameLabel"})
    private VirtualMachinePublicIPAddressDnsSettingsConfigurationResponse(String domainNameLabel) {
        this.domainNameLabel = Objects.requireNonNull(domainNameLabel);
    }

    /**
     * The Domain name label prefix of the PublicIPAddress resources that will be created. The generated name label is the concatenation of the domain name label and vm network profile unique ID.
     * 
     */
    public String getDomainNameLabel() {
        return this.domainNameLabel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachinePublicIPAddressDnsSettingsConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String domainNameLabel;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualMachinePublicIPAddressDnsSettingsConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domainNameLabel = defaults.domainNameLabel;
        }

        public Builder setDomainNameLabel(String domainNameLabel) {
            this.domainNameLabel = Objects.requireNonNull(domainNameLabel);
            return this;
        }

        public VirtualMachinePublicIPAddressDnsSettingsConfigurationResponse build() {
            return new VirtualMachinePublicIPAddressDnsSettingsConfigurationResponse(domainNameLabel);
        }
    }
}
