// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Client secret information for factory's bring your own app repository configuration.
 * 
 */
public final class GitHubClientSecret extends io.pulumi.resources.InvokeArgs {

    public static final GitHubClientSecret Empty = new GitHubClientSecret();

    /**
     * Bring your own app client secret AKV URL.
     * 
     */
    @InputImport(name="byoaSecretAkvUrl")
    private final @Nullable String byoaSecretAkvUrl;

    public Optional<String> getByoaSecretAkvUrl() {
        return this.byoaSecretAkvUrl == null ? Optional.empty() : Optional.ofNullable(this.byoaSecretAkvUrl);
    }

    /**
     * Bring your own app client secret name in AKV.
     * 
     */
    @InputImport(name="byoaSecretName")
    private final @Nullable String byoaSecretName;

    public Optional<String> getByoaSecretName() {
        return this.byoaSecretName == null ? Optional.empty() : Optional.ofNullable(this.byoaSecretName);
    }

    public GitHubClientSecret(
        @Nullable String byoaSecretAkvUrl,
        @Nullable String byoaSecretName) {
        this.byoaSecretAkvUrl = byoaSecretAkvUrl;
        this.byoaSecretName = byoaSecretName;
    }

    private GitHubClientSecret() {
        this.byoaSecretAkvUrl = null;
        this.byoaSecretName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GitHubClientSecret defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String byoaSecretAkvUrl;
        private @Nullable String byoaSecretName;

        public Builder() {
    	      // Empty
        }

        public Builder(GitHubClientSecret defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.byoaSecretAkvUrl = defaults.byoaSecretAkvUrl;
    	      this.byoaSecretName = defaults.byoaSecretName;
        }

        public Builder setByoaSecretAkvUrl(@Nullable String byoaSecretAkvUrl) {
            this.byoaSecretAkvUrl = byoaSecretAkvUrl;
            return this;
        }

        public Builder setByoaSecretName(@Nullable String byoaSecretName) {
            this.byoaSecretName = byoaSecretName;
            return this;
        }

        public GitHubClientSecret build() {
            return new GitHubClientSecret(byoaSecretAkvUrl, byoaSecretName);
        }
    }
}
