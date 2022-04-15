// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.inputs;

import io.pulumi.awsnative.wafv2.inputs.RuleGroupCustomHTTPHeader;
import io.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;


/**
 * Custom request handling.
 * 
 */
public final class RuleGroupCustomRequestHandling extends io.pulumi.resources.InvokeArgs {

    public static final RuleGroupCustomRequestHandling Empty = new RuleGroupCustomRequestHandling();

    /**
     * Collection of HTTP headers.
     * 
     */
    @Import(name="insertHeaders", required=true)
      private final List<RuleGroupCustomHTTPHeader> insertHeaders;

    public List<RuleGroupCustomHTTPHeader> insertHeaders() {
        return this.insertHeaders;
    }

    public RuleGroupCustomRequestHandling(List<RuleGroupCustomHTTPHeader> insertHeaders) {
        this.insertHeaders = Objects.requireNonNull(insertHeaders, "expected parameter 'insertHeaders' to be non-null");
    }

    private RuleGroupCustomRequestHandling() {
        this.insertHeaders = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupCustomRequestHandling defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<RuleGroupCustomHTTPHeader> insertHeaders;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupCustomRequestHandling defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.insertHeaders = defaults.insertHeaders;
        }

        public Builder insertHeaders(List<RuleGroupCustomHTTPHeader> insertHeaders) {
            this.insertHeaders = Objects.requireNonNull(insertHeaders);
            return this;
        }
        public Builder insertHeaders(RuleGroupCustomHTTPHeader... insertHeaders) {
            return insertHeaders(List.of(insertHeaders));
        }        public RuleGroupCustomRequestHandling build() {
            return new RuleGroupCustomRequestHandling(insertHeaders);
        }
    }
}
