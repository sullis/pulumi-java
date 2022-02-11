// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.acmpca.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class CertificateKeyUsage {
    private final @Nullable Boolean cRLSign;
    private final @Nullable Boolean dataEncipherment;
    private final @Nullable Boolean decipherOnly;
    private final @Nullable Boolean digitalSignature;
    private final @Nullable Boolean encipherOnly;
    private final @Nullable Boolean keyAgreement;
    private final @Nullable Boolean keyCertSign;
    private final @Nullable Boolean keyEncipherment;
    private final @Nullable Boolean nonRepudiation;

    @OutputCustomType.Constructor({"cRLSign","dataEncipherment","decipherOnly","digitalSignature","encipherOnly","keyAgreement","keyCertSign","keyEncipherment","nonRepudiation"})
    private CertificateKeyUsage(
        @Nullable Boolean cRLSign,
        @Nullable Boolean dataEncipherment,
        @Nullable Boolean decipherOnly,
        @Nullable Boolean digitalSignature,
        @Nullable Boolean encipherOnly,
        @Nullable Boolean keyAgreement,
        @Nullable Boolean keyCertSign,
        @Nullable Boolean keyEncipherment,
        @Nullable Boolean nonRepudiation) {
        this.cRLSign = cRLSign;
        this.dataEncipherment = dataEncipherment;
        this.decipherOnly = decipherOnly;
        this.digitalSignature = digitalSignature;
        this.encipherOnly = encipherOnly;
        this.keyAgreement = keyAgreement;
        this.keyCertSign = keyCertSign;
        this.keyEncipherment = keyEncipherment;
        this.nonRepudiation = nonRepudiation;
    }

    public Optional<Boolean> getCRLSign() {
        return Optional.ofNullable(this.cRLSign);
    }
    public Optional<Boolean> getDataEncipherment() {
        return Optional.ofNullable(this.dataEncipherment);
    }
    public Optional<Boolean> getDecipherOnly() {
        return Optional.ofNullable(this.decipherOnly);
    }
    public Optional<Boolean> getDigitalSignature() {
        return Optional.ofNullable(this.digitalSignature);
    }
    public Optional<Boolean> getEncipherOnly() {
        return Optional.ofNullable(this.encipherOnly);
    }
    public Optional<Boolean> getKeyAgreement() {
        return Optional.ofNullable(this.keyAgreement);
    }
    public Optional<Boolean> getKeyCertSign() {
        return Optional.ofNullable(this.keyCertSign);
    }
    public Optional<Boolean> getKeyEncipherment() {
        return Optional.ofNullable(this.keyEncipherment);
    }
    public Optional<Boolean> getNonRepudiation() {
        return Optional.ofNullable(this.nonRepudiation);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateKeyUsage defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean cRLSign;
        private @Nullable Boolean dataEncipherment;
        private @Nullable Boolean decipherOnly;
        private @Nullable Boolean digitalSignature;
        private @Nullable Boolean encipherOnly;
        private @Nullable Boolean keyAgreement;
        private @Nullable Boolean keyCertSign;
        private @Nullable Boolean keyEncipherment;
        private @Nullable Boolean nonRepudiation;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateKeyUsage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cRLSign = defaults.cRLSign;
    	      this.dataEncipherment = defaults.dataEncipherment;
    	      this.decipherOnly = defaults.decipherOnly;
    	      this.digitalSignature = defaults.digitalSignature;
    	      this.encipherOnly = defaults.encipherOnly;
    	      this.keyAgreement = defaults.keyAgreement;
    	      this.keyCertSign = defaults.keyCertSign;
    	      this.keyEncipherment = defaults.keyEncipherment;
    	      this.nonRepudiation = defaults.nonRepudiation;
        }

        public Builder setCRLSign(@Nullable Boolean cRLSign) {
            this.cRLSign = cRLSign;
            return this;
        }

        public Builder setDataEncipherment(@Nullable Boolean dataEncipherment) {
            this.dataEncipherment = dataEncipherment;
            return this;
        }

        public Builder setDecipherOnly(@Nullable Boolean decipherOnly) {
            this.decipherOnly = decipherOnly;
            return this;
        }

        public Builder setDigitalSignature(@Nullable Boolean digitalSignature) {
            this.digitalSignature = digitalSignature;
            return this;
        }

        public Builder setEncipherOnly(@Nullable Boolean encipherOnly) {
            this.encipherOnly = encipherOnly;
            return this;
        }

        public Builder setKeyAgreement(@Nullable Boolean keyAgreement) {
            this.keyAgreement = keyAgreement;
            return this;
        }

        public Builder setKeyCertSign(@Nullable Boolean keyCertSign) {
            this.keyCertSign = keyCertSign;
            return this;
        }

        public Builder setKeyEncipherment(@Nullable Boolean keyEncipherment) {
            this.keyEncipherment = keyEncipherment;
            return this;
        }

        public Builder setNonRepudiation(@Nullable Boolean nonRepudiation) {
            this.nonRepudiation = nonRepudiation;
            return this;
        }

        public CertificateKeyUsage build() {
            return new CertificateKeyUsage(cRLSign, dataEncipherment, decipherOnly, digitalSignature, encipherOnly, keyAgreement, keyCertSign, keyEncipherment, nonRepudiation);
        }
    }
}
