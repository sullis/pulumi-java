// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementXssMatchStatementFieldToMatchAllQueryArgumentsGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementXssMatchStatementFieldToMatchBodyGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementXssMatchStatementFieldToMatchMethodGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementXssMatchStatementFieldToMatchQueryStringGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementXssMatchStatementFieldToMatchSingleHeaderGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementXssMatchStatementFieldToMatchSingleQueryArgumentGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementXssMatchStatementFieldToMatchUriPathGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementXssMatchStatementFieldToMatchGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementXssMatchStatementFieldToMatchGetArgs Empty = new WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementXssMatchStatementFieldToMatchGetArgs();

    /**
     * Inspect all query arguments.
     * 
     */
    @InputImport(name="allQueryArguments")
      private final @Nullable Input<WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementXssMatchStatementFieldToMatchAllQueryArgumentsGetArgs> allQueryArguments;

    public Input<WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementXssMatchStatementFieldToMatchAllQueryArgumentsGetArgs> getAllQueryArguments() {
        return this.allQueryArguments == null ? Input.empty() : this.allQueryArguments;
    }

    /**
     * Inspect the request body, which immediately follows the request headers.
     * 
     */
    @InputImport(name="body")
      private final @Nullable Input<WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementXssMatchStatementFieldToMatchBodyGetArgs> body;

    public Input<WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementXssMatchStatementFieldToMatchBodyGetArgs> getBody() {
        return this.body == null ? Input.empty() : this.body;
    }

    /**
     * Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * 
     */
    @InputImport(name="method")
      private final @Nullable Input<WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementXssMatchStatementFieldToMatchMethodGetArgs> method;

    public Input<WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementXssMatchStatementFieldToMatchMethodGetArgs> getMethod() {
        return this.method == null ? Input.empty() : this.method;
    }

    /**
     * Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * 
     */
    @InputImport(name="queryString")
      private final @Nullable Input<WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementXssMatchStatementFieldToMatchQueryStringGetArgs> queryString;

    public Input<WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementXssMatchStatementFieldToMatchQueryStringGetArgs> getQueryString() {
        return this.queryString == null ? Input.empty() : this.queryString;
    }

    /**
     * Inspect a single header. See Single Header below for details.
     * 
     */
    @InputImport(name="singleHeader")
      private final @Nullable Input<WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementXssMatchStatementFieldToMatchSingleHeaderGetArgs> singleHeader;

    public Input<WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementXssMatchStatementFieldToMatchSingleHeaderGetArgs> getSingleHeader() {
        return this.singleHeader == null ? Input.empty() : this.singleHeader;
    }

    /**
     * Inspect a single query argument. See Single Query Argument below for details.
     * 
     */
    @InputImport(name="singleQueryArgument")
      private final @Nullable Input<WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementXssMatchStatementFieldToMatchSingleQueryArgumentGetArgs> singleQueryArgument;

    public Input<WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementXssMatchStatementFieldToMatchSingleQueryArgumentGetArgs> getSingleQueryArgument() {
        return this.singleQueryArgument == null ? Input.empty() : this.singleQueryArgument;
    }

    /**
     * Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * 
     */
    @InputImport(name="uriPath")
      private final @Nullable Input<WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementXssMatchStatementFieldToMatchUriPathGetArgs> uriPath;

    public Input<WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementXssMatchStatementFieldToMatchUriPathGetArgs> getUriPath() {
        return this.uriPath == null ? Input.empty() : this.uriPath;
    }

    public WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementXssMatchStatementFieldToMatchGetArgs(
        @Nullable Input<WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementXssMatchStatementFieldToMatchAllQueryArgumentsGetArgs> allQueryArguments,
        @Nullable Input<WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementXssMatchStatementFieldToMatchBodyGetArgs> body,
        @Nullable Input<WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementXssMatchStatementFieldToMatchMethodGetArgs> method,
        @Nullable Input<WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementXssMatchStatementFieldToMatchQueryStringGetArgs> queryString,
        @Nullable Input<WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementXssMatchStatementFieldToMatchSingleHeaderGetArgs> singleHeader,
        @Nullable Input<WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementXssMatchStatementFieldToMatchSingleQueryArgumentGetArgs> singleQueryArgument,
        @Nullable Input<WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementXssMatchStatementFieldToMatchUriPathGetArgs> uriPath) {
        this.allQueryArguments = allQueryArguments;
        this.body = body;
        this.method = method;
        this.queryString = queryString;
        this.singleHeader = singleHeader;
        this.singleQueryArgument = singleQueryArgument;
        this.uriPath = uriPath;
    }

    private WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementXssMatchStatementFieldToMatchGetArgs() {
        this.allQueryArguments = Input.empty();
        this.body = Input.empty();
        this.method = Input.empty();
        this.queryString = Input.empty();
        this.singleHeader = Input.empty();
        this.singleQueryArgument = Input.empty();
        this.uriPath = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementXssMatchStatementFieldToMatchGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementXssMatchStatementFieldToMatchAllQueryArgumentsGetArgs> allQueryArguments;
        private @Nullable Input<WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementXssMatchStatementFieldToMatchBodyGetArgs> body;
        private @Nullable Input<WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementXssMatchStatementFieldToMatchMethodGetArgs> method;
        private @Nullable Input<WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementXssMatchStatementFieldToMatchQueryStringGetArgs> queryString;
        private @Nullable Input<WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementXssMatchStatementFieldToMatchSingleHeaderGetArgs> singleHeader;
        private @Nullable Input<WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementXssMatchStatementFieldToMatchSingleQueryArgumentGetArgs> singleQueryArgument;
        private @Nullable Input<WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementXssMatchStatementFieldToMatchUriPathGetArgs> uriPath;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementXssMatchStatementFieldToMatchGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allQueryArguments = defaults.allQueryArguments;
    	      this.body = defaults.body;
    	      this.method = defaults.method;
    	      this.queryString = defaults.queryString;
    	      this.singleHeader = defaults.singleHeader;
    	      this.singleQueryArgument = defaults.singleQueryArgument;
    	      this.uriPath = defaults.uriPath;
        }

        public Builder setAllQueryArguments(@Nullable Input<WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementXssMatchStatementFieldToMatchAllQueryArgumentsGetArgs> allQueryArguments) {
            this.allQueryArguments = allQueryArguments;
            return this;
        }

        public Builder setAllQueryArguments(@Nullable WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementXssMatchStatementFieldToMatchAllQueryArgumentsGetArgs allQueryArguments) {
            this.allQueryArguments = Input.ofNullable(allQueryArguments);
            return this;
        }

        public Builder setBody(@Nullable Input<WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementXssMatchStatementFieldToMatchBodyGetArgs> body) {
            this.body = body;
            return this;
        }

        public Builder setBody(@Nullable WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementXssMatchStatementFieldToMatchBodyGetArgs body) {
            this.body = Input.ofNullable(body);
            return this;
        }

        public Builder setMethod(@Nullable Input<WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementXssMatchStatementFieldToMatchMethodGetArgs> method) {
            this.method = method;
            return this;
        }

        public Builder setMethod(@Nullable WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementXssMatchStatementFieldToMatchMethodGetArgs method) {
            this.method = Input.ofNullable(method);
            return this;
        }

        public Builder setQueryString(@Nullable Input<WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementXssMatchStatementFieldToMatchQueryStringGetArgs> queryString) {
            this.queryString = queryString;
            return this;
        }

        public Builder setQueryString(@Nullable WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementXssMatchStatementFieldToMatchQueryStringGetArgs queryString) {
            this.queryString = Input.ofNullable(queryString);
            return this;
        }

        public Builder setSingleHeader(@Nullable Input<WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementXssMatchStatementFieldToMatchSingleHeaderGetArgs> singleHeader) {
            this.singleHeader = singleHeader;
            return this;
        }

        public Builder setSingleHeader(@Nullable WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementXssMatchStatementFieldToMatchSingleHeaderGetArgs singleHeader) {
            this.singleHeader = Input.ofNullable(singleHeader);
            return this;
        }

        public Builder setSingleQueryArgument(@Nullable Input<WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementXssMatchStatementFieldToMatchSingleQueryArgumentGetArgs> singleQueryArgument) {
            this.singleQueryArgument = singleQueryArgument;
            return this;
        }

        public Builder setSingleQueryArgument(@Nullable WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementXssMatchStatementFieldToMatchSingleQueryArgumentGetArgs singleQueryArgument) {
            this.singleQueryArgument = Input.ofNullable(singleQueryArgument);
            return this;
        }

        public Builder setUriPath(@Nullable Input<WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementXssMatchStatementFieldToMatchUriPathGetArgs> uriPath) {
            this.uriPath = uriPath;
            return this;
        }

        public Builder setUriPath(@Nullable WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementXssMatchStatementFieldToMatchUriPathGetArgs uriPath) {
            this.uriPath = Input.ofNullable(uriPath);
            return this;
        }
        public WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementXssMatchStatementFieldToMatchGetArgs build() {
            return new WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementXssMatchStatementFieldToMatchGetArgs(allQueryArguments, body, method, queryString, singleHeader, singleQueryArgument, uriPath);
        }
    }
}