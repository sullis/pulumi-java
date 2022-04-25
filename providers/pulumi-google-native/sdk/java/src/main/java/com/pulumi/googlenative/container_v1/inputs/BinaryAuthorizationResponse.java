// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


/**
 * Configuration for Binary Authorization.
 * 
 */
public final class BinaryAuthorizationResponse extends com.pulumi.resources.InvokeArgs {

    public static final BinaryAuthorizationResponse Empty = new BinaryAuthorizationResponse();

    /**
     * Enable Binary Authorization for this cluster. If enabled, all container images will be validated by Binary Authorization.
     * 
     */
    @Import(name="enabled", required=true)
    private Boolean enabled;

    /**
     * @return Enable Binary Authorization for this cluster. If enabled, all container images will be validated by Binary Authorization.
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }

    private BinaryAuthorizationResponse() {}

    private BinaryAuthorizationResponse(BinaryAuthorizationResponse $) {
        this.enabled = $.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BinaryAuthorizationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BinaryAuthorizationResponse $;

        public Builder() {
            $ = new BinaryAuthorizationResponse();
        }

        public Builder(BinaryAuthorizationResponse defaults) {
            $ = new BinaryAuthorizationResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled Enable Binary Authorization for this cluster. If enabled, all container images will be validated by Binary Authorization.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            $.enabled = enabled;
            return this;
        }

        public BinaryAuthorizationResponse build() {
            $.enabled = Objects.requireNonNull($.enabled, "expected parameter 'enabled' to be non-null");
            return $;
        }
    }

}
