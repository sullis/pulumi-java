// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.videoanalyzer.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class EccTokenKeyResponse {
    /**
     * @return Elliptical curve algorithm to be used: ES256, ES384 or ES512.
     * 
     */
    private final String alg;
    /**
     * @return JWT token key id. Validation keys are looked up based on the key id present on the JWT token header.
     * 
     */
    private final String kid;
    /**
     * @return The discriminator for derived types.
     * Expected value is &#39;#Microsoft.VideoAnalyzer.EccTokenKey&#39;.
     * 
     */
    private final String type;
    /**
     * @return X coordinate.
     * 
     */
    private final String x;
    /**
     * @return Y coordinate.
     * 
     */
    private final String y;

    @CustomType.Constructor
    private EccTokenKeyResponse(
        @CustomType.Parameter("alg") String alg,
        @CustomType.Parameter("kid") String kid,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("x") String x,
        @CustomType.Parameter("y") String y) {
        this.alg = alg;
        this.kid = kid;
        this.type = type;
        this.x = x;
        this.y = y;
    }

    /**
     * @return Elliptical curve algorithm to be used: ES256, ES384 or ES512.
     * 
     */
    public String alg() {
        return this.alg;
    }
    /**
     * @return JWT token key id. Validation keys are looked up based on the key id present on the JWT token header.
     * 
     */
    public String kid() {
        return this.kid;
    }
    /**
     * @return The discriminator for derived types.
     * Expected value is &#39;#Microsoft.VideoAnalyzer.EccTokenKey&#39;.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return X coordinate.
     * 
     */
    public String x() {
        return this.x;
    }
    /**
     * @return Y coordinate.
     * 
     */
    public String y() {
        return this.y;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EccTokenKeyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String alg;
        private String kid;
        private String type;
        private String x;
        private String y;

        public Builder() {
    	      // Empty
        }

        public Builder(EccTokenKeyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alg = defaults.alg;
    	      this.kid = defaults.kid;
    	      this.type = defaults.type;
    	      this.x = defaults.x;
    	      this.y = defaults.y;
        }

        public Builder alg(String alg) {
            this.alg = Objects.requireNonNull(alg);
            return this;
        }
        public Builder kid(String kid) {
            this.kid = Objects.requireNonNull(kid);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder x(String x) {
            this.x = Objects.requireNonNull(x);
            return this;
        }
        public Builder y(String y) {
            this.y = Objects.requireNonNull(y);
            return this;
        }        public EccTokenKeyResponse build() {
            return new EccTokenKeyResponse(alg, kid, type, x, y);
        }
    }
}
