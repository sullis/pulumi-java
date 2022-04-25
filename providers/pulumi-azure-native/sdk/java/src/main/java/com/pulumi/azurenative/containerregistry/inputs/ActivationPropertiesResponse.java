// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerregistry.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * The activation properties of the connected registry.
 * 
 */
public final class ActivationPropertiesResponse extends com.pulumi.resources.InvokeArgs {

    public static final ActivationPropertiesResponse Empty = new ActivationPropertiesResponse();

    /**
     * The activation status of the connected registry.
     * 
     */
    @Import(name="status", required=true)
    private String status;

    /**
     * @return The activation status of the connected registry.
     * 
     */
    public String status() {
        return this.status;
    }

    private ActivationPropertiesResponse() {}

    private ActivationPropertiesResponse(ActivationPropertiesResponse $) {
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ActivationPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ActivationPropertiesResponse $;

        public Builder() {
            $ = new ActivationPropertiesResponse();
        }

        public Builder(ActivationPropertiesResponse defaults) {
            $ = new ActivationPropertiesResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param status The activation status of the connected registry.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            $.status = status;
            return this;
        }

        public ActivationPropertiesResponse build() {
            $.status = Objects.requireNonNull($.status, "expected parameter 'status' to be non-null");
            return $;
        }
    }

}
