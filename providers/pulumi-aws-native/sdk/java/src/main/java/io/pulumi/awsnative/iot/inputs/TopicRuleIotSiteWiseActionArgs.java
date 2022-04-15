// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.inputs;

import io.pulumi.awsnative.iot.inputs.TopicRulePutAssetPropertyValueEntryArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class TopicRuleIotSiteWiseActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final TopicRuleIotSiteWiseActionArgs Empty = new TopicRuleIotSiteWiseActionArgs();

    @Import(name="putAssetPropertyValueEntries", required=true)
      private final Output<List<TopicRulePutAssetPropertyValueEntryArgs>> putAssetPropertyValueEntries;

    public Output<List<TopicRulePutAssetPropertyValueEntryArgs>> putAssetPropertyValueEntries() {
        return this.putAssetPropertyValueEntries;
    }

    @Import(name="roleArn", required=true)
      private final Output<String> roleArn;

    public Output<String> roleArn() {
        return this.roleArn;
    }

    public TopicRuleIotSiteWiseActionArgs(
        Output<List<TopicRulePutAssetPropertyValueEntryArgs>> putAssetPropertyValueEntries,
        Output<String> roleArn) {
        this.putAssetPropertyValueEntries = Objects.requireNonNull(putAssetPropertyValueEntries, "expected parameter 'putAssetPropertyValueEntries' to be non-null");
        this.roleArn = Objects.requireNonNull(roleArn, "expected parameter 'roleArn' to be non-null");
    }

    private TopicRuleIotSiteWiseActionArgs() {
        this.putAssetPropertyValueEntries = Codegen.empty();
        this.roleArn = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicRuleIotSiteWiseActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<TopicRulePutAssetPropertyValueEntryArgs>> putAssetPropertyValueEntries;
        private Output<String> roleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicRuleIotSiteWiseActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.putAssetPropertyValueEntries = defaults.putAssetPropertyValueEntries;
    	      this.roleArn = defaults.roleArn;
        }

        public Builder putAssetPropertyValueEntries(Output<List<TopicRulePutAssetPropertyValueEntryArgs>> putAssetPropertyValueEntries) {
            this.putAssetPropertyValueEntries = Objects.requireNonNull(putAssetPropertyValueEntries);
            return this;
        }
        public Builder putAssetPropertyValueEntries(List<TopicRulePutAssetPropertyValueEntryArgs> putAssetPropertyValueEntries) {
            this.putAssetPropertyValueEntries = Output.of(Objects.requireNonNull(putAssetPropertyValueEntries));
            return this;
        }
        public Builder putAssetPropertyValueEntries(TopicRulePutAssetPropertyValueEntryArgs... putAssetPropertyValueEntries) {
            return putAssetPropertyValueEntries(List.of(putAssetPropertyValueEntries));
        }
        public Builder roleArn(Output<String> roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }
        public Builder roleArn(String roleArn) {
            this.roleArn = Output.of(Objects.requireNonNull(roleArn));
            return this;
        }        public TopicRuleIotSiteWiseActionArgs build() {
            return new TopicRuleIotSiteWiseActionArgs(putAssetPropertyValueEntries, roleArn);
        }
    }
}
