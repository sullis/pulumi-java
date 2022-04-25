// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudkms_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * The public key component of the wrapping key. For details of the type of key this public key corresponds to, see the ImportMethod.
 * 
 */
public final class WrappingPublicKeyResponse extends com.pulumi.resources.InvokeArgs {

    public static final WrappingPublicKeyResponse Empty = new WrappingPublicKeyResponse();

    /**
     * The public key, encoded in PEM format. For more information, see the [RFC 7468](https://tools.ietf.org/html/rfc7468) sections for [General Considerations](https://tools.ietf.org/html/rfc7468#section-2) and [Textual Encoding of Subject Public Key Info] (https://tools.ietf.org/html/rfc7468#section-13).
     * 
     */
    @Import(name="pem", required=true)
    private String pem;

    /**
     * @return The public key, encoded in PEM format. For more information, see the [RFC 7468](https://tools.ietf.org/html/rfc7468) sections for [General Considerations](https://tools.ietf.org/html/rfc7468#section-2) and [Textual Encoding of Subject Public Key Info] (https://tools.ietf.org/html/rfc7468#section-13).
     * 
     */
    public String pem() {
        return this.pem;
    }

    private WrappingPublicKeyResponse() {}

    private WrappingPublicKeyResponse(WrappingPublicKeyResponse $) {
        this.pem = $.pem;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WrappingPublicKeyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WrappingPublicKeyResponse $;

        public Builder() {
            $ = new WrappingPublicKeyResponse();
        }

        public Builder(WrappingPublicKeyResponse defaults) {
            $ = new WrappingPublicKeyResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param pem The public key, encoded in PEM format. For more information, see the [RFC 7468](https://tools.ietf.org/html/rfc7468) sections for [General Considerations](https://tools.ietf.org/html/rfc7468#section-2) and [Textual Encoding of Subject Public Key Info] (https://tools.ietf.org/html/rfc7468#section-13).
         * 
         * @return builder
         * 
         */
        public Builder pem(String pem) {
            $.pem = pem;
            return this;
        }

        public WrappingPublicKeyResponse build() {
            $.pem = Objects.requireNonNull($.pem, "expected parameter 'pem' to be non-null");
            return $;
        }
    }

}
