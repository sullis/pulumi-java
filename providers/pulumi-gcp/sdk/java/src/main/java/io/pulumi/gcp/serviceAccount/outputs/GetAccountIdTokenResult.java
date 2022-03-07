// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.serviceAccount.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetAccountIdTokenResult {
    private final @Nullable List<String> delegates;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * The `id_token` representing the new generated identity.
     * 
     */
    private final String idToken;
    private final @Nullable Boolean includeEmail;
    private final String targetAudience;
    private final @Nullable String targetServiceAccount;

    @OutputCustomType.Constructor({"delegates","id","idToken","includeEmail","targetAudience","targetServiceAccount"})
    private GetAccountIdTokenResult(
        @Nullable List<String> delegates,
        String id,
        String idToken,
        @Nullable Boolean includeEmail,
        String targetAudience,
        @Nullable String targetServiceAccount) {
        this.delegates = delegates;
        this.id = Objects.requireNonNull(id);
        this.idToken = Objects.requireNonNull(idToken);
        this.includeEmail = includeEmail;
        this.targetAudience = Objects.requireNonNull(targetAudience);
        this.targetServiceAccount = targetServiceAccount;
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
    /**
     * The `id_token` representing the new generated identity.
     * 
    */
    public String getIdToken() {
        return this.idToken;
    }
    public Optional<Boolean> getIncludeEmail() {
        return Optional.ofNullable(this.includeEmail);
    }
    public String getTargetAudience() {
        return this.targetAudience;
    }
    public Optional<String> getTargetServiceAccount() {
        return Optional.ofNullable(this.targetServiceAccount);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAccountIdTokenResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> delegates;
        private String id;
        private String idToken;
        private @Nullable Boolean includeEmail;
        private String targetAudience;
        private @Nullable String targetServiceAccount;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAccountIdTokenResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.delegates = defaults.delegates;
    	      this.id = defaults.id;
    	      this.idToken = defaults.idToken;
    	      this.includeEmail = defaults.includeEmail;
    	      this.targetAudience = defaults.targetAudience;
    	      this.targetServiceAccount = defaults.targetServiceAccount;
        }

        public Builder setDelegates(@Nullable List<String> delegates) {
            this.delegates = delegates;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setIdToken(String idToken) {
            this.idToken = Objects.requireNonNull(idToken);
            return this;
        }

        public Builder setIncludeEmail(@Nullable Boolean includeEmail) {
            this.includeEmail = includeEmail;
            return this;
        }

        public Builder setTargetAudience(String targetAudience) {
            this.targetAudience = Objects.requireNonNull(targetAudience);
            return this;
        }

        public Builder setTargetServiceAccount(@Nullable String targetServiceAccount) {
            this.targetServiceAccount = targetServiceAccount;
            return this;
        }
        public GetAccountIdTokenResult build() {
            return new GetAccountIdTokenResult(delegates, id, idToken, includeEmail, targetAudience, targetServiceAccount);
        }
    }
}