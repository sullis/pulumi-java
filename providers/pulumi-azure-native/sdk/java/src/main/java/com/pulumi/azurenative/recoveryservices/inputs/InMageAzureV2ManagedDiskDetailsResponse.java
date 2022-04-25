// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * InMageAzureV2 Managed disk details.
 * 
 */
public final class InMageAzureV2ManagedDiskDetailsResponse extends com.pulumi.resources.InvokeArgs {

    public static final InMageAzureV2ManagedDiskDetailsResponse Empty = new InMageAzureV2ManagedDiskDetailsResponse();

    /**
     * The disk id.
     * 
     */
    @Import(name="diskId")
    private @Nullable String diskId;

    /**
     * @return The disk id.
     * 
     */
    public Optional<String> diskId() {
        return Optional.ofNullable(this.diskId);
    }

    /**
     * The replica disk type.
     * 
     */
    @Import(name="replicaDiskType")
    private @Nullable String replicaDiskType;

    /**
     * @return The replica disk type.
     * 
     */
    public Optional<String> replicaDiskType() {
        return Optional.ofNullable(this.replicaDiskType);
    }

    /**
     * Seed managed disk Id.
     * 
     */
    @Import(name="seedManagedDiskId")
    private @Nullable String seedManagedDiskId;

    /**
     * @return Seed managed disk Id.
     * 
     */
    public Optional<String> seedManagedDiskId() {
        return Optional.ofNullable(this.seedManagedDiskId);
    }

    private InMageAzureV2ManagedDiskDetailsResponse() {}

    private InMageAzureV2ManagedDiskDetailsResponse(InMageAzureV2ManagedDiskDetailsResponse $) {
        this.diskId = $.diskId;
        this.replicaDiskType = $.replicaDiskType;
        this.seedManagedDiskId = $.seedManagedDiskId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InMageAzureV2ManagedDiskDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InMageAzureV2ManagedDiskDetailsResponse $;

        public Builder() {
            $ = new InMageAzureV2ManagedDiskDetailsResponse();
        }

        public Builder(InMageAzureV2ManagedDiskDetailsResponse defaults) {
            $ = new InMageAzureV2ManagedDiskDetailsResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param diskId The disk id.
         * 
         * @return builder
         * 
         */
        public Builder diskId(@Nullable String diskId) {
            $.diskId = diskId;
            return this;
        }

        /**
         * @param replicaDiskType The replica disk type.
         * 
         * @return builder
         * 
         */
        public Builder replicaDiskType(@Nullable String replicaDiskType) {
            $.replicaDiskType = replicaDiskType;
            return this;
        }

        /**
         * @param seedManagedDiskId Seed managed disk Id.
         * 
         * @return builder
         * 
         */
        public Builder seedManagedDiskId(@Nullable String seedManagedDiskId) {
            $.seedManagedDiskId = seedManagedDiskId;
            return this;
        }

        public InMageAzureV2ManagedDiskDetailsResponse build() {
            return $;
        }
    }

}
