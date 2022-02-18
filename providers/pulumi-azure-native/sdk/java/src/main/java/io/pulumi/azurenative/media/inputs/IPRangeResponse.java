// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The IP address range in the CIDR scheme.
 * 
 */
public final class IPRangeResponse extends io.pulumi.resources.InvokeArgs {

    public static final IPRangeResponse Empty = new IPRangeResponse();

    /**
     * The IP address.
     * 
     */
    @InputImport(name="address")
    private final @Nullable String address;

    public Optional<String> getAddress() {
        return this.address == null ? Optional.empty() : Optional.ofNullable(this.address);
    }

    /**
     * The friendly name for the IP address range.
     * 
     */
    @InputImport(name="name")
    private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * The subnet mask prefix length (see CIDR notation).
     * 
     */
    @InputImport(name="subnetPrefixLength")
    private final @Nullable Integer subnetPrefixLength;

    public Optional<Integer> getSubnetPrefixLength() {
        return this.subnetPrefixLength == null ? Optional.empty() : Optional.ofNullable(this.subnetPrefixLength);
    }

    public IPRangeResponse(
        @Nullable String address,
        @Nullable String name,
        @Nullable Integer subnetPrefixLength) {
        this.address = address;
        this.name = name;
        this.subnetPrefixLength = subnetPrefixLength;
    }

    private IPRangeResponse() {
        this.address = null;
        this.name = null;
        this.subnetPrefixLength = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IPRangeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String address;
        private @Nullable String name;
        private @Nullable Integer subnetPrefixLength;

        public Builder() {
    	      // Empty
        }

        public Builder(IPRangeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.name = defaults.name;
    	      this.subnetPrefixLength = defaults.subnetPrefixLength;
        }

        public Builder setAddress(@Nullable String address) {
            this.address = address;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setSubnetPrefixLength(@Nullable Integer subnetPrefixLength) {
            this.subnetPrefixLength = subnetPrefixLength;
            return this;
        }

        public IPRangeResponse build() {
            return new IPRangeResponse(address, name, subnetPrefixLength);
        }
    }
}
