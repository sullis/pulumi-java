// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudfront.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CachePolicyHeadersConfig extends io.pulumi.resources.InvokeArgs {

    public static final CachePolicyHeadersConfig Empty = new CachePolicyHeadersConfig();

    @InputImport(name="headerBehavior", required=true)
    private final String headerBehavior;

    public String getHeaderBehavior() {
        return this.headerBehavior;
    }

    @InputImport(name="headers")
    private final @Nullable List<String> headers;

    public List<String> getHeaders() {
        return this.headers == null ? List.of() : this.headers;
    }

    public CachePolicyHeadersConfig(
        String headerBehavior,
        @Nullable List<String> headers) {
        this.headerBehavior = Objects.requireNonNull(headerBehavior, "expected parameter 'headerBehavior' to be non-null");
        this.headers = headers;
    }

    private CachePolicyHeadersConfig() {
        this.headerBehavior = null;
        this.headers = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CachePolicyHeadersConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String headerBehavior;
        private @Nullable List<String> headers;

        public Builder() {
    	      // Empty
        }

        public Builder(CachePolicyHeadersConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.headerBehavior = defaults.headerBehavior;
    	      this.headers = defaults.headers;
        }

        public Builder setHeaderBehavior(String headerBehavior) {
            this.headerBehavior = Objects.requireNonNull(headerBehavior);
            return this;
        }

        public Builder setHeaders(@Nullable List<String> headers) {
            this.headers = headers;
            return this;
        }

        public CachePolicyHeadersConfig build() {
            return new CachePolicyHeadersConfig(headerBehavior, headers);
        }
    }
}
