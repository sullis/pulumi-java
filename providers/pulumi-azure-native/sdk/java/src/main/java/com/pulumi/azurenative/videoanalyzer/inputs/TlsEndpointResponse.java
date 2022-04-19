// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.videoanalyzer.inputs;

import com.pulumi.azurenative.videoanalyzer.inputs.PemCertificateListResponse;
import com.pulumi.azurenative.videoanalyzer.inputs.SecureIotDeviceRemoteTunnelResponse;
import com.pulumi.azurenative.videoanalyzer.inputs.TlsValidationOptionsResponse;
import com.pulumi.azurenative.videoanalyzer.inputs.UsernamePasswordCredentialsResponse;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * TLS endpoint describes an endpoint that the pipeline can connect to over TLS transport (data is encrypted in transit).
 * 
 */
public final class TlsEndpointResponse extends com.pulumi.resources.InvokeArgs {

    public static final TlsEndpointResponse Empty = new TlsEndpointResponse();

    /**
     * Credentials to be presented to the endpoint.
     * 
     */
    @Import(name="credentials", required=true)
      private final UsernamePasswordCredentialsResponse credentials;

    public UsernamePasswordCredentialsResponse credentials() {
        return this.credentials;
    }

    /**
     * List of trusted certificate authorities when authenticating a TLS connection. A null list designates that Azure Video Analyzer's list of trusted authorities should be used.
     * 
     */
    @Import(name="trustedCertificates")
      private final @Nullable PemCertificateListResponse trustedCertificates;

    public Optional<PemCertificateListResponse> trustedCertificates() {
        return this.trustedCertificates == null ? Optional.empty() : Optional.ofNullable(this.trustedCertificates);
    }

    /**
     * Describes the tunnel through which Video Analyzer can connect to the endpoint URL. This is an optional property, typically used when the endpoint is behind a firewall.
     * 
     */
    @Import(name="tunnel")
      private final @Nullable SecureIotDeviceRemoteTunnelResponse tunnel;

    public Optional<SecureIotDeviceRemoteTunnelResponse> tunnel() {
        return this.tunnel == null ? Optional.empty() : Optional.ofNullable(this.tunnel);
    }

    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.VideoAnalyzer.TlsEndpoint'.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String type() {
        return this.type;
    }

    /**
     * The endpoint URL for Video Analyzer to connect to.
     * 
     */
    @Import(name="url", required=true)
      private final String url;

    public String url() {
        return this.url;
    }

    /**
     * Validation options to use when authenticating a TLS connection. By default, strict validation is used.
     * 
     */
    @Import(name="validationOptions")
      private final @Nullable TlsValidationOptionsResponse validationOptions;

    public Optional<TlsValidationOptionsResponse> validationOptions() {
        return this.validationOptions == null ? Optional.empty() : Optional.ofNullable(this.validationOptions);
    }

    public TlsEndpointResponse(
        UsernamePasswordCredentialsResponse credentials,
        @Nullable PemCertificateListResponse trustedCertificates,
        @Nullable SecureIotDeviceRemoteTunnelResponse tunnel,
        String type,
        String url,
        @Nullable TlsValidationOptionsResponse validationOptions) {
        this.credentials = Objects.requireNonNull(credentials, "expected parameter 'credentials' to be non-null");
        this.trustedCertificates = trustedCertificates;
        this.tunnel = tunnel;
        this.type = Codegen.stringProp("type").arg(type).require();
        this.url = Objects.requireNonNull(url, "expected parameter 'url' to be non-null");
        this.validationOptions = validationOptions;
    }

    private TlsEndpointResponse() {
        this.credentials = null;
        this.trustedCertificates = null;
        this.tunnel = null;
        this.type = null;
        this.url = null;
        this.validationOptions = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TlsEndpointResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UsernamePasswordCredentialsResponse credentials;
        private @Nullable PemCertificateListResponse trustedCertificates;
        private @Nullable SecureIotDeviceRemoteTunnelResponse tunnel;
        private String type;
        private String url;
        private @Nullable TlsValidationOptionsResponse validationOptions;

        public Builder() {
    	      // Empty
        }

        public Builder(TlsEndpointResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.credentials = defaults.credentials;
    	      this.trustedCertificates = defaults.trustedCertificates;
    	      this.tunnel = defaults.tunnel;
    	      this.type = defaults.type;
    	      this.url = defaults.url;
    	      this.validationOptions = defaults.validationOptions;
        }

        public Builder credentials(UsernamePasswordCredentialsResponse credentials) {
            this.credentials = Objects.requireNonNull(credentials);
            return this;
        }
        public Builder trustedCertificates(@Nullable PemCertificateListResponse trustedCertificates) {
            this.trustedCertificates = trustedCertificates;
            return this;
        }
        public Builder tunnel(@Nullable SecureIotDeviceRemoteTunnelResponse tunnel) {
            this.tunnel = tunnel;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder url(String url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }
        public Builder validationOptions(@Nullable TlsValidationOptionsResponse validationOptions) {
            this.validationOptions = validationOptions;
            return this;
        }        public TlsEndpointResponse build() {
            return new TlsEndpointResponse(credentials, trustedCertificates, tunnel, type, url, validationOptions);
        }
    }
}
