// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.imagebuilder.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Launch permissions can be used to configure which AWS accounts can use the AMI to launch instances.
 * 
 */
public final class DistributionConfigurationDistributionAmiDistributionConfigurationPropertiesLaunchPermissionConfigurationProperties extends io.pulumi.resources.InvokeArgs {

    public static final DistributionConfigurationDistributionAmiDistributionConfigurationPropertiesLaunchPermissionConfigurationProperties Empty = new DistributionConfigurationDistributionAmiDistributionConfigurationPropertiesLaunchPermissionConfigurationProperties();

    /**
     * The ARN for an Amazon Web Services Organization that you want to share your AMI with.
     * 
     */
    @InputImport(name="organizationArns")
    private final @Nullable List<String> organizationArns;

    public List<String> getOrganizationArns() {
        return this.organizationArns == null ? List.of() : this.organizationArns;
    }

    /**
     * The ARN for an Organizations organizational unit (OU) that you want to share your AMI with.
     * 
     */
    @InputImport(name="organizationalUnitArns")
    private final @Nullable List<String> organizationalUnitArns;

    public List<String> getOrganizationalUnitArns() {
        return this.organizationalUnitArns == null ? List.of() : this.organizationalUnitArns;
    }

    /**
     * The name of the group.
     * 
     */
    @InputImport(name="userGroups")
    private final @Nullable List<String> userGroups;

    public List<String> getUserGroups() {
        return this.userGroups == null ? List.of() : this.userGroups;
    }

    /**
     * The AWS account ID.
     * 
     */
    @InputImport(name="userIds")
    private final @Nullable List<String> userIds;

    public List<String> getUserIds() {
        return this.userIds == null ? List.of() : this.userIds;
    }

    public DistributionConfigurationDistributionAmiDistributionConfigurationPropertiesLaunchPermissionConfigurationProperties(
        @Nullable List<String> organizationArns,
        @Nullable List<String> organizationalUnitArns,
        @Nullable List<String> userGroups,
        @Nullable List<String> userIds) {
        this.organizationArns = organizationArns;
        this.organizationalUnitArns = organizationalUnitArns;
        this.userGroups = userGroups;
        this.userIds = userIds;
    }

    private DistributionConfigurationDistributionAmiDistributionConfigurationPropertiesLaunchPermissionConfigurationProperties() {
        this.organizationArns = List.of();
        this.organizationalUnitArns = List.of();
        this.userGroups = List.of();
        this.userIds = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionConfigurationDistributionAmiDistributionConfigurationPropertiesLaunchPermissionConfigurationProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> organizationArns;
        private @Nullable List<String> organizationalUnitArns;
        private @Nullable List<String> userGroups;
        private @Nullable List<String> userIds;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionConfigurationDistributionAmiDistributionConfigurationPropertiesLaunchPermissionConfigurationProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.organizationArns = defaults.organizationArns;
    	      this.organizationalUnitArns = defaults.organizationalUnitArns;
    	      this.userGroups = defaults.userGroups;
    	      this.userIds = defaults.userIds;
        }

        public Builder setOrganizationArns(@Nullable List<String> organizationArns) {
            this.organizationArns = organizationArns;
            return this;
        }

        public Builder setOrganizationalUnitArns(@Nullable List<String> organizationalUnitArns) {
            this.organizationalUnitArns = organizationalUnitArns;
            return this;
        }

        public Builder setUserGroups(@Nullable List<String> userGroups) {
            this.userGroups = userGroups;
            return this;
        }

        public Builder setUserIds(@Nullable List<String> userIds) {
            this.userIds = userIds;
            return this;
        }

        public DistributionConfigurationDistributionAmiDistributionConfigurationPropertiesLaunchPermissionConfigurationProperties build() {
            return new DistributionConfigurationDistributionAmiDistributionConfigurationPropertiesLaunchPermissionConfigurationProperties(organizationArns, organizationalUnitArns, userGroups, userIds);
        }
    }
}
