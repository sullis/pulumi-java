// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class URLMapPathMatcherDefaultRouteActionWeightedBackendServiceHeaderActionResponseHeadersToAddArgs extends com.pulumi.resources.ResourceArgs {

    public static final URLMapPathMatcherDefaultRouteActionWeightedBackendServiceHeaderActionResponseHeadersToAddArgs Empty = new URLMapPathMatcherDefaultRouteActionWeightedBackendServiceHeaderActionResponseHeadersToAddArgs();

    /**
     * The name of the header to add.
     * 
     */
    @Import(name="headerName")
    private @Nullable Output<String> headerName;

    /**
     * @return The name of the header to add.
     * 
     */
    public Optional<Output<String>> headerName() {
        return Optional.ofNullable(this.headerName);
    }

    /**
     * The value of the header to add.
     * 
     */
    @Import(name="headerValue")
    private @Nullable Output<String> headerValue;

    /**
     * @return The value of the header to add.
     * 
     */
    public Optional<Output<String>> headerValue() {
        return Optional.ofNullable(this.headerValue);
    }

    /**
     * If false, headerValue is appended to any values that already exist for the header.
     * If true, headerValue is set for the header, discarding any values that were set for that header.
     * 
     */
    @Import(name="replace")
    private @Nullable Output<Boolean> replace;

    /**
     * @return If false, headerValue is appended to any values that already exist for the header.
     * If true, headerValue is set for the header, discarding any values that were set for that header.
     * 
     */
    public Optional<Output<Boolean>> replace() {
        return Optional.ofNullable(this.replace);
    }

    private URLMapPathMatcherDefaultRouteActionWeightedBackendServiceHeaderActionResponseHeadersToAddArgs() {}

    private URLMapPathMatcherDefaultRouteActionWeightedBackendServiceHeaderActionResponseHeadersToAddArgs(URLMapPathMatcherDefaultRouteActionWeightedBackendServiceHeaderActionResponseHeadersToAddArgs $) {
        this.headerName = $.headerName;
        this.headerValue = $.headerValue;
        this.replace = $.replace;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(URLMapPathMatcherDefaultRouteActionWeightedBackendServiceHeaderActionResponseHeadersToAddArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private URLMapPathMatcherDefaultRouteActionWeightedBackendServiceHeaderActionResponseHeadersToAddArgs $;

        public Builder() {
            $ = new URLMapPathMatcherDefaultRouteActionWeightedBackendServiceHeaderActionResponseHeadersToAddArgs();
        }

        public Builder(URLMapPathMatcherDefaultRouteActionWeightedBackendServiceHeaderActionResponseHeadersToAddArgs defaults) {
            $ = new URLMapPathMatcherDefaultRouteActionWeightedBackendServiceHeaderActionResponseHeadersToAddArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param headerName The name of the header to add.
         * 
         * @return builder
         * 
         */
        public Builder headerName(@Nullable Output<String> headerName) {
            $.headerName = headerName;
            return this;
        }

        /**
         * @param headerName The name of the header to add.
         * 
         * @return builder
         * 
         */
        public Builder headerName(String headerName) {
            return headerName(Output.of(headerName));
        }

        /**
         * @param headerValue The value of the header to add.
         * 
         * @return builder
         * 
         */
        public Builder headerValue(@Nullable Output<String> headerValue) {
            $.headerValue = headerValue;
            return this;
        }

        /**
         * @param headerValue The value of the header to add.
         * 
         * @return builder
         * 
         */
        public Builder headerValue(String headerValue) {
            return headerValue(Output.of(headerValue));
        }

        /**
         * @param replace If false, headerValue is appended to any values that already exist for the header.
         * If true, headerValue is set for the header, discarding any values that were set for that header.
         * 
         * @return builder
         * 
         */
        public Builder replace(@Nullable Output<Boolean> replace) {
            $.replace = replace;
            return this;
        }

        /**
         * @param replace If false, headerValue is appended to any values that already exist for the header.
         * If true, headerValue is set for the header, discarding any values that were set for that header.
         * 
         * @return builder
         * 
         */
        public Builder replace(Boolean replace) {
            return replace(Output.of(replace));
        }

        public URLMapPathMatcherDefaultRouteActionWeightedBackendServiceHeaderActionResponseHeadersToAddArgs build() {
            return $;
        }
    }

}
