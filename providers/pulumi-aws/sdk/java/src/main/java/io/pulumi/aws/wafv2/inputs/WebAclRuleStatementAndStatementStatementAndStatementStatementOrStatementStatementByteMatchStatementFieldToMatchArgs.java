// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementByteMatchStatementFieldToMatchAllQueryArgumentsArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementByteMatchStatementFieldToMatchBodyArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementByteMatchStatementFieldToMatchMethodArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementByteMatchStatementFieldToMatchQueryStringArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementByteMatchStatementFieldToMatchSingleHeaderArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementByteMatchStatementFieldToMatchSingleQueryArgumentArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementByteMatchStatementFieldToMatchUriPathArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementByteMatchStatementFieldToMatchArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementByteMatchStatementFieldToMatchArgs Empty = new WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementByteMatchStatementFieldToMatchArgs();

    /**
     * Inspect all query arguments.
     * 
     */
    @Import(name="allQueryArguments")
      private final @Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementByteMatchStatementFieldToMatchAllQueryArgumentsArgs> allQueryArguments;

    public Output<WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementByteMatchStatementFieldToMatchAllQueryArgumentsArgs> allQueryArguments() {
        return this.allQueryArguments == null ? Codegen.empty() : this.allQueryArguments;
    }

    /**
     * Inspect the request body, which immediately follows the request headers.
     * 
     */
    @Import(name="body")
      private final @Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementByteMatchStatementFieldToMatchBodyArgs> body;

    public Output<WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementByteMatchStatementFieldToMatchBodyArgs> body() {
        return this.body == null ? Codegen.empty() : this.body;
    }

    /**
     * Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * 
     */
    @Import(name="method")
      private final @Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementByteMatchStatementFieldToMatchMethodArgs> method;

    public Output<WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementByteMatchStatementFieldToMatchMethodArgs> method() {
        return this.method == null ? Codegen.empty() : this.method;
    }

    /**
     * Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * 
     */
    @Import(name="queryString")
      private final @Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementByteMatchStatementFieldToMatchQueryStringArgs> queryString;

    public Output<WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementByteMatchStatementFieldToMatchQueryStringArgs> queryString() {
        return this.queryString == null ? Codegen.empty() : this.queryString;
    }

    /**
     * Inspect a single header. See Single Header below for details.
     * 
     */
    @Import(name="singleHeader")
      private final @Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementByteMatchStatementFieldToMatchSingleHeaderArgs> singleHeader;

    public Output<WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementByteMatchStatementFieldToMatchSingleHeaderArgs> singleHeader() {
        return this.singleHeader == null ? Codegen.empty() : this.singleHeader;
    }

    /**
     * Inspect a single query argument. See Single Query Argument below for details.
     * 
     */
    @Import(name="singleQueryArgument")
      private final @Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementByteMatchStatementFieldToMatchSingleQueryArgumentArgs> singleQueryArgument;

    public Output<WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementByteMatchStatementFieldToMatchSingleQueryArgumentArgs> singleQueryArgument() {
        return this.singleQueryArgument == null ? Codegen.empty() : this.singleQueryArgument;
    }

    /**
     * Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * 
     */
    @Import(name="uriPath")
      private final @Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementByteMatchStatementFieldToMatchUriPathArgs> uriPath;

    public Output<WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementByteMatchStatementFieldToMatchUriPathArgs> uriPath() {
        return this.uriPath == null ? Codegen.empty() : this.uriPath;
    }

    public WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementByteMatchStatementFieldToMatchArgs(
        @Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementByteMatchStatementFieldToMatchAllQueryArgumentsArgs> allQueryArguments,
        @Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementByteMatchStatementFieldToMatchBodyArgs> body,
        @Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementByteMatchStatementFieldToMatchMethodArgs> method,
        @Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementByteMatchStatementFieldToMatchQueryStringArgs> queryString,
        @Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementByteMatchStatementFieldToMatchSingleHeaderArgs> singleHeader,
        @Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementByteMatchStatementFieldToMatchSingleQueryArgumentArgs> singleQueryArgument,
        @Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementByteMatchStatementFieldToMatchUriPathArgs> uriPath) {
        this.allQueryArguments = allQueryArguments;
        this.body = body;
        this.method = method;
        this.queryString = queryString;
        this.singleHeader = singleHeader;
        this.singleQueryArgument = singleQueryArgument;
        this.uriPath = uriPath;
    }

    private WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementByteMatchStatementFieldToMatchArgs() {
        this.allQueryArguments = Codegen.empty();
        this.body = Codegen.empty();
        this.method = Codegen.empty();
        this.queryString = Codegen.empty();
        this.singleHeader = Codegen.empty();
        this.singleQueryArgument = Codegen.empty();
        this.uriPath = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementByteMatchStatementFieldToMatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementByteMatchStatementFieldToMatchAllQueryArgumentsArgs> allQueryArguments;
        private @Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementByteMatchStatementFieldToMatchBodyArgs> body;
        private @Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementByteMatchStatementFieldToMatchMethodArgs> method;
        private @Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementByteMatchStatementFieldToMatchQueryStringArgs> queryString;
        private @Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementByteMatchStatementFieldToMatchSingleHeaderArgs> singleHeader;
        private @Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementByteMatchStatementFieldToMatchSingleQueryArgumentArgs> singleQueryArgument;
        private @Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementByteMatchStatementFieldToMatchUriPathArgs> uriPath;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementByteMatchStatementFieldToMatchArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allQueryArguments = defaults.allQueryArguments;
    	      this.body = defaults.body;
    	      this.method = defaults.method;
    	      this.queryString = defaults.queryString;
    	      this.singleHeader = defaults.singleHeader;
    	      this.singleQueryArgument = defaults.singleQueryArgument;
    	      this.uriPath = defaults.uriPath;
        }

        public Builder allQueryArguments(@Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementByteMatchStatementFieldToMatchAllQueryArgumentsArgs> allQueryArguments) {
            this.allQueryArguments = allQueryArguments;
            return this;
        }
        public Builder allQueryArguments(@Nullable WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementByteMatchStatementFieldToMatchAllQueryArgumentsArgs allQueryArguments) {
            this.allQueryArguments = Codegen.ofNullable(allQueryArguments);
            return this;
        }
        public Builder body(@Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementByteMatchStatementFieldToMatchBodyArgs> body) {
            this.body = body;
            return this;
        }
        public Builder body(@Nullable WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementByteMatchStatementFieldToMatchBodyArgs body) {
            this.body = Codegen.ofNullable(body);
            return this;
        }
        public Builder method(@Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementByteMatchStatementFieldToMatchMethodArgs> method) {
            this.method = method;
            return this;
        }
        public Builder method(@Nullable WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementByteMatchStatementFieldToMatchMethodArgs method) {
            this.method = Codegen.ofNullable(method);
            return this;
        }
        public Builder queryString(@Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementByteMatchStatementFieldToMatchQueryStringArgs> queryString) {
            this.queryString = queryString;
            return this;
        }
        public Builder queryString(@Nullable WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementByteMatchStatementFieldToMatchQueryStringArgs queryString) {
            this.queryString = Codegen.ofNullable(queryString);
            return this;
        }
        public Builder singleHeader(@Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementByteMatchStatementFieldToMatchSingleHeaderArgs> singleHeader) {
            this.singleHeader = singleHeader;
            return this;
        }
        public Builder singleHeader(@Nullable WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementByteMatchStatementFieldToMatchSingleHeaderArgs singleHeader) {
            this.singleHeader = Codegen.ofNullable(singleHeader);
            return this;
        }
        public Builder singleQueryArgument(@Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementByteMatchStatementFieldToMatchSingleQueryArgumentArgs> singleQueryArgument) {
            this.singleQueryArgument = singleQueryArgument;
            return this;
        }
        public Builder singleQueryArgument(@Nullable WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementByteMatchStatementFieldToMatchSingleQueryArgumentArgs singleQueryArgument) {
            this.singleQueryArgument = Codegen.ofNullable(singleQueryArgument);
            return this;
        }
        public Builder uriPath(@Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementByteMatchStatementFieldToMatchUriPathArgs> uriPath) {
            this.uriPath = uriPath;
            return this;
        }
        public Builder uriPath(@Nullable WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementByteMatchStatementFieldToMatchUriPathArgs uriPath) {
            this.uriPath = Codegen.ofNullable(uriPath);
            return this;
        }        public WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementByteMatchStatementFieldToMatchArgs build() {
            return new WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementByteMatchStatementFieldToMatchArgs(allQueryArguments, body, method, queryString, singleHeader, singleQueryArgument, uriPath);
        }
    }
}
