// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.certificateauthority.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CertificateConfigX509ConfigCaOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final CertificateConfigX509ConfigCaOptionsArgs Empty = new CertificateConfigX509ConfigCaOptionsArgs();

    /**
     * When true, the "CA" in Basic Constraints extension will be set to true.
     * 
     */
    @Import(name="isCa")
      private final @Nullable Output<Boolean> isCa;

    public Output<Boolean> getIsCa() {
        return this.isCa == null ? Output.empty() : this.isCa;
    }

    /**
     * Refers to the "path length constraint" in Basic Constraints extension. For a CA certificate, this value describes the depth of
     * subordinate CA certificates that are allowed. If this value is less than 0, the request will fail.
     * 
     */
    @Import(name="maxIssuerPathLength")
      private final @Nullable Output<Integer> maxIssuerPathLength;

    public Output<Integer> getMaxIssuerPathLength() {
        return this.maxIssuerPathLength == null ? Output.empty() : this.maxIssuerPathLength;
    }

    /**
     * When true, the "CA" in Basic Constraints extension will be set to false.
     * If both `is_ca` and `non_ca` are unset, the extension will be omitted from the CA certificate.
     * 
     */
    @Import(name="nonCa")
      private final @Nullable Output<Boolean> nonCa;

    public Output<Boolean> getNonCa() {
        return this.nonCa == null ? Output.empty() : this.nonCa;
    }

    /**
     * When true, the "path length constraint" in Basic Constraints extension will be set to 0.
     * if both `max_issuer_path_length` and `zero_max_issuer_path_length` are unset,
     * the max path length will be omitted from the CA certificate.
     * 
     */
    @Import(name="zeroMaxIssuerPathLength")
      private final @Nullable Output<Boolean> zeroMaxIssuerPathLength;

    public Output<Boolean> getZeroMaxIssuerPathLength() {
        return this.zeroMaxIssuerPathLength == null ? Output.empty() : this.zeroMaxIssuerPathLength;
    }

    public CertificateConfigX509ConfigCaOptionsArgs(
        @Nullable Output<Boolean> isCa,
        @Nullable Output<Integer> maxIssuerPathLength,
        @Nullable Output<Boolean> nonCa,
        @Nullable Output<Boolean> zeroMaxIssuerPathLength) {
        this.isCa = isCa;
        this.maxIssuerPathLength = maxIssuerPathLength;
        this.nonCa = nonCa;
        this.zeroMaxIssuerPathLength = zeroMaxIssuerPathLength;
    }

    private CertificateConfigX509ConfigCaOptionsArgs() {
        this.isCa = Output.empty();
        this.maxIssuerPathLength = Output.empty();
        this.nonCa = Output.empty();
        this.zeroMaxIssuerPathLength = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateConfigX509ConfigCaOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> isCa;
        private @Nullable Output<Integer> maxIssuerPathLength;
        private @Nullable Output<Boolean> nonCa;
        private @Nullable Output<Boolean> zeroMaxIssuerPathLength;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateConfigX509ConfigCaOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isCa = defaults.isCa;
    	      this.maxIssuerPathLength = defaults.maxIssuerPathLength;
    	      this.nonCa = defaults.nonCa;
    	      this.zeroMaxIssuerPathLength = defaults.zeroMaxIssuerPathLength;
        }

        public Builder isCa(@Nullable Output<Boolean> isCa) {
            this.isCa = isCa;
            return this;
        }
        public Builder isCa(@Nullable Boolean isCa) {
            this.isCa = Output.ofNullable(isCa);
            return this;
        }
        public Builder maxIssuerPathLength(@Nullable Output<Integer> maxIssuerPathLength) {
            this.maxIssuerPathLength = maxIssuerPathLength;
            return this;
        }
        public Builder maxIssuerPathLength(@Nullable Integer maxIssuerPathLength) {
            this.maxIssuerPathLength = Output.ofNullable(maxIssuerPathLength);
            return this;
        }
        public Builder nonCa(@Nullable Output<Boolean> nonCa) {
            this.nonCa = nonCa;
            return this;
        }
        public Builder nonCa(@Nullable Boolean nonCa) {
            this.nonCa = Output.ofNullable(nonCa);
            return this;
        }
        public Builder zeroMaxIssuerPathLength(@Nullable Output<Boolean> zeroMaxIssuerPathLength) {
            this.zeroMaxIssuerPathLength = zeroMaxIssuerPathLength;
            return this;
        }
        public Builder zeroMaxIssuerPathLength(@Nullable Boolean zeroMaxIssuerPathLength) {
            this.zeroMaxIssuerPathLength = Output.ofNullable(zeroMaxIssuerPathLength);
            return this;
        }        public CertificateConfigX509ConfigCaOptionsArgs build() {
            return new CertificateConfigX509ConfigCaOptionsArgs(isCa, maxIssuerPathLength, nonCa, zeroMaxIssuerPathLength);
        }
    }
}
