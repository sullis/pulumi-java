// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lookoutmetrics.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class AlertSNSConfiguration {
    private final String roleArn;
    private final String snsTopicArn;

    @OutputCustomType.Constructor({"roleArn","snsTopicArn"})
    private AlertSNSConfiguration(
        String roleArn,
        String snsTopicArn) {
        this.roleArn = Objects.requireNonNull(roleArn);
        this.snsTopicArn = Objects.requireNonNull(snsTopicArn);
    }

    public String getRoleArn() {
        return this.roleArn;
    }
    public String getSnsTopicArn() {
        return this.snsTopicArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AlertSNSConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String roleArn;
        private String snsTopicArn;

        public Builder() {
    	      // Empty
        }

        public Builder(AlertSNSConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.roleArn = defaults.roleArn;
    	      this.snsTopicArn = defaults.snsTopicArn;
        }

        public Builder setRoleArn(String roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }

        public Builder setSnsTopicArn(String snsTopicArn) {
            this.snsTopicArn = Objects.requireNonNull(snsTopicArn);
            return this;
        }

        public AlertSNSConfiguration build() {
            return new AlertSNSConfiguration(roleArn, snsTopicArn);
        }
    }
}
