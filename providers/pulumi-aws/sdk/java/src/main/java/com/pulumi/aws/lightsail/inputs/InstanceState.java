// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lightsail.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstanceState extends com.pulumi.resources.ResourceArgs {

    public static final InstanceState Empty = new InstanceState();

    /**
     * The ARN of the Lightsail instance (matches `id`).
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    /**
     * @return The ARN of the Lightsail instance (matches `id`).
     * 
     */
    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * The Availability Zone in which to create your
     * instance (see list below)
     * 
     */
    @Import(name="availabilityZone")
    private @Nullable Output<String> availabilityZone;

    /**
     * @return The Availability Zone in which to create your
     * instance (see list below)
     * 
     */
    public Optional<Output<String>> availabilityZone() {
        return Optional.ofNullable(this.availabilityZone);
    }

    /**
     * The ID for a virtual private server image. A list of available blueprint IDs can be obtained using the AWS CLI command: `aws lightsail get-blueprints`
     * 
     */
    @Import(name="blueprintId")
    private @Nullable Output<String> blueprintId;

    /**
     * @return The ID for a virtual private server image. A list of available blueprint IDs can be obtained using the AWS CLI command: `aws lightsail get-blueprints`
     * 
     */
    public Optional<Output<String>> blueprintId() {
        return Optional.ofNullable(this.blueprintId);
    }

    /**
     * The bundle of specification information (see list below)
     * 
     */
    @Import(name="bundleId")
    private @Nullable Output<String> bundleId;

    /**
     * @return The bundle of specification information (see list below)
     * 
     */
    public Optional<Output<String>> bundleId() {
        return Optional.ofNullable(this.bundleId);
    }

    /**
     * The number of vCPUs the instance has.
     * 
     */
    @Import(name="cpuCount")
    private @Nullable Output<Integer> cpuCount;

    /**
     * @return The number of vCPUs the instance has.
     * 
     */
    public Optional<Output<Integer>> cpuCount() {
        return Optional.ofNullable(this.cpuCount);
    }

    /**
     * The timestamp when the instance was created.
     * 
     */
    @Import(name="createdAt")
    private @Nullable Output<String> createdAt;

    /**
     * @return The timestamp when the instance was created.
     * 
     */
    public Optional<Output<String>> createdAt() {
        return Optional.ofNullable(this.createdAt);
    }

    /**
     * (**Deprecated**) The first IPv6 address of the Lightsail instance. Use `ipv6_addresses` attribute instead.
     * 
     * @deprecated
     * use `ipv6_addresses` attribute instead
     * 
     */
    @Deprecated /* use `ipv6_addresses` attribute instead */
    @Import(name="ipv6Address")
    private @Nullable Output<String> ipv6Address;

    /**
     * @return (**Deprecated**) The first IPv6 address of the Lightsail instance. Use `ipv6_addresses` attribute instead.
     * 
     * @deprecated
     * use `ipv6_addresses` attribute instead
     * 
     */
    @Deprecated /* use `ipv6_addresses` attribute instead */
    public Optional<Output<String>> ipv6Address() {
        return Optional.ofNullable(this.ipv6Address);
    }

    /**
     * List of IPv6 addresses for the Lightsail instance.
     * 
     */
    @Import(name="ipv6Addresses")
    private @Nullable Output<List<String>> ipv6Addresses;

    /**
     * @return List of IPv6 addresses for the Lightsail instance.
     * 
     */
    public Optional<Output<List<String>>> ipv6Addresses() {
        return Optional.ofNullable(this.ipv6Addresses);
    }

    /**
     * A Boolean value indicating whether this instance has a static IP assigned to it.
     * 
     */
    @Import(name="isStaticIp")
    private @Nullable Output<Boolean> isStaticIp;

    /**
     * @return A Boolean value indicating whether this instance has a static IP assigned to it.
     * 
     */
    public Optional<Output<Boolean>> isStaticIp() {
        return Optional.ofNullable(this.isStaticIp);
    }

    /**
     * The name of your key pair. Created in the
     * Lightsail console (cannot use `aws.ec2.KeyPair` at this time)
     * 
     */
    @Import(name="keyPairName")
    private @Nullable Output<String> keyPairName;

    /**
     * @return The name of your key pair. Created in the
     * Lightsail console (cannot use `aws.ec2.KeyPair` at this time)
     * 
     */
    public Optional<Output<String>> keyPairName() {
        return Optional.ofNullable(this.keyPairName);
    }

    /**
     * The name of the Lightsail Instance. Names be unique within each AWS Region in your Lightsail account.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the Lightsail Instance. Names be unique within each AWS Region in your Lightsail account.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The private IP address of the instance.
     * 
     */
    @Import(name="privateIpAddress")
    private @Nullable Output<String> privateIpAddress;

    /**
     * @return The private IP address of the instance.
     * 
     */
    public Optional<Output<String>> privateIpAddress() {
        return Optional.ofNullable(this.privateIpAddress);
    }

    /**
     * The public IP address of the instance.
     * 
     */
    @Import(name="publicIpAddress")
    private @Nullable Output<String> publicIpAddress;

    /**
     * @return The public IP address of the instance.
     * 
     */
    public Optional<Output<String>> publicIpAddress() {
        return Optional.ofNullable(this.publicIpAddress);
    }

    /**
     * The amount of RAM in GB on the instance (e.g., 1.0).
     * 
     */
    @Import(name="ramSize")
    private @Nullable Output<Double> ramSize;

    /**
     * @return The amount of RAM in GB on the instance (e.g., 1.0).
     * 
     */
    public Optional<Output<Double>> ramSize() {
        return Optional.ofNullable(this.ramSize);
    }

    /**
     * A map of tags to assign to the resource. To create a key-only tag, use an empty string as the value. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. To create a key-only tag, use an empty string as the value. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Import(name="tagsAll")
    private @Nullable Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Optional<Output<Map<String,String>>> tagsAll() {
        return Optional.ofNullable(this.tagsAll);
    }

    /**
     * launch script to configure server with additional user data
     * 
     */
    @Import(name="userData")
    private @Nullable Output<String> userData;

    /**
     * @return launch script to configure server with additional user data
     * 
     */
    public Optional<Output<String>> userData() {
        return Optional.ofNullable(this.userData);
    }

    /**
     * The user name for connecting to the instance (e.g., ec2-user).
     * 
     */
    @Import(name="username")
    private @Nullable Output<String> username;

    /**
     * @return The user name for connecting to the instance (e.g., ec2-user).
     * 
     */
    public Optional<Output<String>> username() {
        return Optional.ofNullable(this.username);
    }

    private InstanceState() {}

    private InstanceState(InstanceState $) {
        this.arn = $.arn;
        this.availabilityZone = $.availabilityZone;
        this.blueprintId = $.blueprintId;
        this.bundleId = $.bundleId;
        this.cpuCount = $.cpuCount;
        this.createdAt = $.createdAt;
        this.ipv6Address = $.ipv6Address;
        this.ipv6Addresses = $.ipv6Addresses;
        this.isStaticIp = $.isStaticIp;
        this.keyPairName = $.keyPairName;
        this.name = $.name;
        this.privateIpAddress = $.privateIpAddress;
        this.publicIpAddress = $.publicIpAddress;
        this.ramSize = $.ramSize;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
        this.userData = $.userData;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceState $;

        public Builder() {
            $ = new InstanceState();
        }

        public Builder(InstanceState defaults) {
            $ = new InstanceState(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn The ARN of the Lightsail instance (matches `id`).
         * 
         * @return builder
         * 
         */
        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn The ARN of the Lightsail instance (matches `id`).
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param availabilityZone The Availability Zone in which to create your
         * instance (see list below)
         * 
         * @return builder
         * 
         */
        public Builder availabilityZone(@Nullable Output<String> availabilityZone) {
            $.availabilityZone = availabilityZone;
            return this;
        }

        /**
         * @param availabilityZone The Availability Zone in which to create your
         * instance (see list below)
         * 
         * @return builder
         * 
         */
        public Builder availabilityZone(String availabilityZone) {
            return availabilityZone(Output.of(availabilityZone));
        }

        /**
         * @param blueprintId The ID for a virtual private server image. A list of available blueprint IDs can be obtained using the AWS CLI command: `aws lightsail get-blueprints`
         * 
         * @return builder
         * 
         */
        public Builder blueprintId(@Nullable Output<String> blueprintId) {
            $.blueprintId = blueprintId;
            return this;
        }

        /**
         * @param blueprintId The ID for a virtual private server image. A list of available blueprint IDs can be obtained using the AWS CLI command: `aws lightsail get-blueprints`
         * 
         * @return builder
         * 
         */
        public Builder blueprintId(String blueprintId) {
            return blueprintId(Output.of(blueprintId));
        }

        /**
         * @param bundleId The bundle of specification information (see list below)
         * 
         * @return builder
         * 
         */
        public Builder bundleId(@Nullable Output<String> bundleId) {
            $.bundleId = bundleId;
            return this;
        }

        /**
         * @param bundleId The bundle of specification information (see list below)
         * 
         * @return builder
         * 
         */
        public Builder bundleId(String bundleId) {
            return bundleId(Output.of(bundleId));
        }

        /**
         * @param cpuCount The number of vCPUs the instance has.
         * 
         * @return builder
         * 
         */
        public Builder cpuCount(@Nullable Output<Integer> cpuCount) {
            $.cpuCount = cpuCount;
            return this;
        }

        /**
         * @param cpuCount The number of vCPUs the instance has.
         * 
         * @return builder
         * 
         */
        public Builder cpuCount(Integer cpuCount) {
            return cpuCount(Output.of(cpuCount));
        }

        /**
         * @param createdAt The timestamp when the instance was created.
         * 
         * @return builder
         * 
         */
        public Builder createdAt(@Nullable Output<String> createdAt) {
            $.createdAt = createdAt;
            return this;
        }

        /**
         * @param createdAt The timestamp when the instance was created.
         * 
         * @return builder
         * 
         */
        public Builder createdAt(String createdAt) {
            return createdAt(Output.of(createdAt));
        }

        /**
         * @param ipv6Address (**Deprecated**) The first IPv6 address of the Lightsail instance. Use `ipv6_addresses` attribute instead.
         * 
         * @return builder
         * 
         * @deprecated
         * use `ipv6_addresses` attribute instead
         * 
         */
        @Deprecated /* use `ipv6_addresses` attribute instead */
        public Builder ipv6Address(@Nullable Output<String> ipv6Address) {
            $.ipv6Address = ipv6Address;
            return this;
        }

        /**
         * @param ipv6Address (**Deprecated**) The first IPv6 address of the Lightsail instance. Use `ipv6_addresses` attribute instead.
         * 
         * @return builder
         * 
         * @deprecated
         * use `ipv6_addresses` attribute instead
         * 
         */
        @Deprecated /* use `ipv6_addresses` attribute instead */
        public Builder ipv6Address(String ipv6Address) {
            return ipv6Address(Output.of(ipv6Address));
        }

        /**
         * @param ipv6Addresses List of IPv6 addresses for the Lightsail instance.
         * 
         * @return builder
         * 
         */
        public Builder ipv6Addresses(@Nullable Output<List<String>> ipv6Addresses) {
            $.ipv6Addresses = ipv6Addresses;
            return this;
        }

        /**
         * @param ipv6Addresses List of IPv6 addresses for the Lightsail instance.
         * 
         * @return builder
         * 
         */
        public Builder ipv6Addresses(List<String> ipv6Addresses) {
            return ipv6Addresses(Output.of(ipv6Addresses));
        }

        /**
         * @param ipv6Addresses List of IPv6 addresses for the Lightsail instance.
         * 
         * @return builder
         * 
         */
        public Builder ipv6Addresses(String... ipv6Addresses) {
            return ipv6Addresses(List.of(ipv6Addresses));
        }

        /**
         * @param isStaticIp A Boolean value indicating whether this instance has a static IP assigned to it.
         * 
         * @return builder
         * 
         */
        public Builder isStaticIp(@Nullable Output<Boolean> isStaticIp) {
            $.isStaticIp = isStaticIp;
            return this;
        }

        /**
         * @param isStaticIp A Boolean value indicating whether this instance has a static IP assigned to it.
         * 
         * @return builder
         * 
         */
        public Builder isStaticIp(Boolean isStaticIp) {
            return isStaticIp(Output.of(isStaticIp));
        }

        /**
         * @param keyPairName The name of your key pair. Created in the
         * Lightsail console (cannot use `aws.ec2.KeyPair` at this time)
         * 
         * @return builder
         * 
         */
        public Builder keyPairName(@Nullable Output<String> keyPairName) {
            $.keyPairName = keyPairName;
            return this;
        }

        /**
         * @param keyPairName The name of your key pair. Created in the
         * Lightsail console (cannot use `aws.ec2.KeyPair` at this time)
         * 
         * @return builder
         * 
         */
        public Builder keyPairName(String keyPairName) {
            return keyPairName(Output.of(keyPairName));
        }

        /**
         * @param name The name of the Lightsail Instance. Names be unique within each AWS Region in your Lightsail account.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the Lightsail Instance. Names be unique within each AWS Region in your Lightsail account.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param privateIpAddress The private IP address of the instance.
         * 
         * @return builder
         * 
         */
        public Builder privateIpAddress(@Nullable Output<String> privateIpAddress) {
            $.privateIpAddress = privateIpAddress;
            return this;
        }

        /**
         * @param privateIpAddress The private IP address of the instance.
         * 
         * @return builder
         * 
         */
        public Builder privateIpAddress(String privateIpAddress) {
            return privateIpAddress(Output.of(privateIpAddress));
        }

        /**
         * @param publicIpAddress The public IP address of the instance.
         * 
         * @return builder
         * 
         */
        public Builder publicIpAddress(@Nullable Output<String> publicIpAddress) {
            $.publicIpAddress = publicIpAddress;
            return this;
        }

        /**
         * @param publicIpAddress The public IP address of the instance.
         * 
         * @return builder
         * 
         */
        public Builder publicIpAddress(String publicIpAddress) {
            return publicIpAddress(Output.of(publicIpAddress));
        }

        /**
         * @param ramSize The amount of RAM in GB on the instance (e.g., 1.0).
         * 
         * @return builder
         * 
         */
        public Builder ramSize(@Nullable Output<Double> ramSize) {
            $.ramSize = ramSize;
            return this;
        }

        /**
         * @param ramSize The amount of RAM in GB on the instance (e.g., 1.0).
         * 
         * @return builder
         * 
         */
        public Builder ramSize(Double ramSize) {
            return ramSize(Output.of(ramSize));
        }

        /**
         * @param tags A map of tags to assign to the resource. To create a key-only tag, use an empty string as the value. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A map of tags to assign to the resource. To create a key-only tag, use an empty string as the value. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            $.tagsAll = tagsAll;
            return this;
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(Map<String,String> tagsAll) {
            return tagsAll(Output.of(tagsAll));
        }

        /**
         * @param userData launch script to configure server with additional user data
         * 
         * @return builder
         * 
         */
        public Builder userData(@Nullable Output<String> userData) {
            $.userData = userData;
            return this;
        }

        /**
         * @param userData launch script to configure server with additional user data
         * 
         * @return builder
         * 
         */
        public Builder userData(String userData) {
            return userData(Output.of(userData));
        }

        /**
         * @param username The user name for connecting to the instance (e.g., ec2-user).
         * 
         * @return builder
         * 
         */
        public Builder username(@Nullable Output<String> username) {
            $.username = username;
            return this;
        }

        /**
         * @param username The user name for connecting to the instance (e.g., ec2-user).
         * 
         * @return builder
         * 
         */
        public Builder username(String username) {
            return username(Output.of(username));
        }

        public InstanceState build() {
            return $;
        }
    }

}
