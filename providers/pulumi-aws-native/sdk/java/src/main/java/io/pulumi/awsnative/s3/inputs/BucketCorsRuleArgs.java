// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.inputs;

import io.pulumi.awsnative.s3.enums.BucketCorsRuleAllowedMethodsItem;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
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
    @InputImport(name="allowedHeaders")
    private final @Nullable Input<List<String>> allowedHeaders;

    public Input<List<String>> getAllowedHeaders() {
        return this.allowedHeaders == null ? Input.empty() : this.allowedHeaders;
    }

    /**
     * An HTTP method that you allow the origin to execute.
     * 
     */
    @InputImport(name="allowedMethods", required=true)
    private final Input<List<BucketCorsRuleAllowedMethodsItem>> allowedMethods;

    public Input<List<BucketCorsRuleAllowedMethodsItem>> getAllowedMethods() {
        return this.allowedMethods;
    }

    /**
     * One or more origins you want customers to be able to access the bucket from.
     * 
     */
    @InputImport(name="allowedOrigins", required=true)
    private final Input<List<String>> allowedOrigins;

    public Input<List<String>> getAllowedOrigins() {
        return this.allowedOrigins;
    }

    /**
     * One or more headers in the response that you want customers to be able to access from their applications (for example, from a JavaScript XMLHttpRequest object).
     * 
     */
    @InputImport(name="exposedHeaders")
    private final @Nullable Input<List<String>> exposedHeaders;

    public Input<List<String>> getExposedHeaders() {
        return this.exposedHeaders == null ? Input.empty() : this.exposedHeaders;
    }

    /**
     * A unique identifier for this rule.
     * 
     */
    @InputImport(name="id")
    private final @Nullable Input<String> id;

    public Input<String> getId() {
        return this.id == null ? Input.empty() : this.id;
    }

    /**
     * The time in seconds that your browser is to cache the preflight response for the specified resource.
     * 
     */
    @InputImport(name="maxAge")
    private final @Nullable Input<Integer> maxAge;

    public Input<Integer> getMaxAge() {
        return this.maxAge == null ? Input.empty() : this.maxAge;
    }

    public BucketCorsRuleArgs(
        @Nullable Input<List<String>> allowedHeaders,
        Input<List<BucketCorsRuleAllowedMethodsItem>> allowedMethods,
        Input<List<String>> allowedOrigins,
        @Nullable Input<List<String>> exposedHeaders,
        @Nullable Input<String> id,
        @Nullable Input<Integer> maxAge) {
        this.allowedHeaders = allowedHeaders;
        this.allowedMethods = Objects.requireNonNull(allowedMethods, "expected parameter 'allowedMethods' to be non-null");
        this.allowedOrigins = Objects.requireNonNull(allowedOrigins, "expected parameter 'allowedOrigins' to be non-null");
        this.exposedHeaders = exposedHeaders;
        this.id = id;
        this.maxAge = maxAge;
    }

    private BucketCorsRuleArgs() {
        this.allowedHeaders = Input.empty();
        this.allowedMethods = Input.empty();
        this.allowedOrigins = Input.empty();
        this.exposedHeaders = Input.empty();
        this.id = Input.empty();
        this.maxAge = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketCorsRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> allowedHeaders;
        private Input<List<BucketCorsRuleAllowedMethodsItem>> allowedMethods;
        private Input<List<String>> allowedOrigins;
        private @Nullable Input<List<String>> exposedHeaders;
        private @Nullable Input<String> id;
        private @Nullable Input<Integer> maxAge;

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

        public Builder setAllowedHeaders(@Nullable Input<List<String>> allowedHeaders) {
            this.allowedHeaders = allowedHeaders;
            return this;
        }

        public Builder setAllowedHeaders(@Nullable List<String> allowedHeaders) {
            this.allowedHeaders = Input.ofNullable(allowedHeaders);
            return this;
        }

        public Builder setAllowedMethods(Input<List<BucketCorsRuleAllowedMethodsItem>> allowedMethods) {
            this.allowedMethods = Objects.requireNonNull(allowedMethods);
            return this;
        }

        public Builder setAllowedMethods(List<BucketCorsRuleAllowedMethodsItem> allowedMethods) {
            this.allowedMethods = Input.of(Objects.requireNonNull(allowedMethods));
            return this;
        }

        public Builder setAllowedOrigins(Input<List<String>> allowedOrigins) {
            this.allowedOrigins = Objects.requireNonNull(allowedOrigins);
            return this;
        }

        public Builder setAllowedOrigins(List<String> allowedOrigins) {
            this.allowedOrigins = Input.of(Objects.requireNonNull(allowedOrigins));
            return this;
        }

        public Builder setExposedHeaders(@Nullable Input<List<String>> exposedHeaders) {
            this.exposedHeaders = exposedHeaders;
            return this;
        }

        public Builder setExposedHeaders(@Nullable List<String> exposedHeaders) {
            this.exposedHeaders = Input.ofNullable(exposedHeaders);
            return this;
        }

        public Builder setId(@Nullable Input<String> id) {
            this.id = id;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = Input.ofNullable(id);
            return this;
        }

        public Builder setMaxAge(@Nullable Input<Integer> maxAge) {
            this.maxAge = maxAge;
            return this;
        }

        public Builder setMaxAge(@Nullable Integer maxAge) {
            this.maxAge = Input.ofNullable(maxAge);
            return this;
        }

        public BucketCorsRuleArgs build() {
            return new BucketCorsRuleArgs(allowedHeaders, allowedMethods, allowedOrigins, exposedHeaders, id, maxAge);
        }
    }
}
