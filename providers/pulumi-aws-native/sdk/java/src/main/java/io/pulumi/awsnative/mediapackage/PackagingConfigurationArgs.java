// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.mediapackage;

import io.pulumi.awsnative.mediapackage.inputs.PackagingConfigurationCmafPackageArgs;
import io.pulumi.awsnative.mediapackage.inputs.PackagingConfigurationDashPackageArgs;
import io.pulumi.awsnative.mediapackage.inputs.PackagingConfigurationHlsPackageArgs;
import io.pulumi.awsnative.mediapackage.inputs.PackagingConfigurationMssPackageArgs;
import io.pulumi.awsnative.mediapackage.inputs.PackagingConfigurationTagArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PackagingConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final PackagingConfigurationArgs Empty = new PackagingConfigurationArgs();

    /**
     * A CMAF packaging configuration.
     * 
     */
    @Import(name="cmafPackage")
      private final @Nullable Output<PackagingConfigurationCmafPackageArgs> cmafPackage;

    public Output<PackagingConfigurationCmafPackageArgs> cmafPackage() {
        return this.cmafPackage == null ? Codegen.empty() : this.cmafPackage;
    }

    /**
     * A Dynamic Adaptive Streaming over HTTP (DASH) packaging configuration.
     * 
     */
    @Import(name="dashPackage")
      private final @Nullable Output<PackagingConfigurationDashPackageArgs> dashPackage;

    public Output<PackagingConfigurationDashPackageArgs> dashPackage() {
        return this.dashPackage == null ? Codegen.empty() : this.dashPackage;
    }

    /**
     * An HTTP Live Streaming (HLS) packaging configuration.
     * 
     */
    @Import(name="hlsPackage")
      private final @Nullable Output<PackagingConfigurationHlsPackageArgs> hlsPackage;

    public Output<PackagingConfigurationHlsPackageArgs> hlsPackage() {
        return this.hlsPackage == null ? Codegen.empty() : this.hlsPackage;
    }

    /**
     * A Microsoft Smooth Streaming (MSS) PackagingConfiguration.
     * 
     */
    @Import(name="mssPackage")
      private final @Nullable Output<PackagingConfigurationMssPackageArgs> mssPackage;

    public Output<PackagingConfigurationMssPackageArgs> mssPackage() {
        return this.mssPackage == null ? Codegen.empty() : this.mssPackage;
    }

    /**
     * The ID of a PackagingGroup.
     * 
     */
    @Import(name="packagingGroupId", required=true)
      private final Output<String> packagingGroupId;

    public Output<String> packagingGroupId() {
        return this.packagingGroupId;
    }

    /**
     * A collection of tags associated with a resource
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<List<PackagingConfigurationTagArgs>> tags;

    public Output<List<PackagingConfigurationTagArgs>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public PackagingConfigurationArgs(
        @Nullable Output<PackagingConfigurationCmafPackageArgs> cmafPackage,
        @Nullable Output<PackagingConfigurationDashPackageArgs> dashPackage,
        @Nullable Output<PackagingConfigurationHlsPackageArgs> hlsPackage,
        @Nullable Output<PackagingConfigurationMssPackageArgs> mssPackage,
        Output<String> packagingGroupId,
        @Nullable Output<List<PackagingConfigurationTagArgs>> tags) {
        this.cmafPackage = cmafPackage;
        this.dashPackage = dashPackage;
        this.hlsPackage = hlsPackage;
        this.mssPackage = mssPackage;
        this.packagingGroupId = Objects.requireNonNull(packagingGroupId, "expected parameter 'packagingGroupId' to be non-null");
        this.tags = tags;
    }

    private PackagingConfigurationArgs() {
        this.cmafPackage = Codegen.empty();
        this.dashPackage = Codegen.empty();
        this.hlsPackage = Codegen.empty();
        this.mssPackage = Codegen.empty();
        this.packagingGroupId = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PackagingConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<PackagingConfigurationCmafPackageArgs> cmafPackage;
        private @Nullable Output<PackagingConfigurationDashPackageArgs> dashPackage;
        private @Nullable Output<PackagingConfigurationHlsPackageArgs> hlsPackage;
        private @Nullable Output<PackagingConfigurationMssPackageArgs> mssPackage;
        private Output<String> packagingGroupId;
        private @Nullable Output<List<PackagingConfigurationTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(PackagingConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cmafPackage = defaults.cmafPackage;
    	      this.dashPackage = defaults.dashPackage;
    	      this.hlsPackage = defaults.hlsPackage;
    	      this.mssPackage = defaults.mssPackage;
    	      this.packagingGroupId = defaults.packagingGroupId;
    	      this.tags = defaults.tags;
        }

        public Builder cmafPackage(@Nullable Output<PackagingConfigurationCmafPackageArgs> cmafPackage) {
            this.cmafPackage = cmafPackage;
            return this;
        }
        public Builder cmafPackage(@Nullable PackagingConfigurationCmafPackageArgs cmafPackage) {
            this.cmafPackage = Codegen.ofNullable(cmafPackage);
            return this;
        }
        public Builder dashPackage(@Nullable Output<PackagingConfigurationDashPackageArgs> dashPackage) {
            this.dashPackage = dashPackage;
            return this;
        }
        public Builder dashPackage(@Nullable PackagingConfigurationDashPackageArgs dashPackage) {
            this.dashPackage = Codegen.ofNullable(dashPackage);
            return this;
        }
        public Builder hlsPackage(@Nullable Output<PackagingConfigurationHlsPackageArgs> hlsPackage) {
            this.hlsPackage = hlsPackage;
            return this;
        }
        public Builder hlsPackage(@Nullable PackagingConfigurationHlsPackageArgs hlsPackage) {
            this.hlsPackage = Codegen.ofNullable(hlsPackage);
            return this;
        }
        public Builder mssPackage(@Nullable Output<PackagingConfigurationMssPackageArgs> mssPackage) {
            this.mssPackage = mssPackage;
            return this;
        }
        public Builder mssPackage(@Nullable PackagingConfigurationMssPackageArgs mssPackage) {
            this.mssPackage = Codegen.ofNullable(mssPackage);
            return this;
        }
        public Builder packagingGroupId(Output<String> packagingGroupId) {
            this.packagingGroupId = Objects.requireNonNull(packagingGroupId);
            return this;
        }
        public Builder packagingGroupId(String packagingGroupId) {
            this.packagingGroupId = Output.of(Objects.requireNonNull(packagingGroupId));
            return this;
        }
        public Builder tags(@Nullable Output<List<PackagingConfigurationTagArgs>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable List<PackagingConfigurationTagArgs> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tags(PackagingConfigurationTagArgs... tags) {
            return tags(List.of(tags));
        }        public PackagingConfigurationArgs build() {
            return new PackagingConfigurationArgs(cmafPackage, dashPackage, hlsPackage, mssPackage, packagingGroupId, tags);
        }
    }
}
