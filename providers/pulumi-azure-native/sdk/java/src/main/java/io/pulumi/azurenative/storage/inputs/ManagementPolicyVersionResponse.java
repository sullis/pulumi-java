// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.inputs;

import io.pulumi.azurenative.storage.inputs.DateAfterCreationResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Management policy action for blob version.
 * 
 */
public final class ManagementPolicyVersionResponse extends io.pulumi.resources.InvokeArgs {

    public static final ManagementPolicyVersionResponse Empty = new ManagementPolicyVersionResponse();

    /**
     * The function to delete the blob version
     * 
     */
    @InputImport(name="delete")
    private final @Nullable DateAfterCreationResponse delete;

    public Optional<DateAfterCreationResponse> getDelete() {
        return this.delete == null ? Optional.empty() : Optional.ofNullable(this.delete);
    }

    /**
     * The function to tier blob version to archive storage. Support blob version currently at Hot or Cool tier
     * 
     */
    @InputImport(name="tierToArchive")
    private final @Nullable DateAfterCreationResponse tierToArchive;

    public Optional<DateAfterCreationResponse> getTierToArchive() {
        return this.tierToArchive == null ? Optional.empty() : Optional.ofNullable(this.tierToArchive);
    }

    /**
     * The function to tier blob version to cool storage. Support blob version currently at Hot tier
     * 
     */
    @InputImport(name="tierToCool")
    private final @Nullable DateAfterCreationResponse tierToCool;

    public Optional<DateAfterCreationResponse> getTierToCool() {
        return this.tierToCool == null ? Optional.empty() : Optional.ofNullable(this.tierToCool);
    }

    public ManagementPolicyVersionResponse(
        @Nullable DateAfterCreationResponse delete,
        @Nullable DateAfterCreationResponse tierToArchive,
        @Nullable DateAfterCreationResponse tierToCool) {
        this.delete = delete;
        this.tierToArchive = tierToArchive;
        this.tierToCool = tierToCool;
    }

    private ManagementPolicyVersionResponse() {
        this.delete = null;
        this.tierToArchive = null;
        this.tierToCool = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagementPolicyVersionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DateAfterCreationResponse delete;
        private @Nullable DateAfterCreationResponse tierToArchive;
        private @Nullable DateAfterCreationResponse tierToCool;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagementPolicyVersionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.delete = defaults.delete;
    	      this.tierToArchive = defaults.tierToArchive;
    	      this.tierToCool = defaults.tierToCool;
        }

        public Builder setDelete(@Nullable DateAfterCreationResponse delete) {
            this.delete = delete;
            return this;
        }

        public Builder setTierToArchive(@Nullable DateAfterCreationResponse tierToArchive) {
            this.tierToArchive = tierToArchive;
            return this;
        }

        public Builder setTierToCool(@Nullable DateAfterCreationResponse tierToCool) {
            this.tierToCool = tierToCool;
            return this;
        }

        public ManagementPolicyVersionResponse build() {
            return new ManagementPolicyVersionResponse(delete, tierToArchive, tierToCool);
        }
    }
}
