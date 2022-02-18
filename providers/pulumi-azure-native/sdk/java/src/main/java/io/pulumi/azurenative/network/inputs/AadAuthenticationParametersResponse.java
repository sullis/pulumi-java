// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * AAD Vpn authentication type related parameters.
 * 
 */
public final class AadAuthenticationParametersResponse extends io.pulumi.resources.InvokeArgs {

    public static final AadAuthenticationParametersResponse Empty = new AadAuthenticationParametersResponse();

    /**
     * AAD Vpn authentication parameter AAD audience.
     * 
     */
    @InputImport(name="aadAudience")
    private final @Nullable String aadAudience;

    public Optional<String> getAadAudience() {
        return this.aadAudience == null ? Optional.empty() : Optional.ofNullable(this.aadAudience);
    }

    /**
     * AAD Vpn authentication parameter AAD issuer.
     * 
     */
    @InputImport(name="aadIssuer")
    private final @Nullable String aadIssuer;

    public Optional<String> getAadIssuer() {
        return this.aadIssuer == null ? Optional.empty() : Optional.ofNullable(this.aadIssuer);
    }

    /**
     * AAD Vpn authentication parameter AAD tenant.
     * 
     */
    @InputImport(name="aadTenant")
    private final @Nullable String aadTenant;

    public Optional<String> getAadTenant() {
        return this.aadTenant == null ? Optional.empty() : Optional.ofNullable(this.aadTenant);
    }

    public AadAuthenticationParametersResponse(
        @Nullable String aadAudience,
        @Nullable String aadIssuer,
        @Nullable String aadTenant) {
        this.aadAudience = aadAudience;
        this.aadIssuer = aadIssuer;
        this.aadTenant = aadTenant;
    }

    private AadAuthenticationParametersResponse() {
        this.aadAudience = null;
        this.aadIssuer = null;
        this.aadTenant = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AadAuthenticationParametersResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String aadAudience;
        private @Nullable String aadIssuer;
        private @Nullable String aadTenant;

        public Builder() {
    	      // Empty
        }

        public Builder(AadAuthenticationParametersResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aadAudience = defaults.aadAudience;
    	      this.aadIssuer = defaults.aadIssuer;
    	      this.aadTenant = defaults.aadTenant;
        }

        public Builder setAadAudience(@Nullable String aadAudience) {
            this.aadAudience = aadAudience;
            return this;
        }

        public Builder setAadIssuer(@Nullable String aadIssuer) {
            this.aadIssuer = aadIssuer;
            return this;
        }

        public Builder setAadTenant(@Nullable String aadTenant) {
            this.aadTenant = aadTenant;
            return this;
        }

        public AadAuthenticationParametersResponse build() {
            return new AadAuthenticationParametersResponse(aadAudience, aadIssuer, aadTenant);
        }
    }
}
