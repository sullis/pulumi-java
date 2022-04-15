// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TopicRuleSqsActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final TopicRuleSqsActionArgs Empty = new TopicRuleSqsActionArgs();

    @Import(name="queueUrl", required=true)
      private final Output<String> queueUrl;

    public Output<String> queueUrl() {
        return this.queueUrl;
    }

    @Import(name="roleArn", required=true)
      private final Output<String> roleArn;

    public Output<String> roleArn() {
        return this.roleArn;
    }

    @Import(name="useBase64")
      private final @Nullable Output<Boolean> useBase64;

    public Output<Boolean> useBase64() {
        return this.useBase64 == null ? Codegen.empty() : this.useBase64;
    }

    public TopicRuleSqsActionArgs(
        Output<String> queueUrl,
        Output<String> roleArn,
        @Nullable Output<Boolean> useBase64) {
        this.queueUrl = Objects.requireNonNull(queueUrl, "expected parameter 'queueUrl' to be non-null");
        this.roleArn = Objects.requireNonNull(roleArn, "expected parameter 'roleArn' to be non-null");
        this.useBase64 = useBase64;
    }

    private TopicRuleSqsActionArgs() {
        this.queueUrl = Codegen.empty();
        this.roleArn = Codegen.empty();
        this.useBase64 = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicRuleSqsActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> queueUrl;
        private Output<String> roleArn;
        private @Nullable Output<Boolean> useBase64;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicRuleSqsActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.queueUrl = defaults.queueUrl;
    	      this.roleArn = defaults.roleArn;
    	      this.useBase64 = defaults.useBase64;
        }

        public Builder queueUrl(Output<String> queueUrl) {
            this.queueUrl = Objects.requireNonNull(queueUrl);
            return this;
        }
        public Builder queueUrl(String queueUrl) {
            this.queueUrl = Output.of(Objects.requireNonNull(queueUrl));
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
        public Builder useBase64(@Nullable Output<Boolean> useBase64) {
            this.useBase64 = useBase64;
            return this;
        }
        public Builder useBase64(@Nullable Boolean useBase64) {
            this.useBase64 = Codegen.ofNullable(useBase64);
            return this;
        }        public TopicRuleSqsActionArgs build() {
            return new TopicRuleSqsActionArgs(queueUrl, roleArn, useBase64);
        }
    }
}
