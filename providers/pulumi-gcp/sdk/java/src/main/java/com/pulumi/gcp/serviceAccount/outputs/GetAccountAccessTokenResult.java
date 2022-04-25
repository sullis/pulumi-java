// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.serviceAccount.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAccountAccessTokenResult {
    /**
     * @return The `access_token` representing the new generated identity.
     * 
     */
    private final String accessToken;
    private final @Nullable List<String> delegates;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final @Nullable String lifetime;
    private final List<String> scopes;
    private final String targetServiceAccount;

    @CustomType.Constructor
    private GetAccountAccessTokenResult(
        @CustomType.Parameter("accessToken") String accessToken,
        @CustomType.Parameter("delegates") @Nullable List<String> delegates,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("lifetime") @Nullable String lifetime,
        @CustomType.Parameter("scopes") List<String> scopes,
        @CustomType.Parameter("targetServiceAccount") String targetServiceAccount) {
        this.accessToken = accessToken;
        this.delegates = delegates;
        this.id = id;
        this.lifetime = lifetime;
        this.scopes = scopes;
        this.targetServiceAccount = targetServiceAccount;
    }

    /**
     * @return The `access_token` representing the new generated identity.
     * 
     */
    public String accessToken() {
        return this.accessToken;
    }
    public List<String> delegates() {
        return this.delegates == null ? List.of() : this.delegates;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public Optional<String> lifetime() {
        return Optional.ofNullable(this.lifetime);
    }
    public List<String> scopes() {
        return this.scopes;
    }
    public String targetServiceAccount() {
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

        public Builder accessToken(String accessToken) {
            this.accessToken = Objects.requireNonNull(accessToken);
            return this;
        }
        public Builder delegates(@Nullable List<String> delegates) {
            this.delegates = delegates;
            return this;
        }
        public Builder delegates(String... delegates) {
            return delegates(List.of(delegates));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder lifetime(@Nullable String lifetime) {
            this.lifetime = lifetime;
            return this;
        }
        public Builder scopes(List<String> scopes) {
            this.scopes = Objects.requireNonNull(scopes);
            return this;
        }
        public Builder scopes(String... scopes) {
            return scopes(List.of(scopes));
        }
        public Builder targetServiceAccount(String targetServiceAccount) {
            this.targetServiceAccount = Objects.requireNonNull(targetServiceAccount);
            return this;
        }        public GetAccountAccessTokenResult build() {
            return new GetAccountAccessTokenResult(accessToken, delegates, id, lifetime, scopes, targetServiceAccount);
        }
    }
}
