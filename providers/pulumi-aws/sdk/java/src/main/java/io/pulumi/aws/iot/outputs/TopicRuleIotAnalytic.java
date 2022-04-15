// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iot.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class TopicRuleIotAnalytic {
    /**
     * Name of AWS IOT Analytics channel.
     * 
     */
    private final String channelName;
    /**
     * The ARN of the IAM role that grants access.
     * 
     */
    private final String roleArn;

    @CustomType.Constructor
    private TopicRuleIotAnalytic(
        @CustomType.Parameter("channelName") String channelName,
        @CustomType.Parameter("roleArn") String roleArn) {
        this.channelName = channelName;
        this.roleArn = roleArn;
    }

    /**
     * Name of AWS IOT Analytics channel.
     * 
    */
    public String channelName() {
        return this.channelName;
    }
    /**
     * The ARN of the IAM role that grants access.
     * 
    */
    public String roleArn() {
        return this.roleArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicRuleIotAnalytic defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String channelName;
        private String roleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicRuleIotAnalytic defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.channelName = defaults.channelName;
    	      this.roleArn = defaults.roleArn;
        }

        public Builder channelName(String channelName) {
            this.channelName = Objects.requireNonNull(channelName);
            return this;
        }
        public Builder roleArn(String roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }        public TopicRuleIotAnalytic build() {
            return new TopicRuleIotAnalytic(channelName, roleArn);
        }
    }
}
