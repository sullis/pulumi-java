// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.serviceAccount.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetAccountAccessTokenResult {
    /**
     * The `access_token` representing the new generated identity.
     * 
     */
    private final String accessToken;
    private final @Nullable List<String> delegates;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final @Nullable String lifetime;
    private final List<String> scopes;
    private final String targetServiceAccount;

    @OutputCustomType.Constructor({"accessToken","delegates","id","lifetime","scopes","targetServiceAccount"})
    private GetAccountAccessTokenResult(
        String accessToken,
        @Nullable List<String> delegates,
        String id,
        @Nullable String lifetime,
        List<String> scopes,
        String targetServiceAccount) {
        this.accessToken = Objects.requireNonNull(accessToken);
        this.delegates = delegates;
        this.id = Objects.requireNonNull(id);
        this.lifetime = lifetime;
        this.scopes = Objects.requireNonNull(scopes);
        this.targetServiceAccount = Objects.requireNonNull(targetServiceAccount);
    }

    /**
     * The `access_token` representing the new generated identity.
     * 
     */
    public String getAccessToken() {
        return this.accessToken;
    }
    public List<String> getDelegates() {
        return this.delegates == null ? List.of() : this.delegates;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    public String getId() {
        return this.id;
    }
    public Optional<String> getLifetime() {
        return Optional.ofNullable(this.lifetime);
    }
    public List<String> getScopes() {
        return this.scopes;
    }
    public String getTargetServiceAccount() {
        return this.targetServiceAccount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAccountAccessTokenResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accessToken;
        private @Nullable List<String> delegates;
        private String id;
        private @Nullable String lifetime;
        private List<String> scopes;
        private String targetServiceAccount;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAccountAccessTokenResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessToken = defaults.accessToken;
    	      this.delegates = defaults.delegates;
    	      this.id = defaults.id;
    	      this.lifetime = defaults.lifetime;
    	      this.scopes = defaults.scopes;
    	      this.targetServiceAccount = defaults.targetServiceAccount;
        }

        public Builder setAccessToken(String accessToken) {
            this.accessToken = Objects.requireNonNull(accessToken);
            return this;
        }

        public Builder setDelegates(@Nullable List<String> delegates) {
            this.delegates = delegates;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLifetime(@Nullable String lifetime) {
            this.lifetime = lifetime;
            return this;
        }

        public Builder setScopes(List<String> scopes) {
            this.scopes = Objects.requireNonNull(scopes);
            return this;
        }

        public Builder setTargetServiceAccount(String targetServiceAccount) {
            this.targetServiceAccount = Objects.requireNonNull(targetServiceAccount);
            return this;
        }

        public GetAccountAccessTokenResult build() {
            return new GetAccountAccessTokenResult(accessToken, delegates, id, lifetime, scopes, targetServiceAccount);
        }
    }
}
