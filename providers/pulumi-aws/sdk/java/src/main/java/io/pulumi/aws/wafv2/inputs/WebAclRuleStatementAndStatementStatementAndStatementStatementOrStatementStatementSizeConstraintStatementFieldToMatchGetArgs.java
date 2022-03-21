// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchAllQueryArgumentsGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchBodyGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchMethodGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchQueryStringGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchSingleHeaderGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchSingleQueryArgumentGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchUriPathGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchGetArgs Empty = new WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchGetArgs();

    /**
     * Inspect all query arguments.
     * 
     */
    @Import(name="allQueryArguments")
      private final @Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchAllQueryArgumentsGetArgs> allQueryArguments;

    public Output<WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchAllQueryArgumentsGetArgs> getAllQueryArguments() {
        return this.allQueryArguments == null ? Output.empty() : this.allQueryArguments;
    }

    /**
     * Inspect the request body, which immediately follows the request headers.
     * 
     */
    @Import(name="body")
      private final @Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchBodyGetArgs> body;

    public Output<WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchBodyGetArgs> getBody() {
        return this.body == null ? Output.empty() : this.body;
    }

    /**
     * Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * 
     */
    @Import(name="method")
      private final @Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchMethodGetArgs> method;

    public Output<WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchMethodGetArgs> getMethod() {
        return this.method == null ? Output.empty() : this.method;
    }

    /**
     * Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * 
     */
    @Import(name="queryString")
      private final @Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchQueryStringGetArgs> queryString;

    public Output<WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchQueryStringGetArgs> getQueryString() {
        return this.queryString == null ? Output.empty() : this.queryString;
    }

    /**
     * Inspect a single header. See Single Header below for details.
     * 
     */
    @Import(name="singleHeader")
      private final @Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchSingleHeaderGetArgs> singleHeader;

    public Output<WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchSingleHeaderGetArgs> getSingleHeader() {
        return this.singleHeader == null ? Output.empty() : this.singleHeader;
    }

    /**
     * Inspect a single query argument. See Single Query Argument below for details.
     * 
     */
    @Import(name="singleQueryArgument")
      private final @Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchSingleQueryArgumentGetArgs> singleQueryArgument;

    public Output<WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchSingleQueryArgumentGetArgs> getSingleQueryArgument() {
        return this.singleQueryArgument == null ? Output.empty() : this.singleQueryArgument;
    }

    /**
     * Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * 
     */
    @Import(name="uriPath")
      private final @Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchUriPathGetArgs> uriPath;

    public Output<WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchUriPathGetArgs> getUriPath() {
        return this.uriPath == null ? Output.empty() : this.uriPath;
    }

    public WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchGetArgs(
        @Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchAllQueryArgumentsGetArgs> allQueryArguments,
        @Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchBodyGetArgs> body,
        @Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchMethodGetArgs> method,
        @Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchQueryStringGetArgs> queryString,
        @Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchSingleHeaderGetArgs> singleHeader,
        @Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchSingleQueryArgumentGetArgs> singleQueryArgument,
        @Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchUriPathGetArgs> uriPath) {
        this.allQueryArguments = allQueryArguments;
        this.body = body;
        this.method = method;
        this.queryString = queryString;
        this.singleHeader = singleHeader;
        this.singleQueryArgument = singleQueryArgument;
        this.uriPath = uriPath;
    }

    private WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchGetArgs() {
        this.allQueryArguments = Output.empty();
        this.body = Output.empty();
        this.method = Output.empty();
        this.queryString = Output.empty();
        this.singleHeader = Output.empty();
        this.singleQueryArgument = Output.empty();
        this.uriPath = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchAllQueryArgumentsGetArgs> allQueryArguments;
        private @Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchBodyGetArgs> body;
        private @Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchMethodGetArgs> method;
        private @Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchQueryStringGetArgs> queryString;
        private @Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchSingleHeaderGetArgs> singleHeader;
        private @Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchSingleQueryArgumentGetArgs> singleQueryArgument;
        private @Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchUriPathGetArgs> uriPath;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allQueryArguments = defaults.allQueryArguments;
    	      this.body = defaults.body;
    	      this.method = defaults.method;
    	      this.queryString = defaults.queryString;
    	      this.singleHeader = defaults.singleHeader;
    	      this.singleQueryArgument = defaults.singleQueryArgument;
    	      this.uriPath = defaults.uriPath;
        }

        public Builder allQueryArguments(@Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchAllQueryArgumentsGetArgs> allQueryArguments) {
            this.allQueryArguments = allQueryArguments;
            return this;
        }
        public Builder allQueryArguments(@Nullable WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchAllQueryArgumentsGetArgs allQueryArguments) {
            this.allQueryArguments = Output.ofNullable(allQueryArguments);
            return this;
        }
        public Builder body(@Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchBodyGetArgs> body) {
            this.body = body;
            return this;
        }
        public Builder body(@Nullable WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchBodyGetArgs body) {
            this.body = Output.ofNullable(body);
            return this;
        }
        public Builder method(@Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchMethodGetArgs> method) {
            this.method = method;
            return this;
        }
        public Builder method(@Nullable WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchMethodGetArgs method) {
            this.method = Output.ofNullable(method);
            return this;
        }
        public Builder queryString(@Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchQueryStringGetArgs> queryString) {
            this.queryString = queryString;
            return this;
        }
        public Builder queryString(@Nullable WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchQueryStringGetArgs queryString) {
            this.queryString = Output.ofNullable(queryString);
            return this;
        }
        public Builder singleHeader(@Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchSingleHeaderGetArgs> singleHeader) {
            this.singleHeader = singleHeader;
            return this;
        }
        public Builder singleHeader(@Nullable WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchSingleHeaderGetArgs singleHeader) {
            this.singleHeader = Output.ofNullable(singleHeader);
            return this;
        }
        public Builder singleQueryArgument(@Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchSingleQueryArgumentGetArgs> singleQueryArgument) {
            this.singleQueryArgument = singleQueryArgument;
            return this;
        }
        public Builder singleQueryArgument(@Nullable WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchSingleQueryArgumentGetArgs singleQueryArgument) {
            this.singleQueryArgument = Output.ofNullable(singleQueryArgument);
            return this;
        }
        public Builder uriPath(@Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchUriPathGetArgs> uriPath) {
            this.uriPath = uriPath;
            return this;
        }
        public Builder uriPath(@Nullable WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchUriPathGetArgs uriPath) {
            this.uriPath = Output.ofNullable(uriPath);
            return this;
        }        public WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchGetArgs build() {
            return new WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchGetArgs(allQueryArguments, body, method, queryString, singleHeader, singleQueryArgument, uriPath);
        }
    }
}
