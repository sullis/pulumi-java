// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotsitewise.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * A hierarchy specifies allowed parent/child asset relationships.
 * 
 */
public final class AssetHierarchy extends io.pulumi.resources.InvokeArgs {

    public static final AssetHierarchy Empty = new AssetHierarchy();

    /**
     * The ID of the child asset to be associated.
     * 
     */
    @Import(name="childAssetId", required=true)
      private final String childAssetId;

    public String childAssetId() {
        return this.childAssetId;
    }

    /**
     * The LogicalID of a hierarchy in the parent asset's model.
     * 
     */
    @Import(name="logicalId", required=true)
      private final String logicalId;

    public String logicalId() {
        return this.logicalId;
    }

    public AssetHierarchy(
        String childAssetId,
        String logicalId) {
        this.childAssetId = Objects.requireNonNull(childAssetId, "expected parameter 'childAssetId' to be non-null");
        this.logicalId = Objects.requireNonNull(logicalId, "expected parameter 'logicalId' to be non-null");
    }

    private AssetHierarchy() {
        this.childAssetId = null;
        this.logicalId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssetHierarchy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String childAssetId;
        private String logicalId;

        public Builder() {
    	      // Empty
        }

        public Builder(AssetHierarchy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.childAssetId = defaults.childAssetId;
    	      this.logicalId = defaults.logicalId;
        }

        public Builder childAssetId(String childAssetId) {
            this.childAssetId = Objects.requireNonNull(childAssetId);
            return this;
        }
        public Builder logicalId(String logicalId) {
            this.logicalId = Objects.requireNonNull(logicalId);
            return this;
        }        public AssetHierarchy build() {
            return new AssetHierarchy(childAssetId, logicalId);
        }
    }
}
