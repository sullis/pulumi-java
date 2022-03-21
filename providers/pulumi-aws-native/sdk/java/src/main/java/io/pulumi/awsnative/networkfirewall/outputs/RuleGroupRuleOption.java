// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.networkfirewall.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class RuleGroupRuleOption {
    private final String keyword;
    private final @Nullable List<String> settings;

    @CustomType.Constructor
    private RuleGroupRuleOption(
        @CustomType.Parameter("keyword") String keyword,
        @CustomType.Parameter("settings") @Nullable List<String> settings) {
        this.keyword = keyword;
        this.settings = settings;
    }

    public String getKeyword() {
        return this.keyword;
    }
    public List<String> getSettings() {
        return this.settings == null ? List.of() : this.settings;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleOption defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String keyword;
        private @Nullable List<String> settings;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleOption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyword = defaults.keyword;
    	      this.settings = defaults.settings;
        }

        public Builder keyword(String keyword) {
            this.keyword = Objects.requireNonNull(keyword);
            return this;
        }
        public Builder settings(@Nullable List<String> settings) {
            this.settings = settings;
            return this;
        }
        public Builder settings(String... settings) {
            return settings(List.of(settings));
        }        public RuleGroupRuleOption build() {
            return new RuleGroupRuleOption(keyword, settings);
        }
    }
}
