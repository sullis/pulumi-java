// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.opensearchservice.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DomainCognitoOptions {
    private final @Nullable Boolean enabled;
    private final @Nullable String identityPoolId;
    private final @Nullable String roleArn;
    private final @Nullable String userPoolId;

    @OutputCustomType.Constructor({"enabled","identityPoolId","roleArn","userPoolId"})
    private DomainCognitoOptions(
        @Nullable Boolean enabled,
        @Nullable String identityPoolId,
        @Nullable String roleArn,
        @Nullable String userPoolId) {
        this.enabled = enabled;
        this.identityPoolId = identityPoolId;
        this.roleArn = roleArn;
        this.userPoolId = userPoolId;
    }

    public Optional<Boolean> getEnabled() {
        return Optional.ofNullable(this.enabled);
    }
    public Optional<String> getIdentityPoolId() {
        return Optional.ofNullable(this.identityPoolId);
    }
    public Optional<String> getRoleArn() {
        return Optional.ofNullable(this.roleArn);
    }
    public Optional<String> getUserPoolId() {
        return Optional.ofNullable(this.userPoolId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainCognitoOptions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enabled;
        private @Nullable String identityPoolId;
        private @Nullable String roleArn;
        private @Nullable String userPoolId;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainCognitoOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.identityPoolId = defaults.identityPoolId;
    	      this.roleArn = defaults.roleArn;
    	      this.userPoolId = defaults.userPoolId;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setIdentityPoolId(@Nullable String identityPoolId) {
            this.identityPoolId = identityPoolId;
            return this;
        }

        public Builder setRoleArn(@Nullable String roleArn) {
            this.roleArn = roleArn;
            return this;
        }

        public Builder setUserPoolId(@Nullable String userPoolId) {
            this.userPoolId = userPoolId;
            return this;
        }

        public DomainCognitoOptions build() {
            return new DomainCognitoOptions(enabled, identityPoolId, roleArn, userPoolId);
        }
    }
}
