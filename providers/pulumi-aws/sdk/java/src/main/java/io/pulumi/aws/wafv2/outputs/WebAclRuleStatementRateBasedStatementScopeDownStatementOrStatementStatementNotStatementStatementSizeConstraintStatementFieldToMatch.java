// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.outputs;

import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchAllQueryArguments;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchBody;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchMethod;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchQueryString;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchSingleHeader;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchSingleQueryArgument;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchUriPath;
import io.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatch {
    /**
     * Inspect all query arguments.
     * 
     */
    private final @Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchAllQueryArguments allQueryArguments;
    /**
     * Inspect the request body, which immediately follows the request headers.
     * 
     */
    private final @Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchBody body;
    /**
     * Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * 
     */
    private final @Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchMethod method;
    /**
     * Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * 
     */
    private final @Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchQueryString queryString;
    /**
     * Inspect a single header. See Single Header below for details.
     * 
     */
    private final @Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchSingleHeader singleHeader;
    /**
     * Inspect a single query argument. See Single Query Argument below for details.
     * 
     */
    private final @Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchSingleQueryArgument singleQueryArgument;
    /**
     * Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * 
     */
    private final @Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchUriPath uriPath;

    @CustomType.Constructor
    private WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatch(
        @CustomType.Parameter("allQueryArguments") @Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchAllQueryArguments allQueryArguments,
        @CustomType.Parameter("body") @Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchBody body,
        @CustomType.Parameter("method") @Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchMethod method,
        @CustomType.Parameter("queryString") @Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchQueryString queryString,
        @CustomType.Parameter("singleHeader") @Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchSingleHeader singleHeader,
        @CustomType.Parameter("singleQueryArgument") @Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchSingleQueryArgument singleQueryArgument,
        @CustomType.Parameter("uriPath") @Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchUriPath uriPath) {
        this.allQueryArguments = allQueryArguments;
        this.body = body;
        this.method = method;
        this.queryString = queryString;
        this.singleHeader = singleHeader;
        this.singleQueryArgument = singleQueryArgument;
        this.uriPath = uriPath;
    }

    /**
     * Inspect all query arguments.
     * 
    */
    public Optional<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchAllQueryArguments> getAllQueryArguments() {
        return Optional.ofNullable(this.allQueryArguments);
    }
    /**
     * Inspect the request body, which immediately follows the request headers.
     * 
    */
    public Optional<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchBody> getBody() {
        return Optional.ofNullable(this.body);
    }
    /**
     * Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * 
    */
    public Optional<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchMethod> getMethod() {
        return Optional.ofNullable(this.method);
    }
    /**
     * Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * 
    */
    public Optional<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchQueryString> getQueryString() {
        return Optional.ofNullable(this.queryString);
    }
    /**
     * Inspect a single header. See Single Header below for details.
     * 
    */
    public Optional<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchSingleHeader> getSingleHeader() {
        return Optional.ofNullable(this.singleHeader);
    }
    /**
     * Inspect a single query argument. See Single Query Argument below for details.
     * 
    */
    public Optional<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchSingleQueryArgument> getSingleQueryArgument() {
        return Optional.ofNullable(this.singleQueryArgument);
    }
    /**
     * Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * 
    */
    public Optional<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchUriPath> getUriPath() {
        return Optional.ofNullable(this.uriPath);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatch defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchAllQueryArguments allQueryArguments;
        private @Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchBody body;
        private @Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchMethod method;
        private @Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchQueryString queryString;
        private @Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchSingleHeader singleHeader;
        private @Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchSingleQueryArgument singleQueryArgument;
        private @Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchUriPath uriPath;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allQueryArguments = defaults.allQueryArguments;
    	      this.body = defaults.body;
    	      this.method = defaults.method;
    	      this.queryString = defaults.queryString;
    	      this.singleHeader = defaults.singleHeader;
    	      this.singleQueryArgument = defaults.singleQueryArgument;
    	      this.uriPath = defaults.uriPath;
        }

        public Builder allQueryArguments(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchAllQueryArguments allQueryArguments) {
            this.allQueryArguments = allQueryArguments;
            return this;
        }
        public Builder body(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchBody body) {
            this.body = body;
            return this;
        }
        public Builder method(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchMethod method) {
            this.method = method;
            return this;
        }
        public Builder queryString(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchQueryString queryString) {
            this.queryString = queryString;
            return this;
        }
        public Builder singleHeader(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchSingleHeader singleHeader) {
            this.singleHeader = singleHeader;
            return this;
        }
        public Builder singleQueryArgument(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchSingleQueryArgument singleQueryArgument) {
            this.singleQueryArgument = singleQueryArgument;
            return this;
        }
        public Builder uriPath(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatchUriPath uriPath) {
            this.uriPath = uriPath;
            return this;
        }        public WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatch build() {
            return new WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementNotStatementStatementSizeConstraintStatementFieldToMatch(allQueryArguments, body, method, queryString, singleHeader, singleQueryArgument, uriPath);
        }
    }
}
