// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerservice.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes the Power State of the cluster
 * 
 */
public final class PowerStateResponse extends com.pulumi.resources.InvokeArgs {

    public static final PowerStateResponse Empty = new PowerStateResponse();

    /**
     * Tells whether the cluster is Running or Stopped
     * 
     */
    @Import(name="code")
    private @Nullable String code;

    /**
     * @return Tells whether the cluster is Running or Stopped
     * 
     */
    public Optional<String> code() {
        return Optional.ofNullable(this.code);
    }

    private PowerStateResponse() {}

    private PowerStateResponse(PowerStateResponse $) {
        this.code = $.code;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PowerStateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PowerStateResponse $;

        public Builder() {
            $ = new PowerStateResponse();
        }

        public Builder(PowerStateResponse defaults) {
            $ = new PowerStateResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param code Tells whether the cluster is Running or Stopped
         * 
         * @return builder
         * 
         */
        public Builder code(@Nullable String code) {
            $.code = code;
            return this;
        }

        public PowerStateResponse build() {
            return $;
        }
    }

}
