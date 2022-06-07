// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetGalleryPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetGalleryPlainArgs Empty = new GetGalleryPlainArgs();

    /**
     * The name of the Shared Image Gallery.
     * 
     */
    @Import(name="galleryName", required=true)
    private String galleryName;

    /**
     * @return The name of the Shared Image Gallery.
     * 
     */
    public String galleryName() {
        return this.galleryName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The select expression to apply on the operation.
     * 
     */
    @Import(name="select")
    private @Nullable String select;

    /**
     * @return The select expression to apply on the operation.
     * 
     */
    public Optional<String> select() {
        return Optional.ofNullable(this.select);
    }

    private GetGalleryPlainArgs() {}

    private GetGalleryPlainArgs(GetGalleryPlainArgs $) {
        this.galleryName = $.galleryName;
        this.resourceGroupName = $.resourceGroupName;
        this.select = $.select;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGalleryPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGalleryPlainArgs $;

        public Builder() {
            $ = new GetGalleryPlainArgs();
        }

        public Builder(GetGalleryPlainArgs defaults) {
            $ = new GetGalleryPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param galleryName The name of the Shared Image Gallery.
         * 
         * @return builder
         * 
         */
        public Builder galleryName(String galleryName) {
            $.galleryName = galleryName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param select The select expression to apply on the operation.
         * 
         * @return builder
         * 
         */
        public Builder select(@Nullable String select) {
            $.select = select;
            return this;
        }

        public GetGalleryPlainArgs build() {
            $.galleryName = Objects.requireNonNull($.galleryName, "expected parameter 'galleryName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
