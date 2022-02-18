// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class TopicRuleCloudwatchLogsAction {
    private final String logGroupName;
    private final String roleArn;

    @OutputCustomType.Constructor({"logGroupName","roleArn"})
    private TopicRuleCloudwatchLogsAction(
        String logGroupName,
        String roleArn) {
        this.logGroupName = Objects.requireNonNull(logGroupName);
        this.roleArn = Objects.requireNonNull(roleArn);
    }

    public String getLogGroupName() {
        return this.logGroupName;
    }
    public String getRoleArn() {
        return this.roleArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicRuleCloudwatchLogsAction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String logGroupName;
        private String roleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicRuleCloudwatchLogsAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.logGroupName = defaults.logGroupName;
    	      this.roleArn = defaults.roleArn;
        }

        public Builder setLogGroupName(String logGroupName) {
            this.logGroupName = Objects.requireNonNull(logGroupName);
            return this;
        }

        public Builder setRoleArn(String roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }

        public TopicRuleCloudwatchLogsAction build() {
            return new TopicRuleCloudwatchLogsAction(logGroupName, roleArn);
        }
    }
}
