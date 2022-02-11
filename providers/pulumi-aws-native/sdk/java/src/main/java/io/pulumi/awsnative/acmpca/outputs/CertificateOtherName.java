// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.acmpca.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class CertificateOtherName {
    private final String typeId;
    private final String value;

    @OutputCustomType.Constructor({"typeId","value"})
    private CertificateOtherName(
        String typeId,
        String value) {
        this.typeId = Objects.requireNonNull(typeId);
        this.value = Objects.requireNonNull(value);
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

    public static Builder builder(CertificateOtherName defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String typeId;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateOtherName defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.typeId = defaults.typeId;
    	      this.value = defaults.value;
        }

        public Builder setTypeId(String typeId) {
            this.typeId = Objects.requireNonNull(typeId);
            return this;
        }

        public Builder setValue(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }

        public CertificateOtherName build() {
            return new CertificateOtherName(typeId, value);
        }
    }
}
