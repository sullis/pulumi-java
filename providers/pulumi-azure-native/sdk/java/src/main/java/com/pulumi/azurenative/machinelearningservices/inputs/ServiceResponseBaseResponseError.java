// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.inputs;

import com.pulumi.azurenative.machinelearningservices.inputs.ErrorResponseResponse;
import com.pulumi.core.annotations.Import;
import java.util.Objects;


/**
 * The error details.
 * 
 */
public final class ServiceResponseBaseResponseError extends com.pulumi.resources.InvokeArgs {

    public static final ServiceResponseBaseResponseError Empty = new ServiceResponseBaseResponseError();

    /**
     * The error response.
     * 
     */
    @Import(name="error", required=true)
    private ErrorResponseResponse error;

    /**
     * @return The error response.
     * 
     */
    public ErrorResponseResponse error() {
        return this.error;
    }

    private ServiceResponseBaseResponseError() {}

    private ServiceResponseBaseResponseError(ServiceResponseBaseResponseError $) {
        this.error = $.error;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceResponseBaseResponseError defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceResponseBaseResponseError $;

        public Builder() {
            $ = new ServiceResponseBaseResponseError();
        }

        public Builder(ServiceResponseBaseResponseError defaults) {
            $ = new ServiceResponseBaseResponseError(Objects.requireNonNull(defaults));
        }

        /**
         * @param error The error response.
         * 
         * @return builder
         * 
         */
        public Builder error(ErrorResponseResponse error) {
            $.error = error;
            return this;
        }

        public ServiceResponseBaseResponseError build() {
            $.error = Objects.requireNonNull($.error, "expected parameter 'error' to be non-null");
            return $;
        }
    }

}
