// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.privateca_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;

@OutputCustomType
public final class CaOptionsResponse {
    /**
     * Optional. Refers to the "CA" X.509 extension, which is a boolean value. When this value is missing, the extension will be omitted from the CA certificate.
     * 
     */
    private final Boolean isCa;
    /**
     * Optional. Refers to the path length restriction X.509 extension. For a CA certificate, this value describes the depth of subordinate CA certificates that are allowed. If this value is less than 0, the request will fail. If this value is missing, the max path length will be omitted from the CA certificate.
     * 
     */
    private final Integer maxIssuerPathLength;

    @OutputCustomType.Constructor({"isCa","maxIssuerPathLength"})
    private CaOptionsResponse(
        Boolean isCa,
        Integer maxIssuerPathLength) {
        this.isCa = Objects.requireNonNull(isCa);
        this.maxIssuerPathLength = Objects.requireNonNull(maxIssuerPathLength);
    }

    /**
     * Optional. Refers to the "CA" X.509 extension, which is a boolean value. When this value is missing, the extension will be omitted from the CA certificate.
     * 
    */
    public Boolean getIsCa() {
        return this.isCa;
    }
    /**
     * Optional. Refers to the path length restriction X.509 extension. For a CA certificate, this value describes the depth of subordinate CA certificates that are allowed. If this value is less than 0, the request will fail. If this value is missing, the max path length will be omitted from the CA certificate.
     * 
    */
    public Integer getMaxIssuerPathLength() {
        return this.maxIssuerPathLength;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CaOptionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean isCa;
        private Integer maxIssuerPathLength;

        public Builder() {
    	      // Empty
        }

        public Builder(CaOptionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isCa = defaults.isCa;
    	      this.maxIssuerPathLength = defaults.maxIssuerPathLength;
        }

        public Builder setIsCa(Boolean isCa) {
            this.isCa = Objects.requireNonNull(isCa);
            return this;
        }

        public Builder setMaxIssuerPathLength(Integer maxIssuerPathLength) {
            this.maxIssuerPathLength = Objects.requireNonNull(maxIssuerPathLength);
            return this;
        }
        public CaOptionsResponse build() {
            return new CaOptionsResponse(isCa, maxIssuerPathLength);
        }
    }
}