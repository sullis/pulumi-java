// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.inputs;

import io.pulumi.azurenative.storage.inputs.DateAfterCreationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Management policy action for blob version.
 * 
 */
public final class ManagementPolicyVersionArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManagementPolicyVersionArgs Empty = new ManagementPolicyVersionArgs();

    /**
     * The function to delete the blob version
     * 
     */
    @InputImport(name="delete")
      private final @Nullable Input<DateAfterCreationArgs> delete;

    public Input<DateAfterCreationArgs> getDelete() {
        return this.delete == null ? Input.empty() : this.delete;
    }

    /**
     * The function to tier blob version to archive storage. Support blob version currently at Hot or Cool tier
     * 
     */
    @InputImport(name="tierToArchive")
      private final @Nullable Input<DateAfterCreationArgs> tierToArchive;

    public Input<DateAfterCreationArgs> getTierToArchive() {
        return this.tierToArchive == null ? Input.empty() : this.tierToArchive;
    }

    /**
     * The function to tier blob version to cool storage. Support blob version currently at Hot tier
     * 
     */
    @InputImport(name="tierToCool")
      private final @Nullable Input<DateAfterCreationArgs> tierToCool;

    public Input<DateAfterCreationArgs> getTierToCool() {
        return this.tierToCool == null ? Input.empty() : this.tierToCool;
    }

    public ManagementPolicyVersionArgs(
        @Nullable Input<DateAfterCreationArgs> delete,
        @Nullable Input<DateAfterCreationArgs> tierToArchive,
        @Nullable Input<DateAfterCreationArgs> tierToCool) {
        this.delete = delete;
        this.tierToArchive = tierToArchive;
        this.tierToCool = tierToCool;
    }

    private ManagementPolicyVersionArgs() {
        this.delete = Input.empty();
        this.tierToArchive = Input.empty();
        this.tierToCool = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagementPolicyVersionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<DateAfterCreationArgs> delete;
        private @Nullable Input<DateAfterCreationArgs> tierToArchive;
        private @Nullable Input<DateAfterCreationArgs> tierToCool;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagementPolicyVersionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.delete = defaults.delete;
    	      this.tierToArchive = defaults.tierToArchive;
    	      this.tierToCool = defaults.tierToCool;
        }

        public Builder setDelete(@Nullable Input<DateAfterCreationArgs> delete) {
            this.delete = delete;
            return this;
        }

        public Builder setDelete(@Nullable DateAfterCreationArgs delete) {
            this.delete = Input.ofNullable(delete);
            return this;
        }

        public Builder setTierToArchive(@Nullable Input<DateAfterCreationArgs> tierToArchive) {
            this.tierToArchive = tierToArchive;
            return this;
        }

        public Builder setTierToArchive(@Nullable DateAfterCreationArgs tierToArchive) {
            this.tierToArchive = Input.ofNullable(tierToArchive);
            return this;
        }

        public Builder setTierToCool(@Nullable Input<DateAfterCreationArgs> tierToCool) {
            this.tierToCool = tierToCool;
            return this;
        }

        public Builder setTierToCool(@Nullable DateAfterCreationArgs tierToCool) {
            this.tierToCool = Input.ofNullable(tierToCool);
            return this;
        }
        public ManagementPolicyVersionArgs build() {
            return new ManagementPolicyVersionArgs(delete, tierToArchive, tierToCool);
        }
    }
}