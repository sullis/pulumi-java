// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.imagebuilder.outputs;

import com.pulumi.aws.imagebuilder.outputs.GetDistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermission;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetDistributionConfigurationDistributionAmiDistributionConfiguration {
    /**
     * @return Key-value map of tags to apply to distributed AMI.
     * 
     */
    private final Map<String,String> amiTags;
    /**
     * @return Description to apply to distributed AMI.
     * 
     */
    private final String description;
    /**
     * @return Amazon Resource Name (ARN) of Key Management Service (KMS) Key to encrypt AMI.
     * 
     */
    private final String kmsKeyId;
    /**
     * @return Nested list of EC2 launch permissions.
     * 
     */
    private final List<GetDistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermission> launchPermissions;
    /**
     * @return Name of the distribution configuration.
     * 
     */
    private final String name;
    /**
     * @return Set of target AWS Account identifiers.
     * 
     */
    private final List<String> targetAccountIds;

    @CustomType.Constructor
    private GetDistributionConfigurationDistributionAmiDistributionConfiguration(
        @CustomType.Parameter("amiTags") Map<String,String> amiTags,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("kmsKeyId") String kmsKeyId,
        @CustomType.Parameter("launchPermissions") List<GetDistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermission> launchPermissions,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("targetAccountIds") List<String> targetAccountIds) {
        this.amiTags = amiTags;
        this.description = description;
        this.kmsKeyId = kmsKeyId;
        this.launchPermissions = launchPermissions;
        this.name = name;
        this.targetAccountIds = targetAccountIds;
    }

    /**
     * @return Key-value map of tags to apply to distributed AMI.
     * 
     */
    public Map<String,String> amiTags() {
        return this.amiTags;
    }
    /**
     * @return Description to apply to distributed AMI.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return Amazon Resource Name (ARN) of Key Management Service (KMS) Key to encrypt AMI.
     * 
     */
    public String kmsKeyId() {
        return this.kmsKeyId;
    }
    /**
     * @return Nested list of EC2 launch permissions.
     * 
     */
    public List<GetDistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermission> launchPermissions() {
        return this.launchPermissions;
    }
    /**
     * @return Name of the distribution configuration.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Set of target AWS Account identifiers.
     * 
     */
    public List<String> targetAccountIds() {
        return this.targetAccountIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDistributionConfigurationDistributionAmiDistributionConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> amiTags;
        private String description;
        private String kmsKeyId;
        private List<GetDistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermission> launchPermissions;
        private String name;
        private List<String> targetAccountIds;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDistributionConfigurationDistributionAmiDistributionConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.amiTags = defaults.amiTags;
    	      this.description = defaults.description;
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.launchPermissions = defaults.launchPermissions;
    	      this.name = defaults.name;
    	      this.targetAccountIds = defaults.targetAccountIds;
        }

        public Builder amiTags(Map<String,String> amiTags) {
            this.amiTags = Objects.requireNonNull(amiTags);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder kmsKeyId(String kmsKeyId) {
            this.kmsKeyId = Objects.requireNonNull(kmsKeyId);
            return this;
        }
        public Builder launchPermissions(List<GetDistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermission> launchPermissions) {
            this.launchPermissions = Objects.requireNonNull(launchPermissions);
            return this;
        }
        public Builder launchPermissions(GetDistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermission... launchPermissions) {
            return launchPermissions(List.of(launchPermissions));
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder targetAccountIds(List<String> targetAccountIds) {
            this.targetAccountIds = Objects.requireNonNull(targetAccountIds);
            return this;
        }
        public Builder targetAccountIds(String... targetAccountIds) {
            return targetAccountIds(List.of(targetAccountIds));
        }        public GetDistributionConfigurationDistributionAmiDistributionConfiguration build() {
            return new GetDistributionConfigurationDistributionAmiDistributionConfiguration(amiTags, description, kmsKeyId, launchPermissions, name, targetAccountIds);
        }
    }
}
