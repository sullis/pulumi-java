// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Effective Virtual Network
 * 
 */
public final class EffectiveVirtualNetworkResponse extends com.pulumi.resources.InvokeArgs {

    public static final EffectiveVirtualNetworkResponse Empty = new EffectiveVirtualNetworkResponse();

    /**
     * Effective vnet Id.
     * 
     */
    @Import(name="id")
    private @Nullable String id;

    /**
     * @return Effective vnet Id.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * Location of vnet.
     * 
     */
    @Import(name="location")
    private @Nullable String location;

    /**
     * @return Location of vnet.
     * 
     */
    public Optional<String> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Membership Type.
     * 
     */
    @Import(name="membershipType")
    private @Nullable String membershipType;

    /**
     * @return Membership Type.
     * 
     */
    public Optional<String> membershipType() {
        return Optional.ofNullable(this.membershipType);
    }

    private EffectiveVirtualNetworkResponse() {}

    private EffectiveVirtualNetworkResponse(EffectiveVirtualNetworkResponse $) {
        this.id = $.id;
        this.location = $.location;
        this.membershipType = $.membershipType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EffectiveVirtualNetworkResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EffectiveVirtualNetworkResponse $;

        public Builder() {
            $ = new EffectiveVirtualNetworkResponse();
        }

        public Builder(EffectiveVirtualNetworkResponse defaults) {
            $ = new EffectiveVirtualNetworkResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param id Effective vnet Id.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable String id) {
            $.id = id;
            return this;
        }

        /**
         * @param location Location of vnet.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable String location) {
            $.location = location;
            return this;
        }

        /**
         * @param membershipType Membership Type.
         * 
         * @return builder
         * 
         */
        public Builder membershipType(@Nullable String membershipType) {
            $.membershipType = membershipType;
            return this;
        }

        public EffectiveVirtualNetworkResponse build() {
            return $;
        }
    }

}
