// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.run_v1alpha1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Not supported by Cloud Run HTTPHeader describes a custom header to be used in HTTP probes
 * 
 */
public final class HTTPHeaderResponse extends com.pulumi.resources.InvokeArgs {

    public static final HTTPHeaderResponse Empty = new HTTPHeaderResponse();

    /**
     * The header field name
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The header field name
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * The header field value
     * 
     */
    @Import(name="value", required=true)
    private String value;

    /**
     * @return The header field value
     * 
     */
    public String value() {
        return this.value;
    }

    private HTTPHeaderResponse() {}

    private HTTPHeaderResponse(HTTPHeaderResponse $) {
        this.name = $.name;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HTTPHeaderResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HTTPHeaderResponse $;

        public Builder() {
            $ = new HTTPHeaderResponse();
        }

        public Builder(HTTPHeaderResponse defaults) {
            $ = new HTTPHeaderResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The header field name
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param value The header field value
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            $.value = value;
            return this;
        }

        public HTTPHeaderResponse build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
