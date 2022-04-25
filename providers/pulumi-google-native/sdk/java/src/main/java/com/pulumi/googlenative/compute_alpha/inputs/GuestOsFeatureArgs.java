// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute_alpha.enums.GuestOsFeatureType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Guest OS features.
 * 
 */
public final class GuestOsFeatureArgs extends com.pulumi.resources.ResourceArgs {

    public static final GuestOsFeatureArgs Empty = new GuestOsFeatureArgs();

    /**
     * The ID of a supported feature. To add multiple values, use commas to separate values. Set to one or more of the following values: - VIRTIO_SCSI_MULTIQUEUE - WINDOWS - MULTI_IP_SUBNET - UEFI_COMPATIBLE - SECURE_BOOT - GVNIC - SEV_CAPABLE - SUSPEND_RESUME_COMPATIBLE For more information, see Enabling guest operating system features.
     * 
     */
    @Import(name="type")
    private @Nullable Output<GuestOsFeatureType> type;

    /**
     * @return The ID of a supported feature. To add multiple values, use commas to separate values. Set to one or more of the following values: - VIRTIO_SCSI_MULTIQUEUE - WINDOWS - MULTI_IP_SUBNET - UEFI_COMPATIBLE - SECURE_BOOT - GVNIC - SEV_CAPABLE - SUSPEND_RESUME_COMPATIBLE For more information, see Enabling guest operating system features.
     * 
     */
    public Optional<Output<GuestOsFeatureType>> type() {
        return Optional.ofNullable(this.type);
    }

    private GuestOsFeatureArgs() {}

    private GuestOsFeatureArgs(GuestOsFeatureArgs $) {
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GuestOsFeatureArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GuestOsFeatureArgs $;

        public Builder() {
            $ = new GuestOsFeatureArgs();
        }

        public Builder(GuestOsFeatureArgs defaults) {
            $ = new GuestOsFeatureArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param type The ID of a supported feature. To add multiple values, use commas to separate values. Set to one or more of the following values: - VIRTIO_SCSI_MULTIQUEUE - WINDOWS - MULTI_IP_SUBNET - UEFI_COMPATIBLE - SECURE_BOOT - GVNIC - SEV_CAPABLE - SUSPEND_RESUME_COMPATIBLE For more information, see Enabling guest operating system features.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<GuestOsFeatureType> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The ID of a supported feature. To add multiple values, use commas to separate values. Set to one or more of the following values: - VIRTIO_SCSI_MULTIQUEUE - WINDOWS - MULTI_IP_SUBNET - UEFI_COMPATIBLE - SECURE_BOOT - GVNIC - SEV_CAPABLE - SUSPEND_RESUME_COMPATIBLE For more information, see Enabling guest operating system features.
         * 
         * @return builder
         * 
         */
        public Builder type(GuestOsFeatureType type) {
            return type(Output.of(type));
        }

        public GuestOsFeatureArgs build() {
            return $;
        }
    }

}
