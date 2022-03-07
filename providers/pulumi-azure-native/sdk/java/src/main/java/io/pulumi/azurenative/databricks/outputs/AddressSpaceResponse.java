// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databricks.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class AddressSpaceResponse {
    /**
     * A list of address blocks reserved for this virtual network in CIDR notation.
     * 
     */
    private final @Nullable List<String> addressPrefixes;

    @OutputCustomType.Constructor({"addressPrefixes"})
    private AddressSpaceResponse(@Nullable List<String> addressPrefixes) {
        this.addressPrefixes = addressPrefixes;
    }

    /**
     * A list of address blocks reserved for this virtual network in CIDR notation.
     * 
    */
    public List<String> getAddressPrefixes() {
        return this.addressPrefixes == null ? List.of() : this.addressPrefixes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AddressSpaceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> addressPrefixes;

        public Builder() {
    	      // Empty
        }

        public Builder(AddressSpaceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addressPrefixes = defaults.addressPrefixes;
        }

        public Builder setAddressPrefixes(@Nullable List<String> addressPrefixes) {
            this.addressPrefixes = addressPrefixes;
            return this;
        }
        public AddressSpaceResponse build() {
            return new AddressSpaceResponse(addressPrefixes);
        }
    }
}