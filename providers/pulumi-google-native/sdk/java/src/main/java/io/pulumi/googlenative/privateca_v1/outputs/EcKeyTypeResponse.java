// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.privateca_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class EcKeyTypeResponse {
    /**
     * Optional. A signature algorithm that must be used. If this is omitted, any EC-based signature algorithm will be allowed.
     * 
     */
    private final String signatureAlgorithm;

    @OutputCustomType.Constructor({"signatureAlgorithm"})
    private EcKeyTypeResponse(String signatureAlgorithm) {
        this.signatureAlgorithm = Objects.requireNonNull(signatureAlgorithm);
    }

    /**
     * Optional. A signature algorithm that must be used. If this is omitted, any EC-based signature algorithm will be allowed.
     * 
    */
    public String getSignatureAlgorithm() {
        return this.signatureAlgorithm;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EcKeyTypeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String signatureAlgorithm;

        public Builder() {
    	      // Empty
        }

        public Builder(EcKeyTypeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.signatureAlgorithm = defaults.signatureAlgorithm;
        }

        public Builder setSignatureAlgorithm(String signatureAlgorithm) {
            this.signatureAlgorithm = Objects.requireNonNull(signatureAlgorithm);
            return this;
        }
        public EcKeyTypeResponse build() {
            return new EcKeyTypeResponse(signatureAlgorithm);
        }
    }
}