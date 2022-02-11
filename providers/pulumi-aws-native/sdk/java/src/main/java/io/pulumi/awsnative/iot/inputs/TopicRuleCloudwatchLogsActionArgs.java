// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class TopicRuleCloudwatchLogsActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final TopicRuleCloudwatchLogsActionArgs Empty = new TopicRuleCloudwatchLogsActionArgs();

    @InputImport(name="logGroupName", required=true)
    private final Input<String> logGroupName;

    public Input<String> getLogGroupName() {
        return this.logGroupName;
    }

    @InputImport(name="roleArn", required=true)
    private final Input<String> roleArn;

    public Input<String> getRoleArn() {
        return this.roleArn;
    }

    public TopicRuleCloudwatchLogsActionArgs(
        Input<String> logGroupName,
        Input<String> roleArn) {
        this.logGroupName = Objects.requireNonNull(logGroupName, "expected parameter 'logGroupName' to be non-null");
        this.roleArn = Objects.requireNonNull(roleArn, "expected parameter 'roleArn' to be non-null");
    }

    private TopicRuleCloudwatchLogsActionArgs() {
        this.logGroupName = Input.empty();
        this.roleArn = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicRuleCloudwatchLogsActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> logGroupName;
        private Input<String> roleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicRuleCloudwatchLogsActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.logGroupName = defaults.logGroupName;
    	      this.roleArn = defaults.roleArn;
        }

        public Builder setLogGroupName(Input<String> logGroupName) {
            this.logGroupName = Objects.requireNonNull(logGroupName);
            return this;
        }

        public Builder setLogGroupName(String logGroupName) {
            this.logGroupName = Input.of(Objects.requireNonNull(logGroupName));
            return this;
        }

        public Builder setRoleArn(Input<String> roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }

        public Builder setRoleArn(String roleArn) {
            this.roleArn = Input.of(Objects.requireNonNull(roleArn));
            return this;
        }

        public TopicRuleCloudwatchLogsActionArgs build() {
            return new TopicRuleCloudwatchLogsActionArgs(logGroupName, roleArn);
        }
    }
}
