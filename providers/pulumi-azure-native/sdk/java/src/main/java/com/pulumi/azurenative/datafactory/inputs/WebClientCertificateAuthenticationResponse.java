// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.inputs.AzureKeyVaultSecretReferenceResponse;
import com.pulumi.azurenative.datafactory.inputs.SecureStringResponse;
import com.pulumi.core.Either;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;


/**
 * A WebLinkedService that uses client certificate based authentication to communicate with an HTTP endpoint. This scheme follows mutual authentication; the server must also provide valid credentials to the client.
 * 
 */
public final class WebClientCertificateAuthenticationResponse extends com.pulumi.resources.InvokeArgs {

    public static final WebClientCertificateAuthenticationResponse Empty = new WebClientCertificateAuthenticationResponse();

    /**
     * Type of authentication used to connect to the web table source.
     * Expected value is 'ClientCertificate'.
     * 
     */
    @Import(name="authenticationType", required=true)
      private final String authenticationType;

    public String authenticationType() {
        return this.authenticationType;
    }

    /**
     * Password for the PFX file.
     * 
     */
    @Import(name="password", required=true)
      private final Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password;

    public Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password() {
        return this.password;
    }

    /**
     * Base64-encoded contents of a PFX file.
     * 
     */
    @Import(name="pfx", required=true)
      private final Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> pfx;

    public Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> pfx() {
        return this.pfx;
    }

    /**
     * The URL of the web service endpoint, e.g. http://www.microsoft.com . Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="url", required=true)
      private final Object url;

    public Object url() {
        return this.url;
    }

    public WebClientCertificateAuthenticationResponse(
        String authenticationType,
        Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password,
        Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> pfx,
        Object url) {
        this.authenticationType = Codegen.stringProp("authenticationType").arg(authenticationType).require();
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

        public Builder authenticationType(String authenticationType) {
            this.authenticationType = Objects.requireNonNull(authenticationType);
            return this;
        }
        public Builder password(Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }
        public Builder pfx(Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> pfx) {
            this.pfx = Objects.requireNonNull(pfx);
            return this;
        }
        public Builder url(Object url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }        public WebClientCertificateAuthenticationResponse build() {
            return new WebClientCertificateAuthenticationResponse(authenticationType, password, pfx, url);
        }
    }
}
