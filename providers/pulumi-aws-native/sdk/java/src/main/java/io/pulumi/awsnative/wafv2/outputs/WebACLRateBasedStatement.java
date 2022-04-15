// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.outputs;

import io.pulumi.awsnative.wafv2.enums.WebACLRateBasedStatementAggregateKeyType;
import io.pulumi.awsnative.wafv2.outputs.WebACLForwardedIPConfiguration;
import io.pulumi.awsnative.wafv2.outputs.WebACLStatement;
import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WebACLRateBasedStatement {
    private final WebACLRateBasedStatementAggregateKeyType aggregateKeyType;
    private final @Nullable WebACLForwardedIPConfiguration forwardedIPConfig;
    private final Integer limit;
    private final @Nullable WebACLStatement scopeDownStatement;

    @CustomType.Constructor
    private WebACLRateBasedStatement(
        @CustomType.Parameter("aggregateKeyType") WebACLRateBasedStatementAggregateKeyType aggregateKeyType,
        @CustomType.Parameter("forwardedIPConfig") @Nullable WebACLForwardedIPConfiguration forwardedIPConfig,
        @CustomType.Parameter("limit") Integer limit,
        @CustomType.Parameter("scopeDownStatement") @Nullable WebACLStatement scopeDownStatement) {
        this.aggregateKeyType = aggregateKeyType;
        this.forwardedIPConfig = forwardedIPConfig;
        this.limit = limit;
        this.scopeDownStatement = scopeDownStatement;
    }

    public WebACLRateBasedStatementAggregateKeyType aggregateKeyType() {
        return this.aggregateKeyType;
    }
    public Optional<WebACLForwardedIPConfiguration> forwardedIPConfig() {
        return Optional.ofNullable(this.forwardedIPConfig);
    }
    public Integer limit() {
        return this.limit;
    }
    public Optional<WebACLStatement> scopeDownStatement() {
        return Optional.ofNullable(this.scopeDownStatement);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebACLRateBasedStatement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebACLRateBasedStatementAggregateKeyType aggregateKeyType;
        private @Nullable WebACLForwardedIPConfiguration forwardedIPConfig;
        private Integer limit;
        private @Nullable WebACLStatement scopeDownStatement;

        public Builder() {
    	      // Empty
        }

        public Builder(WebACLRateBasedStatement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aggregateKeyType = defaults.aggregateKeyType;
    	      this.forwardedIPConfig = defaults.forwardedIPConfig;
    	      this.limit = defaults.limit;
    	      this.scopeDownStatement = defaults.scopeDownStatement;
        }

        public Builder aggregateKeyType(WebACLRateBasedStatementAggregateKeyType aggregateKeyType) {
            this.aggregateKeyType = Objects.requireNonNull(aggregateKeyType);
            return this;
        }
        public Builder forwardedIPConfig(@Nullable WebACLForwardedIPConfiguration forwardedIPConfig) {
            this.forwardedIPConfig = forwardedIPConfig;
            return this;
        }
        public Builder limit(Integer limit) {
            this.limit = Objects.requireNonNull(limit);
            return this;
        }
        public Builder scopeDownStatement(@Nullable WebACLStatement scopeDownStatement) {
            this.scopeDownStatement = scopeDownStatement;
            return this;
        }        public WebACLRateBasedStatement build() {
            return new WebACLRateBasedStatement(aggregateKeyType, forwardedIPConfig, limit, scopeDownStatement);
        }
    }
}
