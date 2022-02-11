// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.inputs;

import io.pulumi.awsnative.wafv2.inputs.RuleGroupFieldToMatchSingleHeaderProperties;
import io.pulumi.awsnative.wafv2.inputs.RuleGroupFieldToMatchSingleQueryArgumentProperties;
import io.pulumi.awsnative.wafv2.inputs.RuleGroupJsonBody;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Object;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RuleGroupFieldToMatch extends io.pulumi.resources.InvokeArgs {

    public static final RuleGroupFieldToMatch Empty = new RuleGroupFieldToMatch();

    @InputImport(name="allQueryArguments")
    private final @Nullable Object allQueryArguments;

    public Optional<Object> getAllQueryArguments() {
        return this.allQueryArguments == null ? Optional.empty() : Optional.ofNullable(this.allQueryArguments);
    }

    @InputImport(name="body")
    private final @Nullable Object body;

    public Optional<Object> getBody() {
        return this.body == null ? Optional.empty() : Optional.ofNullable(this.body);
    }

    @InputImport(name="jsonBody")
    private final @Nullable RuleGroupJsonBody jsonBody;

    public Optional<RuleGroupJsonBody> getJsonBody() {
        return this.jsonBody == null ? Optional.empty() : Optional.ofNullable(this.jsonBody);
    }

    @InputImport(name="method")
    private final @Nullable Object method;

    public Optional<Object> getMethod() {
        return this.method == null ? Optional.empty() : Optional.ofNullable(this.method);
    }

    @InputImport(name="queryString")
    private final @Nullable Object queryString;

    public Optional<Object> getQueryString() {
        return this.queryString == null ? Optional.empty() : Optional.ofNullable(this.queryString);
    }

    @InputImport(name="singleHeader")
    private final @Nullable RuleGroupFieldToMatchSingleHeaderProperties singleHeader;

    public Optional<RuleGroupFieldToMatchSingleHeaderProperties> getSingleHeader() {
        return this.singleHeader == null ? Optional.empty() : Optional.ofNullable(this.singleHeader);
    }

    @InputImport(name="singleQueryArgument")
    private final @Nullable RuleGroupFieldToMatchSingleQueryArgumentProperties singleQueryArgument;

    public Optional<RuleGroupFieldToMatchSingleQueryArgumentProperties> getSingleQueryArgument() {
        return this.singleQueryArgument == null ? Optional.empty() : Optional.ofNullable(this.singleQueryArgument);
    }

    @InputImport(name="uriPath")
    private final @Nullable Object uriPath;

    public Optional<Object> getUriPath() {
        return this.uriPath == null ? Optional.empty() : Optional.ofNullable(this.uriPath);
    }

    public RuleGroupFieldToMatch(
        @Nullable Object allQueryArguments,
        @Nullable Object body,
        @Nullable RuleGroupJsonBody jsonBody,
        @Nullable Object method,
        @Nullable Object queryString,
        @Nullable RuleGroupFieldToMatchSingleHeaderProperties singleHeader,
        @Nullable RuleGroupFieldToMatchSingleQueryArgumentProperties singleQueryArgument,
        @Nullable Object uriPath) {
        this.allQueryArguments = allQueryArguments;
        this.body = body;
        this.jsonBody = jsonBody;
        this.method = method;
        this.queryString = queryString;
        this.singleHeader = singleHeader;
        this.singleQueryArgument = singleQueryArgument;
        this.uriPath = uriPath;
    }

    private RuleGroupFieldToMatch() {
        this.allQueryArguments = null;
        this.body = null;
        this.jsonBody = null;
        this.method = null;
        this.queryString = null;
        this.singleHeader = null;
        this.singleQueryArgument = null;
        this.uriPath = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupFieldToMatch defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object allQueryArguments;
        private @Nullable Object body;
        private @Nullable RuleGroupJsonBody jsonBody;
        private @Nullable Object method;
        private @Nullable Object queryString;
        private @Nullable RuleGroupFieldToMatchSingleHeaderProperties singleHeader;
        private @Nullable RuleGroupFieldToMatchSingleQueryArgumentProperties singleQueryArgument;
        private @Nullable Object uriPath;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupFieldToMatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allQueryArguments = defaults.allQueryArguments;
    	      this.body = defaults.body;
    	      this.jsonBody = defaults.jsonBody;
    	      this.method = defaults.method;
    	      this.queryString = defaults.queryString;
    	      this.singleHeader = defaults.singleHeader;
    	      this.singleQueryArgument = defaults.singleQueryArgument;
    	      this.uriPath = defaults.uriPath;
        }

        public Builder setAllQueryArguments(@Nullable Object allQueryArguments) {
            this.allQueryArguments = allQueryArguments;
            return this;
        }

        public Builder setBody(@Nullable Object body) {
            this.body = body;
            return this;
        }

        public Builder setJsonBody(@Nullable RuleGroupJsonBody jsonBody) {
            this.jsonBody = jsonBody;
            return this;
        }

        public Builder setMethod(@Nullable Object method) {
            this.method = method;
            return this;
        }

        public Builder setQueryString(@Nullable Object queryString) {
            this.queryString = queryString;
            return this;
        }

        public Builder setSingleHeader(@Nullable RuleGroupFieldToMatchSingleHeaderProperties singleHeader) {
            this.singleHeader = singleHeader;
            return this;
        }

        public Builder setSingleQueryArgument(@Nullable RuleGroupFieldToMatchSingleQueryArgumentProperties singleQueryArgument) {
            this.singleQueryArgument = singleQueryArgument;
            return this;
        }

        public Builder setUriPath(@Nullable Object uriPath) {
            this.uriPath = uriPath;
            return this;
        }

        public RuleGroupFieldToMatch build() {
            return new RuleGroupFieldToMatch(allQueryArguments, body, jsonBody, method, queryString, singleHeader, singleQueryArgument, uriPath);
        }
    }
}
