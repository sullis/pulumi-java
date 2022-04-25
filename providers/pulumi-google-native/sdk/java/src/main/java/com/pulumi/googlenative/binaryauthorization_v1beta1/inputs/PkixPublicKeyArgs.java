// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.binaryauthorization_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.binaryauthorization_v1beta1.enums.PkixPublicKeySignatureAlgorithm;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A public key in the PkixPublicKey format (see https://tools.ietf.org/html/rfc5280#section-4.1.2.7 for details). Public keys of this type are typically textually encoded using the PEM format.
 * 
 */
public final class PkixPublicKeyArgs extends com.pulumi.resources.ResourceArgs {

    public static final PkixPublicKeyArgs Empty = new PkixPublicKeyArgs();

    /**
     * A PEM-encoded public key, as described in https://tools.ietf.org/html/rfc7468#section-13
     * 
     */
    @Import(name="publicKeyPem")
    private @Nullable Output<String> publicKeyPem;

    /**
     * @return A PEM-encoded public key, as described in https://tools.ietf.org/html/rfc7468#section-13
     * 
     */
    public Optional<Output<String>> publicKeyPem() {
        return Optional.ofNullable(this.publicKeyPem);
    }

    /**
     * The signature algorithm used to verify a message against a signature using this key. These signature algorithm must match the structure and any object identifiers encoded in `public_key_pem` (i.e. this algorithm must match that of the public key).
     * 
     */
    @Import(name="signatureAlgorithm")
    private @Nullable Output<PkixPublicKeySignatureAlgorithm> signatureAlgorithm;

    /**
     * @return The signature algorithm used to verify a message against a signature using this key. These signature algorithm must match the structure and any object identifiers encoded in `public_key_pem` (i.e. this algorithm must match that of the public key).
     * 
     */
    public Optional<Output<PkixPublicKeySignatureAlgorithm>> signatureAlgorithm() {
        return Optional.ofNullable(this.signatureAlgorithm);
    }

    private PkixPublicKeyArgs() {}

    private PkixPublicKeyArgs(PkixPublicKeyArgs $) {
        this.publicKeyPem = $.publicKeyPem;
        this.signatureAlgorithm = $.signatureAlgorithm;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PkixPublicKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PkixPublicKeyArgs $;

        public Builder() {
            $ = new PkixPublicKeyArgs();
        }

        public Builder(PkixPublicKeyArgs defaults) {
            $ = new PkixPublicKeyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param publicKeyPem A PEM-encoded public key, as described in https://tools.ietf.org/html/rfc7468#section-13
         * 
         * @return builder
         * 
         */
        public Builder publicKeyPem(@Nullable Output<String> publicKeyPem) {
            $.publicKeyPem = publicKeyPem;
            return this;
        }

        /**
         * @param publicKeyPem A PEM-encoded public key, as described in https://tools.ietf.org/html/rfc7468#section-13
         * 
         * @return builder
         * 
         */
        public Builder publicKeyPem(String publicKeyPem) {
            return publicKeyPem(Output.of(publicKeyPem));
        }

        /**
         * @param signatureAlgorithm The signature algorithm used to verify a message against a signature using this key. These signature algorithm must match the structure and any object identifiers encoded in `public_key_pem` (i.e. this algorithm must match that of the public key).
         * 
         * @return builder
         * 
         */
        public Builder signatureAlgorithm(@Nullable Output<PkixPublicKeySignatureAlgorithm> signatureAlgorithm) {
            $.signatureAlgorithm = signatureAlgorithm;
            return this;
        }

        /**
         * @param signatureAlgorithm The signature algorithm used to verify a message against a signature using this key. These signature algorithm must match the structure and any object identifiers encoded in `public_key_pem` (i.e. this algorithm must match that of the public key).
         * 
         * @return builder
         * 
         */
        public Builder signatureAlgorithm(PkixPublicKeySignatureAlgorithm signatureAlgorithm) {
            return signatureAlgorithm(Output.of(signatureAlgorithm));
        }

        public PkixPublicKeyArgs build() {
            return $;
        }
    }

}
