// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ecr.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAuthorizationTokenResult {
    /**
     * Temporary IAM authentication credentials to access the ECR repository encoded in base64 in the form of `user_name:password`.
     * 
     */
    private final String authorizationToken;
    /**
     * The time in UTC RFC3339 format when the authorization token expires.
     * 
     */
    private final String expiresAt;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * Password decoded from the authorization token.
     * 
     */
    private final String password;
    /**
     * The registry URL to use in the docker login command.
     * 
     */
    private final String proxyEndpoint;
    private final @Nullable String registryId;
    /**
     * User name decoded from the authorization token.
     * 
     */
    private final String userName;

    @CustomType.Constructor
    private GetAuthorizationTokenResult(
        @CustomType.Parameter("authorizationToken") String authorizationToken,
        @CustomType.Parameter("expiresAt") String expiresAt,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("password") String password,
        @CustomType.Parameter("proxyEndpoint") String proxyEndpoint,
        @CustomType.Parameter("registryId") @Nullable String registryId,
        @CustomType.Parameter("userName") String userName) {
        this.authorizationToken = authorizationToken;
        this.expiresAt = expiresAt;
        this.id = id;
        this.password = password;
        this.proxyEndpoint = proxyEndpoint;
        this.registryId = registryId;
        this.userName = userName;
    }

    /**
     * Temporary IAM authentication credentials to access the ECR repository encoded in base64 in the form of `user_name:password`.
     * 
    */
    public String authorizationToken() {
        return this.authorizationToken;
    }
    /**
     * The time in UTC RFC3339 format when the authorization token expires.
     * 
    */
    public String expiresAt() {
        return this.expiresAt;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * Password decoded from the authorization token.
     * 
    */
    public String password() {
        return this.password;
    }
    /**
     * The registry URL to use in the docker login command.
     * 
    */
    public String proxyEndpoint() {
        return this.proxyEndpoint;
    }
    public Optional<String> registryId() {
        return Optional.ofNullable(this.registryId);
    }
    /**
     * User name decoded from the authorization token.
     * 
    */
    public String userName() {
        return this.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAuthorizationTokenResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String authorizationToken;
        private String expiresAt;
        private String id;
        private String password;
        private String proxyEndpoint;
        private @Nullable String registryId;
        private String userName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAuthorizationTokenResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizationToken = defaults.authorizationToken;
    	      this.expiresAt = defaults.expiresAt;
    	      this.id = defaults.id;
    	      this.password = defaults.password;
    	      this.proxyEndpoint = defaults.proxyEndpoint;
    	      this.registryId = defaults.registryId;
    	      this.userName = defaults.userName;
        }

        public Builder authorizationToken(String authorizationToken) {
            this.authorizationToken = Objects.requireNonNull(authorizationToken);
            return this;
        }
        public Builder expiresAt(String expiresAt) {
            this.expiresAt = Objects.requireNonNull(expiresAt);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder password(String password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }
        public Builder proxyEndpoint(String proxyEndpoint) {
            this.proxyEndpoint = Objects.requireNonNull(proxyEndpoint);
            return this;
        }
        public Builder registryId(@Nullable String registryId) {
            this.registryId = registryId;
            return this;
        }
        public Builder userName(String userName) {
            this.userName = Objects.requireNonNull(userName);
            return this;
        }        public GetAuthorizationTokenResult build() {
            return new GetAuthorizationTokenResult(authorizationToken, expiresAt, id, password, proxyEndpoint, registryId, userName);
        }
    }
}
