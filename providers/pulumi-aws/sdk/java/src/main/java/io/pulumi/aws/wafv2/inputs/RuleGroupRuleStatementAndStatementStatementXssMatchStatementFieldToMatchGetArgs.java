// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementAndStatementStatementXssMatchStatementFieldToMatchAllQueryArgumentsGetArgs;
import io.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementAndStatementStatementXssMatchStatementFieldToMatchBodyGetArgs;
import io.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementAndStatementStatementXssMatchStatementFieldToMatchMethodGetArgs;
import io.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementAndStatementStatementXssMatchStatementFieldToMatchQueryStringGetArgs;
import io.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementAndStatementStatementXssMatchStatementFieldToMatchSingleHeaderGetArgs;
import io.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementAndStatementStatementXssMatchStatementFieldToMatchSingleQueryArgumentGetArgs;
import io.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementAndStatementStatementXssMatchStatementFieldToMatchUriPathGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RuleGroupRuleStatementAndStatementStatementXssMatchStatementFieldToMatchGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleGroupRuleStatementAndStatementStatementXssMatchStatementFieldToMatchGetArgs Empty = new RuleGroupRuleStatementAndStatementStatementXssMatchStatementFieldToMatchGetArgs();

    /**
     * Inspect all query arguments.
     * 
     */
    @Import(name="allQueryArguments")
      private final @Nullable Output<RuleGroupRuleStatementAndStatementStatementXssMatchStatementFieldToMatchAllQueryArgumentsGetArgs> allQueryArguments;

    public Output<RuleGroupRuleStatementAndStatementStatementXssMatchStatementFieldToMatchAllQueryArgumentsGetArgs> allQueryArguments() {
        return this.allQueryArguments == null ? Codegen.empty() : this.allQueryArguments;
    }

    /**
     * Inspect the request body, which immediately follows the request headers.
     * 
     */
    @Import(name="body")
      private final @Nullable Output<RuleGroupRuleStatementAndStatementStatementXssMatchStatementFieldToMatchBodyGetArgs> body;

    public Output<RuleGroupRuleStatementAndStatementStatementXssMatchStatementFieldToMatchBodyGetArgs> body() {
        return this.body == null ? Codegen.empty() : this.body;
    }

    /**
     * Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * 
     */
    @Import(name="method")
      private final @Nullable Output<RuleGroupRuleStatementAndStatementStatementXssMatchStatementFieldToMatchMethodGetArgs> method;

    public Output<RuleGroupRuleStatementAndStatementStatementXssMatchStatementFieldToMatchMethodGetArgs> method() {
        return this.method == null ? Codegen.empty() : this.method;
    }

    /**
     * Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * 
     */
    @Import(name="queryString")
      private final @Nullable Output<RuleGroupRuleStatementAndStatementStatementXssMatchStatementFieldToMatchQueryStringGetArgs> queryString;

    public Output<RuleGroupRuleStatementAndStatementStatementXssMatchStatementFieldToMatchQueryStringGetArgs> queryString() {
        return this.queryString == null ? Codegen.empty() : this.queryString;
    }

    /**
     * Inspect a single header. See Single Header below for details.
     * 
     */
    @Import(name="singleHeader")
      private final @Nullable Output<RuleGroupRuleStatementAndStatementStatementXssMatchStatementFieldToMatchSingleHeaderGetArgs> singleHeader;

    public Output<RuleGroupRuleStatementAndStatementStatementXssMatchStatementFieldToMatchSingleHeaderGetArgs> singleHeader() {
        return this.singleHeader == null ? Codegen.empty() : this.singleHeader;
    }

    /**
     * Inspect a single query argument. See Single Query Argument below for details.
     * 
     */
    @Import(name="singleQueryArgument")
      private final @Nullable Output<RuleGroupRuleStatementAndStatementStatementXssMatchStatementFieldToMatchSingleQueryArgumentGetArgs> singleQueryArgument;

    public Output<RuleGroupRuleStatementAndStatementStatementXssMatchStatementFieldToMatchSingleQueryArgumentGetArgs> singleQueryArgument() {
        return this.singleQueryArgument == null ? Codegen.empty() : this.singleQueryArgument;
    }

    /**
     * Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * 
     */
    @Import(name="uriPath")
      private final @Nullable Output<RuleGroupRuleStatementAndStatementStatementXssMatchStatementFieldToMatchUriPathGetArgs> uriPath;

    public Output<RuleGroupRuleStatementAndStatementStatementXssMatchStatementFieldToMatchUriPathGetArgs> uriPath() {
        return this.uriPath == null ? Codegen.empty() : this.uriPath;
    }

    public RuleGroupRuleStatementAndStatementStatementXssMatchStatementFieldToMatchGetArgs(
        @Nullable Output<RuleGroupRuleStatementAndStatementStatementXssMatchStatementFieldToMatchAllQueryArgumentsGetArgs> allQueryArguments,
        @Nullable Output<RuleGroupRuleStatementAndStatementStatementXssMatchStatementFieldToMatchBodyGetArgs> body,
        @Nullable Output<RuleGroupRuleStatementAndStatementStatementXssMatchStatementFieldToMatchMethodGetArgs> method,
        @Nullable Output<RuleGroupRuleStatementAndStatementStatementXssMatchStatementFieldToMatchQueryStringGetArgs> queryString,
        @Nullable Output<RuleGroupRuleStatementAndStatementStatementXssMatchStatementFieldToMatchSingleHeaderGetArgs> singleHeader,
        @Nullable Output<RuleGroupRuleStatementAndStatementStatementXssMatchStatementFieldToMatchSingleQueryArgumentGetArgs> singleQueryArgument,
        @Nullable Output<RuleGroupRuleStatementAndStatementStatementXssMatchStatementFieldToMatchUriPathGetArgs> uriPath) {
        this.allQueryArguments = allQueryArguments;
        this.body = body;
        this.method = method;
        this.queryString = queryString;
        this.singleHeader = singleHeader;
        this.singleQueryArgument = singleQueryArgument;
        this.uriPath = uriPath;
    }

    private RuleGroupRuleStatementAndStatementStatementXssMatchStatementFieldToMatchGetArgs() {
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

    public static Builder builder(RuleGroupRuleStatementAndStatementStatementXssMatchStatementFieldToMatchGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<RuleGroupRuleStatementAndStatementStatementXssMatchStatementFieldToMatchAllQueryArgumentsGetArgs> allQueryArguments;
        private @Nullable Output<RuleGroupRuleStatementAndStatementStatementXssMatchStatementFieldToMatchBodyGetArgs> body;
        private @Nullable Output<RuleGroupRuleStatementAndStatementStatementXssMatchStatementFieldToMatchMethodGetArgs> method;
        private @Nullable Output<RuleGroupRuleStatementAndStatementStatementXssMatchStatementFieldToMatchQueryStringGetArgs> queryString;
        private @Nullable Output<RuleGroupRuleStatementAndStatementStatementXssMatchStatementFieldToMatchSingleHeaderGetArgs> singleHeader;
        private @Nullable Output<RuleGroupRuleStatementAndStatementStatementXssMatchStatementFieldToMatchSingleQueryArgumentGetArgs> singleQueryArgument;
        private @Nullable Output<RuleGroupRuleStatementAndStatementStatementXssMatchStatementFieldToMatchUriPathGetArgs> uriPath;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleStatementAndStatementStatementXssMatchStatementFieldToMatchGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allQueryArguments = defaults.allQueryArguments;
    	      this.body = defaults.body;
    	      this.method = defaults.method;
    	      this.queryString = defaults.queryString;
    	      this.singleHeader = defaults.singleHeader;
    	      this.singleQueryArgument = defaults.singleQueryArgument;
    	      this.uriPath = defaults.uriPath;
        }

        public Builder allQueryArguments(@Nullable Output<RuleGroupRuleStatementAndStatementStatementXssMatchStatementFieldToMatchAllQueryArgumentsGetArgs> allQueryArguments) {
            this.allQueryArguments = allQueryArguments;
            return this;
        }
        public Builder allQueryArguments(@Nullable RuleGroupRuleStatementAndStatementStatementXssMatchStatementFieldToMatchAllQueryArgumentsGetArgs allQueryArguments) {
            this.allQueryArguments = Codegen.ofNullable(allQueryArguments);
            return this;
        }
        public Builder body(@Nullable Output<RuleGroupRuleStatementAndStatementStatementXssMatchStatementFieldToMatchBodyGetArgs> body) {
            this.body = body;
            return this;
        }
        public Builder body(@Nullable RuleGroupRuleStatementAndStatementStatementXssMatchStatementFieldToMatchBodyGetArgs body) {
            this.body = Codegen.ofNullable(body);
            return this;
        }
        public Builder method(@Nullable Output<RuleGroupRuleStatementAndStatementStatementXssMatchStatementFieldToMatchMethodGetArgs> method) {
            this.method = method;
            return this;
        }
        public Builder method(@Nullable RuleGroupRuleStatementAndStatementStatementXssMatchStatementFieldToMatchMethodGetArgs method) {
            this.method = Codegen.ofNullable(method);
            return this;
        }
        public Builder queryString(@Nullable Output<RuleGroupRuleStatementAndStatementStatementXssMatchStatementFieldToMatchQueryStringGetArgs> queryString) {
            this.queryString = queryString;
            return this;
        }
        public Builder queryString(@Nullable RuleGroupRuleStatementAndStatementStatementXssMatchStatementFieldToMatchQueryStringGetArgs queryString) {
            this.queryString = Codegen.ofNullable(queryString);
            return this;
        }
        public Builder singleHeader(@Nullable Output<RuleGroupRuleStatementAndStatementStatementXssMatchStatementFieldToMatchSingleHeaderGetArgs> singleHeader) {
            this.singleHeader = singleHeader;
            return this;
        }
        public Builder singleHeader(@Nullable RuleGroupRuleStatementAndStatementStatementXssMatchStatementFieldToMatchSingleHeaderGetArgs singleHeader) {
            this.singleHeader = Codegen.ofNullable(singleHeader);
            return this;
        }
        public Builder singleQueryArgument(@Nullable Output<RuleGroupRuleStatementAndStatementStatementXssMatchStatementFieldToMatchSingleQueryArgumentGetArgs> singleQueryArgument) {
            this.singleQueryArgument = singleQueryArgument;
            return this;
        }
        public Builder singleQueryArgument(@Nullable RuleGroupRuleStatementAndStatementStatementXssMatchStatementFieldToMatchSingleQueryArgumentGetArgs singleQueryArgument) {
            this.singleQueryArgument = Codegen.ofNullable(singleQueryArgument);
            return this;
        }
        public Builder uriPath(@Nullable Output<RuleGroupRuleStatementAndStatementStatementXssMatchStatementFieldToMatchUriPathGetArgs> uriPath) {
            this.uriPath = uriPath;
            return this;
        }
        public Builder uriPath(@Nullable RuleGroupRuleStatementAndStatementStatementXssMatchStatementFieldToMatchUriPathGetArgs uriPath) {
            this.uriPath = Codegen.ofNullable(uriPath);
            return this;
        }        public RuleGroupRuleStatementAndStatementStatementXssMatchStatementFieldToMatchGetArgs build() {
            return new RuleGroupRuleStatementAndStatementStatementXssMatchStatementFieldToMatchGetArgs(allQueryArguments, body, method, queryString, singleHeader, singleQueryArgument, uriPath);
        }
    }
}
