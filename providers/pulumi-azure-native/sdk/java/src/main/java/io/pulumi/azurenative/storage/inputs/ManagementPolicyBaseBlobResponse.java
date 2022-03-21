// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.inputs;

import io.pulumi.azurenative.storage.inputs.DateAfterModificationResponse;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Management policy action for base blob.
 * 
 */
public final class ManagementPolicyBaseBlobResponse extends io.pulumi.resources.InvokeArgs {

    public static final ManagementPolicyBaseBlobResponse Empty = new ManagementPolicyBaseBlobResponse();

    /**
     * The function to delete the blob
     * 
     */
    @Import(name="delete")
      private final @Nullable DateAfterModificationResponse delete;

    public Optional<DateAfterModificationResponse> getDelete() {
        return this.delete == null ? Optional.empty() : Optional.ofNullable(this.delete);
    }

    /**
     * This property enables auto tiering of a blob from cool to hot on a blob access. This property requires tierToCool.daysAfterLastAccessTimeGreaterThan.
     * 
     */
    @Import(name="enableAutoTierToHotFromCool")
      private final @Nullable Boolean enableAutoTierToHotFromCool;

    public Optional<Boolean> getEnableAutoTierToHotFromCool() {
        return this.enableAutoTierToHotFromCool == null ? Optional.empty() : Optional.ofNullable(this.enableAutoTierToHotFromCool);
    }

    /**
     * The function to tier blobs to archive storage. Support blobs currently at Hot or Cool tier
     * 
     */
    @Import(name="tierToArchive")
      private final @Nullable DateAfterModificationResponse tierToArchive;

    public Optional<DateAfterModificationResponse> getTierToArchive() {
        return this.tierToArchive == null ? Optional.empty() : Optional.ofNullable(this.tierToArchive);
    }

    /**
     * The function to tier blobs to cool storage. Support blobs currently at Hot tier
     * 
     */
    @Import(name="tierToCool")
      private final @Nullable DateAfterModificationResponse tierToCool;

    public Optional<DateAfterModificationResponse> getTierToCool() {
        return this.tierToCool == null ? Optional.empty() : Optional.ofNullable(this.tierToCool);
    }

    public ManagementPolicyBaseBlobResponse(
        @Nullable DateAfterModificationResponse delete,
        @Nullable Boolean enableAutoTierToHotFromCool,
        @Nullable DateAfterModificationResponse tierToArchive,
        @Nullable DateAfterModificationResponse tierToCool) {
        this.delete = delete;
        this.enableAutoTierToHotFromCool = enableAutoTierToHotFromCool;
        this.tierToArchive = tierToArchive;
        this.tierToCool = tierToCool;
    }

    private ManagementPolicyBaseBlobResponse() {
        this.delete = null;
        this.enableAutoTierToHotFromCool = null;
        this.tierToArchive = null;
        this.tierToCool = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagementPolicyBaseBlobResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DateAfterModificationResponse delete;
        private @Nullable Boolean enableAutoTierToHotFromCool;
        private @Nullable DateAfterModificationResponse tierToArchive;
        private @Nullable DateAfterModificationResponse tierToCool;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagementPolicyBaseBlobResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.delete = defaults.delete;
    	      this.enableAutoTierToHotFromCool = defaults.enableAutoTierToHotFromCool;
    	      this.tierToArchive = defaults.tierToArchive;
    	      this.tierToCool = defaults.tierToCool;
        }

        public Builder delete(@Nullable DateAfterModificationResponse delete) {
            this.delete = delete;
            return this;
        }
        public Builder enableAutoTierToHotFromCool(@Nullable Boolean enableAutoTierToHotFromCool) {
            this.enableAutoTierToHotFromCool = enableAutoTierToHotFromCool;
            return this;
        }
        public Builder tierToArchive(@Nullable DateAfterModificationResponse tierToArchive) {
            this.tierToArchive = tierToArchive;
            return this;
        }
        public Builder tierToCool(@Nullable DateAfterModificationResponse tierToCool) {
            this.tierToCool = tierToCool;
            return this;
        }        public ManagementPolicyBaseBlobResponse build() {
            return new ManagementPolicyBaseBlobResponse(delete, enableAutoTierToHotFromCool, tierToArchive, tierToCool);
        }
    }
}
