// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web;

import io.pulumi.azurenative.web.enums.AzureResourceType;
import io.pulumi.azurenative.web.enums.CustomHostNameDnsRecordType;
import io.pulumi.azurenative.web.enums.HostNameType;
import io.pulumi.azurenative.web.enums.SslState;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAppHostNameBindingSlotArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAppHostNameBindingSlotArgs Empty = new WebAppHostNameBindingSlotArgs();

    /**
     * Azure resource name.
     * 
     */
    @InputImport(name="azureResourceName")
    private final @Nullable Input<String> azureResourceName;

    public Input<String> getAzureResourceName() {
        return this.azureResourceName == null ? Input.empty() : this.azureResourceName;
    }

    /**
     * Azure resource type.
     * 
     */
    @InputImport(name="azureResourceType")
    private final @Nullable Input<AzureResourceType> azureResourceType;

    public Input<AzureResourceType> getAzureResourceType() {
        return this.azureResourceType == null ? Input.empty() : this.azureResourceType;
    }

    /**
     * Custom DNS record type.
     * 
     */
    @InputImport(name="customHostNameDnsRecordType")
    private final @Nullable Input<CustomHostNameDnsRecordType> customHostNameDnsRecordType;

    public Input<CustomHostNameDnsRecordType> getCustomHostNameDnsRecordType() {
        return this.customHostNameDnsRecordType == null ? Input.empty() : this.customHostNameDnsRecordType;
    }

    /**
     * Fully qualified ARM domain resource URI.
     * 
     */
    @InputImport(name="domainId")
    private final @Nullable Input<String> domainId;

    public Input<String> getDomainId() {
        return this.domainId == null ? Input.empty() : this.domainId;
    }

    /**
     * Hostname in the hostname binding.
     * 
     */
    @InputImport(name="hostName")
    private final @Nullable Input<String> hostName;

    public Input<String> getHostName() {
        return this.hostName == null ? Input.empty() : this.hostName;
    }

    /**
     * Hostname type.
     * 
     */
    @InputImport(name="hostNameType")
    private final @Nullable Input<HostNameType> hostNameType;

    public Input<HostNameType> getHostNameType() {
        return this.hostNameType == null ? Input.empty() : this.hostNameType;
    }

    /**
     * Kind of resource.
     * 
     */
    @InputImport(name="kind")
    private final @Nullable Input<String> kind;

    public Input<String> getKind() {
        return this.kind == null ? Input.empty() : this.kind;
    }

    /**
     * Name of the app.
     * 
     */
    @InputImport(name="name", required=true)
    private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    /**
     * Name of the resource group to which the resource belongs.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * App Service app name.
     * 
     */
    @InputImport(name="siteName")
    private final @Nullable Input<String> siteName;

    public Input<String> getSiteName() {
        return this.siteName == null ? Input.empty() : this.siteName;
    }

    /**
     * Name of the deployment slot. If a slot is not specified, the API will create a binding for the production slot.
     * 
     */
    @InputImport(name="slot", required=true)
    private final Input<String> slot;

    public Input<String> getSlot() {
        return this.slot;
    }

    /**
     * SSL type
     * 
     */
    @InputImport(name="sslState")
    private final @Nullable Input<SslState> sslState;

    public Input<SslState> getSslState() {
        return this.sslState == null ? Input.empty() : this.sslState;
    }

    /**
     * SSL certificate thumbprint
     * 
     */
    @InputImport(name="thumbprint")
    private final @Nullable Input<String> thumbprint;

    public Input<String> getThumbprint() {
        return this.thumbprint == null ? Input.empty() : this.thumbprint;
    }

    public WebAppHostNameBindingSlotArgs(
        @Nullable Input<String> azureResourceName,
        @Nullable Input<AzureResourceType> azureResourceType,
        @Nullable Input<CustomHostNameDnsRecordType> customHostNameDnsRecordType,
        @Nullable Input<String> domainId,
        @Nullable Input<String> hostName,
        @Nullable Input<HostNameType> hostNameType,
        @Nullable Input<String> kind,
        Input<String> name,
        Input<String> resourceGroupName,
        @Nullable Input<String> siteName,
        Input<String> slot,
        @Nullable Input<SslState> sslState,
        @Nullable Input<String> thumbprint) {
        this.azureResourceName = azureResourceName;
        this.azureResourceType = azureResourceType;
        this.customHostNameDnsRecordType = customHostNameDnsRecordType;
        this.domainId = domainId;
        this.hostName = hostName;
        this.hostNameType = hostNameType;
        this.kind = kind;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.siteName = siteName;
        this.slot = Objects.requireNonNull(slot, "expected parameter 'slot' to be non-null");
        this.sslState = sslState;
        this.thumbprint = thumbprint;
    }

    private WebAppHostNameBindingSlotArgs() {
        this.azureResourceName = Input.empty();
        this.azureResourceType = Input.empty();
        this.customHostNameDnsRecordType = Input.empty();
        this.domainId = Input.empty();
        this.hostName = Input.empty();
        this.hostNameType = Input.empty();
        this.kind = Input.empty();
        this.name = Input.empty();
        this.resourceGroupName = Input.empty();
        this.siteName = Input.empty();
        this.slot = Input.empty();
        this.sslState = Input.empty();
        this.thumbprint = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAppHostNameBindingSlotArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> azureResourceName;
        private @Nullable Input<AzureResourceType> azureResourceType;
        private @Nullable Input<CustomHostNameDnsRecordType> customHostNameDnsRecordType;
        private @Nullable Input<String> domainId;
        private @Nullable Input<String> hostName;
        private @Nullable Input<HostNameType> hostNameType;
        private @Nullable Input<String> kind;
        private Input<String> name;
        private Input<String> resourceGroupName;
        private @Nullable Input<String> siteName;
        private Input<String> slot;
        private @Nullable Input<SslState> sslState;
        private @Nullable Input<String> thumbprint;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAppHostNameBindingSlotArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.azureResourceName = defaults.azureResourceName;
    	      this.azureResourceType = defaults.azureResourceType;
    	      this.customHostNameDnsRecordType = defaults.customHostNameDnsRecordType;
    	      this.domainId = defaults.domainId;
    	      this.hostName = defaults.hostName;
    	      this.hostNameType = defaults.hostNameType;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.siteName = defaults.siteName;
    	      this.slot = defaults.slot;
    	      this.sslState = defaults.sslState;
    	      this.thumbprint = defaults.thumbprint;
        }

        public Builder setAzureResourceName(@Nullable Input<String> azureResourceName) {
            this.azureResourceName = azureResourceName;
            return this;
        }

        public Builder setAzureResourceName(@Nullable String azureResourceName) {
            this.azureResourceName = Input.ofNullable(azureResourceName);
            return this;
        }

        public Builder setAzureResourceType(@Nullable Input<AzureResourceType> azureResourceType) {
            this.azureResourceType = azureResourceType;
            return this;
        }

        public Builder setAzureResourceType(@Nullable AzureResourceType azureResourceType) {
            this.azureResourceType = Input.ofNullable(azureResourceType);
            return this;
        }

        public Builder setCustomHostNameDnsRecordType(@Nullable Input<CustomHostNameDnsRecordType> customHostNameDnsRecordType) {
            this.customHostNameDnsRecordType = customHostNameDnsRecordType;
            return this;
        }

        public Builder setCustomHostNameDnsRecordType(@Nullable CustomHostNameDnsRecordType customHostNameDnsRecordType) {
            this.customHostNameDnsRecordType = Input.ofNullable(customHostNameDnsRecordType);
            return this;
        }

        public Builder setDomainId(@Nullable Input<String> domainId) {
            this.domainId = domainId;
            return this;
        }

        public Builder setDomainId(@Nullable String domainId) {
            this.domainId = Input.ofNullable(domainId);
            return this;
        }

        public Builder setHostName(@Nullable Input<String> hostName) {
            this.hostName = hostName;
            return this;
        }

        public Builder setHostName(@Nullable String hostName) {
            this.hostName = Input.ofNullable(hostName);
            return this;
        }

        public Builder setHostNameType(@Nullable Input<HostNameType> hostNameType) {
            this.hostNameType = hostNameType;
            return this;
        }

        public Builder setHostNameType(@Nullable HostNameType hostNameType) {
            this.hostNameType = Input.ofNullable(hostNameType);
            return this;
        }

        public Builder setKind(@Nullable Input<String> kind) {
            this.kind = kind;
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = Input.ofNullable(kind);
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
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

        public Builder setSiteName(@Nullable Input<String> siteName) {
            this.siteName = siteName;
            return this;
        }

        public Builder setSiteName(@Nullable String siteName) {
            this.siteName = Input.ofNullable(siteName);
            return this;
        }

        public Builder setSlot(Input<String> slot) {
            this.slot = Objects.requireNonNull(slot);
            return this;
        }

        public Builder setSlot(String slot) {
            this.slot = Input.of(Objects.requireNonNull(slot));
            return this;
        }

        public Builder setSslState(@Nullable Input<SslState> sslState) {
            this.sslState = sslState;
            return this;
        }

        public Builder setSslState(@Nullable SslState sslState) {
            this.sslState = Input.ofNullable(sslState);
            return this;
        }

        public Builder setThumbprint(@Nullable Input<String> thumbprint) {
            this.thumbprint = thumbprint;
            return this;
        }

        public Builder setThumbprint(@Nullable String thumbprint) {
            this.thumbprint = Input.ofNullable(thumbprint);
            return this;
        }

        public WebAppHostNameBindingSlotArgs build() {
            return new WebAppHostNameBindingSlotArgs(azureResourceName, azureResourceType, customHostNameDnsRecordType, domainId, hostName, hostNameType, kind, name, resourceGroupName, siteName, slot, sslState, thumbprint);
        }
    }
}
