// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.AzureKeyVaultSecretReferenceArgs;
import io.pulumi.azurenative.datafactory.inputs.SecureStringArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;


/**
 * A WebLinkedService that uses basic authentication to communicate with an HTTP endpoint.
 * 
 */
public final class WebBasicAuthenticationArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebBasicAuthenticationArgs Empty = new WebBasicAuthenticationArgs();

    /**
     * Type of authentication used to connect to the web table source.
     * Expected value is 'Basic'.
     * 
     */
    @InputImport(name="authenticationType", required=true)
    private final Input<String> authenticationType;

    public Input<String> getAuthenticationType() {
        return this.authenticationType;
    }

    /**
     * The password for Basic authentication.
     * 
     */
    @InputImport(name="password", required=true)
    private final Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password;

    public Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> getPassword() {
        return this.password;
    }

    /**
     * The URL of the web service endpoint, e.g. http://www.microsoft.com . Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="url", required=true)
    private final Input<Object> url;

    public Input<Object> getUrl() {
        return this.url;
    }

    /**
     * User name for Basic authentication. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="username", required=true)
    private final Input<Object> username;

    public Input<Object> getUsername() {
        return this.username;
    }

    public WebBasicAuthenticationArgs(
        Input<String> authenticationType,
        Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password,
        Input<Object> url,
        Input<Object> username) {
        this.authenticationType = Objects.requireNonNull(authenticationType, "expected parameter 'authenticationType' to be non-null");
        this.password = Objects.requireNonNull(password, "expected parameter 'password' to be non-null");
        this.url = Objects.requireNonNull(url, "expected parameter 'url' to be non-null");
        this.username = Objects.requireNonNull(username, "expected parameter 'username' to be non-null");
    }

    private WebBasicAuthenticationArgs() {
        this.authenticationType = Input.empty();
        this.password = Input.empty();
        this.url = Input.empty();
        this.username = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebBasicAuthenticationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> authenticationType;
        private Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password;
        private Input<Object> url;
        private Input<Object> username;

        public Builder() {
    	      // Empty
        }

        public Builder(WebBasicAuthenticationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authenticationType = defaults.authenticationType;
    	      this.password = defaults.password;
    	      this.url = defaults.url;
    	      this.username = defaults.username;
        }

        public Builder setAuthenticationType(Input<String> authenticationType) {
            this.authenticationType = Objects.requireNonNull(authenticationType);
            return this;
        }

        public Builder setAuthenticationType(String authenticationType) {
            this.authenticationType = Input.of(Objects.requireNonNull(authenticationType));
            return this;
        }

        public Builder setPassword(Input<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }

        public Builder setPassword(Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs> password) {
            this.password = Input.of(Objects.requireNonNull(password));
            return this;
        }

        public Builder setUrl(Input<Object> url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }

        public Builder setUrl(Object url) {
            this.url = Input.of(Objects.requireNonNull(url));
            return this;
        }

        public Builder setUsername(Input<Object> username) {
            this.username = Objects.requireNonNull(username);
            return this;
        }

        public Builder setUsername(Object username) {
            this.username = Input.of(Objects.requireNonNull(username));
            return this;
        }

        public WebBasicAuthenticationArgs build() {
            return new WebBasicAuthenticationArgs(authenticationType, password, url, username);
        }
    }
}
