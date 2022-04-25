// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.appplatform.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Collection of instances belong to the API portal
 * 
 */
public final class ApiPortalInstanceResponse extends com.pulumi.resources.InvokeArgs {

    public static final ApiPortalInstanceResponse Empty = new ApiPortalInstanceResponse();

    /**
     * Name of the API portal instance
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return Name of the API portal instance
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * Status of the API portal instance
     * 
     */
    @Import(name="status", required=true)
    private String status;

    /**
     * @return Status of the API portal instance
     * 
     */
    public String status() {
        return this.status;
    }

    private ApiPortalInstanceResponse() {}

    private ApiPortalInstanceResponse(ApiPortalInstanceResponse $) {
        this.name = $.name;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApiPortalInstanceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApiPortalInstanceResponse $;

        public Builder() {
            $ = new ApiPortalInstanceResponse();
        }

        public Builder(ApiPortalInstanceResponse defaults) {
            $ = new ApiPortalInstanceResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Name of the API portal instance
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param status Status of the API portal instance
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            $.status = status;
            return this;
        }

        public ApiPortalInstanceResponse build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.status = Objects.requireNonNull($.status, "expected parameter 'status' to be non-null");
            return $;
        }
    }

}
