// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.acmpca.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class CertificateAuthorityOtherName {
    private final String typeId;
    private final String value;

    @CustomType.Constructor
    private CertificateAuthorityOtherName(
        @CustomType.Parameter("typeId") String typeId,
        @CustomType.Parameter("value") String value) {
        this.typeId = typeId;
        this.value = value;
    }

    public String getTypeId() {
        return this.typeId;
    }
    public String getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateAuthorityOtherName defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String typeId;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateAuthorityOtherName defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.typeId = defaults.typeId;
    	      this.value = defaults.value;
        }

        public Builder typeId(String typeId) {
            this.typeId = Objects.requireNonNull(typeId);
            return this;
        }
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }        public CertificateAuthorityOtherName build() {
            return new CertificateAuthorityOtherName(typeId, value);
        }
    }
}
