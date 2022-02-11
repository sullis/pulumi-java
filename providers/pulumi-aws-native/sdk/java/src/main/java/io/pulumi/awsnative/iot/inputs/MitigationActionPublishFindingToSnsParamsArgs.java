// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class MitigationActionPublishFindingToSnsParamsArgs extends io.pulumi.resources.ResourceArgs {

    public static final MitigationActionPublishFindingToSnsParamsArgs Empty = new MitigationActionPublishFindingToSnsParamsArgs();

    @InputImport(name="topicArn", required=true)
    private final Input<String> topicArn;

    public Input<String> getTopicArn() {
        return this.topicArn;
    }

    public MitigationActionPublishFindingToSnsParamsArgs(Input<String> topicArn) {
        this.topicArn = Objects.requireNonNull(topicArn, "expected parameter 'topicArn' to be non-null");
    }

    private MitigationActionPublishFindingToSnsParamsArgs() {
        this.topicArn = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MitigationActionPublishFindingToSnsParamsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> topicArn;

        public Builder() {
    	      // Empty
        }

        public Builder(MitigationActionPublishFindingToSnsParamsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.topicArn = defaults.topicArn;
        }

        public Builder setTopicArn(Input<String> topicArn) {
            this.topicArn = Objects.requireNonNull(topicArn);
            return this;
        }

        public Builder setTopicArn(String topicArn) {
            this.topicArn = Input.of(Objects.requireNonNull(topicArn));
            return this;
        }

        public MitigationActionPublishFindingToSnsParamsArgs build() {
            return new MitigationActionPublishFindingToSnsParamsArgs(topicArn);
        }
    }
}
