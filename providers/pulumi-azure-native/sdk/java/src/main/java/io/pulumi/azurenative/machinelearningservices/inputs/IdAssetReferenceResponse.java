// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Reference to an asset via its ARM resource ID.
 * 
 */
public final class IdAssetReferenceResponse extends io.pulumi.resources.InvokeArgs {

    public static final IdAssetReferenceResponse Empty = new IdAssetReferenceResponse();

    /**
     * ARM resource ID of the asset.
     * 
     */
    @InputImport(name="assetId", required=true)
    private final String assetId;

    public String getAssetId() {
        return this.assetId;
    }

    /**
     * Enum to determine which reference method to use for an asset.
     * Expected value is 'Id'.
     * 
     */
    @InputImport(name="referenceType", required=true)
    private final String referenceType;

    public String getReferenceType() {
        return this.referenceType;
    }

    public IdAssetReferenceResponse(
        String assetId,
        String referenceType) {
        this.assetId = Objects.requireNonNull(assetId, "expected parameter 'assetId' to be non-null");
        this.referenceType = Objects.requireNonNull(referenceType, "expected parameter 'referenceType' to be non-null");
    }

    private IdAssetReferenceResponse() {
        this.assetId = null;
        this.referenceType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IdAssetReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String assetId;
        private String referenceType;

        public Builder() {
    	      // Empty
        }

        public Builder(IdAssetReferenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assetId = defaults.assetId;
    	      this.referenceType = defaults.referenceType;
        }

        public Builder setAssetId(String assetId) {
            this.assetId = Objects.requireNonNull(assetId);
            return this;
        }

        public Builder setReferenceType(String referenceType) {
            this.referenceType = Objects.requireNonNull(referenceType);
            return this;
        }

        public IdAssetReferenceResponse build() {
            return new IdAssetReferenceResponse(assetId, referenceType);
        }
    }
}
