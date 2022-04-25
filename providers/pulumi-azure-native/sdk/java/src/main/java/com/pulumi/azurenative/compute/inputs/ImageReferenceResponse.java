// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specifies information about the image to use. You can specify information about platform images, marketplace images, or virtual machine images. This element is required when you want to use a platform image, marketplace image, or virtual machine image, but is not used in other creation operations. NOTE: Image reference publisher and offer can only be set when you create the scale set.
 * 
 */
public final class ImageReferenceResponse extends com.pulumi.resources.InvokeArgs {

    public static final ImageReferenceResponse Empty = new ImageReferenceResponse();

    /**
     * Specifies in decimal numbers, the version of platform image or marketplace image used to create the virtual machine. This readonly field differs from &#39;version&#39;, only if the value specified in &#39;version&#39; field is &#39;latest&#39;.
     * 
     */
    @Import(name="exactVersion", required=true)
    private String exactVersion;

    /**
     * @return Specifies in decimal numbers, the version of platform image or marketplace image used to create the virtual machine. This readonly field differs from &#39;version&#39;, only if the value specified in &#39;version&#39; field is &#39;latest&#39;.
     * 
     */
    public String exactVersion() {
        return this.exactVersion;
    }

    /**
     * Resource Id
     * 
     */
    @Import(name="id")
    private @Nullable String id;

    /**
     * @return Resource Id
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * Specifies the offer of the platform image or marketplace image used to create the virtual machine.
     * 
     */
    @Import(name="offer")
    private @Nullable String offer;

    /**
     * @return Specifies the offer of the platform image or marketplace image used to create the virtual machine.
     * 
     */
    public Optional<String> offer() {
        return Optional.ofNullable(this.offer);
    }

    /**
     * The image publisher.
     * 
     */
    @Import(name="publisher")
    private @Nullable String publisher;

    /**
     * @return The image publisher.
     * 
     */
    public Optional<String> publisher() {
        return Optional.ofNullable(this.publisher);
    }

    /**
     * The image SKU.
     * 
     */
    @Import(name="sku")
    private @Nullable String sku;

    /**
     * @return The image SKU.
     * 
     */
    public Optional<String> sku() {
        return Optional.ofNullable(this.sku);
    }

    /**
     * Specifies the version of the platform image or marketplace image used to create the virtual machine. The allowed formats are Major.Minor.Build or &#39;latest&#39;. Major, Minor, and Build are decimal numbers. Specify &#39;latest&#39; to use the latest version of an image available at deploy time. Even if you use &#39;latest&#39;, the VM image will not automatically update after deploy time even if a new version becomes available.
     * 
     */
    @Import(name="version")
    private @Nullable String version;

    /**
     * @return Specifies the version of the platform image or marketplace image used to create the virtual machine. The allowed formats are Major.Minor.Build or &#39;latest&#39;. Major, Minor, and Build are decimal numbers. Specify &#39;latest&#39; to use the latest version of an image available at deploy time. Even if you use &#39;latest&#39;, the VM image will not automatically update after deploy time even if a new version becomes available.
     * 
     */
    public Optional<String> version() {
        return Optional.ofNullable(this.version);
    }

    private ImageReferenceResponse() {}

    private ImageReferenceResponse(ImageReferenceResponse $) {
        this.exactVersion = $.exactVersion;
        this.id = $.id;
        this.offer = $.offer;
        this.publisher = $.publisher;
        this.sku = $.sku;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ImageReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ImageReferenceResponse $;

        public Builder() {
            $ = new ImageReferenceResponse();
        }

        public Builder(ImageReferenceResponse defaults) {
            $ = new ImageReferenceResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param exactVersion Specifies in decimal numbers, the version of platform image or marketplace image used to create the virtual machine. This readonly field differs from &#39;version&#39;, only if the value specified in &#39;version&#39; field is &#39;latest&#39;.
         * 
         * @return builder
         * 
         */
        public Builder exactVersion(String exactVersion) {
            $.exactVersion = exactVersion;
            return this;
        }

        /**
         * @param id Resource Id
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable String id) {
            $.id = id;
            return this;
        }

        /**
         * @param offer Specifies the offer of the platform image or marketplace image used to create the virtual machine.
         * 
         * @return builder
         * 
         */
        public Builder offer(@Nullable String offer) {
            $.offer = offer;
            return this;
        }

        /**
         * @param publisher The image publisher.
         * 
         * @return builder
         * 
         */
        public Builder publisher(@Nullable String publisher) {
            $.publisher = publisher;
            return this;
        }

        /**
         * @param sku The image SKU.
         * 
         * @return builder
         * 
         */
        public Builder sku(@Nullable String sku) {
            $.sku = sku;
            return this;
        }

        /**
         * @param version Specifies the version of the platform image or marketplace image used to create the virtual machine. The allowed formats are Major.Minor.Build or &#39;latest&#39;. Major, Minor, and Build are decimal numbers. Specify &#39;latest&#39; to use the latest version of an image available at deploy time. Even if you use &#39;latest&#39;, the VM image will not automatically update after deploy time even if a new version becomes available.
         * 
         * @return builder
         * 
         */
        public Builder version(@Nullable String version) {
            $.version = version;
            return this;
        }

        public ImageReferenceResponse build() {
            $.exactVersion = Objects.requireNonNull($.exactVersion, "expected parameter 'exactVersion' to be non-null");
            return $;
        }
    }

}
