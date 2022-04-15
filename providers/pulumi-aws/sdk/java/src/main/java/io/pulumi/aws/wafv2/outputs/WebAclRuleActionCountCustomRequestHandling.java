// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.outputs;

import io.pulumi.aws.wafv2.outputs.WebAclRuleActionCountCustomRequestHandlingInsertHeader;
import io.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;

@CustomType
public final class WebAclRuleActionCountCustomRequestHandling {
    /**
     * The `insert_header` blocks used to define HTTP headers added to the request. See Custom HTTP Header below for details.
     * 
     */
    private final List<WebAclRuleActionCountCustomRequestHandlingInsertHeader> insertHeaders;

    @CustomType.Constructor
    private WebAclRuleActionCountCustomRequestHandling(@CustomType.Parameter("insertHeaders") List<WebAclRuleActionCountCustomRequestHandlingInsertHeader> insertHeaders) {
        this.insertHeaders = insertHeaders;
    }

    /**
     * The `insert_header` blocks used to define HTTP headers added to the request. See Custom HTTP Header below for details.
     * 
    */
    public List<WebAclRuleActionCountCustomRequestHandlingInsertHeader> insertHeaders() {
        return this.insertHeaders;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleActionCountCustomRequestHandling defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<WebAclRuleActionCountCustomRequestHandlingInsertHeader> insertHeaders;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleActionCountCustomRequestHandling defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.insertHeaders = defaults.insertHeaders;
        }

        public Builder insertHeaders(List<WebAclRuleActionCountCustomRequestHandlingInsertHeader> insertHeaders) {
            this.insertHeaders = Objects.requireNonNull(insertHeaders);
            return this;
        }
        public Builder insertHeaders(WebAclRuleActionCountCustomRequestHandlingInsertHeader... insertHeaders) {
            return insertHeaders(List.of(insertHeaders));
        }        public WebAclRuleActionCountCustomRequestHandling build() {
            return new WebAclRuleActionCountCustomRequestHandling(insertHeaders);
        }
    }
}
