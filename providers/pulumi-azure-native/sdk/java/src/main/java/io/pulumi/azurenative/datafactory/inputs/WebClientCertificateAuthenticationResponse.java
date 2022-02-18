// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.AzureKeyVaultSecretReferenceResponse;
import io.pulumi.azurenative.datafactory.inputs.SecureStringResponse;
import io.pulumi.core.Either;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;


/**
 * A WebLinkedService that uses client certificate based authentication to communicate with an HTTP endpoint. This scheme follows mutual authentication; the server must also provide valid credentials to the client.
 * 
 */
public final class WebClientCertificateAuthenticationResponse extends io.pulumi.resources.InvokeArgs {

    public static final WebClientCertificateAuthenticationResponse Empty = new WebClientCertificateAuthenticationResponse();

    /**
     * Type of authentication used to connect to the web table source.
     * Expected value is 'ClientCertificate'.
     * 
     */
    @InputImport(name="authenticationType", required=true)
    private final String authenticationType;

    public String getAuthenticationType() {
        return this.authenticationType;
    }

    /**
     * Password for the PFX file.
     * 
     */
    @InputImport(name="password", required=true)
    private final Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password;

    public Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> getPassword() {
        return this.password;
    }

    /**
     * Base64-encoded contents of a PFX file.
     * 
     */
    @InputImport(name="pfx", required=true)
    private final Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> pfx;

    public Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> getPfx() {
        return this.pfx;
    }

    /**
     * The URL of the web service endpoint, e.g. http://www.microsoft.com . Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="url", required=true)
    private final Object url;

    public Object getUrl() {
        return this.url;
    }

    public WebClientCertificateAuthenticationResponse(
        String authenticationType,
        Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password,
        Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> pfx,
        Object url) {
        this.authenticationType = Objects.requireNonNull(authenticationType, "expected parameter 'authenticationType' to be non-null");
        this.password = Objects.requireNonNull(password, "expected parameter 'password' to be non-null");
        this.pfx = Objects.requireNonNull(pfx, "expected parameter 'pfx' to be non-null");
        this.url = Objects.requireNonNull(url, "expected parameter 'url' to be non-null");
    }

    private WebClientCertificateAuthenticationResponse() {
        this.authenticationType = null;
        this.password = null;
        this.pfx = null;
        this.url = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebClientCertificateAuthenticationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String authenticationType;
        private Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password;
        private Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> pfx;
        private Object url;

        public Builder() {
    	      // Empty
        }

        public Builder(WebClientCertificateAuthenticationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authenticationType = defaults.authenticationType;
    	      this.password = defaults.password;
    	      this.pfx = defaults.pfx;
    	      this.url = defaults.url;
        }

        public Builder setAuthenticationType(String authenticationType) {
            this.authenticationType = Objects.requireNonNull(authenticationType);
            return this;
        }

        public Builder setPassword(Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }

        public Builder setPfx(Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> pfx) {
            this.pfx = Objects.requireNonNull(pfx);
            return this;
        }

        public Builder setUrl(Object url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }

        public WebClientCertificateAuthenticationResponse build() {
            return new WebClientCertificateAuthenticationResponse(authenticationType, password, pfx, url);
        }
    }
}
