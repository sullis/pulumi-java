// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.inputs;

import io.pulumi.awsnative.wafv2.inputs.WebACLExcludedRule;
import io.pulumi.awsnative.wafv2.inputs.WebACLStatement;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WebACLManagedRuleGroupStatement extends io.pulumi.resources.InvokeArgs {

    public static final WebACLManagedRuleGroupStatement Empty = new WebACLManagedRuleGroupStatement();

    @InputImport(name="excludedRules")
      private final @Nullable List<WebACLExcludedRule> excludedRules;

    public List<WebACLExcludedRule> getExcludedRules() {
        return this.excludedRules == null ? List.of() : this.excludedRules;
    }

    @InputImport(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    @InputImport(name="scopeDownStatement")
      private final @Nullable WebACLStatement scopeDownStatement;

    public Optional<WebACLStatement> getScopeDownStatement() {
        return this.scopeDownStatement == null ? Optional.empty() : Optional.ofNullable(this.scopeDownStatement);
    }

    @InputImport(name="vendorName", required=true)
      private final String vendorName;

    public String getVendorName() {
        return this.vendorName;
    }

    @InputImport(name="version")
      private final @Nullable String version;

    public Optional<String> getVersion() {
        return this.version == null ? Optional.empty() : Optional.ofNullable(this.version);
    }

    public WebACLManagedRuleGroupStatement(
        @Nullable List<WebACLExcludedRule> excludedRules,
        String name,
        @Nullable WebACLStatement scopeDownStatement,
        String vendorName,
        @Nullable String version) {
        this.excludedRules = excludedRules;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.scopeDownStatement = scopeDownStatement;
        this.vendorName = Objects.requireNonNull(vendorName, "expected parameter 'vendorName' to be non-null");
        this.version = version;
    }

    private WebACLManagedRuleGroupStatement() {
        this.excludedRules = List.of();
        this.name = null;
        this.scopeDownStatement = null;
        this.vendorName = null;
        this.version = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebACLManagedRuleGroupStatement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<WebACLExcludedRule> excludedRules;
        private String name;
        private @Nullable WebACLStatement scopeDownStatement;
        private String vendorName;
        private @Nullable String version;

        public Builder() {
    	      // Empty
        }

        public Builder(WebACLManagedRuleGroupStatement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.excludedRules = defaults.excludedRules;
    	      this.name = defaults.name;
    	      this.scopeDownStatement = defaults.scopeDownStatement;
    	      this.vendorName = defaults.vendorName;
    	      this.version = defaults.version;
        }

        public Builder setExcludedRules(@Nullable List<WebACLExcludedRule> excludedRules) {
            this.excludedRules = excludedRules;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setScopeDownStatement(@Nullable WebACLStatement scopeDownStatement) {
            this.scopeDownStatement = scopeDownStatement;
            return this;
        }

        public Builder setVendorName(String vendorName) {
            this.vendorName = Objects.requireNonNull(vendorName);
            return this;
        }

        public Builder setVersion(@Nullable String version) {
            this.version = version;
            return this;
        }
        public WebACLManagedRuleGroupStatement build() {
            return new WebACLManagedRuleGroupStatement(excludedRules, name, scopeDownStatement, vendorName, version);
        }
    }
}