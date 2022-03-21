// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.certificateauthority.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class CaPoolIssuancePolicyAllowedKeyTypeEllipticCurveGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final CaPoolIssuancePolicyAllowedKeyTypeEllipticCurveGetArgs Empty = new CaPoolIssuancePolicyAllowedKeyTypeEllipticCurveGetArgs();

    /**
     * The algorithm used.
     * Possible values are `ECDSA_P256`, `ECDSA_P384`, and `EDDSA_25519`.
     * 
     */
    @Import(name="signatureAlgorithm", required=true)
      private final Output<String> signatureAlgorithm;

    public Output<String> getSignatureAlgorithm() {
        return this.signatureAlgorithm;
    }

    public CaPoolIssuancePolicyAllowedKeyTypeEllipticCurveGetArgs(Output<String> signatureAlgorithm) {
        this.signatureAlgorithm = Objects.requireNonNull(signatureAlgorithm, "expected parameter 'signatureAlgorithm' to be non-null");
    }

    private CaPoolIssuancePolicyAllowedKeyTypeEllipticCurveGetArgs() {
        this.signatureAlgorithm = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CaPoolIssuancePolicyAllowedKeyTypeEllipticCurveGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> signatureAlgorithm;

        public Builder() {
    	      // Empty
        }

        public Builder(CaPoolIssuancePolicyAllowedKeyTypeEllipticCurveGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.signatureAlgorithm = defaults.signatureAlgorithm;
        }

        public Builder signatureAlgorithm(Output<String> signatureAlgorithm) {
            this.signatureAlgorithm = Objects.requireNonNull(signatureAlgorithm);
            return this;
        }
        public Builder signatureAlgorithm(String signatureAlgorithm) {
            this.signatureAlgorithm = Output.of(Objects.requireNonNull(signatureAlgorithm));
            return this;
        }        public CaPoolIssuancePolicyAllowedKeyTypeEllipticCurveGetArgs build() {
            return new CaPoolIssuancePolicyAllowedKeyTypeEllipticCurveGetArgs(signatureAlgorithm);
        }
    }
}
