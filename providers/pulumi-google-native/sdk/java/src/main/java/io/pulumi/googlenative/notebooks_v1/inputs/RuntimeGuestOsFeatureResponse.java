// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.notebooks_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Optional. A list of features to enable on the guest operating system. Applicable only for bootable images. Read [Enabling guest operating system features](https://cloud.google.com/compute/docs/images/create-delete-deprecate-private-images#guest-os-features) to see a list of available options. Guest OS features for boot disk.
 * 
 */
public final class RuntimeGuestOsFeatureResponse extends io.pulumi.resources.InvokeArgs {

    public static final RuntimeGuestOsFeatureResponse Empty = new RuntimeGuestOsFeatureResponse();

    /**
     * The ID of a supported feature. Read [Enabling guest operating system features](https://cloud.google.com/compute/docs/images/create-delete-deprecate-private-images#guest-os-features) to see a list of available options. Valid values: * FEATURE_TYPE_UNSPECIFIED * MULTI_IP_SUBNET * SECURE_BOOT * UEFI_COMPATIBLE * VIRTIO_SCSI_MULTIQUEUE * WINDOWS
     * 
     */
    @InputImport(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    public RuntimeGuestOsFeatureResponse(String type) {
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private RuntimeGuestOsFeatureResponse() {
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuntimeGuestOsFeatureResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(RuntimeGuestOsFeatureResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public RuntimeGuestOsFeatureResponse build() {
            return new RuntimeGuestOsFeatureResponse(type);
        }
    }
}