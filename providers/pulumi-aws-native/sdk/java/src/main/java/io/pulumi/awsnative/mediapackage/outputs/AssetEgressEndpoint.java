// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.mediapackage.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class AssetEgressEndpoint {
    /**
     * The ID of the PackagingConfiguration being applied to the Asset.
     * 
     */
    private final String packagingConfigurationId;
    /**
     * The URL of the parent manifest for the repackaged Asset.
     * 
     */
    private final String url;

    @OutputCustomType.Constructor({"packagingConfigurationId","url"})
    private AssetEgressEndpoint(
        String packagingConfigurationId,
        String url) {
        this.packagingConfigurationId = Objects.requireNonNull(packagingConfigurationId);
        this.url = Objects.requireNonNull(url);
    }

    /**
     * The ID of the PackagingConfiguration being applied to the Asset.
     * 
     */
    public String getPackagingConfigurationId() {
        return this.packagingConfigurationId;
    }
    /**
     * The URL of the parent manifest for the repackaged Asset.
     * 
     */
    public String getUrl() {
        return this.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssetEgressEndpoint defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String packagingConfigurationId;
        private String url;

        public Builder() {
    	      // Empty
        }

        public Builder(AssetEgressEndpoint defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.packagingConfigurationId = defaults.packagingConfigurationId;
    	      this.url = defaults.url;
        }

        public Builder setPackagingConfigurationId(String packagingConfigurationId) {
            this.packagingConfigurationId = Objects.requireNonNull(packagingConfigurationId);
            return this;
        }

        public Builder setUrl(String url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }

        public AssetEgressEndpoint build() {
            return new AssetEgressEndpoint(packagingConfigurationId, url);
        }
    }
}
