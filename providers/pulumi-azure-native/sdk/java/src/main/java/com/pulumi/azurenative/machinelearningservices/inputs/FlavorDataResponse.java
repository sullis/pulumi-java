// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FlavorDataResponse extends com.pulumi.resources.InvokeArgs {

    public static final FlavorDataResponse Empty = new FlavorDataResponse();

    /**
     * Model flavor-specific data.
     * 
     */
    @Import(name="data")
    private @Nullable Map<String,String> data;

    /**
     * @return Model flavor-specific data.
     * 
     */
    public Optional<Map<String,String>> data() {
        return Optional.ofNullable(this.data);
    }

    private FlavorDataResponse() {}

    private FlavorDataResponse(FlavorDataResponse $) {
        this.data = $.data;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FlavorDataResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FlavorDataResponse $;

        public Builder() {
            $ = new FlavorDataResponse();
        }

        public Builder(FlavorDataResponse defaults) {
            $ = new FlavorDataResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param data Model flavor-specific data.
         * 
         * @return builder
         * 
         */
        public Builder data(@Nullable Map<String,String> data) {
            $.data = data;
            return this;
        }

        public FlavorDataResponse build() {
            return $;
        }
    }

}
