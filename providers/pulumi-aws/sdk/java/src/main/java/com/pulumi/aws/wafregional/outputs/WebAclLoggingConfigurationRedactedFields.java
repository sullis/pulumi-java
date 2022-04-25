// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafregional.outputs;

import com.pulumi.aws.wafregional.outputs.WebAclLoggingConfigurationRedactedFieldsFieldToMatch;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;

@CustomType
public final class WebAclLoggingConfigurationRedactedFields {
    /**
     * @return Set of configuration blocks for fields to redact. Detailed below.
     * 
     */
    private final List<WebAclLoggingConfigurationRedactedFieldsFieldToMatch> fieldToMatches;

    @CustomType.Constructor
    private WebAclLoggingConfigurationRedactedFields(@CustomType.Parameter("fieldToMatches") List<WebAclLoggingConfigurationRedactedFieldsFieldToMatch> fieldToMatches) {
        this.fieldToMatches = fieldToMatches;
    }

    /**
     * @return Set of configuration blocks for fields to redact. Detailed below.
     * 
     */
    public List<WebAclLoggingConfigurationRedactedFieldsFieldToMatch> fieldToMatches() {
        return this.fieldToMatches;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclLoggingConfigurationRedactedFields defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<WebAclLoggingConfigurationRedactedFieldsFieldToMatch> fieldToMatches;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclLoggingConfigurationRedactedFields defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fieldToMatches = defaults.fieldToMatches;
        }

        public Builder fieldToMatches(List<WebAclLoggingConfigurationRedactedFieldsFieldToMatch> fieldToMatches) {
            this.fieldToMatches = Objects.requireNonNull(fieldToMatches);
            return this;
        }
        public Builder fieldToMatches(WebAclLoggingConfigurationRedactedFieldsFieldToMatch... fieldToMatches) {
            return fieldToMatches(List.of(fieldToMatches));
        }        public WebAclLoggingConfigurationRedactedFields build() {
            return new WebAclLoggingConfigurationRedactedFields(fieldToMatches);
        }
    }
}
