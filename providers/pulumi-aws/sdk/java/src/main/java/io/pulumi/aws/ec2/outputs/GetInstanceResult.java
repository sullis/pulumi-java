// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.outputs;

import io.pulumi.aws.ec2.outputs.GetInstanceCreditSpecification;
import io.pulumi.aws.ec2.outputs.GetInstanceEbsBlockDevice;
import io.pulumi.aws.ec2.outputs.GetInstanceEnclaveOption;
import io.pulumi.aws.ec2.outputs.GetInstanceEphemeralBlockDevice;
import io.pulumi.aws.ec2.outputs.GetInstanceFilter;
import io.pulumi.aws.ec2.outputs.GetInstanceMetadataOption;
import io.pulumi.aws.ec2.outputs.GetInstanceRootBlockDevice;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetInstanceResult {
    /**
     * The ID of the AMI used to launch the instance.
     * 
     */
    private final String ami;
    /**
     * The ARN of the instance.
     * 
     */
    private final String arn;
    /**
     * Whether or not the Instance is associated with a public IP address or not (Boolean).
     * 
     */
    private final Boolean associatePublicIpAddress;
    /**
     * The availability zone of the Instance.
     * 
     */
    private final String availabilityZone;
    /**
     * The credit specification of the Instance.
     * 
     */
    private final List<GetInstanceCreditSpecification> creditSpecifications;
    private final Boolean disableApiTermination;
    /**
     * The EBS block device mappings of the Instance.
     * 
     */
    private final List<GetInstanceEbsBlockDevice> ebsBlockDevices;
    /**
     * Whether the Instance is EBS optimized or not (Boolean).
     * 
     */
    private final Boolean ebsOptimized;
    /**
     * The enclave options of the Instance.
     * 
     */
    private final List<GetInstanceEnclaveOption> enclaveOptions;
    /**
     * The ephemeral block device mappings of the Instance.
     * 
     */
    private final List<GetInstanceEphemeralBlockDevice> ephemeralBlockDevices;
    private final @Nullable List<GetInstanceFilter> filters;
    private final @Nullable Boolean getPasswordData;
    private final @Nullable Boolean getUserData;
    /**
     * The Id of the dedicated host the instance will be assigned to.
     * 
     */
    private final String hostId;
    /**
     * The name of the instance profile associated with the Instance.
     * 
     */
    private final String iamInstanceProfile;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final @Nullable String instanceId;
    /**
     * The state of the instance. One of: `pending`, `running`, `shutting-down`, `terminated`, `stopping`, `stopped`. See [Instance Lifecycle](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-lifecycle.html) for more information.
     * 
     */
    private final String instanceState;
    private final Map<String,String> instanceTags;
    /**
     * The type of the Instance.
     * 
     */
    private final String instanceType;
    /**
     * The IPv6 addresses associated to the Instance, if applicable. **NOTE**: Unlike the IPv4 address, this doesn't change if you attach an EIP to the instance.
     * 
     */
    private final List<String> ipv6Addresses;
    /**
     * The key name of the Instance.
     * 
     */
    private final String keyName;
    /**
     * The metadata options of the Instance.
     * 
     */
    private final List<GetInstanceMetadataOption> metadataOptions;
    /**
     * Whether detailed monitoring is enabled or disabled for the Instance (Boolean).
     * 
     */
    private final Boolean monitoring;
    /**
     * The ID of the network interface that was created with the Instance.
     * 
     */
    private final String networkInterfaceId;
    /**
     * The Amazon Resource Name (ARN) of the Outpost.
     * 
     */
    private final String outpostArn;
    /**
     * Base-64 encoded encrypted password data for the instance.
     * Useful for getting the administrator password for instances running Microsoft Windows.
     * This attribute is only exported if `get_password_data` is true.
     * See [GetPasswordData](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetPasswordData.html) for more information.
     * 
     */
    private final String passwordData;
    /**
     * The placement group of the Instance.
     * 
     */
    private final String placementGroup;
    /**
     * The number of the partition the instance is in.
     * 
     */
    private final Integer placementPartitionNumber;
    /**
     * The private DNS name assigned to the Instance. Can only be
     * used inside the Amazon EC2, and only available if you've enabled DNS hostnames
     * for your VPC.
     * 
     */
    private final String privateDns;
    /**
     * The private IP address assigned to the Instance.
     * 
     */
    private final String privateIp;
    /**
     * The public DNS name assigned to the Instance. For EC2-VPC, this
     * is only available if you've enabled DNS hostnames for your VPC.
     * 
     */
    private final String publicDns;
    /**
     * The public IP address assigned to the Instance, if applicable. **NOTE**: If you are using an `aws.ec2.Eip` with your instance, you should refer to the EIP's address directly and not use `public_ip`, as this field will change after the EIP is attached.
     * 
     */
    private final String publicIp;
    /**
     * The root block device mappings of the Instance
     * 
     */
    private final List<GetInstanceRootBlockDevice> rootBlockDevices;
    /**
     * The secondary private IPv4 addresses assigned to the instance's primary network interface (eth0) in a VPC.
     * 
     */
    private final List<String> secondaryPrivateIps;
    /**
     * The associated security groups.
     * 
     */
    private final List<String> securityGroups;
    /**
     * Whether the network interface performs source/destination checking (Boolean).
     * 
     */
    private final Boolean sourceDestCheck;
    /**
     * The VPC subnet ID.
     * 
     */
    private final String subnetId;
    /**
     * A map of tags assigned to the Instance.
     * 
     */
    private final Map<String,String> tags;
    /**
     * The tenancy of the instance: `dedicated`, `default`, `host`.
     * 
     */
    private final String tenancy;
    /**
     * SHA-1 hash of User Data supplied to the Instance.
     * 
     */
    private final String userData;
    /**
     * Base64 encoded contents of User Data supplied to the Instance. This attribute is only exported if `get_user_data` is true.
     * 
     */
    private final String userDataBase64;
    /**
     * The associated security groups in a non-default VPC.
     * 
     */
    private final List<String> vpcSecurityGroupIds;

    @OutputCustomType.Constructor({"ami","arn","associatePublicIpAddress","availabilityZone","creditSpecifications","disableApiTermination","ebsBlockDevices","ebsOptimized","enclaveOptions","ephemeralBlockDevices","filters","getPasswordData","getUserData","hostId","iamInstanceProfile","id","instanceId","instanceState","instanceTags","instanceType","ipv6Addresses","keyName","metadataOptions","monitoring","networkInterfaceId","outpostArn","passwordData","placementGroup","placementPartitionNumber","privateDns","privateIp","publicDns","publicIp","rootBlockDevices","secondaryPrivateIps","securityGroups","sourceDestCheck","subnetId","tags","tenancy","userData","userDataBase64","vpcSecurityGroupIds"})
    private GetInstanceResult(
        String ami,
        String arn,
        Boolean associatePublicIpAddress,
        String availabilityZone,
        List<GetInstanceCreditSpecification> creditSpecifications,
        Boolean disableApiTermination,
        List<GetInstanceEbsBlockDevice> ebsBlockDevices,
        Boolean ebsOptimized,
        List<GetInstanceEnclaveOption> enclaveOptions,
        List<GetInstanceEphemeralBlockDevice> ephemeralBlockDevices,
        @Nullable List<GetInstanceFilter> filters,
        @Nullable Boolean getPasswordData,
        @Nullable Boolean getUserData,
        String hostId,
        String iamInstanceProfile,
        String id,
        @Nullable String instanceId,
        String instanceState,
        Map<String,String> instanceTags,
        String instanceType,
        List<String> ipv6Addresses,
        String keyName,
        List<GetInstanceMetadataOption> metadataOptions,
        Boolean monitoring,
        String networkInterfaceId,
        String outpostArn,
        String passwordData,
        String placementGroup,
        Integer placementPartitionNumber,
        String privateDns,
        String privateIp,
        String publicDns,
        String publicIp,
        List<GetInstanceRootBlockDevice> rootBlockDevices,
        List<String> secondaryPrivateIps,
        List<String> securityGroups,
        Boolean sourceDestCheck,
        String subnetId,
        Map<String,String> tags,
        String tenancy,
        String userData,
        String userDataBase64,
        List<String> vpcSecurityGroupIds) {
        this.ami = Objects.requireNonNull(ami);
        this.arn = Objects.requireNonNull(arn);
        this.associatePublicIpAddress = Objects.requireNonNull(associatePublicIpAddress);
        this.availabilityZone = Objects.requireNonNull(availabilityZone);
        this.creditSpecifications = Objects.requireNonNull(creditSpecifications);
        this.disableApiTermination = Objects.requireNonNull(disableApiTermination);
        this.ebsBlockDevices = Objects.requireNonNull(ebsBlockDevices);
        this.ebsOptimized = Objects.requireNonNull(ebsOptimized);
        this.enclaveOptions = Objects.requireNonNull(enclaveOptions);
        this.ephemeralBlockDevices = Objects.requireNonNull(ephemeralBlockDevices);
        this.filters = filters;
        this.getPasswordData = getPasswordData;
        this.getUserData = getUserData;
        this.hostId = Objects.requireNonNull(hostId);
        this.iamInstanceProfile = Objects.requireNonNull(iamInstanceProfile);
        this.id = Objects.requireNonNull(id);
        this.instanceId = instanceId;
        this.instanceState = Objects.requireNonNull(instanceState);
        this.instanceTags = Objects.requireNonNull(instanceTags);
        this.instanceType = Objects.requireNonNull(instanceType);
        this.ipv6Addresses = Objects.requireNonNull(ipv6Addresses);
        this.keyName = Objects.requireNonNull(keyName);
        this.metadataOptions = Objects.requireNonNull(metadataOptions);
        this.monitoring = Objects.requireNonNull(monitoring);
        this.networkInterfaceId = Objects.requireNonNull(networkInterfaceId);
        this.outpostArn = Objects.requireNonNull(outpostArn);
        this.passwordData = Objects.requireNonNull(passwordData);
        this.placementGroup = Objects.requireNonNull(placementGroup);
        this.placementPartitionNumber = Objects.requireNonNull(placementPartitionNumber);
        this.privateDns = Objects.requireNonNull(privateDns);
        this.privateIp = Objects.requireNonNull(privateIp);
        this.publicDns = Objects.requireNonNull(publicDns);
        this.publicIp = Objects.requireNonNull(publicIp);
        this.rootBlockDevices = Objects.requireNonNull(rootBlockDevices);
        this.secondaryPrivateIps = Objects.requireNonNull(secondaryPrivateIps);
        this.securityGroups = Objects.requireNonNull(securityGroups);
        this.sourceDestCheck = Objects.requireNonNull(sourceDestCheck);
        this.subnetId = Objects.requireNonNull(subnetId);
        this.tags = Objects.requireNonNull(tags);
        this.tenancy = Objects.requireNonNull(tenancy);
        this.userData = Objects.requireNonNull(userData);
        this.userDataBase64 = Objects.requireNonNull(userDataBase64);
        this.vpcSecurityGroupIds = Objects.requireNonNull(vpcSecurityGroupIds);
    }

    /**
     * The ID of the AMI used to launch the instance.
     * 
    */
    public String getAmi() {
        return this.ami;
    }
    /**
     * The ARN of the instance.
     * 
    */
    public String getArn() {
        return this.arn;
    }
    /**
     * Whether or not the Instance is associated with a public IP address or not (Boolean).
     * 
    */
    public Boolean getAssociatePublicIpAddress() {
        return this.associatePublicIpAddress;
    }
    /**
     * The availability zone of the Instance.
     * 
    */
    public String getAvailabilityZone() {
        return this.availabilityZone;
    }
    /**
     * The credit specification of the Instance.
     * 
    */
    public List<GetInstanceCreditSpecification> getCreditSpecifications() {
        return this.creditSpecifications;
    }
    public Boolean getDisableApiTermination() {
        return this.disableApiTermination;
    }
    /**
     * The EBS block device mappings of the Instance.
     * 
    */
    public List<GetInstanceEbsBlockDevice> getEbsBlockDevices() {
        return this.ebsBlockDevices;
    }
    /**
     * Whether the Instance is EBS optimized or not (Boolean).
     * 
    */
    public Boolean getEbsOptimized() {
        return this.ebsOptimized;
    }
    /**
     * The enclave options of the Instance.
     * 
    */
    public List<GetInstanceEnclaveOption> getEnclaveOptions() {
        return this.enclaveOptions;
    }
    /**
     * The ephemeral block device mappings of the Instance.
     * 
    */
    public List<GetInstanceEphemeralBlockDevice> getEphemeralBlockDevices() {
        return this.ephemeralBlockDevices;
    }
    public List<GetInstanceFilter> getFilters() {
        return this.filters == null ? List.of() : this.filters;
    }
    public Optional<Boolean> getGetPasswordData() {
        return Optional.ofNullable(this.getPasswordData);
    }
    public Optional<Boolean> getGetUserData() {
        return Optional.ofNullable(this.getUserData);
    }
    /**
     * The Id of the dedicated host the instance will be assigned to.
     * 
    */
    public String getHostId() {
        return this.hostId;
    }
    /**
     * The name of the instance profile associated with the Instance.
     * 
    */
    public String getIamInstanceProfile() {
        return this.iamInstanceProfile;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    public Optional<String> getInstanceId() {
        return Optional.ofNullable(this.instanceId);
    }
    /**
     * The state of the instance. One of: `pending`, `running`, `shutting-down`, `terminated`, `stopping`, `stopped`. See [Instance Lifecycle](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-lifecycle.html) for more information.
     * 
    */
    public String getInstanceState() {
        return this.instanceState;
    }
    public Map<String,String> getInstanceTags() {
        return this.instanceTags;
    }
    /**
     * The type of the Instance.
     * 
    */
    public String getInstanceType() {
        return this.instanceType;
    }
    /**
     * The IPv6 addresses associated to the Instance, if applicable. **NOTE**: Unlike the IPv4 address, this doesn't change if you attach an EIP to the instance.
     * 
    */
    public List<String> getIpv6Addresses() {
        return this.ipv6Addresses;
    }
    /**
     * The key name of the Instance.
     * 
    */
    public String getKeyName() {
        return this.keyName;
    }
    /**
     * The metadata options of the Instance.
     * 
    */
    public List<GetInstanceMetadataOption> getMetadataOptions() {
        return this.metadataOptions;
    }
    /**
     * Whether detailed monitoring is enabled or disabled for the Instance (Boolean).
     * 
    */
    public Boolean getMonitoring() {
        return this.monitoring;
    }
    /**
     * The ID of the network interface that was created with the Instance.
     * 
    */
    public String getNetworkInterfaceId() {
        return this.networkInterfaceId;
    }
    /**
     * The Amazon Resource Name (ARN) of the Outpost.
     * 
    */
    public String getOutpostArn() {
        return this.outpostArn;
    }
    /**
     * Base-64 encoded encrypted password data for the instance.
     * Useful for getting the administrator password for instances running Microsoft Windows.
     * This attribute is only exported if `get_password_data` is true.
     * See [GetPasswordData](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetPasswordData.html) for more information.
     * 
    */
    public String getPasswordData() {
        return this.passwordData;
    }
    /**
     * The placement group of the Instance.
     * 
    */
    public String getPlacementGroup() {
        return this.placementGroup;
    }
    /**
     * The number of the partition the instance is in.
     * 
    */
    public Integer getPlacementPartitionNumber() {
        return this.placementPartitionNumber;
    }
    /**
     * The private DNS name assigned to the Instance. Can only be
     * used inside the Amazon EC2, and only available if you've enabled DNS hostnames
     * for your VPC.
     * 
    */
    public String getPrivateDns() {
        return this.privateDns;
    }
    /**
     * The private IP address assigned to the Instance.
     * 
    */
    public String getPrivateIp() {
        return this.privateIp;
    }
    /**
     * The public DNS name assigned to the Instance. For EC2-VPC, this
     * is only available if you've enabled DNS hostnames for your VPC.
     * 
    */
    public String getPublicDns() {
        return this.publicDns;
    }
    /**
     * The public IP address assigned to the Instance, if applicable. **NOTE**: If you are using an `aws.ec2.Eip` with your instance, you should refer to the EIP's address directly and not use `public_ip`, as this field will change after the EIP is attached.
     * 
    */
    public String getPublicIp() {
        return this.publicIp;
    }
    /**
     * The root block device mappings of the Instance
     * 
    */
    public List<GetInstanceRootBlockDevice> getRootBlockDevices() {
        return this.rootBlockDevices;
    }
    /**
     * The secondary private IPv4 addresses assigned to the instance's primary network interface (eth0) in a VPC.
     * 
    */
    public List<String> getSecondaryPrivateIps() {
        return this.secondaryPrivateIps;
    }
    /**
     * The associated security groups.
     * 
    */
    public List<String> getSecurityGroups() {
        return this.securityGroups;
    }
    /**
     * Whether the network interface performs source/destination checking (Boolean).
     * 
    */
    public Boolean getSourceDestCheck() {
        return this.sourceDestCheck;
    }
    /**
     * The VPC subnet ID.
     * 
    */
    public String getSubnetId() {
        return this.subnetId;
    }
    /**
     * A map of tags assigned to the Instance.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags;
    }
    /**
     * The tenancy of the instance: `dedicated`, `default`, `host`.
     * 
    */
    public String getTenancy() {
        return this.tenancy;
    }
    /**
     * SHA-1 hash of User Data supplied to the Instance.
     * 
    */
    public String getUserData() {
        return this.userData;
    }
    /**
     * Base64 encoded contents of User Data supplied to the Instance. This attribute is only exported if `get_user_data` is true.
     * 
    */
    public String getUserDataBase64() {
        return this.userDataBase64;
    }
    /**
     * The associated security groups in a non-default VPC.
     * 
    */
    public List<String> getVpcSecurityGroupIds() {
        return this.vpcSecurityGroupIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String ami;
        private String arn;
        private Boolean associatePublicIpAddress;
        private String availabilityZone;
        private List<GetInstanceCreditSpecification> creditSpecifications;
        private Boolean disableApiTermination;
        private List<GetInstanceEbsBlockDevice> ebsBlockDevices;
        private Boolean ebsOptimized;
        private List<GetInstanceEnclaveOption> enclaveOptions;
        private List<GetInstanceEphemeralBlockDevice> ephemeralBlockDevices;
        private @Nullable List<GetInstanceFilter> filters;
        private @Nullable Boolean getPasswordData;
        private @Nullable Boolean getUserData;
        private String hostId;
        private String iamInstanceProfile;
        private String id;
        private @Nullable String instanceId;
        private String instanceState;
        private Map<String,String> instanceTags;
        private String instanceType;
        private List<String> ipv6Addresses;
        private String keyName;
        private List<GetInstanceMetadataOption> metadataOptions;
        private Boolean monitoring;
        private String networkInterfaceId;
        private String outpostArn;
        private String passwordData;
        private String placementGroup;
        private Integer placementPartitionNumber;
        private String privateDns;
        private String privateIp;
        private String publicDns;
        private String publicIp;
        private List<GetInstanceRootBlockDevice> rootBlockDevices;
        private List<String> secondaryPrivateIps;
        private List<String> securityGroups;
        private Boolean sourceDestCheck;
        private String subnetId;
        private Map<String,String> tags;
        private String tenancy;
        private String userData;
        private String userDataBase64;
        private List<String> vpcSecurityGroupIds;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstanceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ami = defaults.ami;
    	      this.arn = defaults.arn;
    	      this.associatePublicIpAddress = defaults.associatePublicIpAddress;
    	      this.availabilityZone = defaults.availabilityZone;
    	      this.creditSpecifications = defaults.creditSpecifications;
    	      this.disableApiTermination = defaults.disableApiTermination;
    	      this.ebsBlockDevices = defaults.ebsBlockDevices;
    	      this.ebsOptimized = defaults.ebsOptimized;
    	      this.enclaveOptions = defaults.enclaveOptions;
    	      this.ephemeralBlockDevices = defaults.ephemeralBlockDevices;
    	      this.filters = defaults.filters;
    	      this.getPasswordData = defaults.getPasswordData;
    	      this.getUserData = defaults.getUserData;
    	      this.hostId = defaults.hostId;
    	      this.iamInstanceProfile = defaults.iamInstanceProfile;
    	      this.id = defaults.id;
    	      this.instanceId = defaults.instanceId;
    	      this.instanceState = defaults.instanceState;
    	      this.instanceTags = defaults.instanceTags;
    	      this.instanceType = defaults.instanceType;
    	      this.ipv6Addresses = defaults.ipv6Addresses;
    	      this.keyName = defaults.keyName;
    	      this.metadataOptions = defaults.metadataOptions;
    	      this.monitoring = defaults.monitoring;
    	      this.networkInterfaceId = defaults.networkInterfaceId;
    	      this.outpostArn = defaults.outpostArn;
    	      this.passwordData = defaults.passwordData;
    	      this.placementGroup = defaults.placementGroup;
    	      this.placementPartitionNumber = defaults.placementPartitionNumber;
    	      this.privateDns = defaults.privateDns;
    	      this.privateIp = defaults.privateIp;
    	      this.publicDns = defaults.publicDns;
    	      this.publicIp = defaults.publicIp;
    	      this.rootBlockDevices = defaults.rootBlockDevices;
    	      this.secondaryPrivateIps = defaults.secondaryPrivateIps;
    	      this.securityGroups = defaults.securityGroups;
    	      this.sourceDestCheck = defaults.sourceDestCheck;
    	      this.subnetId = defaults.subnetId;
    	      this.tags = defaults.tags;
    	      this.tenancy = defaults.tenancy;
    	      this.userData = defaults.userData;
    	      this.userDataBase64 = defaults.userDataBase64;
    	      this.vpcSecurityGroupIds = defaults.vpcSecurityGroupIds;
        }

        public Builder setAmi(String ami) {
            this.ami = Objects.requireNonNull(ami);
            return this;
        }

        public Builder setArn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public Builder setAssociatePublicIpAddress(Boolean associatePublicIpAddress) {
            this.associatePublicIpAddress = Objects.requireNonNull(associatePublicIpAddress);
            return this;
        }

        public Builder setAvailabilityZone(String availabilityZone) {
            this.availabilityZone = Objects.requireNonNull(availabilityZone);
            return this;
        }

        public Builder setCreditSpecifications(List<GetInstanceCreditSpecification> creditSpecifications) {
            this.creditSpecifications = Objects.requireNonNull(creditSpecifications);
            return this;
        }

        public Builder setDisableApiTermination(Boolean disableApiTermination) {
            this.disableApiTermination = Objects.requireNonNull(disableApiTermination);
            return this;
        }

        public Builder setEbsBlockDevices(List<GetInstanceEbsBlockDevice> ebsBlockDevices) {
            this.ebsBlockDevices = Objects.requireNonNull(ebsBlockDevices);
            return this;
        }

        public Builder setEbsOptimized(Boolean ebsOptimized) {
            this.ebsOptimized = Objects.requireNonNull(ebsOptimized);
            return this;
        }

        public Builder setEnclaveOptions(List<GetInstanceEnclaveOption> enclaveOptions) {
            this.enclaveOptions = Objects.requireNonNull(enclaveOptions);
            return this;
        }

        public Builder setEphemeralBlockDevices(List<GetInstanceEphemeralBlockDevice> ephemeralBlockDevices) {
            this.ephemeralBlockDevices = Objects.requireNonNull(ephemeralBlockDevices);
            return this;
        }

        public Builder setFilters(@Nullable List<GetInstanceFilter> filters) {
            this.filters = filters;
            return this;
        }

        public Builder setGetPasswordData(@Nullable Boolean getPasswordData) {
            this.getPasswordData = getPasswordData;
            return this;
        }

        public Builder setGetUserData(@Nullable Boolean getUserData) {
            this.getUserData = getUserData;
            return this;
        }

        public Builder setHostId(String hostId) {
            this.hostId = Objects.requireNonNull(hostId);
            return this;
        }

        public Builder setIamInstanceProfile(String iamInstanceProfile) {
            this.iamInstanceProfile = Objects.requireNonNull(iamInstanceProfile);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setInstanceId(@Nullable String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        public Builder setInstanceState(String instanceState) {
            this.instanceState = Objects.requireNonNull(instanceState);
            return this;
        }

        public Builder setInstanceTags(Map<String,String> instanceTags) {
            this.instanceTags = Objects.requireNonNull(instanceTags);
            return this;
        }

        public Builder setInstanceType(String instanceType) {
            this.instanceType = Objects.requireNonNull(instanceType);
            return this;
        }

        public Builder setIpv6Addresses(List<String> ipv6Addresses) {
            this.ipv6Addresses = Objects.requireNonNull(ipv6Addresses);
            return this;
        }

        public Builder setKeyName(String keyName) {
            this.keyName = Objects.requireNonNull(keyName);
            return this;
        }

        public Builder setMetadataOptions(List<GetInstanceMetadataOption> metadataOptions) {
            this.metadataOptions = Objects.requireNonNull(metadataOptions);
            return this;
        }

        public Builder setMonitoring(Boolean monitoring) {
            this.monitoring = Objects.requireNonNull(monitoring);
            return this;
        }

        public Builder setNetworkInterfaceId(String networkInterfaceId) {
            this.networkInterfaceId = Objects.requireNonNull(networkInterfaceId);
            return this;
        }

        public Builder setOutpostArn(String outpostArn) {
            this.outpostArn = Objects.requireNonNull(outpostArn);
            return this;
        }

        public Builder setPasswordData(String passwordData) {
            this.passwordData = Objects.requireNonNull(passwordData);
            return this;
        }

        public Builder setPlacementGroup(String placementGroup) {
            this.placementGroup = Objects.requireNonNull(placementGroup);
            return this;
        }

        public Builder setPlacementPartitionNumber(Integer placementPartitionNumber) {
            this.placementPartitionNumber = Objects.requireNonNull(placementPartitionNumber);
            return this;
        }

        public Builder setPrivateDns(String privateDns) {
            this.privateDns = Objects.requireNonNull(privateDns);
            return this;
        }

        public Builder setPrivateIp(String privateIp) {
            this.privateIp = Objects.requireNonNull(privateIp);
            return this;
        }

        public Builder setPublicDns(String publicDns) {
            this.publicDns = Objects.requireNonNull(publicDns);
            return this;
        }

        public Builder setPublicIp(String publicIp) {
            this.publicIp = Objects.requireNonNull(publicIp);
            return this;
        }

        public Builder setRootBlockDevices(List<GetInstanceRootBlockDevice> rootBlockDevices) {
            this.rootBlockDevices = Objects.requireNonNull(rootBlockDevices);
            return this;
        }

        public Builder setSecondaryPrivateIps(List<String> secondaryPrivateIps) {
            this.secondaryPrivateIps = Objects.requireNonNull(secondaryPrivateIps);
            return this;
        }

        public Builder setSecurityGroups(List<String> securityGroups) {
            this.securityGroups = Objects.requireNonNull(securityGroups);
            return this;
        }

        public Builder setSourceDestCheck(Boolean sourceDestCheck) {
            this.sourceDestCheck = Objects.requireNonNull(sourceDestCheck);
            return this;
        }

        public Builder setSubnetId(String subnetId) {
            this.subnetId = Objects.requireNonNull(subnetId);
            return this;
        }

        public Builder setTags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }

        public Builder setTenancy(String tenancy) {
            this.tenancy = Objects.requireNonNull(tenancy);
            return this;
        }

        public Builder setUserData(String userData) {
            this.userData = Objects.requireNonNull(userData);
            return this;
        }

        public Builder setUserDataBase64(String userDataBase64) {
            this.userDataBase64 = Objects.requireNonNull(userDataBase64);
            return this;
        }

        public Builder setVpcSecurityGroupIds(List<String> vpcSecurityGroupIds) {
            this.vpcSecurityGroupIds = Objects.requireNonNull(vpcSecurityGroupIds);
            return this;
        }
        public GetInstanceResult build() {
            return new GetInstanceResult(ami, arn, associatePublicIpAddress, availabilityZone, creditSpecifications, disableApiTermination, ebsBlockDevices, ebsOptimized, enclaveOptions, ephemeralBlockDevices, filters, getPasswordData, getUserData, hostId, iamInstanceProfile, id, instanceId, instanceState, instanceTags, instanceType, ipv6Addresses, keyName, metadataOptions, monitoring, networkInterfaceId, outpostArn, passwordData, placementGroup, placementPartitionNumber, privateDns, privateIp, publicDns, publicIp, rootBlockDevices, secondaryPrivateIps, securityGroups, sourceDestCheck, subnetId, tags, tenancy, userData, userDataBase64, vpcSecurityGroupIds);
        }
    }
}