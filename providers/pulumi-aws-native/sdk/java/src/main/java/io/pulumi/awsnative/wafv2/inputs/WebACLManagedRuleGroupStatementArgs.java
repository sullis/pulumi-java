// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.inputs;

import io.pulumi.awsnative.wafv2.inputs.WebACLExcludedRuleArgs;
import io.pulumi.awsnative.wafv2.inputs.WebACLStatementArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebACLManagedRuleGroupStatementArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebACLManagedRuleGroupStatementArgs Empty = new WebACLManagedRuleGroupStatementArgs();

    @InputImport(name="excludedRules")
    private final @Nullable Input<List<WebACLExcludedRuleArgs>> excludedRules;

    public Input<List<WebACLExcludedRuleArgs>> getExcludedRules() {
        return this.excludedRules == null ? Input.empty() : this.excludedRules;
    }

    @InputImport(name="name", required=true)
    private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    @InputImport(name="scopeDownStatement")
    private final @Nullable Input<WebACLStatementArgs> scopeDownStatement;

    public Input<WebACLStatementArgs> getScopeDownStatement() {
        return this.scopeDownStatement == null ? Input.empty() : this.scopeDownStatement;
    }

    @InputImport(name="vendorName", required=true)
    private final Input<String> vendorName;

    public Input<String> getVendorName() {
        return this.vendorName;
    }

    @InputImport(name="version")
    private final @Nullable Input<String> version;

    public Input<String> getVersion() {
        return this.version == null ? Input.empty() : this.version;
    }

    public WebACLManagedRuleGroupStatementArgs(
        @Nullable Input<List<WebACLExcludedRuleArgs>> excludedRules,
        Input<String> name,
        @Nullable Input<WebACLStatementArgs> scopeDownStatement,
        Input<String> vendorName,
        @Nullable Input<String> version) {
        this.excludedRules = excludedRules;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.scopeDownStatement = scopeDownStatement;
        this.vendorName = Objects.requireNonNull(vendorName, "expected parameter 'vendorName' to be non-null");
        this.version = version;
    }

    private WebACLManagedRuleGroupStatementArgs() {
        this.excludedRules = Input.empty();
        this.name = Input.empty();
        this.scopeDownStatement = Input.empty();
        this.vendorName = Input.empty();
        this.version = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebACLManagedRuleGroupStatementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<WebACLExcludedRuleArgs>> excludedRules;
        private Input<String> name;
        private @Nullable Input<WebACLStatementArgs> scopeDownStatement;
        private Input<String> vendorName;
        private @Nullable Input<String> version;

        public Builder() {
    	      // Empty
        }

        public Builder(WebACLManagedRuleGroupStatementArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.excludedRules = defaults.excludedRules;
    	      this.name = defaults.name;
    	      this.scopeDownStatement = defaults.scopeDownStatement;
    	      this.vendorName = defaults.vendorName;
    	      this.version = defaults.version;
        }

        public Builder setExcludedRules(@Nullable Input<List<WebACLExcludedRuleArgs>> excludedRules) {
            this.excludedRules = excludedRules;
            return this;
        }

        public Builder setExcludedRules(@Nullable List<WebACLExcludedRuleArgs> excludedRules) {
            this.excludedRules = Input.ofNullable(excludedRules);
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setScopeDownStatement(@Nullable Input<WebACLStatementArgs> scopeDownStatement) {
            this.scopeDownStatement = scopeDownStatement;
            return this;
        }

        public Builder setScopeDownStatement(@Nullable WebACLStatementArgs scopeDownStatement) {
            this.scopeDownStatement = Input.ofNullable(scopeDownStatement);
            return this;
        }

        public Builder setVendorName(Input<String> vendorName) {
            this.vendorName = Objects.requireNonNull(vendorName);
            return this;
        }

        public Builder setVendorName(String vendorName) {
            this.vendorName = Input.of(Objects.requireNonNull(vendorName));
            return this;
        }

        public Builder setVersion(@Nullable Input<String> version) {
            this.version = version;
            return this;
        }

        public Builder setVersion(@Nullable String version) {
            this.version = Input.ofNullable(version);
            return this;
        }

        public WebACLManagedRuleGroupStatementArgs build() {
            return new WebACLManagedRuleGroupStatementArgs(excludedRules, name, scopeDownStatement, vendorName, version);
        }
    }
}
