// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AadAuthenticationParametersResponse {
    /**
     * AAD Vpn authentication parameter AAD audience.
     * 
     */
    private final @Nullable String aadAudience;
    /**
     * AAD Vpn authentication parameter AAD issuer.
     * 
     */
    private final @Nullable String aadIssuer;
    /**
     * AAD Vpn authentication parameter AAD tenant.
     * 
     */
    private final @Nullable String aadTenant;

    @OutputCustomType.Constructor({"aadAudience","aadIssuer","aadTenant"})
    private AadAuthenticationParametersResponse(
        @Nullable String aadAudience,
        @Nullable String aadIssuer,
        @Nullable String aadTenant) {
        this.aadAudience = aadAudience;
        this.aadIssuer = aadIssuer;
        this.aadTenant = aadTenant;
    }

    /**
     * AAD Vpn authentication parameter AAD audience.
     * 
    */
    public Optional<String> getAadAudience() {
        return Optional.ofNullable(this.aadAudience);
    }
    /**
     * AAD Vpn authentication parameter AAD issuer.
     * 
    */
    public Optional<String> getAadIssuer() {
        return Optional.ofNullable(this.aadIssuer);
    }
    /**
     * AAD Vpn authentication parameter AAD tenant.
     * 
    */
    public Optional<String> getAadTenant() {
        return Optional.ofNullable(this.aadTenant);
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