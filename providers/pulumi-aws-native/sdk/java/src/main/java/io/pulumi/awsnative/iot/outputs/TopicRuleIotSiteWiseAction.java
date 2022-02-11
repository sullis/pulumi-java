// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.outputs;

import io.pulumi.awsnative.iot.outputs.TopicRulePutAssetPropertyValueEntry;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class TopicRuleIotSiteWiseAction {
    private final List<TopicRulePutAssetPropertyValueEntry> putAssetPropertyValueEntries;
    private final String roleArn;

    @OutputCustomType.Constructor({"putAssetPropertyValueEntries","roleArn"})
    private TopicRuleIotSiteWiseAction(
        List<TopicRulePutAssetPropertyValueEntry> putAssetPropertyValueEntries,
        String roleArn) {
        this.putAssetPropertyValueEntries = Objects.requireNonNull(putAssetPropertyValueEntries);
        this.roleArn = Objects.requireNonNull(roleArn);
    }

    public List<TopicRulePutAssetPropertyValueEntry> getPutAssetPropertyValueEntries() {
        return this.putAssetPropertyValueEntries;
    }
    public String getRoleArn() {
        return this.roleArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicRuleIotSiteWiseAction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<TopicRulePutAssetPropertyValueEntry> putAssetPropertyValueEntries;
        private String roleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicRuleIotSiteWiseAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.putAssetPropertyValueEntries = defaults.putAssetPropertyValueEntries;
    	      this.roleArn = defaults.roleArn;
        }

        public Builder setPutAssetPropertyValueEntries(List<TopicRulePutAssetPropertyValueEntry> putAssetPropertyValueEntries) {
            this.putAssetPropertyValueEntries = Objects.requireNonNull(putAssetPropertyValueEntries);
            return this;
        }

        public Builder setRoleArn(String roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }

        public TopicRuleIotSiteWiseAction build() {
            return new TopicRuleIotSiteWiseAction(putAssetPropertyValueEntries, roleArn);
        }
    }
}
