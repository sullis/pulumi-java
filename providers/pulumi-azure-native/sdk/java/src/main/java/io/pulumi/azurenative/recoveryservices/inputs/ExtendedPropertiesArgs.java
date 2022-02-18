// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.azurenative.recoveryservices.inputs.DiskExclusionPropertiesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Extended Properties for Azure IaasVM Backup.
 * 
 */
public final class ExtendedPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final ExtendedPropertiesArgs Empty = new ExtendedPropertiesArgs();

    /**
     * Extended Properties for Disk Exclusion.
     * 
     */
    @InputImport(name="diskExclusionProperties")
    private final @Nullable Input<DiskExclusionPropertiesArgs> diskExclusionProperties;

    public Input<DiskExclusionPropertiesArgs> getDiskExclusionProperties() {
        return this.diskExclusionProperties == null ? Input.empty() : this.diskExclusionProperties;
    }

    public ExtendedPropertiesArgs(@Nullable Input<DiskExclusionPropertiesArgs> diskExclusionProperties) {
        this.diskExclusionProperties = diskExclusionProperties;
    }

    private ExtendedPropertiesArgs() {
        this.diskExclusionProperties = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExtendedPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<DiskExclusionPropertiesArgs> diskExclusionProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(ExtendedPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskExclusionProperties = defaults.diskExclusionProperties;
        }

        public Builder setDiskExclusionProperties(@Nullable Input<DiskExclusionPropertiesArgs> diskExclusionProperties) {
            this.diskExclusionProperties = diskExclusionProperties;
            return this;
        }

        public Builder setDiskExclusionProperties(@Nullable DiskExclusionPropertiesArgs diskExclusionProperties) {
            this.diskExclusionProperties = Input.ofNullable(diskExclusionProperties);
            return this;
        }

        public ExtendedPropertiesArgs build() {
            return new ExtendedPropertiesArgs(diskExclusionProperties);
        }
    }
}
