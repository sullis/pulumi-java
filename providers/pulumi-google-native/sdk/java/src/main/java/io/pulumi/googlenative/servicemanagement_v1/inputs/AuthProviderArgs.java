// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicemanagement_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.servicemanagement_v1.inputs.JwtLocationArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Configuration for an authentication provider, including support for [JSON Web Token (JWT)](https://tools.ietf.org/html/draft-ietf-oauth-json-web-token-32).
 * 
 */
public final class AuthProviderArgs extends io.pulumi.resources.ResourceArgs {

    public static final AuthProviderArgs Empty = new AuthProviderArgs();

    /**
     * The list of JWT [audiences](https://tools.ietf.org/html/draft-ietf-oauth-json-web-token-32#section-4.1.3). that are allowed to access. A JWT containing any of these audiences will be accepted. When this setting is absent, JWTs with audiences: - "https://[service.name]/[google.protobuf.Api.name]" - "https://[service.name]/" will be accepted. For example, if no audiences are in the setting, LibraryService API will accept JWTs with the following audiences: - https://library-example.googleapis.com/google.example.library.v1.LibraryService - https://library-example.googleapis.com/ Example: audiences: bookstore_android.apps.googleusercontent.com, bookstore_web.apps.googleusercontent.com
     * 
     */
    @InputImport(name="audiences")
      private final @Nullable Input<String> audiences;

    public Input<String> getAudiences() {
        return this.audiences == null ? Input.empty() : this.audiences;
    }

    /**
     * Redirect URL if JWT token is required but not present or is expired. Implement authorizationUrl of securityDefinitions in OpenAPI spec.
     * 
     */
    @InputImport(name="authorizationUrl")
      private final @Nullable Input<String> authorizationUrl;

    public Input<String> getAuthorizationUrl() {
        return this.authorizationUrl == null ? Input.empty() : this.authorizationUrl;
    }

    /**
     * The unique identifier of the auth provider. It will be referred to by `AuthRequirement.provider_id`. Example: "bookstore_auth".
     * 
     */
    @InputImport(name="id")
      private final @Nullable Input<String> id;

    public Input<String> getId() {
        return this.id == null ? Input.empty() : this.id;
    }

    /**
     * Identifies the principal that issued the JWT. See https://tools.ietf.org/html/draft-ietf-oauth-json-web-token-32#section-4.1.1 Usually a URL or an email address. Example: https://securetoken.google.com Example: 1234567-compute@developer.gserviceaccount.com
     * 
     */
    @InputImport(name="issuer")
      private final @Nullable Input<String> issuer;

    public Input<String> getIssuer() {
        return this.issuer == null ? Input.empty() : this.issuer;
    }

    /**
     * URL of the provider's public key set to validate signature of the JWT. See [OpenID Discovery](https://openid.net/specs/openid-connect-discovery-1_0.html#ProviderMetadata). Optional if the key set document: - can be retrieved from [OpenID Discovery](https://openid.net/specs/openid-connect-discovery-1_0.html) of the issuer. - can be inferred from the email domain of the issuer (e.g. a Google service account). Example: https://www.googleapis.com/oauth2/v1/certs
     * 
     */
    @InputImport(name="jwksUri")
      private final @Nullable Input<String> jwksUri;

    public Input<String> getJwksUri() {
        return this.jwksUri == null ? Input.empty() : this.jwksUri;
    }

    /**
     * Defines the locations to extract the JWT. JWT locations can be either from HTTP headers or URL query parameters. The rule is that the first match wins. The checking order is: checking all headers first, then URL query parameters. If not specified, default to use following 3 locations: 1) Authorization: Bearer 2) x-goog-iap-jwt-assertion 3) access_token query parameter Default locations can be specified as followings: jwt_locations: - header: Authorization value_prefix: "Bearer " - header: x-goog-iap-jwt-assertion - query: access_token
     * 
     */
    @InputImport(name="jwtLocations")
      private final @Nullable Input<List<JwtLocationArgs>> jwtLocations;

    public Input<List<JwtLocationArgs>> getJwtLocations() {
        return this.jwtLocations == null ? Input.empty() : this.jwtLocations;
    }

    public AuthProviderArgs(
        @Nullable Input<String> audiences,
        @Nullable Input<String> authorizationUrl,
        @Nullable Input<String> id,
        @Nullable Input<String> issuer,
        @Nullable Input<String> jwksUri,
        @Nullable Input<List<JwtLocationArgs>> jwtLocations) {
        this.audiences = audiences;
        this.authorizationUrl = authorizationUrl;
        this.id = id;
        this.issuer = issuer;
        this.jwksUri = jwksUri;
        this.jwtLocations = jwtLocations;
    }

    private AuthProviderArgs() {
        this.audiences = Input.empty();
        this.authorizationUrl = Input.empty();
        this.id = Input.empty();
        this.issuer = Input.empty();
        this.jwksUri = Input.empty();
        this.jwtLocations = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AuthProviderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> audiences;
        private @Nullable Input<String> authorizationUrl;
        private @Nullable Input<String> id;
        private @Nullable Input<String> issuer;
        private @Nullable Input<String> jwksUri;
        private @Nullable Input<List<JwtLocationArgs>> jwtLocations;

        public Builder() {
    	      // Empty
        }

        public Builder(AuthProviderArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.audiences = defaults.audiences;
    	      this.authorizationUrl = defaults.authorizationUrl;
    	      this.id = defaults.id;
    	      this.issuer = defaults.issuer;
    	      this.jwksUri = defaults.jwksUri;
    	      this.jwtLocations = defaults.jwtLocations;
        }

        public Builder setAudiences(@Nullable Input<String> audiences) {
            this.audiences = audiences;
            return this;
        }

        public Builder setAudiences(@Nullable String audiences) {
            this.audiences = Input.ofNullable(audiences);
            return this;
        }

        public Builder setAuthorizationUrl(@Nullable Input<String> authorizationUrl) {
            this.authorizationUrl = authorizationUrl;
            return this;
        }

        public Builder setAuthorizationUrl(@Nullable String authorizationUrl) {
            this.authorizationUrl = Input.ofNullable(authorizationUrl);
            return this;
        }

        public Builder setId(@Nullable Input<String> id) {
            this.id = id;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = Input.ofNullable(id);
            return this;
        }

        public Builder setIssuer(@Nullable Input<String> issuer) {
            this.issuer = issuer;
            return this;
        }

        public Builder setIssuer(@Nullable String issuer) {
            this.issuer = Input.ofNullable(issuer);
            return this;
        }

        public Builder setJwksUri(@Nullable Input<String> jwksUri) {
            this.jwksUri = jwksUri;
            return this;
        }

        public Builder setJwksUri(@Nullable String jwksUri) {
            this.jwksUri = Input.ofNullable(jwksUri);
            return this;
        }

        public Builder setJwtLocations(@Nullable Input<List<JwtLocationArgs>> jwtLocations) {
            this.jwtLocations = jwtLocations;
            return this;
        }

        public Builder setJwtLocations(@Nullable List<JwtLocationArgs> jwtLocations) {
            this.jwtLocations = Input.ofNullable(jwtLocations);
            return this;
        }
        public AuthProviderArgs build() {
            return new AuthProviderArgs(audiences, authorizationUrl, id, issuer, jwksUri, jwtLocations);
        }
    }
}