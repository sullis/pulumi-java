// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.inputs;

import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchAllQueryArgumentsGetArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchBodyGetArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchMethodGetArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchQueryStringGetArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchSingleHeaderGetArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchSingleQueryArgumentGetArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchUriPathGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchGetArgs Empty = new WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchGetArgs();

    /**
     * Inspect all query arguments.
     * 
     */
    @Import(name="allQueryArguments")
    private @Nullable Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchAllQueryArgumentsGetArgs> allQueryArguments;

    /**
     * @return Inspect all query arguments.
     * 
     */
    public Optional<Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchAllQueryArgumentsGetArgs>> allQueryArguments() {
        return Optional.ofNullable(this.allQueryArguments);
    }

    /**
     * Inspect the request body, which immediately follows the request headers.
     * 
     */
    @Import(name="body")
    private @Nullable Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchBodyGetArgs> body;

    /**
     * @return Inspect the request body, which immediately follows the request headers.
     * 
     */
    public Optional<Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchBodyGetArgs>> body() {
        return Optional.ofNullable(this.body);
    }

    /**
     * Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * 
     */
    @Import(name="method")
    private @Nullable Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchMethodGetArgs> method;

    /**
     * @return Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * 
     */
    public Optional<Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchMethodGetArgs>> method() {
        return Optional.ofNullable(this.method);
    }

    /**
     * Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * 
     */
    @Import(name="queryString")
    private @Nullable Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchQueryStringGetArgs> queryString;

    /**
     * @return Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * 
     */
    public Optional<Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchQueryStringGetArgs>> queryString() {
        return Optional.ofNullable(this.queryString);
    }

    /**
     * Inspect a single header. See Single Header below for details.
     * 
     */
    @Import(name="singleHeader")
    private @Nullable Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchSingleHeaderGetArgs> singleHeader;

    /**
     * @return Inspect a single header. See Single Header below for details.
     * 
     */
    public Optional<Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchSingleHeaderGetArgs>> singleHeader() {
        return Optional.ofNullable(this.singleHeader);
    }

    /**
     * Inspect a single query argument. See Single Query Argument below for details.
     * 
     */
    @Import(name="singleQueryArgument")
    private @Nullable Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchSingleQueryArgumentGetArgs> singleQueryArgument;

    /**
     * @return Inspect a single query argument. See Single Query Argument below for details.
     * 
     */
    public Optional<Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchSingleQueryArgumentGetArgs>> singleQueryArgument() {
        return Optional.ofNullable(this.singleQueryArgument);
    }

    /**
     * Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * 
     */
    @Import(name="uriPath")
    private @Nullable Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchUriPathGetArgs> uriPath;

    /**
     * @return Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * 
     */
    public Optional<Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchUriPathGetArgs>> uriPath() {
        return Optional.ofNullable(this.uriPath);
    }

    private WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchGetArgs() {}

    private WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchGetArgs(WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchGetArgs $) {
        this.allQueryArguments = $.allQueryArguments;
        this.body = $.body;
        this.method = $.method;
        this.queryString = $.queryString;
        this.singleHeader = $.singleHeader;
        this.singleQueryArgument = $.singleQueryArgument;
        this.uriPath = $.uriPath;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchGetArgs $;

        public Builder() {
            $ = new WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchGetArgs();
        }

        public Builder(WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchGetArgs defaults) {
            $ = new WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param allQueryArguments Inspect all query arguments.
         * 
         * @return builder
         * 
         */
        public Builder allQueryArguments(@Nullable Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchAllQueryArgumentsGetArgs> allQueryArguments) {
            $.allQueryArguments = allQueryArguments;
            return this;
        }

        /**
         * @param allQueryArguments Inspect all query arguments.
         * 
         * @return builder
         * 
         */
        public Builder allQueryArguments(WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchAllQueryArgumentsGetArgs allQueryArguments) {
            return allQueryArguments(Output.of(allQueryArguments));
        }

        /**
         * @param body Inspect the request body, which immediately follows the request headers.
         * 
         * @return builder
         * 
         */
        public Builder body(@Nullable Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchBodyGetArgs> body) {
            $.body = body;
            return this;
        }

        /**
         * @param body Inspect the request body, which immediately follows the request headers.
         * 
         * @return builder
         * 
         */
        public Builder body(WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchBodyGetArgs body) {
            return body(Output.of(body));
        }

        /**
         * @param method Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
         * 
         * @return builder
         * 
         */
        public Builder method(@Nullable Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchMethodGetArgs> method) {
            $.method = method;
            return this;
        }

        /**
         * @param method Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
         * 
         * @return builder
         * 
         */
        public Builder method(WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchMethodGetArgs method) {
            return method(Output.of(method));
        }

        /**
         * @param queryString Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
         * 
         * @return builder
         * 
         */
        public Builder queryString(@Nullable Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchQueryStringGetArgs> queryString) {
            $.queryString = queryString;
            return this;
        }

        /**
         * @param queryString Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
         * 
         * @return builder
         * 
         */
        public Builder queryString(WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchQueryStringGetArgs queryString) {
            return queryString(Output.of(queryString));
        }

        /**
         * @param singleHeader Inspect a single header. See Single Header below for details.
         * 
         * @return builder
         * 
         */
        public Builder singleHeader(@Nullable Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchSingleHeaderGetArgs> singleHeader) {
            $.singleHeader = singleHeader;
            return this;
        }

        /**
         * @param singleHeader Inspect a single header. See Single Header below for details.
         * 
         * @return builder
         * 
         */
        public Builder singleHeader(WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchSingleHeaderGetArgs singleHeader) {
            return singleHeader(Output.of(singleHeader));
        }

        /**
         * @param singleQueryArgument Inspect a single query argument. See Single Query Argument below for details.
         * 
         * @return builder
         * 
         */
        public Builder singleQueryArgument(@Nullable Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchSingleQueryArgumentGetArgs> singleQueryArgument) {
            $.singleQueryArgument = singleQueryArgument;
            return this;
        }

        /**
         * @param singleQueryArgument Inspect a single query argument. See Single Query Argument below for details.
         * 
         * @return builder
         * 
         */
        public Builder singleQueryArgument(WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchSingleQueryArgumentGetArgs singleQueryArgument) {
            return singleQueryArgument(Output.of(singleQueryArgument));
        }

        /**
         * @param uriPath Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
         * 
         * @return builder
         * 
         */
        public Builder uriPath(@Nullable Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchUriPathGetArgs> uriPath) {
            $.uriPath = uriPath;
            return this;
        }

        /**
         * @param uriPath Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
         * 
         * @return builder
         * 
         */
        public Builder uriPath(WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchUriPathGetArgs uriPath) {
            return uriPath(Output.of(uriPath));
        }

        public WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchGetArgs build() {
            return $;
        }
    }

}
