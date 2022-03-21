// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.timestream.inputs;

import io.pulumi.awsnative.timestream.inputs.MagneticStoreWritePropertiesPropertiesMagneticStoreRejectedDataLocationPropertiesS3ConfigurationPropertiesArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Location to store information about records that were asynchronously rejected during magnetic store writes.
 * 
 */
public final class MagneticStoreWritePropertiesPropertiesMagneticStoreRejectedDataLocationPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final MagneticStoreWritePropertiesPropertiesMagneticStoreRejectedDataLocationPropertiesArgs Empty = new MagneticStoreWritePropertiesPropertiesMagneticStoreRejectedDataLocationPropertiesArgs();

    /**
     * S3 configuration for location to store rejections from magnetic store writes
     * 
     */
    @Import(name="s3Configuration")
      private final @Nullable Output<MagneticStoreWritePropertiesPropertiesMagneticStoreRejectedDataLocationPropertiesS3ConfigurationPropertiesArgs> s3Configuration;

    public Output<MagneticStoreWritePropertiesPropertiesMagneticStoreRejectedDataLocationPropertiesS3ConfigurationPropertiesArgs> getS3Configuration() {
        return this.s3Configuration == null ? Output.empty() : this.s3Configuration;
    }

    public MagneticStoreWritePropertiesPropertiesMagneticStoreRejectedDataLocationPropertiesArgs(@Nullable Output<MagneticStoreWritePropertiesPropertiesMagneticStoreRejectedDataLocationPropertiesS3ConfigurationPropertiesArgs> s3Configuration) {
        this.s3Configuration = s3Configuration;
    }

    private MagneticStoreWritePropertiesPropertiesMagneticStoreRejectedDataLocationPropertiesArgs() {
        this.s3Configuration = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MagneticStoreWritePropertiesPropertiesMagneticStoreRejectedDataLocationPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<MagneticStoreWritePropertiesPropertiesMagneticStoreRejectedDataLocationPropertiesS3ConfigurationPropertiesArgs> s3Configuration;

        public Builder() {
    	      // Empty
        }

        public Builder(MagneticStoreWritePropertiesPropertiesMagneticStoreRejectedDataLocationPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.s3Configuration = defaults.s3Configuration;
        }

        public Builder s3Configuration(@Nullable Output<MagneticStoreWritePropertiesPropertiesMagneticStoreRejectedDataLocationPropertiesS3ConfigurationPropertiesArgs> s3Configuration) {
            this.s3Configuration = s3Configuration;
            return this;
        }
        public Builder s3Configuration(@Nullable MagneticStoreWritePropertiesPropertiesMagneticStoreRejectedDataLocationPropertiesS3ConfigurationPropertiesArgs s3Configuration) {
            this.s3Configuration = Output.ofNullable(s3Configuration);
            return this;
        }        public MagneticStoreWritePropertiesPropertiesMagneticStoreRejectedDataLocationPropertiesArgs build() {
            return new MagneticStoreWritePropertiesPropertiesMagneticStoreRejectedDataLocationPropertiesArgs(s3Configuration);
        }
    }
}
