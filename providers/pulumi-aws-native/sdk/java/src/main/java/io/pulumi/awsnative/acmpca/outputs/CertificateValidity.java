// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.acmpca.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class CertificateValidity {
    private final String type;
    private final Double value;

    @CustomType.Constructor
    private CertificateValidity(
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("value") Double value) {
        this.type = type;
        this.value = value;
    }

    public String type() {
        return this.type;
    }
    public Double value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateValidity defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String type;
        private Double value;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateValidity defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder value(Double value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }        public CertificateValidity build() {
            return new CertificateValidity(type, value);
        }
    }
}
