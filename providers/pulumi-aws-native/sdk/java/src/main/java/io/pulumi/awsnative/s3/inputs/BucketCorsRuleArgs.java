// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.inputs;

import io.pulumi.awsnative.s3.enums.BucketCorsRuleAllowedMethodsItem;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A set of origins and methods (cross-origin access that you want to allow). You can add up to 100 rules to the configuration.
 * 
 */
public final class BucketCorsRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketCorsRuleArgs Empty = new BucketCorsRuleArgs();

    /**
     * Headers that are specified in the Access-Control-Request-Headers header.
     * 
     */
    @Import(name="allowedHeaders")
      private final @Nullable Output<List<String>> allowedHeaders;

    public Output<List<String>> allowedHeaders() {
        return this.allowedHeaders == null ? Codegen.empty() : this.allowedHeaders;
    }

    /**
     * An HTTP method that you allow the origin to execute.
     * 
     */
    @Import(name="allowedMethods", required=true)
      private final Output<List<BucketCorsRuleAllowedMethodsItem>> allowedMethods;

    public Output<List<BucketCorsRuleAllowedMethodsItem>> allowedMethods() {
        return this.allowedMethods;
    }

    /**
     * One or more origins you want customers to be able to access the bucket from.
     * 
     */
    @Import(name="allowedOrigins", required=true)
      private final Output<List<String>> allowedOrigins;

    public Output<List<String>> allowedOrigins() {
        return this.allowedOrigins;
    }

    /**
     * One or more headers in the response that you want customers to be able to access from their applications (for example, from a JavaScript XMLHttpRequest object).
     * 
     */
    @Import(name="exposedHeaders")
      private final @Nullable Output<List<String>> exposedHeaders;

    public Output<List<String>> exposedHeaders() {
        return this.exposedHeaders == null ? Codegen.empty() : this.exposedHeaders;
    }

    /**
     * A unique identifier for this rule.
     * 
     */
    @Import(name="id")
      private final @Nullable Output<String> id;

    public Output<String> id() {
        return this.id == null ? Codegen.empty() : this.id;
    }

    /**
     * The time in seconds that your browser is to cache the preflight response for the specified resource.
     * 
     */
    @Import(name="maxAge")
      private final @Nullable Output<Integer> maxAge;

    public Output<Integer> maxAge() {
        return this.maxAge == null ? Codegen.empty() : this.maxAge;
    }

    public BucketCorsRuleArgs(
        @Nullable Output<List<String>> allowedHeaders,
        Output<List<BucketCorsRuleAllowedMethodsItem>> allowedMethods,
        Output<List<String>> allowedOrigins,
        @Nullable Output<List<String>> exposedHeaders,
        @Nullable Output<String> id,
        @Nullable Output<Integer> maxAge) {
        this.allowedHeaders = allowedHeaders;
        this.allowedMethods = Objects.requireNonNull(allowedMethods, "expected parameter 'allowedMethods' to be non-null");
        this.allowedOrigins = Objects.requireNonNull(allowedOrigins, "expected parameter 'allowedOrigins' to be non-null");
        this.exposedHeaders = exposedHeaders;
        this.id = id;
        this.maxAge = maxAge;
    }

    private BucketCorsRuleArgs() {
        this.allowedHeaders = Codegen.empty();
        this.allowedMethods = Codegen.empty();
        this.allowedOrigins = Codegen.empty();
        this.exposedHeaders = Codegen.empty();
        this.id = Codegen.empty();
        this.maxAge = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketCorsRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> allowedHeaders;
        private Output<List<BucketCorsRuleAllowedMethodsItem>> allowedMethods;
        private Output<List<String>> allowedOrigins;
        private @Nullable Output<List<String>> exposedHeaders;
        private @Nullable Output<String> id;
        private @Nullable Output<Integer> maxAge;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketCorsRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedHeaders = defaults.allowedHeaders;
    	      this.allowedMethods = defaults.allowedMethods;
    	      this.allowedOrigins = defaults.allowedOrigins;
    	      this.exposedHeaders = defaults.exposedHeaders;
    	      this.id = defaults.id;
    	      this.maxAge = defaults.maxAge;
        }

        public Builder allowedHeaders(@Nullable Output<List<String>> allowedHeaders) {
            this.allowedHeaders = allowedHeaders;
            return this;
        }
        public Builder allowedHeaders(@Nullable List<String> allowedHeaders) {
            this.allowedHeaders = Codegen.ofNullable(allowedHeaders);
            return this;
        }
        public Builder allowedHeaders(String... allowedHeaders) {
            return allowedHeaders(List.of(allowedHeaders));
        }
        public Builder allowedMethods(Output<List<BucketCorsRuleAllowedMethodsItem>> allowedMethods) {
            this.allowedMethods = Objects.requireNonNull(allowedMethods);
            return this;
        }
        public Builder allowedMethods(List<BucketCorsRuleAllowedMethodsItem> allowedMethods) {
            this.allowedMethods = Output.of(Objects.requireNonNull(allowedMethods));
            return this;
        }
        public Builder allowedMethods(BucketCorsRuleAllowedMethodsItem... allowedMethods) {
            return allowedMethods(List.of(allowedMethods));
        }
        public Builder allowedOrigins(Output<List<String>> allowedOrigins) {
            this.allowedOrigins = Objects.requireNonNull(allowedOrigins);
            return this;
        }
        public Builder allowedOrigins(List<String> allowedOrigins) {
            this.allowedOrigins = Output.of(Objects.requireNonNull(allowedOrigins));
            return this;
        }
        public Builder allowedOrigins(String... allowedOrigins) {
            return allowedOrigins(List.of(allowedOrigins));
        }
        public Builder exposedHeaders(@Nullable Output<List<String>> exposedHeaders) {
            this.exposedHeaders = exposedHeaders;
            return this;
        }
        public Builder exposedHeaders(@Nullable List<String> exposedHeaders) {
            this.exposedHeaders = Codegen.ofNullable(exposedHeaders);
            return this;
        }
        public Builder exposedHeaders(String... exposedHeaders) {
            return exposedHeaders(List.of(exposedHeaders));
        }
        public Builder id(@Nullable Output<String> id) {
            this.id = id;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = Codegen.ofNullable(id);
            return this;
        }
        public Builder maxAge(@Nullable Output<Integer> maxAge) {
            this.maxAge = maxAge;
            return this;
        }
        public Builder maxAge(@Nullable Integer maxAge) {
            this.maxAge = Codegen.ofNullable(maxAge);
            return this;
        }        public BucketCorsRuleArgs build() {
            return new BucketCorsRuleArgs(allowedHeaders, allowedMethods, allowedOrigins, exposedHeaders, id, maxAge);
        }
    }
}
