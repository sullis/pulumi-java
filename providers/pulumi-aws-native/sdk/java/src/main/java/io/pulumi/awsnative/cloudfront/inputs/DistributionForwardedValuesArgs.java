// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudfront.inputs;

import io.pulumi.awsnative.cloudfront.inputs.DistributionCookiesArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DistributionForwardedValuesArgs extends io.pulumi.resources.ResourceArgs {

    public static final DistributionForwardedValuesArgs Empty = new DistributionForwardedValuesArgs();

    @Import(name="cookies")
      private final @Nullable Output<DistributionCookiesArgs> cookies;

    public Output<DistributionCookiesArgs> getCookies() {
        return this.cookies == null ? Output.empty() : this.cookies;
    }

    @Import(name="headers")
      private final @Nullable Output<List<String>> headers;

    public Output<List<String>> getHeaders() {
        return this.headers == null ? Output.empty() : this.headers;
    }

    @Import(name="queryString", required=true)
      private final Output<Boolean> queryString;

    public Output<Boolean> getQueryString() {
        return this.queryString;
    }

    @Import(name="queryStringCacheKeys")
      private final @Nullable Output<List<String>> queryStringCacheKeys;

    public Output<List<String>> getQueryStringCacheKeys() {
        return this.queryStringCacheKeys == null ? Output.empty() : this.queryStringCacheKeys;
    }

    public DistributionForwardedValuesArgs(
        @Nullable Output<DistributionCookiesArgs> cookies,
        @Nullable Output<List<String>> headers,
        Output<Boolean> queryString,
        @Nullable Output<List<String>> queryStringCacheKeys) {
        this.cookies = cookies;
        this.headers = headers;
        this.queryString = Objects.requireNonNull(queryString, "expected parameter 'queryString' to be non-null");
        this.queryStringCacheKeys = queryStringCacheKeys;
    }

    private DistributionForwardedValuesArgs() {
        this.cookies = Output.empty();
        this.headers = Output.empty();
        this.queryString = Output.empty();
        this.queryStringCacheKeys = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionForwardedValuesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<DistributionCookiesArgs> cookies;
        private @Nullable Output<List<String>> headers;
        private Output<Boolean> queryString;
        private @Nullable Output<List<String>> queryStringCacheKeys;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionForwardedValuesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cookies = defaults.cookies;
    	      this.headers = defaults.headers;
    	      this.queryString = defaults.queryString;
    	      this.queryStringCacheKeys = defaults.queryStringCacheKeys;
        }

        public Builder cookies(@Nullable Output<DistributionCookiesArgs> cookies) {
            this.cookies = cookies;
            return this;
        }
        public Builder cookies(@Nullable DistributionCookiesArgs cookies) {
            this.cookies = Output.ofNullable(cookies);
            return this;
        }
        public Builder headers(@Nullable Output<List<String>> headers) {
            this.headers = headers;
            return this;
        }
        public Builder headers(@Nullable List<String> headers) {
            this.headers = Output.ofNullable(headers);
            return this;
        }
        public Builder headers(String... headers) {
            return headers(List.of(headers));
        }
        public Builder queryString(Output<Boolean> queryString) {
            this.queryString = Objects.requireNonNull(queryString);
            return this;
        }
        public Builder queryString(Boolean queryString) {
            this.queryString = Output.of(Objects.requireNonNull(queryString));
            return this;
        }
        public Builder queryStringCacheKeys(@Nullable Output<List<String>> queryStringCacheKeys) {
            this.queryStringCacheKeys = queryStringCacheKeys;
            return this;
        }
        public Builder queryStringCacheKeys(@Nullable List<String> queryStringCacheKeys) {
            this.queryStringCacheKeys = Output.ofNullable(queryStringCacheKeys);
            return this;
        }
        public Builder queryStringCacheKeys(String... queryStringCacheKeys) {
            return queryStringCacheKeys(List.of(queryStringCacheKeys));
        }        public DistributionForwardedValuesArgs build() {
            return new DistributionForwardedValuesArgs(cookies, headers, queryString, queryStringCacheKeys);
        }
    }
}
