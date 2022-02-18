// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.outputs;

import io.pulumi.awsnative.wafv2.outputs.WebACLCustomHTTPHeader;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class WebACLCustomRequestHandling {
    /**
     * Collection of HTTP headers.
     * 
     */
    private final List<WebACLCustomHTTPHeader> insertHeaders;

    @OutputCustomType.Constructor({"insertHeaders"})
    private WebACLCustomRequestHandling(List<WebACLCustomHTTPHeader> insertHeaders) {
        this.insertHeaders = Objects.requireNonNull(insertHeaders);
    }

    /**
     * Collection of HTTP headers.
     * 
     */
    public List<WebACLCustomHTTPHeader> getInsertHeaders() {
        return this.insertHeaders;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebACLCustomRequestHandling defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<WebACLCustomHTTPHeader> insertHeaders;

        public Builder() {
    	      // Empty
        }

        public Builder(WebACLCustomRequestHandling defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.insertHeaders = defaults.insertHeaders;
        }

        public Builder setInsertHeaders(List<WebACLCustomHTTPHeader> insertHeaders) {
            this.insertHeaders = Objects.requireNonNull(insertHeaders);
            return this;
        }

        public WebACLCustomRequestHandling build() {
            return new WebACLCustomRequestHandling(insertHeaders);
        }
    }
}
