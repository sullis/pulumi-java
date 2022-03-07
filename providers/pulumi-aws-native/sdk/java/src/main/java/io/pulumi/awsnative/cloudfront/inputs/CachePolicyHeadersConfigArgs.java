// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudfront.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CachePolicyHeadersConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final CachePolicyHeadersConfigArgs Empty = new CachePolicyHeadersConfigArgs();

    @InputImport(name="headerBehavior", required=true)
      private final Input<String> headerBehavior;

    public Input<String> getHeaderBehavior() {
        return this.headerBehavior;
    }

    @InputImport(name="headers")
      private final @Nullable Input<List<String>> headers;

    public Input<List<String>> getHeaders() {
        return this.headers == null ? Input.empty() : this.headers;
    }

    public CachePolicyHeadersConfigArgs(
        Input<String> headerBehavior,
        @Nullable Input<List<String>> headers) {
        this.headerBehavior = Objects.requireNonNull(headerBehavior, "expected parameter 'headerBehavior' to be non-null");
        this.headers = headers;
    }

    private CachePolicyHeadersConfigArgs() {
        this.headerBehavior = Input.empty();
        this.headers = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CachePolicyHeadersConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> headerBehavior;
        private @Nullable Input<List<String>> headers;

        public Builder() {
    	      // Empty
        }

        public Builder(CachePolicyHeadersConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.headerBehavior = defaults.headerBehavior;
    	      this.headers = defaults.headers;
        }

        public Builder setHeaderBehavior(Input<String> headerBehavior) {
            this.headerBehavior = Objects.requireNonNull(headerBehavior);
            return this;
        }

        public Builder setHeaderBehavior(String headerBehavior) {
            this.headerBehavior = Input.of(Objects.requireNonNull(headerBehavior));
            return this;
        }

        public Builder setHeaders(@Nullable Input<List<String>> headers) {
            this.headers = headers;
            return this;
        }

        public Builder setHeaders(@Nullable List<String> headers) {
            this.headers = Input.ofNullable(headers);
            return this;
        }
        public CachePolicyHeadersConfigArgs build() {
            return new CachePolicyHeadersConfigArgs(headerBehavior, headers);
        }
    }
}