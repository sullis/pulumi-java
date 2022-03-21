// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class TopicRuleCloudwatchAlarmActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final TopicRuleCloudwatchAlarmActionArgs Empty = new TopicRuleCloudwatchAlarmActionArgs();

    @Import(name="alarmName", required=true)
      private final Output<String> alarmName;

    public Output<String> getAlarmName() {
        return this.alarmName;
    }

    @Import(name="roleArn", required=true)
      private final Output<String> roleArn;

    public Output<String> getRoleArn() {
        return this.roleArn;
    }

    @Import(name="stateReason", required=true)
      private final Output<String> stateReason;

    public Output<String> getStateReason() {
        return this.stateReason;
    }

    @Import(name="stateValue", required=true)
      private final Output<String> stateValue;

    public Output<String> getStateValue() {
        return this.stateValue;
    }

    public TopicRuleCloudwatchAlarmActionArgs(
        Output<String> alarmName,
        Output<String> roleArn,
        Output<String> stateReason,
        Output<String> stateValue) {
        this.alarmName = Objects.requireNonNull(alarmName, "expected parameter 'alarmName' to be non-null");
        this.roleArn = Objects.requireNonNull(roleArn, "expected parameter 'roleArn' to be non-null");
        this.stateReason = Objects.requireNonNull(stateReason, "expected parameter 'stateReason' to be non-null");
        this.stateValue = Objects.requireNonNull(stateValue, "expected parameter 'stateValue' to be non-null");
    }

    private TopicRuleCloudwatchAlarmActionArgs() {
        this.alarmName = Output.empty();
        this.roleArn = Output.empty();
        this.stateReason = Output.empty();
        this.stateValue = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicRuleCloudwatchAlarmActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> alarmName;
        private Output<String> roleArn;
        private Output<String> stateReason;
        private Output<String> stateValue;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicRuleCloudwatchAlarmActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alarmName = defaults.alarmName;
    	      this.roleArn = defaults.roleArn;
    	      this.stateReason = defaults.stateReason;
    	      this.stateValue = defaults.stateValue;
        }

        public Builder alarmName(Output<String> alarmName) {
            this.alarmName = Objects.requireNonNull(alarmName);
            return this;
        }
        public Builder alarmName(String alarmName) {
            this.alarmName = Output.of(Objects.requireNonNull(alarmName));
            return this;
        }
        public Builder roleArn(Output<String> roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }
        public Builder roleArn(String roleArn) {
            this.roleArn = Output.of(Objects.requireNonNull(roleArn));
            return this;
        }
        public Builder stateReason(Output<String> stateReason) {
            this.stateReason = Objects.requireNonNull(stateReason);
            return this;
        }
        public Builder stateReason(String stateReason) {
            this.stateReason = Output.of(Objects.requireNonNull(stateReason));
            return this;
        }
        public Builder stateValue(Output<String> stateValue) {
            this.stateValue = Objects.requireNonNull(stateValue);
            return this;
        }
        public Builder stateValue(String stateValue) {
            this.stateValue = Output.of(Objects.requireNonNull(stateValue));
            return this;
        }        public TopicRuleCloudwatchAlarmActionArgs build() {
            return new TopicRuleCloudwatchAlarmActionArgs(alarmName, roleArn, stateReason, stateValue);
        }
    }
}
