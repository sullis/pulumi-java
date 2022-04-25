// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataflow_v1b3.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * SDK Information.
 * 
 */
public final class SDKInfoResponse extends com.pulumi.resources.InvokeArgs {

    public static final SDKInfoResponse Empty = new SDKInfoResponse();

    /**
     * The SDK Language.
     * 
     */
    @Import(name="language", required=true)
    private String language;

    /**
     * @return The SDK Language.
     * 
     */
    public String language() {
        return this.language;
    }

    /**
     * Optional. The SDK version.
     * 
     */
    @Import(name="version", required=true)
    private String version;

    /**
     * @return Optional. The SDK version.
     * 
     */
    public String version() {
        return this.version;
    }

    private SDKInfoResponse() {}

    private SDKInfoResponse(SDKInfoResponse $) {
        this.language = $.language;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SDKInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SDKInfoResponse $;

        public Builder() {
            $ = new SDKInfoResponse();
        }

        public Builder(SDKInfoResponse defaults) {
            $ = new SDKInfoResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param language The SDK Language.
         * 
         * @return builder
         * 
         */
        public Builder language(String language) {
            $.language = language;
            return this;
        }

        /**
         * @param version Optional. The SDK version.
         * 
         * @return builder
         * 
         */
        public Builder version(String version) {
            $.version = version;
            return this;
        }

        public SDKInfoResponse build() {
            $.language = Objects.requireNonNull($.language, "expected parameter 'language' to be non-null");
            $.version = Objects.requireNonNull($.version, "expected parameter 'version' to be non-null");
            return $;
        }
    }

}
