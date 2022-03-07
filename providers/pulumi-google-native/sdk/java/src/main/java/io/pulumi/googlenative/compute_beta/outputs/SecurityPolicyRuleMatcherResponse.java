// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.compute_beta.outputs.ExprResponse;
import io.pulumi.googlenative.compute_beta.outputs.SecurityPolicyRuleMatcherConfigResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class SecurityPolicyRuleMatcherResponse {
    /**
     * The configuration options available when specifying versioned_expr. This field must be specified if versioned_expr is specified and cannot be specified if versioned_expr is not specified.
     * 
     */
    private final SecurityPolicyRuleMatcherConfigResponse config;
    /**
     * User defined CEVAL expression. A CEVAL expression is used to specify match criteria such as origin.ip, source.region_code and contents in the request header.
     * 
     */
    private final ExprResponse expr;
    /**
     * Preconfigured versioned expression. If this field is specified, config must also be specified. Available preconfigured expressions along with their requirements are: SRC_IPS_V1 - must specify the corresponding src_ip_range field in config.
     * 
     */
    private final String versionedExpr;

    @OutputCustomType.Constructor({"config","expr","versionedExpr"})
    private SecurityPolicyRuleMatcherResponse(
        SecurityPolicyRuleMatcherConfigResponse config,
        ExprResponse expr,
        String versionedExpr) {
        this.config = Objects.requireNonNull(config);
        this.expr = Objects.requireNonNull(expr);
        this.versionedExpr = Objects.requireNonNull(versionedExpr);
    }

    /**
     * The configuration options available when specifying versioned_expr. This field must be specified if versioned_expr is specified and cannot be specified if versioned_expr is not specified.
     * 
    */
    public SecurityPolicyRuleMatcherConfigResponse getConfig() {
        return this.config;
    }
    /**
     * User defined CEVAL expression. A CEVAL expression is used to specify match criteria such as origin.ip, source.region_code and contents in the request header.
     * 
    */
    public ExprResponse getExpr() {
        return this.expr;
    }
    /**
     * Preconfigured versioned expression. If this field is specified, config must also be specified. Available preconfigured expressions along with their requirements are: SRC_IPS_V1 - must specify the corresponding src_ip_range field in config.
     * 
    */
    public String getVersionedExpr() {
        return this.versionedExpr;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityPolicyRuleMatcherResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecurityPolicyRuleMatcherConfigResponse config;
        private ExprResponse expr;
        private String versionedExpr;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityPolicyRuleMatcherResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.config = defaults.config;
    	      this.expr = defaults.expr;
    	      this.versionedExpr = defaults.versionedExpr;
        }

        public Builder setConfig(SecurityPolicyRuleMatcherConfigResponse config) {
            this.config = Objects.requireNonNull(config);
            return this;
        }

        public Builder setExpr(ExprResponse expr) {
            this.expr = Objects.requireNonNull(expr);
            return this;
        }

        public Builder setVersionedExpr(String versionedExpr) {
            this.versionedExpr = Objects.requireNonNull(versionedExpr);
            return this;
        }
        public SecurityPolicyRuleMatcherResponse build() {
            return new SecurityPolicyRuleMatcherResponse(config, expr, versionedExpr);
        }
    }
}