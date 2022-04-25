// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.storage.k8s.io_v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.storage.k8s.io_v1beta1.outputs.VolumeError;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VolumeAttachmentStatus {
    /**
     * @return The last error encountered during attach operation, if any. This field must only be set by the entity completing the attach operation, i.e. the external-attacher.
     * 
     */
    private final @Nullable VolumeError attachError;
    /**
     * @return Indicates the volume is successfully attached. This field must only be set by the entity completing the attach operation, i.e. the external-attacher.
     * 
     */
    private final Boolean attached;
    /**
     * @return Upon successful attach, this field is populated with any information returned by the attach operation that must be passed into subsequent WaitForAttach or Mount calls. This field must only be set by the entity completing the attach operation, i.e. the external-attacher.
     * 
     */
    private final @Nullable Map<String,String> attachmentMetadata;
    /**
     * @return The last error encountered during detach operation, if any. This field must only be set by the entity completing the detach operation, i.e. the external-attacher.
     * 
     */
    private final @Nullable VolumeError detachError;

    @CustomType.Constructor
    private VolumeAttachmentStatus(
        @CustomType.Parameter("attachError") @Nullable VolumeError attachError,
        @CustomType.Parameter("attached") Boolean attached,
        @CustomType.Parameter("attachmentMetadata") @Nullable Map<String,String> attachmentMetadata,
        @CustomType.Parameter("detachError") @Nullable VolumeError detachError) {
        this.attachError = attachError;
        this.attached = attached;
        this.attachmentMetadata = attachmentMetadata;
        this.detachError = detachError;
    }

    /**
     * @return The last error encountered during attach operation, if any. This field must only be set by the entity completing the attach operation, i.e. the external-attacher.
     * 
     */
    public Optional<VolumeError> attachError() {
        return Optional.ofNullable(this.attachError);
    }
    /**
     * @return Indicates the volume is successfully attached. This field must only be set by the entity completing the attach operation, i.e. the external-attacher.
     * 
     */
    public Boolean attached() {
        return this.attached;
    }
    /**
     * @return Upon successful attach, this field is populated with any information returned by the attach operation that must be passed into subsequent WaitForAttach or Mount calls. This field must only be set by the entity completing the attach operation, i.e. the external-attacher.
     * 
     */
    public Map<String,String> attachmentMetadata() {
        return this.attachmentMetadata == null ? Map.of() : this.attachmentMetadata;
    }
    /**
     * @return The last error encountered during detach operation, if any. This field must only be set by the entity completing the detach operation, i.e. the external-attacher.
     * 
     */
    public Optional<VolumeError> detachError() {
        return Optional.ofNullable(this.detachError);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VolumeAttachmentStatus defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable VolumeError attachError;
        private Boolean attached;
        private @Nullable Map<String,String> attachmentMetadata;
        private @Nullable VolumeError detachError;

        public Builder() {
    	      // Empty
        }

        public Builder(VolumeAttachmentStatus defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attachError = defaults.attachError;
    	      this.attached = defaults.attached;
    	      this.attachmentMetadata = defaults.attachmentMetadata;
    	      this.detachError = defaults.detachError;
        }

        public Builder attachError(@Nullable VolumeError attachError) {
            this.attachError = attachError;
            return this;
        }
        public Builder attached(Boolean attached) {
            this.attached = Objects.requireNonNull(attached);
            return this;
        }
        public Builder attachmentMetadata(@Nullable Map<String,String> attachmentMetadata) {
            this.attachmentMetadata = attachmentMetadata;
            return this;
        }
        public Builder detachError(@Nullable VolumeError detachError) {
            this.detachError = detachError;
            return this;
        }        public VolumeAttachmentStatus build() {
            return new VolumeAttachmentStatus(attachError, attached, attachmentMetadata, detachError);
        }
    }
}
