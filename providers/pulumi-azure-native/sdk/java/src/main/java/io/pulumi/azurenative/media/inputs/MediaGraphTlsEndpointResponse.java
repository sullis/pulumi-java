// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.azurenative.media.inputs.MediaGraphPemCertificateListResponse;
import io.pulumi.azurenative.media.inputs.MediaGraphTlsValidationOptionsResponse;
import io.pulumi.azurenative.media.inputs.MediaGraphUsernamePasswordCredentialsResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * An endpoint which must be connected over TLS/SSL.
 * 
 */
public final class MediaGraphTlsEndpointResponse extends io.pulumi.resources.InvokeArgs {

    public static final MediaGraphTlsEndpointResponse Empty = new MediaGraphTlsEndpointResponse();

    /**
     * Polymorphic credentials to present to the endpoint.
     * 
     */
    @InputImport(name="credentials")
    private final @Nullable MediaGraphUsernamePasswordCredentialsResponse credentials;

    public Optional<MediaGraphUsernamePasswordCredentialsResponse> getCredentials() {
        return this.credentials == null ? Optional.empty() : Optional.ofNullable(this.credentials);
    }

    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.MediaGraphTlsEndpoint'.
     * 
     */
    @InputImport(name="odataType", required=true)
    private final String odataType;

    public String getOdataType() {
        return this.odataType;
    }

    /**
     * What certificates should be trusted when authenticating a TLS connection. Null designates that Azure Media's source of trust should be used.
     * 
     */
    @InputImport(name="trustedCertificates")
    private final @Nullable MediaGraphPemCertificateListResponse trustedCertificates;

    public Optional<MediaGraphPemCertificateListResponse> getTrustedCertificates() {
        return this.trustedCertificates == null ? Optional.empty() : Optional.ofNullable(this.trustedCertificates);
    }

    /**
     * Url for the endpoint.
     * 
     */
    @InputImport(name="url", required=true)
    private final String url;

    public String getUrl() {
        return this.url;
    }

    /**
     * Validation options to use when authenticating a TLS connection. By default, strict validation is used.
     * 
     */
    @InputImport(name="validationOptions")
    private final @Nullable MediaGraphTlsValidationOptionsResponse validationOptions;

    public Optional<MediaGraphTlsValidationOptionsResponse> getValidationOptions() {
        return this.validationOptions == null ? Optional.empty() : Optional.ofNullable(this.validationOptions);
    }

    public MediaGraphTlsEndpointResponse(
        @Nullable MediaGraphUsernamePasswordCredentialsResponse credentials,
        String odataType,
        @Nullable MediaGraphPemCertificateListResponse trustedCertificates,
        String url,
        @Nullable MediaGraphTlsValidationOptionsResponse validationOptions) {
        this.credentials = credentials;
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
        this.trustedCertificates = trustedCertificates;
        this.url = Objects.requireNonNull(url, "expected parameter 'url' to be non-null");
        this.validationOptions = validationOptions;
    }

    private MediaGraphTlsEndpointResponse() {
        this.credentials = null;
        this.odataType = null;
        this.trustedCertificates = null;
        this.url = null;
        this.validationOptions = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MediaGraphTlsEndpointResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable MediaGraphUsernamePasswordCredentialsResponse credentials;
        private String odataType;
        private @Nullable MediaGraphPemCertificateListResponse trustedCertificates;
        private String url;
        private @Nullable MediaGraphTlsValidationOptionsResponse validationOptions;

        public Builder() {
    	      // Empty
        }

        public Builder(MediaGraphTlsEndpointResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.credentials = defaults.credentials;
    	      this.odataType = defaults.odataType;
    	      this.trustedCertificates = defaults.trustedCertificates;
    	      this.url = defaults.url;
    	      this.validationOptions = defaults.validationOptions;
        }

        public Builder setCredentials(@Nullable MediaGraphUsernamePasswordCredentialsResponse credentials) {
            this.credentials = credentials;
            return this;
        }

        public Builder setOdataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }

        public Builder setTrustedCertificates(@Nullable MediaGraphPemCertificateListResponse trustedCertificates) {
            this.trustedCertificates = trustedCertificates;
            return this;
        }

        public Builder setUrl(String url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }

        public Builder setValidationOptions(@Nullable MediaGraphTlsValidationOptionsResponse validationOptions) {
            this.validationOptions = validationOptions;
            return this;
        }

        public MediaGraphTlsEndpointResponse build() {
            return new MediaGraphTlsEndpointResponse(credentials, odataType, trustedCertificates, url, validationOptions);
        }
    }
}
