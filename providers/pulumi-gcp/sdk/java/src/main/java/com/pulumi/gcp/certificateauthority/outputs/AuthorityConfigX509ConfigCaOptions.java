// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.certificateauthority.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AuthorityConfigX509ConfigCaOptions {
    /**
     * @return When true, the &#34;CA&#34; in Basic Constraints extension will be set to true.
     * 
     */
    private final Boolean isCa;
    /**
     * @return Refers to the &#34;path length constraint&#34; in Basic Constraints extension. For a CA certificate, this value describes the depth of
     * subordinate CA certificates that are allowed. If this value is less than 0, the request will fail.
     * 
     */
    private final @Nullable Integer maxIssuerPathLength;
    /**
     * @return When true, the &#34;CA&#34; in Basic Constraints extension will be set to false.
     * If both `is_ca` and `non_ca` are unset, the extension will be omitted from the CA certificate.
     * 
     */
    private final @Nullable Boolean nonCa;
    /**
     * @return When true, the &#34;path length constraint&#34; in Basic Constraints extension will be set to 0.
     * if both `max_issuer_path_length` and `zero_max_issuer_path_length` are unset,
     * the max path length will be omitted from the CA certificate.
     * 
     */
    private final @Nullable Boolean zeroMaxIssuerPathLength;

    @CustomType.Constructor
    private AuthorityConfigX509ConfigCaOptions(
        @CustomType.Parameter("isCa") Boolean isCa,
        @CustomType.Parameter("maxIssuerPathLength") @Nullable Integer maxIssuerPathLength,
        @CustomType.Parameter("nonCa") @Nullable Boolean nonCa,
        @CustomType.Parameter("zeroMaxIssuerPathLength") @Nullable Boolean zeroMaxIssuerPathLength) {
        this.isCa = isCa;
        this.maxIssuerPathLength = maxIssuerPathLength;
        this.nonCa = nonCa;
        this.zeroMaxIssuerPathLength = zeroMaxIssuerPathLength;
    }

    /**
     * @return When true, the &#34;CA&#34; in Basic Constraints extension will be set to true.
     * 
     */
    public Boolean isCa() {
        return this.isCa;
    }
    /**
     * @return Refers to the &#34;path length constraint&#34; in Basic Constraints extension. For a CA certificate, this value describes the depth of
     * subordinate CA certificates that are allowed. If this value is less than 0, the request will fail.
     * 
     */
    public Optional<Integer> maxIssuerPathLength() {
        return Optional.ofNullable(this.maxIssuerPathLength);
    }
    /**
     * @return When true, the &#34;CA&#34; in Basic Constraints extension will be set to false.
     * If both `is_ca` and `non_ca` are unset, the extension will be omitted from the CA certificate.
     * 
     */
    public Optional<Boolean> nonCa() {
        return Optional.ofNullable(this.nonCa);
    }
    /**
     * @return When true, the &#34;path length constraint&#34; in Basic Constraints extension will be set to 0.
     * if both `max_issuer_path_length` and `zero_max_issuer_path_length` are unset,
     * the max path length will be omitted from the CA certificate.
     * 
     */
    public Optional<Boolean> zeroMaxIssuerPathLength() {
        return Optional.ofNullable(this.zeroMaxIssuerPathLength);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AuthorityConfigX509ConfigCaOptions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean isCa;
        private @Nullable Integer maxIssuerPathLength;
        private @Nullable Boolean nonCa;
        private @Nullable Boolean zeroMaxIssuerPathLength;

        public Builder() {
    	      // Empty
        }

        public Builder(AuthorityConfigX509ConfigCaOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isCa = defaults.isCa;
    	      this.maxIssuerPathLength = defaults.maxIssuerPathLength;
    	      this.nonCa = defaults.nonCa;
    	      this.zeroMaxIssuerPathLength = defaults.zeroMaxIssuerPathLength;
        }

        public Builder isCa(Boolean isCa) {
            this.isCa = Objects.requireNonNull(isCa);
            return this;
        }
        public Builder maxIssuerPathLength(@Nullable Integer maxIssuerPathLength) {
            this.maxIssuerPathLength = maxIssuerPathLength;
            return this;
        }
        public Builder nonCa(@Nullable Boolean nonCa) {
            this.nonCa = nonCa;
            return this;
        }
        public Builder zeroMaxIssuerPathLength(@Nullable Boolean zeroMaxIssuerPathLength) {
            this.zeroMaxIssuerPathLength = zeroMaxIssuerPathLength;
            return this;
        }        public AuthorityConfigX509ConfigCaOptions build() {
            return new AuthorityConfigX509ConfigCaOptions(isCa, maxIssuerPathLength, nonCa, zeroMaxIssuerPathLength);
        }
    }
}
