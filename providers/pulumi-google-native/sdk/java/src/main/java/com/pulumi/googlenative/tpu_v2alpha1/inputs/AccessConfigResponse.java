// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.tpu_v2alpha1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * An access config attached to the TPU worker.
 * 
 */
public final class AccessConfigResponse extends com.pulumi.resources.InvokeArgs {

    public static final AccessConfigResponse Empty = new AccessConfigResponse();

    /**
     * An external IP address associated with the TPU worker.
     * 
     */
    @Import(name="externalIp", required=true)
    private String externalIp;

    /**
     * @return An external IP address associated with the TPU worker.
     * 
     */
    public String externalIp() {
        return this.externalIp;
    }

    private AccessConfigResponse() {}

    private AccessConfigResponse(AccessConfigResponse $) {
        this.externalIp = $.externalIp;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccessConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccessConfigResponse $;

        public Builder() {
            $ = new AccessConfigResponse();
        }

        public Builder(AccessConfigResponse defaults) {
            $ = new AccessConfigResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param externalIp An external IP address associated with the TPU worker.
         * 
         * @return builder
         * 
         */
        public Builder externalIp(String externalIp) {
            $.externalIp = externalIp;
            return this;
        }

        public AccessConfigResponse build() {
            $.externalIp = Objects.requireNonNull($.externalIp, "expected parameter 'externalIp' to be non-null");
            return $;
        }
    }

}
