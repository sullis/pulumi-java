// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class URLMapPathMatcherDefaultRouteActionWeightedBackendServiceHeaderActionRequestHeadersToAdd {
    /**
     * The name of the header to add.
     * 
     */
    private final @Nullable String headerName;
    /**
     * The value of the header to add.
     * 
     */
    private final @Nullable String headerValue;
    /**
     * If false, headerValue is appended to any values that already exist for the header.
     * If true, headerValue is set for the header, discarding any values that were set for that header.
     * 
     */
    private final @Nullable Boolean replace;

    @OutputCustomType.Constructor({"headerName","headerValue","replace"})
    private URLMapPathMatcherDefaultRouteActionWeightedBackendServiceHeaderActionRequestHeadersToAdd(
        @Nullable String headerName,
        @Nullable String headerValue,
        @Nullable Boolean replace) {
        this.headerName = headerName;
        this.headerValue = headerValue;
        this.replace = replace;
    }

    /**
     * The name of the header to add.
     * 
     */
    public Optional<String> getHeaderName() {
        return Optional.ofNullable(this.headerName);
    }
    /**
     * The value of the header to add.
     * 
     */
    public Optional<String> getHeaderValue() {
        return Optional.ofNullable(this.headerValue);
    }
    /**
     * If false, headerValue is appended to any values that already exist for the header.
     * If true, headerValue is set for the header, discarding any values that were set for that header.
     * 
     */
    public Optional<Boolean> getReplace() {
        return Optional.ofNullable(this.replace);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(URLMapPathMatcherDefaultRouteActionWeightedBackendServiceHeaderActionRequestHeadersToAdd defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String headerName;
        private @Nullable String headerValue;
        private @Nullable Boolean replace;

        public Builder() {
    	      // Empty
        }

        public Builder(URLMapPathMatcherDefaultRouteActionWeightedBackendServiceHeaderActionRequestHeadersToAdd defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.headerName = defaults.headerName;
    	      this.headerValue = defaults.headerValue;
    	      this.replace = defaults.replace;
        }

        public Builder setHeaderName(@Nullable String headerName) {
            this.headerName = headerName;
            return this;
        }

        public Builder setHeaderValue(@Nullable String headerValue) {
            this.headerValue = headerValue;
            return this;
        }

        public Builder setReplace(@Nullable Boolean replace) {
            this.replace = replace;
            return this;
        }

        public URLMapPathMatcherDefaultRouteActionWeightedBackendServiceHeaderActionRequestHeadersToAdd build() {
            return new URLMapPathMatcherDefaultRouteActionWeightedBackendServiceHeaderActionRequestHeadersToAdd(headerName, headerValue, replace);
        }
    }
}
