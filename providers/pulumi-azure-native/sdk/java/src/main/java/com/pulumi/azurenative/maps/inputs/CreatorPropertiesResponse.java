// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.maps.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Creator resource properties
 * 
 */
public final class CreatorPropertiesResponse extends com.pulumi.resources.InvokeArgs {

    public static final CreatorPropertiesResponse Empty = new CreatorPropertiesResponse();

    /**
     * The state of the resource provisioning, terminal states: Succeeded, Failed, Canceled
     * 
     */
    @Import(name="provisioningState")
    private @Nullable String provisioningState;

    /**
     * @return The state of the resource provisioning, terminal states: Succeeded, Failed, Canceled
     * 
     */
    public Optional<String> provisioningState() {
        return Optional.ofNullable(this.provisioningState);
    }

    private CreatorPropertiesResponse() {}

    private CreatorPropertiesResponse(CreatorPropertiesResponse $) {
        this.provisioningState = $.provisioningState;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CreatorPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CreatorPropertiesResponse $;

        public Builder() {
            $ = new CreatorPropertiesResponse();
        }

        public Builder(CreatorPropertiesResponse defaults) {
            $ = new CreatorPropertiesResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param provisioningState The state of the resource provisioning, terminal states: Succeeded, Failed, Canceled
         * 
         * @return builder
         * 
         */
        public Builder provisioningState(@Nullable String provisioningState) {
            $.provisioningState = provisioningState;
            return this;
        }

        public CreatorPropertiesResponse build() {
            return $;
        }
    }

}
