// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Hub Item.
 * 
 */
public final class HubResponse extends com.pulumi.resources.InvokeArgs {

    public static final HubResponse Empty = new HubResponse();

    /**
     * Resource Id.
     * 
     */
    @Import(name="resourceId")
    private @Nullable String resourceId;

    /**
     * @return Resource Id.
     * 
     */
    public Optional<String> resourceId() {
        return Optional.ofNullable(this.resourceId);
    }

    /**
     * Resource Type.
     * 
     */
    @Import(name="resourceType")
    private @Nullable String resourceType;

    /**
     * @return Resource Type.
     * 
     */
    public Optional<String> resourceType() {
        return Optional.ofNullable(this.resourceType);
    }

    private HubResponse() {}

    private HubResponse(HubResponse $) {
        this.resourceId = $.resourceId;
        this.resourceType = $.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HubResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HubResponse $;

        public Builder() {
            $ = new HubResponse();
        }

        public Builder(HubResponse defaults) {
            $ = new HubResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param resourceId Resource Id.
         * 
         * @return builder
         * 
         */
        public Builder resourceId(@Nullable String resourceId) {
            $.resourceId = resourceId;
            return this;
        }

        /**
         * @param resourceType Resource Type.
         * 
         * @return builder
         * 
         */
        public Builder resourceType(@Nullable String resourceType) {
            $.resourceType = resourceType;
            return this;
        }

        public HubResponse build() {
            return $;
        }
    }

}
