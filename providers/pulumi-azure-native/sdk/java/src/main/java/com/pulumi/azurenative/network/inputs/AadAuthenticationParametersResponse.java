// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * AAD Vpn authentication type related parameters.
 * 
 */
public final class AadAuthenticationParametersResponse extends com.pulumi.resources.InvokeArgs {

    public static final AadAuthenticationParametersResponse Empty = new AadAuthenticationParametersResponse();

    /**
     * AAD Vpn authentication parameter AAD audience.
     * 
     */
    @Import(name="aadAudience")
    private @Nullable String aadAudience;

    /**
     * @return AAD Vpn authentication parameter AAD audience.
     * 
     */
    public Optional<String> aadAudience() {
        return Optional.ofNullable(this.aadAudience);
    }

    /**
     * AAD Vpn authentication parameter AAD issuer.
     * 
     */
    @Import(name="aadIssuer")
    private @Nullable String aadIssuer;

    /**
     * @return AAD Vpn authentication parameter AAD issuer.
     * 
     */
    public Optional<String> aadIssuer() {
        return Optional.ofNullable(this.aadIssuer);
    }

    /**
     * AAD Vpn authentication parameter AAD tenant.
     * 
     */
    @Import(name="aadTenant")
    private @Nullable String aadTenant;

    /**
     * @return AAD Vpn authentication parameter AAD tenant.
     * 
     */
    public Optional<String> aadTenant() {
        return Optional.ofNullable(this.aadTenant);
    }

    private AadAuthenticationParametersResponse() {}

    private AadAuthenticationParametersResponse(AadAuthenticationParametersResponse $) {
        this.aadAudience = $.aadAudience;
        this.aadIssuer = $.aadIssuer;
        this.aadTenant = $.aadTenant;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AadAuthenticationParametersResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AadAuthenticationParametersResponse $;

        public Builder() {
            $ = new AadAuthenticationParametersResponse();
        }

        public Builder(AadAuthenticationParametersResponse defaults) {
            $ = new AadAuthenticationParametersResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param aadAudience AAD Vpn authentication parameter AAD audience.
         * 
         * @return builder
         * 
         */
        public Builder aadAudience(@Nullable String aadAudience) {
            $.aadAudience = aadAudience;
            return this;
        }

        /**
         * @param aadIssuer AAD Vpn authentication parameter AAD issuer.
         * 
         * @return builder
         * 
         */
        public Builder aadIssuer(@Nullable String aadIssuer) {
            $.aadIssuer = aadIssuer;
            return this;
        }

        /**
         * @param aadTenant AAD Vpn authentication parameter AAD tenant.
         * 
         * @return builder
         * 
         */
        public Builder aadTenant(@Nullable String aadTenant) {
            $.aadTenant = aadTenant;
            return this;
        }

        public AadAuthenticationParametersResponse build() {
            return $;
        }
    }

}
