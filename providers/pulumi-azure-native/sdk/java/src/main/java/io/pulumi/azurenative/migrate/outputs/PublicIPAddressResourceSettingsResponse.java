// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class PublicIPAddressResourceSettingsResponse {
    /**
     * Gets or sets the domain name label.
     * 
     */
    private final @Nullable String domainNameLabel;
    /**
     * Gets or sets the fully qualified domain name.
     * 
     */
    private final @Nullable String fqdn;
    /**
     * Gets or sets public IP allocation method.
     * 
     */
    private final @Nullable String publicIpAllocationMethod;
    /**
     * The resource type. For example, the value can be Microsoft.Compute/virtualMachines.
     * Expected value is 'Microsoft.Network/publicIPAddresses'.
     * 
     */
    private final String resourceType;
    /**
     * Gets or sets public IP sku.
     * 
     */
    private final @Nullable String sku;
    /**
     * Gets or sets the target Resource name.
     * 
     */
    private final String targetResourceName;
    /**
     * Gets or sets public IP zones.
     * 
     */
    private final @Nullable String zones;

    @OutputCustomType.Constructor({"domainNameLabel","fqdn","publicIpAllocationMethod","resourceType","sku","targetResourceName","zones"})
    private PublicIPAddressResourceSettingsResponse(
        @Nullable String domainNameLabel,
        @Nullable String fqdn,
        @Nullable String publicIpAllocationMethod,
        String resourceType,
        @Nullable String sku,
        String targetResourceName,
        @Nullable String zones) {
        this.domainNameLabel = domainNameLabel;
        this.fqdn = fqdn;
        this.publicIpAllocationMethod = publicIpAllocationMethod;
        this.resourceType = Objects.requireNonNull(resourceType);
        this.sku = sku;
        this.targetResourceName = Objects.requireNonNull(targetResourceName);
        this.zones = zones;
    }

    /**
     * Gets or sets the domain name label.
     * 
     */
    public Optional<String> getDomainNameLabel() {
        return Optional.ofNullable(this.domainNameLabel);
    }
    /**
     * Gets or sets the fully qualified domain name.
     * 
     */
    public Optional<String> getFqdn() {
        return Optional.ofNullable(this.fqdn);
    }
    /**
     * Gets or sets public IP allocation method.
     * 
     */
    public Optional<String> getPublicIpAllocationMethod() {
        return Optional.ofNullable(this.publicIpAllocationMethod);
    }
    /**
     * The resource type. For example, the value can be Microsoft.Compute/virtualMachines.
     * Expected value is 'Microsoft.Network/publicIPAddresses'.
     * 
     */
    public String getPropResourceType() {
        return this.resourceType;
    }
    /**
     * Gets or sets public IP sku.
     * 
     */
    public Optional<String> getSku() {
        return Optional.ofNullable(this.sku);
    }
    /**
     * Gets or sets the target Resource name.
     * 
     */
    public String getTargetResourceName() {
        return this.targetResourceName;
    }
    /**
     * Gets or sets public IP zones.
     * 
     */
    public Optional<String> getZones() {
        return Optional.ofNullable(this.zones);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PublicIPAddressResourceSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String domainNameLabel;
        private @Nullable String fqdn;
        private @Nullable String publicIpAllocationMethod;
        private String resourceType;
        private @Nullable String sku;
        private String targetResourceName;
        private @Nullable String zones;

        public Builder() {
    	      // Empty
        }

        public Builder(PublicIPAddressResourceSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domainNameLabel = defaults.domainNameLabel;
    	      this.fqdn = defaults.fqdn;
    	      this.publicIpAllocationMethod = defaults.publicIpAllocationMethod;
    	      this.resourceType = defaults.resourceType;
    	      this.sku = defaults.sku;
    	      this.targetResourceName = defaults.targetResourceName;
    	      this.zones = defaults.zones;
        }

        public Builder setDomainNameLabel(@Nullable String domainNameLabel) {
            this.domainNameLabel = domainNameLabel;
            return this;
        }

        public Builder setFqdn(@Nullable String fqdn) {
            this.fqdn = fqdn;
            return this;
        }

        public Builder setPublicIpAllocationMethod(@Nullable String publicIpAllocationMethod) {
            this.publicIpAllocationMethod = publicIpAllocationMethod;
            return this;
        }

        public Builder setResourceType(String resourceType) {
            this.resourceType = Objects.requireNonNull(resourceType);
            return this;
        }

        public Builder setSku(@Nullable String sku) {
            this.sku = sku;
            return this;
        }

        public Builder setTargetResourceName(String targetResourceName) {
            this.targetResourceName = Objects.requireNonNull(targetResourceName);
            return this;
        }

        public Builder setZones(@Nullable String zones) {
            this.zones = zones;
            return this;
        }

        public PublicIPAddressResourceSettingsResponse build() {
            return new PublicIPAddressResourceSettingsResponse(domainNameLabel, fqdn, publicIpAllocationMethod, resourceType, sku, targetResourceName, zones);
        }
    }
}
