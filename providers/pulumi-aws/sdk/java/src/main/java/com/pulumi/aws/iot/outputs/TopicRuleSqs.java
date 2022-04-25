// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.iot.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class TopicRuleSqs {
    /**
     * @return The URL of the Amazon SQS queue.
     * 
     */
    private final String queueUrl;
    /**
     * @return The ARN of the IAM role that grants access.
     * 
     */
    private final String roleArn;
    /**
     * @return Specifies whether to use Base64 encoding.
     * 
     */
    private final Boolean useBase64;

    @CustomType.Constructor
    private TopicRuleSqs(
        @CustomType.Parameter("queueUrl") String queueUrl,
        @CustomType.Parameter("roleArn") String roleArn,
        @CustomType.Parameter("useBase64") Boolean useBase64) {
        this.queueUrl = queueUrl;
        this.roleArn = roleArn;
        this.useBase64 = useBase64;
    }

    /**
     * @return The URL of the Amazon SQS queue.
     * 
     */
    public String queueUrl() {
        return this.queueUrl;
    }
    /**
     * @return The ARN of the IAM role that grants access.
     * 
     */
    public String roleArn() {
        return this.roleArn;
    }
    /**
     * @return Specifies whether to use Base64 encoding.
     * 
     */
    public Boolean useBase64() {
        return this.useBase64;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicRuleSqs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String queueUrl;
        private String roleArn;
        private Boolean useBase64;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicRuleSqs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.queueUrl = defaults.queueUrl;
    	      this.roleArn = defaults.roleArn;
    	      this.useBase64 = defaults.useBase64;
        }

        public Builder queueUrl(String queueUrl) {
            this.queueUrl = Objects.requireNonNull(queueUrl);
            return this;
        }
        public Builder roleArn(String roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }
        public Builder useBase64(Boolean useBase64) {
            this.useBase64 = Objects.requireNonNull(useBase64);
            return this;
        }        public TopicRuleSqs build() {
            return new TopicRuleSqs(queueUrl, roleArn, useBase64);
        }
    }
}
