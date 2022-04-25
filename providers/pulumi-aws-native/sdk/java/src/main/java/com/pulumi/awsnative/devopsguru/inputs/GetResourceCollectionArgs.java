// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.devopsguru.inputs;

import com.pulumi.awsnative.devopsguru.enums.ResourceCollectionType;
import com.pulumi.core.annotations.Import;
import java.util.Objects;


public final class GetResourceCollectionArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetResourceCollectionArgs Empty = new GetResourceCollectionArgs();

    /**
     * The type of ResourceCollection
     * 
     */
    @Import(name="resourceCollectionType", required=true)
    private ResourceCollectionType resourceCollectionType;

    /**
     * @return The type of ResourceCollection
     * 
     */
    public ResourceCollectionType resourceCollectionType() {
        return this.resourceCollectionType;
    }

    private GetResourceCollectionArgs() {}

    private GetResourceCollectionArgs(GetResourceCollectionArgs $) {
        this.resourceCollectionType = $.resourceCollectionType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetResourceCollectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetResourceCollectionArgs $;

        public Builder() {
            $ = new GetResourceCollectionArgs();
        }

        public Builder(GetResourceCollectionArgs defaults) {
            $ = new GetResourceCollectionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param resourceCollectionType The type of ResourceCollection
         * 
         * @return builder
         * 
         */
        public Builder resourceCollectionType(ResourceCollectionType resourceCollectionType) {
            $.resourceCollectionType = resourceCollectionType;
            return this;
        }

        public GetResourceCollectionArgs build() {
            $.resourceCollectionType = Objects.requireNonNull($.resourceCollectionType, "expected parameter 'resourceCollectionType' to be non-null");
            return $;
        }
    }

}
