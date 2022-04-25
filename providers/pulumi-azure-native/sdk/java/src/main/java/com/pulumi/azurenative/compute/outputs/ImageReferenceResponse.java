// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ImageReferenceResponse {
    /**
     * @return Specifies in decimal numbers, the version of platform image or marketplace image used to create the virtual machine. This readonly field differs from &#39;version&#39;, only if the value specified in &#39;version&#39; field is &#39;latest&#39;.
     * 
     */
    private final String exactVersion;
    /**
     * @return Resource Id
     * 
     */
    private final @Nullable String id;
    /**
     * @return Specifies the offer of the platform image or marketplace image used to create the virtual machine.
     * 
     */
    private final @Nullable String offer;
    /**
     * @return The image publisher.
     * 
     */
    private final @Nullable String publisher;
    /**
     * @return The image SKU.
     * 
     */
    private final @Nullable String sku;
    /**
     * @return Specifies the version of the platform image or marketplace image used to create the virtual machine. The allowed formats are Major.Minor.Build or &#39;latest&#39;. Major, Minor, and Build are decimal numbers. Specify &#39;latest&#39; to use the latest version of an image available at deploy time. Even if you use &#39;latest&#39;, the VM image will not automatically update after deploy time even if a new version becomes available.
     * 
     */
    private final @Nullable String version;

    @CustomType.Constructor
    private ImageReferenceResponse(
        @CustomType.Parameter("exactVersion") String exactVersion,
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("offer") @Nullable String offer,
        @CustomType.Parameter("publisher") @Nullable String publisher,
        @CustomType.Parameter("sku") @Nullable String sku,
        @CustomType.Parameter("version") @Nullable String version) {
        this.exactVersion = exactVersion;
        this.id = id;
        this.offer = offer;
        this.publisher = publisher;
        this.sku = sku;
        this.version = version;
    }

    /**
     * @return Specifies in decimal numbers, the version of platform image or marketplace image used to create the virtual machine. This readonly field differs from &#39;version&#39;, only if the value specified in &#39;version&#39; field is &#39;latest&#39;.
     * 
     */
    public String exactVersion() {
        return this.exactVersion;
    }
    /**
     * @return Resource Id
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return Specifies the offer of the platform image or marketplace image used to create the virtual machine.
     * 
     */
    public Optional<String> offer() {
        return Optional.ofNullable(this.offer);
    }
    /**
     * @return The image publisher.
     * 
     */
    public Optional<String> publisher() {
        return Optional.ofNullable(this.publisher);
    }
    /**
     * @return The image SKU.
     * 
     */
    public Optional<String> sku() {
        return Optional.ofNullable(this.sku);
    }
    /**
     * @return Specifies the version of the platform image or marketplace image used to create the virtual machine. The allowed formats are Major.Minor.Build or &#39;latest&#39;. Major, Minor, and Build are decimal numbers. Specify &#39;latest&#39; to use the latest version of an image available at deploy time. Even if you use &#39;latest&#39;, the VM image will not automatically update after deploy time even if a new version becomes available.
     * 
     */
    public Optional<String> version() {
        return Optional.ofNullable(this.version);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImageReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String exactVersion;
        private @Nullable String id;
        private @Nullable String offer;
        private @Nullable String publisher;
        private @Nullable String sku;
        private @Nullable String version;

        public Builder() {
    	      // Empty
        }

        public Builder(ImageReferenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exactVersion = defaults.exactVersion;
    	      this.id = defaults.id;
    	      this.offer = defaults.offer;
    	      this.publisher = defaults.publisher;
    	      this.sku = defaults.sku;
    	      this.version = defaults.version;
        }

        public Builder exactVersion(String exactVersion) {
            this.exactVersion = Objects.requireNonNull(exactVersion);
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder offer(@Nullable String offer) {
            this.offer = offer;
            return this;
        }
        public Builder publisher(@Nullable String publisher) {
            this.publisher = publisher;
            return this;
        }
        public Builder sku(@Nullable String sku) {
            this.sku = sku;
            return this;
        }
        public Builder version(@Nullable String version) {
            this.version = version;
            return this;
        }        public ImageReferenceResponse build() {
            return new ImageReferenceResponse(exactVersion, id, offer, publisher, sku, version);
        }
    }
}
