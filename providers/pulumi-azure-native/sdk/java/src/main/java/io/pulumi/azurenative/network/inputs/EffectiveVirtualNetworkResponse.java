// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Effective Virtual Network
 * 
 */
public final class EffectiveVirtualNetworkResponse extends io.pulumi.resources.InvokeArgs {

    public static final EffectiveVirtualNetworkResponse Empty = new EffectiveVirtualNetworkResponse();

    /**
     * Effective vnet Id.
     * 
     */
    @InputImport(name="id")
    private final @Nullable String id;

    public Optional<String> getId() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    /**
     * Location of vnet.
     * 
     */
    @InputImport(name="location")
    private final @Nullable String location;

    public Optional<String> getLocation() {
        return this.location == null ? Optional.empty() : Optional.ofNullable(this.location);
    }

    /**
     * Membership Type.
     * 
     */
    @InputImport(name="membershipType")
    private final @Nullable String membershipType;

    public Optional<String> getMembershipType() {
        return this.membershipType == null ? Optional.empty() : Optional.ofNullable(this.membershipType);
    }

    public EffectiveVirtualNetworkResponse(
        @Nullable String id,
        @Nullable String location,
        @Nullable String membershipType) {
        this.id = id;
        this.location = location;
        this.membershipType = membershipType;
    }

    private EffectiveVirtualNetworkResponse() {
        this.id = null;
        this.location = null;
        this.membershipType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EffectiveVirtualNetworkResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String id;
        private @Nullable String location;
        private @Nullable String membershipType;

        public Builder() {
    	      // Empty
        }

        public Builder(EffectiveVirtualNetworkResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.membershipType = defaults.membershipType;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder setMembershipType(@Nullable String membershipType) {
            this.membershipType = membershipType;
            return this;
        }

        public EffectiveVirtualNetworkResponse build() {
            return new EffectiveVirtualNetworkResponse(id, location, membershipType);
        }
    }
}
