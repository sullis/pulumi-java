// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.imagebuilder.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class DistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermission {
    /**
     * @return Set of EC2 launch permission user groups to assign. Use `all` to distribute a public AMI.
     * 
     */
    private final @Nullable List<String> userGroups;
    /**
     * @return Set of AWS Account identifiers to assign.
     * 
     */
    private final @Nullable List<String> userIds;

    @CustomType.Constructor
    private DistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermission(
        @CustomType.Parameter("userGroups") @Nullable List<String> userGroups,
        @CustomType.Parameter("userIds") @Nullable List<String> userIds) {
        this.userGroups = userGroups;
        this.userIds = userIds;
    }

    /**
     * @return Set of EC2 launch permission user groups to assign. Use `all` to distribute a public AMI.
     * 
     */
    public List<String> userGroups() {
        return this.userGroups == null ? List.of() : this.userGroups;
    }
    /**
     * @return Set of AWS Account identifiers to assign.
     * 
     */
    public List<String> userIds() {
        return this.userIds == null ? List.of() : this.userIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermission defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> userGroups;
        private @Nullable List<String> userIds;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermission defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.userGroups = defaults.userGroups;
    	      this.userIds = defaults.userIds;
        }

        public Builder userGroups(@Nullable List<String> userGroups) {
            this.userGroups = userGroups;
            return this;
        }
        public Builder userGroups(String... userGroups) {
            return userGroups(List.of(userGroups));
        }
        public Builder userIds(@Nullable List<String> userIds) {
            this.userIds = userIds;
            return this;
        }
        public Builder userIds(String... userIds) {
            return userIds(List.of(userIds));
        }        public DistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermission build() {
            return new DistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermission(userGroups, userIds);
        }
    }
}
