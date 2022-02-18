// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Parameters, to define a mitigation action that publishes findings to Amazon SNS. You can implement your own custom actions in response to the Amazon SNS messages.
 * 
 */
public final class MitigationActionPublishFindingToSnsParams extends io.pulumi.resources.InvokeArgs {

    public static final MitigationActionPublishFindingToSnsParams Empty = new MitigationActionPublishFindingToSnsParams();

    /**
     * The ARN of the topic to which you want to publish the findings.
     * 
     */
    @InputImport(name="topicArn", required=true)
    private final String topicArn;

    public String getTopicArn() {
        return this.topicArn;
    }

    public MitigationActionPublishFindingToSnsParams(String topicArn) {
        this.topicArn = Objects.requireNonNull(topicArn, "expected parameter 'topicArn' to be non-null");
    }

    private MitigationActionPublishFindingToSnsParams() {
        this.topicArn = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MitigationActionPublishFindingToSnsParams defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String topicArn;

        public Builder() {
    	      // Empty
        }

        public Builder(MitigationActionPublishFindingToSnsParams defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.topicArn = defaults.topicArn;
        }

        public Builder setTopicArn(String topicArn) {
            this.topicArn = Objects.requireNonNull(topicArn);
            return this;
        }

        public MitigationActionPublishFindingToSnsParams build() {
            return new MitigationActionPublishFindingToSnsParams(topicArn);
        }
    }
}
