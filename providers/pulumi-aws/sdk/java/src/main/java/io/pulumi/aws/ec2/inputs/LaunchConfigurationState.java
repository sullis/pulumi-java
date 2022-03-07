// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.aws.ec2.inputs.LaunchConfigurationEbsBlockDeviceGetArgs;
import io.pulumi.aws.ec2.inputs.LaunchConfigurationEphemeralBlockDeviceGetArgs;
import io.pulumi.aws.ec2.inputs.LaunchConfigurationMetadataOptionsGetArgs;
import io.pulumi.aws.ec2.inputs.LaunchConfigurationRootBlockDeviceGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LaunchConfigurationState extends io.pulumi.resources.ResourceArgs {

    public static final LaunchConfigurationState Empty = new LaunchConfigurationState();

    /**
     * The Amazon Resource Name of the launch configuration.
     * 
     */
    @InputImport(name="arn")
      private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * Associate a public ip address with an instance in a VPC.
     * 
     */
    @InputImport(name="associatePublicIpAddress")
      private final @Nullable Input<Boolean> associatePublicIpAddress;

    public Input<Boolean> getAssociatePublicIpAddress() {
        return this.associatePublicIpAddress == null ? Input.empty() : this.associatePublicIpAddress;
    }

    /**
     * Additional EBS block devices to attach to the
     * instance.  See Block Devices below for details.
     * 
     */
    @InputImport(name="ebsBlockDevices")
      private final @Nullable Input<List<LaunchConfigurationEbsBlockDeviceGetArgs>> ebsBlockDevices;

    public Input<List<LaunchConfigurationEbsBlockDeviceGetArgs>> getEbsBlockDevices() {
        return this.ebsBlockDevices == null ? Input.empty() : this.ebsBlockDevices;
    }

    /**
     * If true, the launched EC2 instance will be EBS-optimized.
     * 
     */
    @InputImport(name="ebsOptimized")
      private final @Nullable Input<Boolean> ebsOptimized;

    public Input<Boolean> getEbsOptimized() {
        return this.ebsOptimized == null ? Input.empty() : this.ebsOptimized;
    }

    /**
     * Enables/disables detailed monitoring. This is enabled by default.
     * 
     */
    @InputImport(name="enableMonitoring")
      private final @Nullable Input<Boolean> enableMonitoring;

    public Input<Boolean> getEnableMonitoring() {
        return this.enableMonitoring == null ? Input.empty() : this.enableMonitoring;
    }

    /**
     * Customize Ephemeral (also known as
     * "Instance Store") volumes on the instance. See Block Devices below for details.
     * 
     */
    @InputImport(name="ephemeralBlockDevices")
      private final @Nullable Input<List<LaunchConfigurationEphemeralBlockDeviceGetArgs>> ephemeralBlockDevices;

    public Input<List<LaunchConfigurationEphemeralBlockDeviceGetArgs>> getEphemeralBlockDevices() {
        return this.ephemeralBlockDevices == null ? Input.empty() : this.ephemeralBlockDevices;
    }

    /**
     * The name attribute of the IAM instance profile to associate
     * with launched instances.
     * 
     */
    @InputImport(name="iamInstanceProfile")
      private final @Nullable Input<String> iamInstanceProfile;

    public Input<String> getIamInstanceProfile() {
        return this.iamInstanceProfile == null ? Input.empty() : this.iamInstanceProfile;
    }

    /**
     * The EC2 image ID to launch.
     * 
     */
    @InputImport(name="imageId")
      private final @Nullable Input<String> imageId;

    public Input<String> getImageId() {
        return this.imageId == null ? Input.empty() : this.imageId;
    }

    /**
     * The size of instance to launch.
     * 
     */
    @InputImport(name="instanceType")
      private final @Nullable Input<String> instanceType;

    public Input<String> getInstanceType() {
        return this.instanceType == null ? Input.empty() : this.instanceType;
    }

    /**
     * The key name that should be used for the instance.
     * 
     */
    @InputImport(name="keyName")
      private final @Nullable Input<String> keyName;

    public Input<String> getKeyName() {
        return this.keyName == null ? Input.empty() : this.keyName;
    }

    /**
     * The metadata options for the instance.
     * 
     */
    @InputImport(name="metadataOptions")
      private final @Nullable Input<LaunchConfigurationMetadataOptionsGetArgs> metadataOptions;

    public Input<LaunchConfigurationMetadataOptionsGetArgs> getMetadataOptions() {
        return this.metadataOptions == null ? Input.empty() : this.metadataOptions;
    }

    /**
     * The name of the launch configuration. If you leave
     * this blank, this provider will auto-generate a unique name. Conflicts with `name_prefix`.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Creates a unique name beginning with the specified
     * prefix. Conflicts with `name`.
     * 
     */
    @InputImport(name="namePrefix")
      private final @Nullable Input<String> namePrefix;

    public Input<String> getNamePrefix() {
        return this.namePrefix == null ? Input.empty() : this.namePrefix;
    }

    /**
     * The tenancy of the instance. Valid values are
     * `"default"` or `"dedicated"`, see [AWS's Create Launch Configuration](http://docs.aws.amazon.com/AutoScaling/latest/APIReference/API_CreateLaunchConfiguration.html)
     * for more details
     * 
     */
    @InputImport(name="placementTenancy")
      private final @Nullable Input<String> placementTenancy;

    public Input<String> getPlacementTenancy() {
        return this.placementTenancy == null ? Input.empty() : this.placementTenancy;
    }

    /**
     * Customize details about the root block
     * device of the instance. See Block Devices below for details.
     * 
     */
    @InputImport(name="rootBlockDevice")
      private final @Nullable Input<LaunchConfigurationRootBlockDeviceGetArgs> rootBlockDevice;

    public Input<LaunchConfigurationRootBlockDeviceGetArgs> getRootBlockDevice() {
        return this.rootBlockDevice == null ? Input.empty() : this.rootBlockDevice;
    }

    /**
     * A list of associated security group IDS.
     * 
     */
    @InputImport(name="securityGroups")
      private final @Nullable Input<List<String>> securityGroups;

    public Input<List<String>> getSecurityGroups() {
        return this.securityGroups == null ? Input.empty() : this.securityGroups;
    }

    /**
     * The maximum price to use for reserving spot instances.
     * 
     */
    @InputImport(name="spotPrice")
      private final @Nullable Input<String> spotPrice;

    public Input<String> getSpotPrice() {
        return this.spotPrice == null ? Input.empty() : this.spotPrice;
    }

    /**
     * The user data to provide when launching the instance. Do not pass gzip-compressed data via this argument; see `user_data_base64` instead.
     * 
     */
    @InputImport(name="userData")
      private final @Nullable Input<String> userData;

    public Input<String> getUserData() {
        return this.userData == null ? Input.empty() : this.userData;
    }

    /**
     * Can be used instead of `user_data` to pass base64-encoded binary data directly. Use this instead of `user_data` whenever the value is not a valid UTF-8 string. For example, gzip-encoded user data must be base64-encoded and passed via this argument to avoid corruption.
     * 
     */
    @InputImport(name="userDataBase64")
      private final @Nullable Input<String> userDataBase64;

    public Input<String> getUserDataBase64() {
        return this.userDataBase64 == null ? Input.empty() : this.userDataBase64;
    }

    /**
     * The ID of a ClassicLink-enabled VPC. Only applies to EC2-Classic instances. (eg. `vpc-2730681a`)
     * 
     */
    @InputImport(name="vpcClassicLinkId")
      private final @Nullable Input<String> vpcClassicLinkId;

    public Input<String> getVpcClassicLinkId() {
        return this.vpcClassicLinkId == null ? Input.empty() : this.vpcClassicLinkId;
    }

    /**
     * The IDs of one or more security groups for the specified ClassicLink-enabled VPC (eg. `sg-46ae3d11`).
     * 
     */
    @InputImport(name="vpcClassicLinkSecurityGroups")
      private final @Nullable Input<List<String>> vpcClassicLinkSecurityGroups;

    public Input<List<String>> getVpcClassicLinkSecurityGroups() {
        return this.vpcClassicLinkSecurityGroups == null ? Input.empty() : this.vpcClassicLinkSecurityGroups;
    }

    public LaunchConfigurationState(
        @Nullable Input<String> arn,
        @Nullable Input<Boolean> associatePublicIpAddress,
        @Nullable Input<List<LaunchConfigurationEbsBlockDeviceGetArgs>> ebsBlockDevices,
        @Nullable Input<Boolean> ebsOptimized,
        @Nullable Input<Boolean> enableMonitoring,
        @Nullable Input<List<LaunchConfigurationEphemeralBlockDeviceGetArgs>> ephemeralBlockDevices,
        @Nullable Input<String> iamInstanceProfile,
        @Nullable Input<String> imageId,
        @Nullable Input<String> instanceType,
        @Nullable Input<String> keyName,
        @Nullable Input<LaunchConfigurationMetadataOptionsGetArgs> metadataOptions,
        @Nullable Input<String> name,
        @Nullable Input<String> namePrefix,
        @Nullable Input<String> placementTenancy,
        @Nullable Input<LaunchConfigurationRootBlockDeviceGetArgs> rootBlockDevice,
        @Nullable Input<List<String>> securityGroups,
        @Nullable Input<String> spotPrice,
        @Nullable Input<String> userData,
        @Nullable Input<String> userDataBase64,
        @Nullable Input<String> vpcClassicLinkId,
        @Nullable Input<List<String>> vpcClassicLinkSecurityGroups) {
        this.arn = arn;
        this.associatePublicIpAddress = associatePublicIpAddress;
        this.ebsBlockDevices = ebsBlockDevices;
        this.ebsOptimized = ebsOptimized;
        this.enableMonitoring = enableMonitoring;
        this.ephemeralBlockDevices = ephemeralBlockDevices;
        this.iamInstanceProfile = iamInstanceProfile;
        this.imageId = imageId;
        this.instanceType = instanceType;
        this.keyName = keyName;
        this.metadataOptions = metadataOptions;
        this.name = name;
        this.namePrefix = namePrefix;
        this.placementTenancy = placementTenancy;
        this.rootBlockDevice = rootBlockDevice;
        this.securityGroups = securityGroups;
        this.spotPrice = spotPrice;
        this.userData = userData;
        this.userDataBase64 = userDataBase64;
        this.vpcClassicLinkId = vpcClassicLinkId;
        this.vpcClassicLinkSecurityGroups = vpcClassicLinkSecurityGroups;
    }

    private LaunchConfigurationState() {
        this.arn = Input.empty();
        this.associatePublicIpAddress = Input.empty();
        this.ebsBlockDevices = Input.empty();
        this.ebsOptimized = Input.empty();
        this.enableMonitoring = Input.empty();
        this.ephemeralBlockDevices = Input.empty();
        this.iamInstanceProfile = Input.empty();
        this.imageId = Input.empty();
        this.instanceType = Input.empty();
        this.keyName = Input.empty();
        this.metadataOptions = Input.empty();
        this.name = Input.empty();
        this.namePrefix = Input.empty();
        this.placementTenancy = Input.empty();
        this.rootBlockDevice = Input.empty();
        this.securityGroups = Input.empty();
        this.spotPrice = Input.empty();
        this.userData = Input.empty();
        this.userDataBase64 = Input.empty();
        this.vpcClassicLinkId = Input.empty();
        this.vpcClassicLinkSecurityGroups = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LaunchConfigurationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> arn;
        private @Nullable Input<Boolean> associatePublicIpAddress;
        private @Nullable Input<List<LaunchConfigurationEbsBlockDeviceGetArgs>> ebsBlockDevices;
        private @Nullable Input<Boolean> ebsOptimized;
        private @Nullable Input<Boolean> enableMonitoring;
        private @Nullable Input<List<LaunchConfigurationEphemeralBlockDeviceGetArgs>> ephemeralBlockDevices;
        private @Nullable Input<String> iamInstanceProfile;
        private @Nullable Input<String> imageId;
        private @Nullable Input<String> instanceType;
        private @Nullable Input<String> keyName;
        private @Nullable Input<LaunchConfigurationMetadataOptionsGetArgs> metadataOptions;
        private @Nullable Input<String> name;
        private @Nullable Input<String> namePrefix;
        private @Nullable Input<String> placementTenancy;
        private @Nullable Input<LaunchConfigurationRootBlockDeviceGetArgs> rootBlockDevice;
        private @Nullable Input<List<String>> securityGroups;
        private @Nullable Input<String> spotPrice;
        private @Nullable Input<String> userData;
        private @Nullable Input<String> userDataBase64;
        private @Nullable Input<String> vpcClassicLinkId;
        private @Nullable Input<List<String>> vpcClassicLinkSecurityGroups;

        public Builder() {
    	      // Empty
        }

        public Builder(LaunchConfigurationState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.associatePublicIpAddress = defaults.associatePublicIpAddress;
    	      this.ebsBlockDevices = defaults.ebsBlockDevices;
    	      this.ebsOptimized = defaults.ebsOptimized;
    	      this.enableMonitoring = defaults.enableMonitoring;
    	      this.ephemeralBlockDevices = defaults.ephemeralBlockDevices;
    	      this.iamInstanceProfile = defaults.iamInstanceProfile;
    	      this.imageId = defaults.imageId;
    	      this.instanceType = defaults.instanceType;
    	      this.keyName = defaults.keyName;
    	      this.metadataOptions = defaults.metadataOptions;
    	      this.name = defaults.name;
    	      this.namePrefix = defaults.namePrefix;
    	      this.placementTenancy = defaults.placementTenancy;
    	      this.rootBlockDevice = defaults.rootBlockDevice;
    	      this.securityGroups = defaults.securityGroups;
    	      this.spotPrice = defaults.spotPrice;
    	      this.userData = defaults.userData;
    	      this.userDataBase64 = defaults.userDataBase64;
    	      this.vpcClassicLinkId = defaults.vpcClassicLinkId;
    	      this.vpcClassicLinkSecurityGroups = defaults.vpcClassicLinkSecurityGroups;
        }

        public Builder setArn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder setAssociatePublicIpAddress(@Nullable Input<Boolean> associatePublicIpAddress) {
            this.associatePublicIpAddress = associatePublicIpAddress;
            return this;
        }

        public Builder setAssociatePublicIpAddress(@Nullable Boolean associatePublicIpAddress) {
            this.associatePublicIpAddress = Input.ofNullable(associatePublicIpAddress);
            return this;
        }

        public Builder setEbsBlockDevices(@Nullable Input<List<LaunchConfigurationEbsBlockDeviceGetArgs>> ebsBlockDevices) {
            this.ebsBlockDevices = ebsBlockDevices;
            return this;
        }

        public Builder setEbsBlockDevices(@Nullable List<LaunchConfigurationEbsBlockDeviceGetArgs> ebsBlockDevices) {
            this.ebsBlockDevices = Input.ofNullable(ebsBlockDevices);
            return this;
        }

        public Builder setEbsOptimized(@Nullable Input<Boolean> ebsOptimized) {
            this.ebsOptimized = ebsOptimized;
            return this;
        }

        public Builder setEbsOptimized(@Nullable Boolean ebsOptimized) {
            this.ebsOptimized = Input.ofNullable(ebsOptimized);
            return this;
        }

        public Builder setEnableMonitoring(@Nullable Input<Boolean> enableMonitoring) {
            this.enableMonitoring = enableMonitoring;
            return this;
        }

        public Builder setEnableMonitoring(@Nullable Boolean enableMonitoring) {
            this.enableMonitoring = Input.ofNullable(enableMonitoring);
            return this;
        }

        public Builder setEphemeralBlockDevices(@Nullable Input<List<LaunchConfigurationEphemeralBlockDeviceGetArgs>> ephemeralBlockDevices) {
            this.ephemeralBlockDevices = ephemeralBlockDevices;
            return this;
        }

        public Builder setEphemeralBlockDevices(@Nullable List<LaunchConfigurationEphemeralBlockDeviceGetArgs> ephemeralBlockDevices) {
            this.ephemeralBlockDevices = Input.ofNullable(ephemeralBlockDevices);
            return this;
        }

        public Builder setIamInstanceProfile(@Nullable Input<String> iamInstanceProfile) {
            this.iamInstanceProfile = iamInstanceProfile;
            return this;
        }

        public Builder setImageId(@Nullable Input<String> imageId) {
            this.imageId = imageId;
            return this;
        }

        public Builder setImageId(@Nullable String imageId) {
            this.imageId = Input.ofNullable(imageId);
            return this;
        }

        public Builder setInstanceType(@Nullable Input<String> instanceType) {
            this.instanceType = instanceType;
            return this;
        }

        public Builder setInstanceType(@Nullable String instanceType) {
            this.instanceType = Input.ofNullable(instanceType);
            return this;
        }

        public Builder setKeyName(@Nullable Input<String> keyName) {
            this.keyName = keyName;
            return this;
        }

        public Builder setKeyName(@Nullable String keyName) {
            this.keyName = Input.ofNullable(keyName);
            return this;
        }

        public Builder setMetadataOptions(@Nullable Input<LaunchConfigurationMetadataOptionsGetArgs> metadataOptions) {
            this.metadataOptions = metadataOptions;
            return this;
        }

        public Builder setMetadataOptions(@Nullable LaunchConfigurationMetadataOptionsGetArgs metadataOptions) {
            this.metadataOptions = Input.ofNullable(metadataOptions);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setNamePrefix(@Nullable Input<String> namePrefix) {
            this.namePrefix = namePrefix;
            return this;
        }

        public Builder setNamePrefix(@Nullable String namePrefix) {
            this.namePrefix = Input.ofNullable(namePrefix);
            return this;
        }

        public Builder setPlacementTenancy(@Nullable Input<String> placementTenancy) {
            this.placementTenancy = placementTenancy;
            return this;
        }

        public Builder setPlacementTenancy(@Nullable String placementTenancy) {
            this.placementTenancy = Input.ofNullable(placementTenancy);
            return this;
        }

        public Builder setRootBlockDevice(@Nullable Input<LaunchConfigurationRootBlockDeviceGetArgs> rootBlockDevice) {
            this.rootBlockDevice = rootBlockDevice;
            return this;
        }

        public Builder setRootBlockDevice(@Nullable LaunchConfigurationRootBlockDeviceGetArgs rootBlockDevice) {
            this.rootBlockDevice = Input.ofNullable(rootBlockDevice);
            return this;
        }

        public Builder setSecurityGroups(@Nullable Input<List<String>> securityGroups) {
            this.securityGroups = securityGroups;
            return this;
        }

        public Builder setSecurityGroups(@Nullable List<String> securityGroups) {
            this.securityGroups = Input.ofNullable(securityGroups);
            return this;
        }

        public Builder setSpotPrice(@Nullable Input<String> spotPrice) {
            this.spotPrice = spotPrice;
            return this;
        }

        public Builder setSpotPrice(@Nullable String spotPrice) {
            this.spotPrice = Input.ofNullable(spotPrice);
            return this;
        }

        public Builder setUserData(@Nullable Input<String> userData) {
            this.userData = userData;
            return this;
        }

        public Builder setUserData(@Nullable String userData) {
            this.userData = Input.ofNullable(userData);
            return this;
        }

        public Builder setUserDataBase64(@Nullable Input<String> userDataBase64) {
            this.userDataBase64 = userDataBase64;
            return this;
        }

        public Builder setUserDataBase64(@Nullable String userDataBase64) {
            this.userDataBase64 = Input.ofNullable(userDataBase64);
            return this;
        }

        public Builder setVpcClassicLinkId(@Nullable Input<String> vpcClassicLinkId) {
            this.vpcClassicLinkId = vpcClassicLinkId;
            return this;
        }

        public Builder setVpcClassicLinkId(@Nullable String vpcClassicLinkId) {
            this.vpcClassicLinkId = Input.ofNullable(vpcClassicLinkId);
            return this;
        }

        public Builder setVpcClassicLinkSecurityGroups(@Nullable Input<List<String>> vpcClassicLinkSecurityGroups) {
            this.vpcClassicLinkSecurityGroups = vpcClassicLinkSecurityGroups;
            return this;
        }

        public Builder setVpcClassicLinkSecurityGroups(@Nullable List<String> vpcClassicLinkSecurityGroups) {
            this.vpcClassicLinkSecurityGroups = Input.ofNullable(vpcClassicLinkSecurityGroups);
            return this;
        }
        public LaunchConfigurationState build() {
            return new LaunchConfigurationState(arn, associatePublicIpAddress, ebsBlockDevices, ebsOptimized, enableMonitoring, ephemeralBlockDevices, iamInstanceProfile, imageId, instanceType, keyName, metadataOptions, name, namePrefix, placementTenancy, rootBlockDevice, securityGroups, spotPrice, userData, userDataBase64, vpcClassicLinkId, vpcClassicLinkSecurityGroups);
        }
    }
}