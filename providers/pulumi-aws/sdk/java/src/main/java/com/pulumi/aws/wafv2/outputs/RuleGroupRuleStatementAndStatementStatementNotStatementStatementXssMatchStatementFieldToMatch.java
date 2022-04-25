// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.outputs;

import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchAllQueryArguments;
import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchBody;
import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchMethod;
import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchQueryString;
import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchSingleHeader;
import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchSingleQueryArgument;
import com.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchUriPath;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RuleGroupRuleStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatch {
    /**
     * @return Inspect all query arguments.
     * 
     */
    private final @Nullable RuleGroupRuleStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchAllQueryArguments allQueryArguments;
    /**
     * @return Inspect the request body, which immediately follows the request headers.
     * 
     */
    private final @Nullable RuleGroupRuleStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchBody body;
    /**
     * @return Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * 
     */
    private final @Nullable RuleGroupRuleStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchMethod method;
    /**
     * @return Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * 
     */
    private final @Nullable RuleGroupRuleStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchQueryString queryString;
    /**
     * @return Inspect a single header. See Single Header below for details.
     * 
     */
    private final @Nullable RuleGroupRuleStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchSingleHeader singleHeader;
    /**
     * @return Inspect a single query argument. See Single Query Argument below for details.
     * 
     */
    private final @Nullable RuleGroupRuleStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchSingleQueryArgument singleQueryArgument;
    /**
     * @return Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * 
     */
    private final @Nullable RuleGroupRuleStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchUriPath uriPath;

    @CustomType.Constructor
    private RuleGroupRuleStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatch(
        @CustomType.Parameter("allQueryArguments") @Nullable RuleGroupRuleStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchAllQueryArguments allQueryArguments,
        @CustomType.Parameter("body") @Nullable RuleGroupRuleStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchBody body,
        @CustomType.Parameter("method") @Nullable RuleGroupRuleStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchMethod method,
        @CustomType.Parameter("queryString") @Nullable RuleGroupRuleStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchQueryString queryString,
        @CustomType.Parameter("singleHeader") @Nullable RuleGroupRuleStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchSingleHeader singleHeader,
        @CustomType.Parameter("singleQueryArgument") @Nullable RuleGroupRuleStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchSingleQueryArgument singleQueryArgument,
        @CustomType.Parameter("uriPath") @Nullable RuleGroupRuleStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchUriPath uriPath) {
        this.allQueryArguments = allQueryArguments;
        this.body = body;
        this.method = method;
        this.queryString = queryString;
        this.singleHeader = singleHeader;
        this.singleQueryArgument = singleQueryArgument;
        this.uriPath = uriPath;
    }

    /**
     * @return Inspect all query arguments.
     * 
     */
    public Optional<RuleGroupRuleStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchAllQueryArguments> allQueryArguments() {
        return Optional.ofNullable(this.allQueryArguments);
    }
    /**
     * @return Inspect the request body, which immediately follows the request headers.
     * 
     */
    public Optional<RuleGroupRuleStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchBody> body() {
        return Optional.ofNullable(this.body);
    }
    /**
     * @return Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * 
     */
    public Optional<RuleGroupRuleStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchMethod> method() {
        return Optional.ofNullable(this.method);
    }
    /**
     * @return Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * 
     */
    public Optional<RuleGroupRuleStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchQueryString> queryString() {
        return Optional.ofNullable(this.queryString);
    }
    /**
     * @return Inspect a single header. See Single Header below for details.
     * 
     */
    public Optional<RuleGroupRuleStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchSingleHeader> singleHeader() {
        return Optional.ofNullable(this.singleHeader);
    }
    /**
     * @return Inspect a single query argument. See Single Query Argument below for details.
     * 
     */
    public Optional<RuleGroupRuleStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchSingleQueryArgument> singleQueryArgument() {
        return Optional.ofNullable(this.singleQueryArgument);
    }
    /**
     * @return Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * 
     */
    public Optional<RuleGroupRuleStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchUriPath> uriPath() {
        return Optional.ofNullable(this.uriPath);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatch defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable RuleGroupRuleStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchAllQueryArguments allQueryArguments;
        private @Nullable RuleGroupRuleStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchBody body;
        private @Nullable RuleGroupRuleStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchMethod method;
        private @Nullable RuleGroupRuleStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchQueryString queryString;
        private @Nullable RuleGroupRuleStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchSingleHeader singleHeader;
        private @Nullable RuleGroupRuleStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchSingleQueryArgument singleQueryArgument;
        private @Nullable RuleGroupRuleStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchUriPath uriPath;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allQueryArguments = defaults.allQueryArguments;
    	      this.body = defaults.body;
    	      this.method = defaults.method;
    	      this.queryString = defaults.queryString;
    	      this.singleHeader = defaults.singleHeader;
    	      this.singleQueryArgument = defaults.singleQueryArgument;
    	      this.uriPath = defaults.uriPath;
        }

        public Builder allQueryArguments(@Nullable RuleGroupRuleStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchAllQueryArguments allQueryArguments) {
            this.allQueryArguments = allQueryArguments;
            return this;
        }
        public Builder body(@Nullable RuleGroupRuleStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchBody body) {
            this.body = body;
            return this;
        }
        public Builder method(@Nullable RuleGroupRuleStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchMethod method) {
            this.method = method;
            return this;
        }
        public Builder queryString(@Nullable RuleGroupRuleStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchQueryString queryString) {
            this.queryString = queryString;
            return this;
        }
        public Builder singleHeader(@Nullable RuleGroupRuleStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchSingleHeader singleHeader) {
            this.singleHeader = singleHeader;
            return this;
        }
        public Builder singleQueryArgument(@Nullable RuleGroupRuleStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchSingleQueryArgument singleQueryArgument) {
            this.singleQueryArgument = singleQueryArgument;
            return this;
        }
        public Builder uriPath(@Nullable RuleGroupRuleStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatchUriPath uriPath) {
            this.uriPath = uriPath;
            return this;
        }        public RuleGroupRuleStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatch build() {
            return new RuleGroupRuleStatementAndStatementStatementNotStatementStatementXssMatchStatementFieldToMatch(allQueryArguments, body, method, queryString, singleHeader, singleQueryArgument, uriPath);
        }
    }
}
