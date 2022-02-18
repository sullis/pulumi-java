// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.elasticloadbalancingv2.outputs;

import io.pulumi.awsnative.elasticloadbalancingv2.outputs.ListenerAuthenticateCognitoConfig;
import io.pulumi.awsnative.elasticloadbalancingv2.outputs.ListenerAuthenticateOidcConfig;
import io.pulumi.awsnative.elasticloadbalancingv2.outputs.ListenerFixedResponseConfig;
import io.pulumi.awsnative.elasticloadbalancingv2.outputs.ListenerForwardConfig;
import io.pulumi.awsnative.elasticloadbalancingv2.outputs.ListenerRedirectConfig;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ListenerAction {
    private final @Nullable ListenerAuthenticateCognitoConfig authenticateCognitoConfig;
    private final @Nullable ListenerAuthenticateOidcConfig authenticateOidcConfig;
    private final @Nullable ListenerFixedResponseConfig fixedResponseConfig;
    private final @Nullable ListenerForwardConfig forwardConfig;
    private final @Nullable Integer order;
    private final @Nullable ListenerRedirectConfig redirectConfig;
    private final @Nullable String targetGroupArn;
    private final String type;

    @OutputCustomType.Constructor({"authenticateCognitoConfig","authenticateOidcConfig","fixedResponseConfig","forwardConfig","order","redirectConfig","targetGroupArn","type"})
    private ListenerAction(
        @Nullable ListenerAuthenticateCognitoConfig authenticateCognitoConfig,
        @Nullable ListenerAuthenticateOidcConfig authenticateOidcConfig,
        @Nullable ListenerFixedResponseConfig fixedResponseConfig,
        @Nullable ListenerForwardConfig forwardConfig,
        @Nullable Integer order,
        @Nullable ListenerRedirectConfig redirectConfig,
        @Nullable String targetGroupArn,
        String type) {
        this.authenticateCognitoConfig = authenticateCognitoConfig;
        this.authenticateOidcConfig = authenticateOidcConfig;
        this.fixedResponseConfig = fixedResponseConfig;
        this.forwardConfig = forwardConfig;
        this.order = order;
        this.redirectConfig = redirectConfig;
        this.targetGroupArn = targetGroupArn;
        this.type = Objects.requireNonNull(type);
    }

    public Optional<ListenerAuthenticateCognitoConfig> getAuthenticateCognitoConfig() {
        return Optional.ofNullable(this.authenticateCognitoConfig);
    }
    public Optional<ListenerAuthenticateOidcConfig> getAuthenticateOidcConfig() {
        return Optional.ofNullable(this.authenticateOidcConfig);
    }
    public Optional<ListenerFixedResponseConfig> getFixedResponseConfig() {
        return Optional.ofNullable(this.fixedResponseConfig);
    }
    public Optional<ListenerForwardConfig> getForwardConfig() {
        return Optional.ofNullable(this.forwardConfig);
    }
    public Optional<Integer> getOrder() {
        return Optional.ofNullable(this.order);
    }
    public Optional<ListenerRedirectConfig> getRedirectConfig() {
        return Optional.ofNullable(this.redirectConfig);
    }
    public Optional<String> getTargetGroupArn() {
        return Optional.ofNullable(this.targetGroupArn);
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListenerAction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ListenerAuthenticateCognitoConfig authenticateCognitoConfig;
        private @Nullable ListenerAuthenticateOidcConfig authenticateOidcConfig;
        private @Nullable ListenerFixedResponseConfig fixedResponseConfig;
        private @Nullable ListenerForwardConfig forwardConfig;
        private @Nullable Integer order;
        private @Nullable ListenerRedirectConfig redirectConfig;
        private @Nullable String targetGroupArn;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ListenerAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authenticateCognitoConfig = defaults.authenticateCognitoConfig;
    	      this.authenticateOidcConfig = defaults.authenticateOidcConfig;
    	      this.fixedResponseConfig = defaults.fixedResponseConfig;
    	      this.forwardConfig = defaults.forwardConfig;
    	      this.order = defaults.order;
    	      this.redirectConfig = defaults.redirectConfig;
    	      this.targetGroupArn = defaults.targetGroupArn;
    	      this.type = defaults.type;
        }

        public Builder setAuthenticateCognitoConfig(@Nullable ListenerAuthenticateCognitoConfig authenticateCognitoConfig) {
            this.authenticateCognitoConfig = authenticateCognitoConfig;
            return this;
        }

        public Builder setAuthenticateOidcConfig(@Nullable ListenerAuthenticateOidcConfig authenticateOidcConfig) {
            this.authenticateOidcConfig = authenticateOidcConfig;
            return this;
        }

        public Builder setFixedResponseConfig(@Nullable ListenerFixedResponseConfig fixedResponseConfig) {
            this.fixedResponseConfig = fixedResponseConfig;
            return this;
        }

        public Builder setForwardConfig(@Nullable ListenerForwardConfig forwardConfig) {
            this.forwardConfig = forwardConfig;
            return this;
        }

        public Builder setOrder(@Nullable Integer order) {
            this.order = order;
            return this;
        }

        public Builder setRedirectConfig(@Nullable ListenerRedirectConfig redirectConfig) {
            this.redirectConfig = redirectConfig;
            return this;
        }

        public Builder setTargetGroupArn(@Nullable String targetGroupArn) {
            this.targetGroupArn = targetGroupArn;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public ListenerAction build() {
            return new ListenerAction(authenticateCognitoConfig, authenticateOidcConfig, fixedResponseConfig, forwardConfig, order, redirectConfig, targetGroupArn, type);
        }
    }
}
