// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAppVnetConnectionSlotArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAppVnetConnectionSlotArgs Empty = new WebAppVnetConnectionSlotArgs();

    /**
     * A certificate file (.cer) blob containing the public key of the private key used to authenticate a
     * Point-To-Site VPN connection.
     * 
     */
    @InputImport(name="certBlob")
    private final @Nullable Input<String> certBlob;

    public Input<String> getCertBlob() {
        return this.certBlob == null ? Input.empty() : this.certBlob;
    }

    /**
     * DNS servers to be used by this Virtual Network. This should be a comma-separated list of IP addresses.
     * 
     */
    @InputImport(name="dnsServers")
    private final @Nullable Input<String> dnsServers;

    public Input<String> getDnsServers() {
        return this.dnsServers == null ? Input.empty() : this.dnsServers;
    }

    /**
     * Flag that is used to denote if this is VNET injection
     * 
     */
    @InputImport(name="isSwift")
    private final @Nullable Input<Boolean> isSwift;

    public Input<Boolean> getIsSwift() {
        return this.isSwift == null ? Input.empty() : this.isSwift;
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
     * Name of the deployment slot. If a slot is not specified, the API will add or update connections for the production slot.
     * 
     */
    @InputImport(name="slot", required=true)
    private final Input<String> slot;

    public Input<String> getSlot() {
        return this.slot;
    }

    /**
     * Name of an existing Virtual Network.
     * 
     */
    @InputImport(name="vnetName")
    private final @Nullable Input<String> vnetName;

    public Input<String> getVnetName() {
        return this.vnetName == null ? Input.empty() : this.vnetName;
    }

    /**
     * The Virtual Network's resource ID.
     * 
     */
    @InputImport(name="vnetResourceId")
    private final @Nullable Input<String> vnetResourceId;

    public Input<String> getVnetResourceId() {
        return this.vnetResourceId == null ? Input.empty() : this.vnetResourceId;
    }

    public WebAppVnetConnectionSlotArgs(
        @Nullable Input<String> certBlob,
        @Nullable Input<String> dnsServers,
        @Nullable Input<Boolean> isSwift,
        @Nullable Input<String> kind,
        Input<String> name,
        Input<String> resourceGroupName,
        Input<String> slot,
        @Nullable Input<String> vnetName,
        @Nullable Input<String> vnetResourceId) {
        this.certBlob = certBlob;
        this.dnsServers = dnsServers;
        this.isSwift = isSwift;
        this.kind = kind;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.slot = Objects.requireNonNull(slot, "expected parameter 'slot' to be non-null");
        this.vnetName = vnetName;
        this.vnetResourceId = vnetResourceId;
    }

    private WebAppVnetConnectionSlotArgs() {
        this.certBlob = Input.empty();
        this.dnsServers = Input.empty();
        this.isSwift = Input.empty();
        this.kind = Input.empty();
        this.name = Input.empty();
        this.resourceGroupName = Input.empty();
        this.slot = Input.empty();
        this.vnetName = Input.empty();
        this.vnetResourceId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAppVnetConnectionSlotArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> certBlob;
        private @Nullable Input<String> dnsServers;
        private @Nullable Input<Boolean> isSwift;
        private @Nullable Input<String> kind;
        private Input<String> name;
        private Input<String> resourceGroupName;
        private Input<String> slot;
        private @Nullable Input<String> vnetName;
        private @Nullable Input<String> vnetResourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAppVnetConnectionSlotArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certBlob = defaults.certBlob;
    	      this.dnsServers = defaults.dnsServers;
    	      this.isSwift = defaults.isSwift;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.slot = defaults.slot;
    	      this.vnetName = defaults.vnetName;
    	      this.vnetResourceId = defaults.vnetResourceId;
        }

        public Builder setCertBlob(@Nullable Input<String> certBlob) {
            this.certBlob = certBlob;
            return this;
        }

        public Builder setCertBlob(@Nullable String certBlob) {
            this.certBlob = Input.ofNullable(certBlob);
            return this;
        }

        public Builder setDnsServers(@Nullable Input<String> dnsServers) {
            this.dnsServers = dnsServers;
            return this;
        }

        public Builder setDnsServers(@Nullable String dnsServers) {
            this.dnsServers = Input.ofNullable(dnsServers);
            return this;
        }

        public Builder setIsSwift(@Nullable Input<Boolean> isSwift) {
            this.isSwift = isSwift;
            return this;
        }

        public Builder setIsSwift(@Nullable Boolean isSwift) {
            this.isSwift = Input.ofNullable(isSwift);
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

        public Builder setSlot(Input<String> slot) {
            this.slot = Objects.requireNonNull(slot);
            return this;
        }

        public Builder setSlot(String slot) {
            this.slot = Input.of(Objects.requireNonNull(slot));
            return this;
        }

        public Builder setVnetName(@Nullable Input<String> vnetName) {
            this.vnetName = vnetName;
            return this;
        }

        public Builder setVnetName(@Nullable String vnetName) {
            this.vnetName = Input.ofNullable(vnetName);
            return this;
        }

        public Builder setVnetResourceId(@Nullable Input<String> vnetResourceId) {
            this.vnetResourceId = vnetResourceId;
            return this;
        }

        public Builder setVnetResourceId(@Nullable String vnetResourceId) {
            this.vnetResourceId = Input.ofNullable(vnetResourceId);
            return this;
        }

        public WebAppVnetConnectionSlotArgs build() {
            return new WebAppVnetConnectionSlotArgs(certBlob, dnsServers, isSwift, kind, name, resourceGroupName, slot, vnetName, vnetResourceId);
        }
    }
}
