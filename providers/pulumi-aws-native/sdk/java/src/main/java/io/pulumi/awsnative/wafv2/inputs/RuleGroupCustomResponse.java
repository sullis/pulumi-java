// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.inputs;

import io.pulumi.awsnative.wafv2.inputs.RuleGroupCustomHTTPHeader;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Custom response.
 * 
 */
public final class RuleGroupCustomResponse extends io.pulumi.resources.InvokeArgs {

    public static final RuleGroupCustomResponse Empty = new RuleGroupCustomResponse();

    /**
     * Custom response body key.
     * 
     */
    @Import(name="customResponseBodyKey")
      private final @Nullable String customResponseBodyKey;

    public Optional<String> customResponseBodyKey() {
        return this.customResponseBodyKey == null ? Optional.empty() : Optional.ofNullable(this.customResponseBodyKey);
    }

    @Import(name="responseCode", required=true)
      private final Integer responseCode;

    public Integer responseCode() {
        return this.responseCode;
    }

    /**
     * Collection of HTTP headers.
     * 
     */
    @Import(name="responseHeaders")
      private final @Nullable List<RuleGroupCustomHTTPHeader> responseHeaders;

    public List<RuleGroupCustomHTTPHeader> responseHeaders() {
        return this.responseHeaders == null ? List.of() : this.responseHeaders;
    }

    public RuleGroupCustomResponse(
        @Nullable String customResponseBodyKey,
        Integer responseCode,
        @Nullable List<RuleGroupCustomHTTPHeader> responseHeaders) {
        this.customResponseBodyKey = customResponseBodyKey;
        this.responseCode = Objects.requireNonNull(responseCode, "expected parameter 'responseCode' to be non-null");
        this.responseHeaders = responseHeaders;
    }

    private RuleGroupCustomResponse() {
        this.customResponseBodyKey = null;
        this.responseCode = null;
        this.responseHeaders = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupCustomResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String customResponseBodyKey;
        private Integer responseCode;
        private @Nullable List<RuleGroupCustomHTTPHeader> responseHeaders;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupCustomResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customResponseBodyKey = defaults.customResponseBodyKey;
    	      this.responseCode = defaults.responseCode;
    	      this.responseHeaders = defaults.responseHeaders;
        }

        public Builder customResponseBodyKey(@Nullable String customResponseBodyKey) {
            this.customResponseBodyKey = customResponseBodyKey;
            return this;
        }
        public Builder responseCode(Integer responseCode) {
            this.responseCode = Objects.requireNonNull(responseCode);
            return this;
        }
        public Builder responseHeaders(@Nullable List<RuleGroupCustomHTTPHeader> responseHeaders) {
            this.responseHeaders = responseHeaders;
            return this;
        }
        public Builder responseHeaders(RuleGroupCustomHTTPHeader... responseHeaders) {
            return responseHeaders(List.of(responseHeaders));
        }        public RuleGroupCustomResponse build() {
            return new RuleGroupCustomResponse(customResponseBodyKey, responseCode, responseHeaders);
        }
    }
}
