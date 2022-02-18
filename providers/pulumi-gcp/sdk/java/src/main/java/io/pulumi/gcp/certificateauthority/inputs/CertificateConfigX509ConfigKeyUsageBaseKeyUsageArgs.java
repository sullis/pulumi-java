// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.certificateauthority.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CertificateConfigX509ConfigKeyUsageBaseKeyUsageArgs extends io.pulumi.resources.ResourceArgs {

    public static final CertificateConfigX509ConfigKeyUsageBaseKeyUsageArgs Empty = new CertificateConfigX509ConfigKeyUsageBaseKeyUsageArgs();

    /**
     * The key may be used to sign certificates.
     * 
     */
    @InputImport(name="certSign")
    private final @Nullable Input<Boolean> certSign;

    public Input<Boolean> getCertSign() {
        return this.certSign == null ? Input.empty() : this.certSign;
    }

    /**
     * The key may be used for cryptographic commitments. Note that this may also be referred to as "non-repudiation".
     * 
     */
    @InputImport(name="contentCommitment")
    private final @Nullable Input<Boolean> contentCommitment;

    public Input<Boolean> getContentCommitment() {
        return this.contentCommitment == null ? Input.empty() : this.contentCommitment;
    }

    /**
     * The key may be used sign certificate revocation lists.
     * 
     */
    @InputImport(name="crlSign")
    private final @Nullable Input<Boolean> crlSign;

    public Input<Boolean> getCrlSign() {
        return this.crlSign == null ? Input.empty() : this.crlSign;
    }

    /**
     * The key may be used to encipher data.
     * 
     */
    @InputImport(name="dataEncipherment")
    private final @Nullable Input<Boolean> dataEncipherment;

    public Input<Boolean> getDataEncipherment() {
        return this.dataEncipherment == null ? Input.empty() : this.dataEncipherment;
    }

    /**
     * The key may be used to decipher only.
     * 
     */
    @InputImport(name="decipherOnly")
    private final @Nullable Input<Boolean> decipherOnly;

    public Input<Boolean> getDecipherOnly() {
        return this.decipherOnly == null ? Input.empty() : this.decipherOnly;
    }

    /**
     * The key may be used for digital signatures.
     * 
     */
    @InputImport(name="digitalSignature")
    private final @Nullable Input<Boolean> digitalSignature;

    public Input<Boolean> getDigitalSignature() {
        return this.digitalSignature == null ? Input.empty() : this.digitalSignature;
    }

    /**
     * The key may be used to encipher only.
     * 
     */
    @InputImport(name="encipherOnly")
    private final @Nullable Input<Boolean> encipherOnly;

    public Input<Boolean> getEncipherOnly() {
        return this.encipherOnly == null ? Input.empty() : this.encipherOnly;
    }

    /**
     * The key may be used in a key agreement protocol.
     * 
     */
    @InputImport(name="keyAgreement")
    private final @Nullable Input<Boolean> keyAgreement;

    public Input<Boolean> getKeyAgreement() {
        return this.keyAgreement == null ? Input.empty() : this.keyAgreement;
    }

    /**
     * The key may be used to encipher other keys.
     * 
     */
    @InputImport(name="keyEncipherment")
    private final @Nullable Input<Boolean> keyEncipherment;

    public Input<Boolean> getKeyEncipherment() {
        return this.keyEncipherment == null ? Input.empty() : this.keyEncipherment;
    }

    public CertificateConfigX509ConfigKeyUsageBaseKeyUsageArgs(
        @Nullable Input<Boolean> certSign,
        @Nullable Input<Boolean> contentCommitment,
        @Nullable Input<Boolean> crlSign,
        @Nullable Input<Boolean> dataEncipherment,
        @Nullable Input<Boolean> decipherOnly,
        @Nullable Input<Boolean> digitalSignature,
        @Nullable Input<Boolean> encipherOnly,
        @Nullable Input<Boolean> keyAgreement,
        @Nullable Input<Boolean> keyEncipherment) {
        this.certSign = certSign;
        this.contentCommitment = contentCommitment;
        this.crlSign = crlSign;
        this.dataEncipherment = dataEncipherment;
        this.decipherOnly = decipherOnly;
        this.digitalSignature = digitalSignature;
        this.encipherOnly = encipherOnly;
        this.keyAgreement = keyAgreement;
        this.keyEncipherment = keyEncipherment;
    }

    private CertificateConfigX509ConfigKeyUsageBaseKeyUsageArgs() {
        this.certSign = Input.empty();
        this.contentCommitment = Input.empty();
        this.crlSign = Input.empty();
        this.dataEncipherment = Input.empty();
        this.decipherOnly = Input.empty();
        this.digitalSignature = Input.empty();
        this.encipherOnly = Input.empty();
        this.keyAgreement = Input.empty();
        this.keyEncipherment = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateConfigX509ConfigKeyUsageBaseKeyUsageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> certSign;
        private @Nullable Input<Boolean> contentCommitment;
        private @Nullable Input<Boolean> crlSign;
        private @Nullable Input<Boolean> dataEncipherment;
        private @Nullable Input<Boolean> decipherOnly;
        private @Nullable Input<Boolean> digitalSignature;
        private @Nullable Input<Boolean> encipherOnly;
        private @Nullable Input<Boolean> keyAgreement;
        private @Nullable Input<Boolean> keyEncipherment;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateConfigX509ConfigKeyUsageBaseKeyUsageArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certSign = defaults.certSign;
    	      this.contentCommitment = defaults.contentCommitment;
    	      this.crlSign = defaults.crlSign;
    	      this.dataEncipherment = defaults.dataEncipherment;
    	      this.decipherOnly = defaults.decipherOnly;
    	      this.digitalSignature = defaults.digitalSignature;
    	      this.encipherOnly = defaults.encipherOnly;
    	      this.keyAgreement = defaults.keyAgreement;
    	      this.keyEncipherment = defaults.keyEncipherment;
        }

        public Builder setCertSign(@Nullable Input<Boolean> certSign) {
            this.certSign = certSign;
            return this;
        }

        public Builder setCertSign(@Nullable Boolean certSign) {
            this.certSign = Input.ofNullable(certSign);
            return this;
        }

        public Builder setContentCommitment(@Nullable Input<Boolean> contentCommitment) {
            this.contentCommitment = contentCommitment;
            return this;
        }

        public Builder setContentCommitment(@Nullable Boolean contentCommitment) {
            this.contentCommitment = Input.ofNullable(contentCommitment);
            return this;
        }

        public Builder setCrlSign(@Nullable Input<Boolean> crlSign) {
            this.crlSign = crlSign;
            return this;
        }

        public Builder setCrlSign(@Nullable Boolean crlSign) {
            this.crlSign = Input.ofNullable(crlSign);
            return this;
        }

        public Builder setDataEncipherment(@Nullable Input<Boolean> dataEncipherment) {
            this.dataEncipherment = dataEncipherment;
            return this;
        }

        public Builder setDataEncipherment(@Nullable Boolean dataEncipherment) {
            this.dataEncipherment = Input.ofNullable(dataEncipherment);
            return this;
        }

        public Builder setDecipherOnly(@Nullable Input<Boolean> decipherOnly) {
            this.decipherOnly = decipherOnly;
            return this;
        }

        public Builder setDecipherOnly(@Nullable Boolean decipherOnly) {
            this.decipherOnly = Input.ofNullable(decipherOnly);
            return this;
        }

        public Builder setDigitalSignature(@Nullable Input<Boolean> digitalSignature) {
            this.digitalSignature = digitalSignature;
            return this;
        }

        public Builder setDigitalSignature(@Nullable Boolean digitalSignature) {
            this.digitalSignature = Input.ofNullable(digitalSignature);
            return this;
        }

        public Builder setEncipherOnly(@Nullable Input<Boolean> encipherOnly) {
            this.encipherOnly = encipherOnly;
            return this;
        }

        public Builder setEncipherOnly(@Nullable Boolean encipherOnly) {
            this.encipherOnly = Input.ofNullable(encipherOnly);
            return this;
        }

        public Builder setKeyAgreement(@Nullable Input<Boolean> keyAgreement) {
            this.keyAgreement = keyAgreement;
            return this;
        }

        public Builder setKeyAgreement(@Nullable Boolean keyAgreement) {
            this.keyAgreement = Input.ofNullable(keyAgreement);
            return this;
        }

        public Builder setKeyEncipherment(@Nullable Input<Boolean> keyEncipherment) {
            this.keyEncipherment = keyEncipherment;
            return this;
        }

        public Builder setKeyEncipherment(@Nullable Boolean keyEncipherment) {
            this.keyEncipherment = Input.ofNullable(keyEncipherment);
            return this;
        }

        public CertificateConfigX509ConfigKeyUsageBaseKeyUsageArgs build() {
            return new CertificateConfigX509ConfigKeyUsageBaseKeyUsageArgs(certSign, contentCommitment, crlSign, dataEncipherment, decipherOnly, digitalSignature, encipherOnly, keyAgreement, keyEncipherment);
        }
    }
}
