// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class WebAclLoggingConfigurationLoggingFilterFilterConditionLabelNameCondition {
    /**
     * @return The label name that a log record must contain in order to meet the condition. This must be a fully qualified label name. Fully qualified labels have a prefix, optional namespaces, and label name. The prefix identifies the rule group or web ACL context of the rule that added the label.
     * 
     */
    private final String labelName;

    @CustomType.Constructor
    private WebAclLoggingConfigurationLoggingFilterFilterConditionLabelNameCondition(@CustomType.Parameter("labelName") String labelName) {
        this.labelName = labelName;
    }

    /**
     * @return The label name that a log record must contain in order to meet the condition. This must be a fully qualified label name. Fully qualified labels have a prefix, optional namespaces, and label name. The prefix identifies the rule group or web ACL context of the rule that added the label.
     * 
     */
    public String labelName() {
        return this.labelName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclLoggingConfigurationLoggingFilterFilterConditionLabelNameCondition defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String labelName;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclLoggingConfigurationLoggingFilterFilterConditionLabelNameCondition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.labelName = defaults.labelName;
        }

        public Builder labelName(String labelName) {
            this.labelName = Objects.requireNonNull(labelName);
            return this;
        }        public WebAclLoggingConfigurationLoggingFilterFilterConditionLabelNameCondition build() {
            return new WebAclLoggingConfigurationLoggingFilterFilterConditionLabelNameCondition(labelName);
        }
    }
}
