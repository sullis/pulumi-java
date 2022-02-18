// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ImageDiskReferenceResponse {
    /**
     * A relative uri containing either a Platform Image Repository or user image reference.
     * 
     */
    private final String id;
    /**
     * If the disk is created from an image's data disk, this is an index that indicates which of the data disks in the image to use. For OS disks, this field is null.
     * 
     */
    private final @Nullable Integer lun;

    @OutputCustomType.Constructor({"id","lun"})
    private ImageDiskReferenceResponse(
        String id,
        @Nullable Integer lun) {
        this.id = Objects.requireNonNull(id);
        this.lun = lun;
    }

    /**
     * A relative uri containing either a Platform Image Repository or user image reference.
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * If the disk is created from an image's data disk, this is an index that indicates which of the data disks in the image to use. For OS disks, this field is null.
     * 
     */
    public Optional<Integer> getLun() {
        return Optional.ofNullable(this.lun);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImageDiskReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private @Nullable Integer lun;

        public Builder() {
    	      // Empty
        }

        public Builder(ImageDiskReferenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.lun = defaults.lun;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLun(@Nullable Integer lun) {
            this.lun = lun;
            return this;
        }

        public ImageDiskReferenceResponse build() {
            return new ImageDiskReferenceResponse(id, lun);
        }
    }
}
