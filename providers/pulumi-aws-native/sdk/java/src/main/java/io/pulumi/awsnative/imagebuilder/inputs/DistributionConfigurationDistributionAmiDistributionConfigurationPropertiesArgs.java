// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.imagebuilder.inputs;

import io.pulumi.awsnative.imagebuilder.inputs.DistributionConfigurationDistributionAmiDistributionConfigurationPropertiesLaunchPermissionConfigurationPropertiesArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The specific AMI settings (for example, launch permissions, AMI tags).
 * 
 */
public final class DistributionConfigurationDistributionAmiDistributionConfigurationPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final DistributionConfigurationDistributionAmiDistributionConfigurationPropertiesArgs Empty = new DistributionConfigurationDistributionAmiDistributionConfigurationPropertiesArgs();

    /**
     * The tags to apply to AMIs distributed to this Region.
     * 
     */
    @Import(name="amiTags")
      private final @Nullable Output<Object> amiTags;

    public Output<Object> getAmiTags() {
        return this.amiTags == null ? Output.empty() : this.amiTags;
    }

    /**
     * The description of the AMI distribution configuration.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * The KMS key identifier used to encrypt the distributed image.
     * 
     */
    @Import(name="kmsKeyId")
      private final @Nullable Output<String> kmsKeyId;

    public Output<String> getKmsKeyId() {
        return this.kmsKeyId == null ? Output.empty() : this.kmsKeyId;
    }

    /**
     * Launch permissions can be used to configure which AWS accounts can use the AMI to launch instances.
     * 
     */
    @Import(name="launchPermissionConfiguration")
      private final @Nullable Output<DistributionConfigurationDistributionAmiDistributionConfigurationPropertiesLaunchPermissionConfigurationPropertiesArgs> launchPermissionConfiguration;

    public Output<DistributionConfigurationDistributionAmiDistributionConfigurationPropertiesLaunchPermissionConfigurationPropertiesArgs> getLaunchPermissionConfiguration() {
        return this.launchPermissionConfiguration == null ? Output.empty() : this.launchPermissionConfiguration;
    }

    /**
     * The name of the AMI distribution configuration.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * The ID of accounts to which you want to distribute an image.
     * 
     */
    @Import(name="targetAccountIds")
      private final @Nullable Output<List<String>> targetAccountIds;

    public Output<List<String>> getTargetAccountIds() {
        return this.targetAccountIds == null ? Output.empty() : this.targetAccountIds;
    }

    public DistributionConfigurationDistributionAmiDistributionConfigurationPropertiesArgs(
        @Nullable Output<Object> amiTags,
        @Nullable Output<String> description,
        @Nullable Output<String> kmsKeyId,
        @Nullable Output<DistributionConfigurationDistributionAmiDistributionConfigurationPropertiesLaunchPermissionConfigurationPropertiesArgs> launchPermissionConfiguration,
        @Nullable Output<String> name,
        @Nullable Output<List<String>> targetAccountIds) {
        this.amiTags = amiTags;
        this.description = description;
        this.kmsKeyId = kmsKeyId;
        this.launchPermissionConfiguration = launchPermissionConfiguration;
        this.name = name;
        this.targetAccountIds = targetAccountIds;
    }

    private DistributionConfigurationDistributionAmiDistributionConfigurationPropertiesArgs() {
        this.amiTags = Output.empty();
        this.description = Output.empty();
        this.kmsKeyId = Output.empty();
        this.launchPermissionConfiguration = Output.empty();
        this.name = Output.empty();
        this.targetAccountIds = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionConfigurationDistributionAmiDistributionConfigurationPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Object> amiTags;
        private @Nullable Output<String> description;
        private @Nullable Output<String> kmsKeyId;
        private @Nullable Output<DistributionConfigurationDistributionAmiDistributionConfigurationPropertiesLaunchPermissionConfigurationPropertiesArgs> launchPermissionConfiguration;
        private @Nullable Output<String> name;
        private @Nullable Output<List<String>> targetAccountIds;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionConfigurationDistributionAmiDistributionConfigurationPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.amiTags = defaults.amiTags;
    	      this.description = defaults.description;
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.launchPermissionConfiguration = defaults.launchPermissionConfiguration;
    	      this.name = defaults.name;
    	      this.targetAccountIds = defaults.targetAccountIds;
        }

        public Builder amiTags(@Nullable Output<Object> amiTags) {
            this.amiTags = amiTags;
            return this;
        }
        public Builder amiTags(@Nullable Object amiTags) {
            this.amiTags = Output.ofNullable(amiTags);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }
        public Builder kmsKeyId(@Nullable Output<String> kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }
        public Builder kmsKeyId(@Nullable String kmsKeyId) {
            this.kmsKeyId = Output.ofNullable(kmsKeyId);
            return this;
        }
        public Builder launchPermissionConfiguration(@Nullable Output<DistributionConfigurationDistributionAmiDistributionConfigurationPropertiesLaunchPermissionConfigurationPropertiesArgs> launchPermissionConfiguration) {
            this.launchPermissionConfiguration = launchPermissionConfiguration;
            return this;
        }
        public Builder launchPermissionConfiguration(@Nullable DistributionConfigurationDistributionAmiDistributionConfigurationPropertiesLaunchPermissionConfigurationPropertiesArgs launchPermissionConfiguration) {
            this.launchPermissionConfiguration = Output.ofNullable(launchPermissionConfiguration);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public Builder targetAccountIds(@Nullable Output<List<String>> targetAccountIds) {
            this.targetAccountIds = targetAccountIds;
            return this;
        }
        public Builder targetAccountIds(@Nullable List<String> targetAccountIds) {
            this.targetAccountIds = Output.ofNullable(targetAccountIds);
            return this;
        }
        public Builder targetAccountIds(String... targetAccountIds) {
            return targetAccountIds(List.of(targetAccountIds));
        }        public DistributionConfigurationDistributionAmiDistributionConfigurationPropertiesArgs build() {
            return new DistributionConfigurationDistributionAmiDistributionConfigurationPropertiesArgs(amiTags, description, kmsKeyId, launchPermissionConfiguration, name, targetAccountIds);
        }
    }
}
