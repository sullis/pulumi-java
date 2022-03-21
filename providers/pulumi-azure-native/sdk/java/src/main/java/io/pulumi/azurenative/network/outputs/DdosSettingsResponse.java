// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.SubResourceResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DdosSettingsResponse {
    /**
     * The DDoS custom policy associated with the public IP.
     * 
     */
    private final @Nullable SubResourceResponse ddosCustomPolicy;
    /**
     * Enables DDoS protection on the public IP.
     * 
     */
    private final @Nullable Boolean protectedIP;
    /**
     * The DDoS protection policy customizability of the public IP. Only standard coverage will have the ability to be customized.
     * 
     */
    private final @Nullable String protectionCoverage;

    @CustomType.Constructor
    private DdosSettingsResponse(
        @CustomType.Parameter("ddosCustomPolicy") @Nullable SubResourceResponse ddosCustomPolicy,
        @CustomType.Parameter("protectedIP") @Nullable Boolean protectedIP,
        @CustomType.Parameter("protectionCoverage") @Nullable String protectionCoverage) {
        this.ddosCustomPolicy = ddosCustomPolicy;
        this.protectedIP = protectedIP;
        this.protectionCoverage = protectionCoverage;
    }

    /**
     * The DDoS custom policy associated with the public IP.
     * 
    */
    public Optional<SubResourceResponse> getDdosCustomPolicy() {
        return Optional.ofNullable(this.ddosCustomPolicy);
    }
    /**
     * Enables DDoS protection on the public IP.
     * 
    */
    public Optional<Boolean> getProtectedIP() {
        return Optional.ofNullable(this.protectedIP);
    }
    /**
     * The DDoS protection policy customizability of the public IP. Only standard coverage will have the ability to be customized.
     * 
    */
    public Optional<String> getProtectionCoverage() {
        return Optional.ofNullable(this.protectionCoverage);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DdosSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable SubResourceResponse ddosCustomPolicy;
        private @Nullable Boolean protectedIP;
        private @Nullable String protectionCoverage;

        public Builder() {
    	      // Empty
        }

        public Builder(DdosSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ddosCustomPolicy = defaults.ddosCustomPolicy;
    	      this.protectedIP = defaults.protectedIP;
    	      this.protectionCoverage = defaults.protectionCoverage;
        }

        public Builder ddosCustomPolicy(@Nullable SubResourceResponse ddosCustomPolicy) {
            this.ddosCustomPolicy = ddosCustomPolicy;
            return this;
        }
        public Builder protectedIP(@Nullable Boolean protectedIP) {
            this.protectedIP = protectedIP;
            return this;
        }
        public Builder protectionCoverage(@Nullable String protectionCoverage) {
            this.protectionCoverage = protectionCoverage;
            return this;
        }        public DdosSettingsResponse build() {
            return new DdosSettingsResponse(ddosCustomPolicy, protectedIP, protectionCoverage);
        }
    }
}
