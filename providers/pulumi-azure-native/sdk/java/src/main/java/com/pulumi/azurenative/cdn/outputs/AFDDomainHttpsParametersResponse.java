// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cdn.outputs;

import com.pulumi.azurenative.cdn.outputs.ResourceReferenceResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AFDDomainHttpsParametersResponse {
    /**
     * @return Defines the source of the SSL certificate.
     * 
     */
    private final String certificateType;
    /**
     * @return TLS protocol version that will be used for Https
     * 
     */
    private final @Nullable String minimumTlsVersion;
    /**
     * @return Resource reference to the secret. ie. subs/rg/profile/secret
     * 
     */
    private final @Nullable ResourceReferenceResponse secret;

    @CustomType.Constructor
    private AFDDomainHttpsParametersResponse(
        @CustomType.Parameter("certificateType") String certificateType,
        @CustomType.Parameter("minimumTlsVersion") @Nullable String minimumTlsVersion,
        @CustomType.Parameter("secret") @Nullable ResourceReferenceResponse secret) {
        this.certificateType = certificateType;
        this.minimumTlsVersion = minimumTlsVersion;
        this.secret = secret;
    }

    /**
     * @return Defines the source of the SSL certificate.
     * 
     */
    public String certificateType() {
        return this.certificateType;
    }
    /**
     * @return TLS protocol version that will be used for Https
     * 
     */
    public Optional<String> minimumTlsVersion() {
        return Optional.ofNullable(this.minimumTlsVersion);
    }
    /**
     * @return Resource reference to the secret. ie. subs/rg/profile/secret
     * 
     */
    public Optional<ResourceReferenceResponse> secret() {
        return Optional.ofNullable(this.secret);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AFDDomainHttpsParametersResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String certificateType;
        private @Nullable String minimumTlsVersion;
        private @Nullable ResourceReferenceResponse secret;

        public Builder() {
    	      // Empty
        }

        public Builder(AFDDomainHttpsParametersResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateType = defaults.certificateType;
    	      this.minimumTlsVersion = defaults.minimumTlsVersion;
    	      this.secret = defaults.secret;
        }

        public Builder certificateType(String certificateType) {
            this.certificateType = Objects.requireNonNull(certificateType);
            return this;
        }
        public Builder minimumTlsVersion(@Nullable String minimumTlsVersion) {
            this.minimumTlsVersion = minimumTlsVersion;
            return this;
        }
        public Builder secret(@Nullable ResourceReferenceResponse secret) {
            this.secret = secret;
            return this;
        }        public AFDDomainHttpsParametersResponse build() {
            return new AFDDomainHttpsParametersResponse(certificateType, minimumTlsVersion, secret);
        }
    }
}
