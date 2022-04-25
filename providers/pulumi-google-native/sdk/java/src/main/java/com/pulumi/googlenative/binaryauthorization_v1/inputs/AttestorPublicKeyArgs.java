// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.binaryauthorization_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.binaryauthorization_v1.inputs.PkixPublicKeyArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * An attestor public key that will be used to verify attestations signed by this attestor.
 * 
 */
public final class AttestorPublicKeyArgs extends com.pulumi.resources.ResourceArgs {

    public static final AttestorPublicKeyArgs Empty = new AttestorPublicKeyArgs();

    /**
     * ASCII-armored representation of a PGP public key, as the entire output by the command `gpg --export --armor foo@example.com` (either LF or CRLF line endings). When using this field, `id` should be left blank. The BinAuthz API handlers will calculate the ID and fill it in automatically. BinAuthz computes this ID as the OpenPGP RFC4880 V4 fingerprint, represented as upper-case hex. If `id` is provided by the caller, it will be overwritten by the API-calculated ID.
     * 
     */
    @Import(name="asciiArmoredPgpPublicKey")
    private @Nullable Output<String> asciiArmoredPgpPublicKey;

    /**
     * @return ASCII-armored representation of a PGP public key, as the entire output by the command `gpg --export --armor foo@example.com` (either LF or CRLF line endings). When using this field, `id` should be left blank. The BinAuthz API handlers will calculate the ID and fill it in automatically. BinAuthz computes this ID as the OpenPGP RFC4880 V4 fingerprint, represented as upper-case hex. If `id` is provided by the caller, it will be overwritten by the API-calculated ID.
     * 
     */
    public Optional<Output<String>> asciiArmoredPgpPublicKey() {
        return Optional.ofNullable(this.asciiArmoredPgpPublicKey);
    }

    /**
     * Optional. A descriptive comment. This field may be updated.
     * 
     */
    @Import(name="comment")
    private @Nullable Output<String> comment;

    /**
     * @return Optional. A descriptive comment. This field may be updated.
     * 
     */
    public Optional<Output<String>> comment() {
        return Optional.ofNullable(this.comment);
    }

    /**
     * The ID of this public key. Signatures verified by BinAuthz must include the ID of the public key that can be used to verify them, and that ID must match the contents of this field exactly. Additional restrictions on this field can be imposed based on which public key type is encapsulated. See the documentation on `public_key` cases below for details.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return The ID of this public key. Signatures verified by BinAuthz must include the ID of the public key that can be used to verify them, and that ID must match the contents of this field exactly. Additional restrictions on this field can be imposed based on which public key type is encapsulated. See the documentation on `public_key` cases below for details.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * A raw PKIX SubjectPublicKeyInfo format public key. NOTE: `id` may be explicitly provided by the caller when using this type of public key, but it MUST be a valid RFC3986 URI. If `id` is left blank, a default one will be computed based on the digest of the DER encoding of the public key.
     * 
     */
    @Import(name="pkixPublicKey")
    private @Nullable Output<PkixPublicKeyArgs> pkixPublicKey;

    /**
     * @return A raw PKIX SubjectPublicKeyInfo format public key. NOTE: `id` may be explicitly provided by the caller when using this type of public key, but it MUST be a valid RFC3986 URI. If `id` is left blank, a default one will be computed based on the digest of the DER encoding of the public key.
     * 
     */
    public Optional<Output<PkixPublicKeyArgs>> pkixPublicKey() {
        return Optional.ofNullable(this.pkixPublicKey);
    }

    private AttestorPublicKeyArgs() {}

    private AttestorPublicKeyArgs(AttestorPublicKeyArgs $) {
        this.asciiArmoredPgpPublicKey = $.asciiArmoredPgpPublicKey;
        this.comment = $.comment;
        this.id = $.id;
        this.pkixPublicKey = $.pkixPublicKey;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AttestorPublicKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AttestorPublicKeyArgs $;

        public Builder() {
            $ = new AttestorPublicKeyArgs();
        }

        public Builder(AttestorPublicKeyArgs defaults) {
            $ = new AttestorPublicKeyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param asciiArmoredPgpPublicKey ASCII-armored representation of a PGP public key, as the entire output by the command `gpg --export --armor foo@example.com` (either LF or CRLF line endings). When using this field, `id` should be left blank. The BinAuthz API handlers will calculate the ID and fill it in automatically. BinAuthz computes this ID as the OpenPGP RFC4880 V4 fingerprint, represented as upper-case hex. If `id` is provided by the caller, it will be overwritten by the API-calculated ID.
         * 
         * @return builder
         * 
         */
        public Builder asciiArmoredPgpPublicKey(@Nullable Output<String> asciiArmoredPgpPublicKey) {
            $.asciiArmoredPgpPublicKey = asciiArmoredPgpPublicKey;
            return this;
        }

        /**
         * @param asciiArmoredPgpPublicKey ASCII-armored representation of a PGP public key, as the entire output by the command `gpg --export --armor foo@example.com` (either LF or CRLF line endings). When using this field, `id` should be left blank. The BinAuthz API handlers will calculate the ID and fill it in automatically. BinAuthz computes this ID as the OpenPGP RFC4880 V4 fingerprint, represented as upper-case hex. If `id` is provided by the caller, it will be overwritten by the API-calculated ID.
         * 
         * @return builder
         * 
         */
        public Builder asciiArmoredPgpPublicKey(String asciiArmoredPgpPublicKey) {
            return asciiArmoredPgpPublicKey(Output.of(asciiArmoredPgpPublicKey));
        }

        /**
         * @param comment Optional. A descriptive comment. This field may be updated.
         * 
         * @return builder
         * 
         */
        public Builder comment(@Nullable Output<String> comment) {
            $.comment = comment;
            return this;
        }

        /**
         * @param comment Optional. A descriptive comment. This field may be updated.
         * 
         * @return builder
         * 
         */
        public Builder comment(String comment) {
            return comment(Output.of(comment));
        }

        /**
         * @param id The ID of this public key. Signatures verified by BinAuthz must include the ID of the public key that can be used to verify them, and that ID must match the contents of this field exactly. Additional restrictions on this field can be imposed based on which public key type is encapsulated. See the documentation on `public_key` cases below for details.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The ID of this public key. Signatures verified by BinAuthz must include the ID of the public key that can be used to verify them, and that ID must match the contents of this field exactly. Additional restrictions on this field can be imposed based on which public key type is encapsulated. See the documentation on `public_key` cases below for details.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param pkixPublicKey A raw PKIX SubjectPublicKeyInfo format public key. NOTE: `id` may be explicitly provided by the caller when using this type of public key, but it MUST be a valid RFC3986 URI. If `id` is left blank, a default one will be computed based on the digest of the DER encoding of the public key.
         * 
         * @return builder
         * 
         */
        public Builder pkixPublicKey(@Nullable Output<PkixPublicKeyArgs> pkixPublicKey) {
            $.pkixPublicKey = pkixPublicKey;
            return this;
        }

        /**
         * @param pkixPublicKey A raw PKIX SubjectPublicKeyInfo format public key. NOTE: `id` may be explicitly provided by the caller when using this type of public key, but it MUST be a valid RFC3986 URI. If `id` is left blank, a default one will be computed based on the digest of the DER encoding of the public key.
         * 
         * @return builder
         * 
         */
        public Builder pkixPublicKey(PkixPublicKeyArgs pkixPublicKey) {
            return pkixPublicKey(Output.of(pkixPublicKey));
        }

        public AttestorPublicKeyArgs build() {
            return $;
        }
    }

}
