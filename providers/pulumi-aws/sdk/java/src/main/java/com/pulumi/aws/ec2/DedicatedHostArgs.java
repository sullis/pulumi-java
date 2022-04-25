// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DedicatedHostArgs extends com.pulumi.resources.ResourceArgs {

    public static final DedicatedHostArgs Empty = new DedicatedHostArgs();

    /**
     * Indicates whether the host accepts any untargeted instance launches that match its instance type configuration, or if it only accepts Host tenancy instance launches that specify its unique host ID. Valid values: `on`, `off`. Default: `on`.
     * 
     */
    @Import(name="autoPlacement")
    private @Nullable Output<String> autoPlacement;

    /**
     * @return Indicates whether the host accepts any untargeted instance launches that match its instance type configuration, or if it only accepts Host tenancy instance launches that specify its unique host ID. Valid values: `on`, `off`. Default: `on`.
     * 
     */
    public Optional<Output<String>> autoPlacement() {
        return Optional.ofNullable(this.autoPlacement);
    }

    /**
     * The Availability Zone in which to allocate the Dedicated Host.
     * 
     */
    @Import(name="availabilityZone", required=true)
    private Output<String> availabilityZone;

    /**
     * @return The Availability Zone in which to allocate the Dedicated Host.
     * 
     */
    public Output<String> availabilityZone() {
        return this.availabilityZone;
    }

    /**
     * Indicates whether to enable or disable host recovery for the Dedicated Host. Valid values: `on`, `off`. Default: `off`.
     * 
     */
    @Import(name="hostRecovery")
    private @Nullable Output<String> hostRecovery;

    /**
     * @return Indicates whether to enable or disable host recovery for the Dedicated Host. Valid values: `on`, `off`. Default: `off`.
     * 
     */
    public Optional<Output<String>> hostRecovery() {
        return Optional.ofNullable(this.hostRecovery);
    }

    /**
     * Specifies the instance family to be supported by the Dedicated Hosts. If you specify an instance family, the Dedicated Hosts support multiple instance types within that instance family. Exactly one of `instance_family` or `instance_type` must be specified.
     * 
     */
    @Import(name="instanceFamily")
    private @Nullable Output<String> instanceFamily;

    /**
     * @return Specifies the instance family to be supported by the Dedicated Hosts. If you specify an instance family, the Dedicated Hosts support multiple instance types within that instance family. Exactly one of `instance_family` or `instance_type` must be specified.
     * 
     */
    public Optional<Output<String>> instanceFamily() {
        return Optional.ofNullable(this.instanceFamily);
    }

    /**
     * Specifies the instance type to be supported by the Dedicated Hosts. If you specify an instance type, the Dedicated Hosts support instances of the specified instance type only.  Exactly one of `instance_family` or `instance_type` must be specified.
     * 
     */
    @Import(name="instanceType")
    private @Nullable Output<String> instanceType;

    /**
     * @return Specifies the instance type to be supported by the Dedicated Hosts. If you specify an instance type, the Dedicated Hosts support instances of the specified instance type only.  Exactly one of `instance_family` or `instance_type` must be specified.
     * 
     */
    public Optional<Output<String>> instanceType() {
        return Optional.ofNullable(this.instanceType);
    }

    /**
     * Map of tags to assign to this resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Map of tags to assign to this resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private DedicatedHostArgs() {}

    private DedicatedHostArgs(DedicatedHostArgs $) {
        this.autoPlacement = $.autoPlacement;
        this.availabilityZone = $.availabilityZone;
        this.hostRecovery = $.hostRecovery;
        this.instanceFamily = $.instanceFamily;
        this.instanceType = $.instanceType;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DedicatedHostArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DedicatedHostArgs $;

        public Builder() {
            $ = new DedicatedHostArgs();
        }

        public Builder(DedicatedHostArgs defaults) {
            $ = new DedicatedHostArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param autoPlacement Indicates whether the host accepts any untargeted instance launches that match its instance type configuration, or if it only accepts Host tenancy instance launches that specify its unique host ID. Valid values: `on`, `off`. Default: `on`.
         * 
         * @return builder
         * 
         */
        public Builder autoPlacement(@Nullable Output<String> autoPlacement) {
            $.autoPlacement = autoPlacement;
            return this;
        }

        /**
         * @param autoPlacement Indicates whether the host accepts any untargeted instance launches that match its instance type configuration, or if it only accepts Host tenancy instance launches that specify its unique host ID. Valid values: `on`, `off`. Default: `on`.
         * 
         * @return builder
         * 
         */
        public Builder autoPlacement(String autoPlacement) {
            return autoPlacement(Output.of(autoPlacement));
        }

        /**
         * @param availabilityZone The Availability Zone in which to allocate the Dedicated Host.
         * 
         * @return builder
         * 
         */
        public Builder availabilityZone(Output<String> availabilityZone) {
            $.availabilityZone = availabilityZone;
            return this;
        }

        /**
         * @param availabilityZone The Availability Zone in which to allocate the Dedicated Host.
         * 
         * @return builder
         * 
         */
        public Builder availabilityZone(String availabilityZone) {
            return availabilityZone(Output.of(availabilityZone));
        }

        /**
         * @param hostRecovery Indicates whether to enable or disable host recovery for the Dedicated Host. Valid values: `on`, `off`. Default: `off`.
         * 
         * @return builder
         * 
         */
        public Builder hostRecovery(@Nullable Output<String> hostRecovery) {
            $.hostRecovery = hostRecovery;
            return this;
        }

        /**
         * @param hostRecovery Indicates whether to enable or disable host recovery for the Dedicated Host. Valid values: `on`, `off`. Default: `off`.
         * 
         * @return builder
         * 
         */
        public Builder hostRecovery(String hostRecovery) {
            return hostRecovery(Output.of(hostRecovery));
        }

        /**
         * @param instanceFamily Specifies the instance family to be supported by the Dedicated Hosts. If you specify an instance family, the Dedicated Hosts support multiple instance types within that instance family. Exactly one of `instance_family` or `instance_type` must be specified.
         * 
         * @return builder
         * 
         */
        public Builder instanceFamily(@Nullable Output<String> instanceFamily) {
            $.instanceFamily = instanceFamily;
            return this;
        }

        /**
         * @param instanceFamily Specifies the instance family to be supported by the Dedicated Hosts. If you specify an instance family, the Dedicated Hosts support multiple instance types within that instance family. Exactly one of `instance_family` or `instance_type` must be specified.
         * 
         * @return builder
         * 
         */
        public Builder instanceFamily(String instanceFamily) {
            return instanceFamily(Output.of(instanceFamily));
        }

        /**
         * @param instanceType Specifies the instance type to be supported by the Dedicated Hosts. If you specify an instance type, the Dedicated Hosts support instances of the specified instance type only.  Exactly one of `instance_family` or `instance_type` must be specified.
         * 
         * @return builder
         * 
         */
        public Builder instanceType(@Nullable Output<String> instanceType) {
            $.instanceType = instanceType;
            return this;
        }

        /**
         * @param instanceType Specifies the instance type to be supported by the Dedicated Hosts. If you specify an instance type, the Dedicated Hosts support instances of the specified instance type only.  Exactly one of `instance_family` or `instance_type` must be specified.
         * 
         * @return builder
         * 
         */
        public Builder instanceType(String instanceType) {
            return instanceType(Output.of(instanceType));
        }

        /**
         * @param tags Map of tags to assign to this resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Map of tags to assign to this resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public DedicatedHostArgs build() {
            $.availabilityZone = Objects.requireNonNull($.availabilityZone, "expected parameter 'availabilityZone' to be non-null");
            return $;
        }
    }

}
