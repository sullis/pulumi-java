// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.outputs;

import io.pulumi.awsnative.iot.outputs.TopicRuleAction;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class TopicRulePayload {
    private final List<TopicRuleAction> actions;
    private final @Nullable String awsIotSqlVersion;
    private final @Nullable String description;
    private final @Nullable TopicRuleAction errorAction;
    private final @Nullable Boolean ruleDisabled;
    private final String sql;

    @OutputCustomType.Constructor({"actions","awsIotSqlVersion","description","errorAction","ruleDisabled","sql"})
    private TopicRulePayload(
        List<TopicRuleAction> actions,
        @Nullable String awsIotSqlVersion,
        @Nullable String description,
        @Nullable TopicRuleAction errorAction,
        @Nullable Boolean ruleDisabled,
        String sql) {
        this.actions = Objects.requireNonNull(actions);
        this.awsIotSqlVersion = awsIotSqlVersion;
        this.description = description;
        this.errorAction = errorAction;
        this.ruleDisabled = ruleDisabled;
        this.sql = Objects.requireNonNull(sql);
    }

    public List<TopicRuleAction> getActions() {
        return this.actions;
    }
    public Optional<String> getAwsIotSqlVersion() {
        return Optional.ofNullable(this.awsIotSqlVersion);
    }
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    public Optional<TopicRuleAction> getErrorAction() {
        return Optional.ofNullable(this.errorAction);
    }
    public Optional<Boolean> getRuleDisabled() {
        return Optional.ofNullable(this.ruleDisabled);
    }
    public String getSql() {
        return this.sql;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicRulePayload defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<TopicRuleAction> actions;
        private @Nullable String awsIotSqlVersion;
        private @Nullable String description;
        private @Nullable TopicRuleAction errorAction;
        private @Nullable Boolean ruleDisabled;
        private String sql;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicRulePayload defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actions = defaults.actions;
    	      this.awsIotSqlVersion = defaults.awsIotSqlVersion;
    	      this.description = defaults.description;
    	      this.errorAction = defaults.errorAction;
    	      this.ruleDisabled = defaults.ruleDisabled;
    	      this.sql = defaults.sql;
        }

        public Builder setActions(List<TopicRuleAction> actions) {
            this.actions = Objects.requireNonNull(actions);
            return this;
        }

        public Builder setAwsIotSqlVersion(@Nullable String awsIotSqlVersion) {
            this.awsIotSqlVersion = awsIotSqlVersion;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setErrorAction(@Nullable TopicRuleAction errorAction) {
            this.errorAction = errorAction;
            return this;
        }

        public Builder setRuleDisabled(@Nullable Boolean ruleDisabled) {
            this.ruleDisabled = ruleDisabled;
            return this;
        }

        public Builder setSql(String sql) {
            this.sql = Objects.requireNonNull(sql);
            return this;
        }

        public TopicRulePayload build() {
            return new TopicRulePayload(actions, awsIotSqlVersion, description, errorAction, ruleDisabled, sql);
        }
    }
}
