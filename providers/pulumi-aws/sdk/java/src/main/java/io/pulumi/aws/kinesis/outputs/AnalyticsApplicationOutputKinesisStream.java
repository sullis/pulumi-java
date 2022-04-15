// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesis.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class AnalyticsApplicationOutputKinesisStream {
    /**
     * The ARN of the Kinesis Stream.
     * 
     */
    private final String resourceArn;
    /**
     * The ARN of the IAM Role used to access the stream.
     * 
     */
    private final String roleArn;

    @CustomType.Constructor
    private AnalyticsApplicationOutputKinesisStream(
        @CustomType.Parameter("resourceArn") String resourceArn,
        @CustomType.Parameter("roleArn") String roleArn) {
        this.resourceArn = resourceArn;
        this.roleArn = roleArn;
    }

    /**
     * The ARN of the Kinesis Stream.
     * 
    */
    public String resourceArn() {
        return this.resourceArn;
    }
    /**
     * The ARN of the IAM Role used to access the stream.
     * 
    */
    public String roleArn() {
        return this.roleArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnalyticsApplicationOutputKinesisStream defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String resourceArn;
        private String roleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(AnalyticsApplicationOutputKinesisStream defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceArn = defaults.resourceArn;
    	      this.roleArn = defaults.roleArn;
        }

        public Builder resourceArn(String resourceArn) {
            this.resourceArn = Objects.requireNonNull(resourceArn);
            return this;
        }
        public Builder roleArn(String roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }        public AnalyticsApplicationOutputKinesisStream build() {
            return new AnalyticsApplicationOutputKinesisStream(resourceArn, roleArn);
        }
    }
}
