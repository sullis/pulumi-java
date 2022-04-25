// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerregistry.inputs;

import com.pulumi.azurenative.containerregistry.inputs.TlsCertificatePropertiesResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * The TLS properties of the connected registry login server.
 * 
 */
public final class TlsPropertiesResponse extends com.pulumi.resources.InvokeArgs {

    public static final TlsPropertiesResponse Empty = new TlsPropertiesResponse();

    /**
     * The certificate used to configure HTTPS for the login server.
     * 
     */
    @Import(name="certificate", required=true)
    private TlsCertificatePropertiesResponse certificate;

    /**
     * @return The certificate used to configure HTTPS for the login server.
     * 
     */
    public TlsCertificatePropertiesResponse certificate() {
        return this.certificate;
    }

    /**
     * Indicates whether HTTPS is enabled for the login server.
     * 
     */
    @Import(name="status", required=true)
    private String status;

    /**
     * @return Indicates whether HTTPS is enabled for the login server.
     * 
     */
    public String status() {
        return this.status;
    }

    private TlsPropertiesResponse() {}

    private TlsPropertiesResponse(TlsPropertiesResponse $) {
        this.certificate = $.certificate;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TlsPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TlsPropertiesResponse $;

        public Builder() {
            $ = new TlsPropertiesResponse();
        }

        public Builder(TlsPropertiesResponse defaults) {
            $ = new TlsPropertiesResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param certificate The certificate used to configure HTTPS for the login server.
         * 
         * @return builder
         * 
         */
        public Builder certificate(TlsCertificatePropertiesResponse certificate) {
            $.certificate = certificate;
            return this;
        }

        /**
         * @param status Indicates whether HTTPS is enabled for the login server.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            $.status = status;
            return this;
        }

        public TlsPropertiesResponse build() {
            $.certificate = Objects.requireNonNull($.certificate, "expected parameter 'certificate' to be non-null");
            $.status = Objects.requireNonNull($.status, "expected parameter 'status' to be non-null");
            return $;
        }
    }

}
