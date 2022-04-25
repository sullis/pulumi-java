// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.privateca_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class RsaKeyTypeResponse {
    /**
     * @return Optional. The maximum allowed RSA modulus size (inclusive), in bits. If this is not set, or if set to zero, the service will not enforce an explicit upper bound on RSA modulus sizes.
     * 
     */
    private final String maxModulusSize;
    /**
     * @return Optional. The minimum allowed RSA modulus size (inclusive), in bits. If this is not set, or if set to zero, the service-level min RSA modulus size will continue to apply.
     * 
     */
    private final String minModulusSize;

    @CustomType.Constructor
    private RsaKeyTypeResponse(
        @CustomType.Parameter("maxModulusSize") String maxModulusSize,
        @CustomType.Parameter("minModulusSize") String minModulusSize) {
        this.maxModulusSize = maxModulusSize;
        this.minModulusSize = minModulusSize;
    }

    /**
     * @return Optional. The maximum allowed RSA modulus size (inclusive), in bits. If this is not set, or if set to zero, the service will not enforce an explicit upper bound on RSA modulus sizes.
     * 
     */
    public String maxModulusSize() {
        return this.maxModulusSize;
    }
    /**
     * @return Optional. The minimum allowed RSA modulus size (inclusive), in bits. If this is not set, or if set to zero, the service-level min RSA modulus size will continue to apply.
     * 
     */
    public String minModulusSize() {
        return this.minModulusSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RsaKeyTypeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String maxModulusSize;
        private String minModulusSize;

        public Builder() {
    	      // Empty
        }

        public Builder(RsaKeyTypeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxModulusSize = defaults.maxModulusSize;
    	      this.minModulusSize = defaults.minModulusSize;
        }

        public Builder maxModulusSize(String maxModulusSize) {
            this.maxModulusSize = Objects.requireNonNull(maxModulusSize);
            return this;
        }
        public Builder minModulusSize(String minModulusSize) {
            this.minModulusSize = Objects.requireNonNull(minModulusSize);
            return this;
        }        public RsaKeyTypeResponse build() {
            return new RsaKeyTypeResponse(maxModulusSize, minModulusSize);
        }
    }
}
