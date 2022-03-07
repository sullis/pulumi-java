// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.inputs;

import io.pulumi.awsnative.iot.inputs.TopicRuleActionArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TopicRulePayloadArgs extends io.pulumi.resources.ResourceArgs {

    public static final TopicRulePayloadArgs Empty = new TopicRulePayloadArgs();

    @InputImport(name="actions", required=true)
      private final Input<List<TopicRuleActionArgs>> actions;

    public Input<List<TopicRuleActionArgs>> getActions() {
        return this.actions;
    }

    @InputImport(name="awsIotSqlVersion")
      private final @Nullable Input<String> awsIotSqlVersion;

    public Input<String> getAwsIotSqlVersion() {
        return this.awsIotSqlVersion == null ? Input.empty() : this.awsIotSqlVersion;
    }

    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    @InputImport(name="errorAction")
      private final @Nullable Input<TopicRuleActionArgs> errorAction;

    public Input<TopicRuleActionArgs> getErrorAction() {
        return this.errorAction == null ? Input.empty() : this.errorAction;
    }

    @InputImport(name="ruleDisabled")
      private final @Nullable Input<Boolean> ruleDisabled;

    public Input<Boolean> getRuleDisabled() {
        return this.ruleDisabled == null ? Input.empty() : this.ruleDisabled;
    }

    @InputImport(name="sql", required=true)
      private final Input<String> sql;

    public Input<String> getSql() {
        return this.sql;
    }

    public TopicRulePayloadArgs(
        Input<List<TopicRuleActionArgs>> actions,
        @Nullable Input<String> awsIotSqlVersion,
        @Nullable Input<String> description,
        @Nullable Input<TopicRuleActionArgs> errorAction,
        @Nullable Input<Boolean> ruleDisabled,
        Input<String> sql) {
        this.actions = Objects.requireNonNull(actions, "expected parameter 'actions' to be non-null");
        this.awsIotSqlVersion = awsIotSqlVersion;
        this.description = description;
        this.errorAction = errorAction;
        this.ruleDisabled = ruleDisabled;
        this.sql = Objects.requireNonNull(sql, "expected parameter 'sql' to be non-null");
    }

    private TopicRulePayloadArgs() {
        this.actions = Input.empty();
        this.awsIotSqlVersion = Input.empty();
        this.description = Input.empty();
        this.errorAction = Input.empty();
        this.ruleDisabled = Input.empty();
        this.sql = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicRulePayloadArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<TopicRuleActionArgs>> actions;
        private @Nullable Input<String> awsIotSqlVersion;
        private @Nullable Input<String> description;
        private @Nullable Input<TopicRuleActionArgs> errorAction;
        private @Nullable Input<Boolean> ruleDisabled;
        private Input<String> sql;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicRulePayloadArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actions = defaults.actions;
    	      this.awsIotSqlVersion = defaults.awsIotSqlVersion;
    	      this.description = defaults.description;
    	      this.errorAction = defaults.errorAction;
    	      this.ruleDisabled = defaults.ruleDisabled;
    	      this.sql = defaults.sql;
        }

        public Builder setActions(Input<List<TopicRuleActionArgs>> actions) {
            this.actions = Objects.requireNonNull(actions);
            return this;
        }

        public Builder setActions(List<TopicRuleActionArgs> actions) {
            this.actions = Input.of(Objects.requireNonNull(actions));
            return this;
        }

        public Builder setAwsIotSqlVersion(@Nullable Input<String> awsIotSqlVersion) {
            this.awsIotSqlVersion = awsIotSqlVersion;
            return this;
        }

        public Builder setAwsIotSqlVersion(@Nullable String awsIotSqlVersion) {
            this.awsIotSqlVersion = Input.ofNullable(awsIotSqlVersion);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setErrorAction(@Nullable Input<TopicRuleActionArgs> errorAction) {
            this.errorAction = errorAction;
            return this;
        }

        public Builder setErrorAction(@Nullable TopicRuleActionArgs errorAction) {
            this.errorAction = Input.ofNullable(errorAction);
            return this;
        }

        public Builder setRuleDisabled(@Nullable Input<Boolean> ruleDisabled) {
            this.ruleDisabled = ruleDisabled;
            return this;
        }

        public Builder setRuleDisabled(@Nullable Boolean ruleDisabled) {
            this.ruleDisabled = Input.ofNullable(ruleDisabled);
            return this;
        }

        public Builder setSql(Input<String> sql) {
            this.sql = Objects.requireNonNull(sql);
            return this;
        }

        public Builder setSql(String sql) {
            this.sql = Input.of(Objects.requireNonNull(sql));
            return this;
        }
        public TopicRulePayloadArgs build() {
            return new TopicRulePayloadArgs(actions, awsIotSqlVersion, description, errorAction, ruleDisabled, sql);
        }
    }
}