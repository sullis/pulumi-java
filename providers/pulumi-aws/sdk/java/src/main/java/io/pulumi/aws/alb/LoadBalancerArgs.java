// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.alb;

import io.pulumi.aws.alb.inputs.LoadBalancerAccessLogsArgs;
import io.pulumi.aws.alb.inputs.LoadBalancerSubnetMappingArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LoadBalancerArgs extends io.pulumi.resources.ResourceArgs {

    public static final LoadBalancerArgs Empty = new LoadBalancerArgs();

    /**
     * An Access Logs block. Access Logs documented below.
     * 
     */
    @Import(name="accessLogs")
      private final @Nullable Output<LoadBalancerAccessLogsArgs> accessLogs;

    public Output<LoadBalancerAccessLogsArgs> accessLogs() {
        return this.accessLogs == null ? Codegen.empty() : this.accessLogs;
    }

    /**
     * The ID of the customer owned ipv4 pool to use for this load balancer.
     * 
     */
    @Import(name="customerOwnedIpv4Pool")
      private final @Nullable Output<String> customerOwnedIpv4Pool;

    public Output<String> customerOwnedIpv4Pool() {
        return this.customerOwnedIpv4Pool == null ? Codegen.empty() : this.customerOwnedIpv4Pool;
    }

    /**
     * Determines how the load balancer handles requests that might pose a security risk to an application due to HTTP desync. Valid values are `monitor`, `defensive` (default), `strictest`.
     * 
     */
    @Import(name="desyncMitigationMode")
      private final @Nullable Output<String> desyncMitigationMode;

    public Output<String> desyncMitigationMode() {
        return this.desyncMitigationMode == null ? Codegen.empty() : this.desyncMitigationMode;
    }

    /**
     * Indicates whether HTTP headers with header fields that are not valid are removed by the load balancer (true) or routed to targets (false). The default is false. Elastic Load Balancing requires that message header names contain only alphanumeric characters and hyphens. Only valid for Load Balancers of type `application`.
     * 
     */
    @Import(name="dropInvalidHeaderFields")
      private final @Nullable Output<Boolean> dropInvalidHeaderFields;

    public Output<Boolean> dropInvalidHeaderFields() {
        return this.dropInvalidHeaderFields == null ? Codegen.empty() : this.dropInvalidHeaderFields;
    }

    /**
     * If true, cross-zone load balancing of the load balancer will be enabled.
     * This is a `network` load balancer feature. Defaults to `false`.
     * 
     */
    @Import(name="enableCrossZoneLoadBalancing")
      private final @Nullable Output<Boolean> enableCrossZoneLoadBalancing;

    public Output<Boolean> enableCrossZoneLoadBalancing() {
        return this.enableCrossZoneLoadBalancing == null ? Codegen.empty() : this.enableCrossZoneLoadBalancing;
    }

    /**
     * If true, deletion of the load balancer will be disabled via
     * the AWS API. This will prevent this provider from deleting the load balancer. Defaults to `false`.
     * 
     */
    @Import(name="enableDeletionProtection")
      private final @Nullable Output<Boolean> enableDeletionProtection;

    public Output<Boolean> enableDeletionProtection() {
        return this.enableDeletionProtection == null ? Codegen.empty() : this.enableDeletionProtection;
    }

    /**
     * Indicates whether HTTP/2 is enabled in `application` load balancers. Defaults to `true`.
     * 
     */
    @Import(name="enableHttp2")
      private final @Nullable Output<Boolean> enableHttp2;

    public Output<Boolean> enableHttp2() {
        return this.enableHttp2 == null ? Codegen.empty() : this.enableHttp2;
    }

    /**
     * Indicates whether to allow a WAF-enabled load balancer to route requests to targets if it is unable to forward the request to AWS WAF. Defaults to `false`.
     * 
     */
    @Import(name="enableWafFailOpen")
      private final @Nullable Output<Boolean> enableWafFailOpen;

    public Output<Boolean> enableWafFailOpen() {
        return this.enableWafFailOpen == null ? Codegen.empty() : this.enableWafFailOpen;
    }

    /**
     * The time in seconds that the connection is allowed to be idle. Only valid for Load Balancers of type `application`. Default: 60.
     * 
     */
    @Import(name="idleTimeout")
      private final @Nullable Output<Integer> idleTimeout;

    public Output<Integer> idleTimeout() {
        return this.idleTimeout == null ? Codegen.empty() : this.idleTimeout;
    }

    /**
     * If true, the LB will be internal.
     * 
     */
    @Import(name="internal")
      private final @Nullable Output<Boolean> internal;

    public Output<Boolean> internal() {
        return this.internal == null ? Codegen.empty() : this.internal;
    }

    /**
     * The type of IP addresses used by the subnets for your load balancer. The possible values are `ipv4` and `dualstack`
     * 
     */
    @Import(name="ipAddressType")
      private final @Nullable Output<String> ipAddressType;

    public Output<String> ipAddressType() {
        return this.ipAddressType == null ? Codegen.empty() : this.ipAddressType;
    }

    /**
     * The type of load balancer to create. Possible values are `application`, `gateway`, or `network`. The default value is `application`.
     * 
     */
    @Import(name="loadBalancerType")
      private final @Nullable Output<String> loadBalancerType;

    public Output<String> loadBalancerType() {
        return this.loadBalancerType == null ? Codegen.empty() : this.loadBalancerType;
    }

    /**
     * The name of the LB. This name must be unique within your AWS account, can have a maximum of 32 characters,
     * must contain only alphanumeric characters or hyphens, and must not begin or end with a hyphen. If not specified,
     * this provider will autogenerate a name beginning with `tf-lb`.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
     * 
     */
    @Import(name="namePrefix")
      private final @Nullable Output<String> namePrefix;

    public Output<String> namePrefix() {
        return this.namePrefix == null ? Codegen.empty() : this.namePrefix;
    }

    /**
     * A list of security group IDs to assign to the LB. Only valid for Load Balancers of type `application`.
     * 
     */
    @Import(name="securityGroups")
      private final @Nullable Output<List<String>> securityGroups;

    public Output<List<String>> securityGroups() {
        return this.securityGroups == null ? Codegen.empty() : this.securityGroups;
    }

    /**
     * A subnet mapping block as documented below.
     * 
     */
    @Import(name="subnetMappings")
      private final @Nullable Output<List<LoadBalancerSubnetMappingArgs>> subnetMappings;

    public Output<List<LoadBalancerSubnetMappingArgs>> subnetMappings() {
        return this.subnetMappings == null ? Codegen.empty() : this.subnetMappings;
    }

    /**
     * A list of subnet IDs to attach to the LB. Subnets
     * cannot be updated for Load Balancers of type `network`. Changing this value
     * for load balancers of type `network` will force a recreation of the resource.
     * 
     */
    @Import(name="subnets")
      private final @Nullable Output<List<String>> subnets;

    public Output<List<String>> subnets() {
        return this.subnets == null ? Codegen.empty() : this.subnets;
    }

    /**
     * A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public LoadBalancerArgs(
        @Nullable Output<LoadBalancerAccessLogsArgs> accessLogs,
        @Nullable Output<String> customerOwnedIpv4Pool,
        @Nullable Output<String> desyncMitigationMode,
        @Nullable Output<Boolean> dropInvalidHeaderFields,
        @Nullable Output<Boolean> enableCrossZoneLoadBalancing,
        @Nullable Output<Boolean> enableDeletionProtection,
        @Nullable Output<Boolean> enableHttp2,
        @Nullable Output<Boolean> enableWafFailOpen,
        @Nullable Output<Integer> idleTimeout,
        @Nullable Output<Boolean> internal,
        @Nullable Output<String> ipAddressType,
        @Nullable Output<String> loadBalancerType,
        @Nullable Output<String> name,
        @Nullable Output<String> namePrefix,
        @Nullable Output<List<String>> securityGroups,
        @Nullable Output<List<LoadBalancerSubnetMappingArgs>> subnetMappings,
        @Nullable Output<List<String>> subnets,
        @Nullable Output<Map<String,String>> tags) {
        this.accessLogs = accessLogs;
        this.customerOwnedIpv4Pool = customerOwnedIpv4Pool;
        this.desyncMitigationMode = desyncMitigationMode;
        this.dropInvalidHeaderFields = dropInvalidHeaderFields;
        this.enableCrossZoneLoadBalancing = enableCrossZoneLoadBalancing;
        this.enableDeletionProtection = enableDeletionProtection;
        this.enableHttp2 = enableHttp2;
        this.enableWafFailOpen = enableWafFailOpen;
        this.idleTimeout = idleTimeout;
        this.internal = internal;
        this.ipAddressType = ipAddressType;
        this.loadBalancerType = loadBalancerType;
        this.name = name;
        this.namePrefix = namePrefix;
        this.securityGroups = securityGroups;
        this.subnetMappings = subnetMappings;
        this.subnets = subnets;
        this.tags = tags;
    }

    private LoadBalancerArgs() {
        this.accessLogs = Codegen.empty();
        this.customerOwnedIpv4Pool = Codegen.empty();
        this.desyncMitigationMode = Codegen.empty();
        this.dropInvalidHeaderFields = Codegen.empty();
        this.enableCrossZoneLoadBalancing = Codegen.empty();
        this.enableDeletionProtection = Codegen.empty();
        this.enableHttp2 = Codegen.empty();
        this.enableWafFailOpen = Codegen.empty();
        this.idleTimeout = Codegen.empty();
        this.internal = Codegen.empty();
        this.ipAddressType = Codegen.empty();
        this.loadBalancerType = Codegen.empty();
        this.name = Codegen.empty();
        this.namePrefix = Codegen.empty();
        this.securityGroups = Codegen.empty();
        this.subnetMappings = Codegen.empty();
        this.subnets = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoadBalancerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<LoadBalancerAccessLogsArgs> accessLogs;
        private @Nullable Output<String> customerOwnedIpv4Pool;
        private @Nullable Output<String> desyncMitigationMode;
        private @Nullable Output<Boolean> dropInvalidHeaderFields;
        private @Nullable Output<Boolean> enableCrossZoneLoadBalancing;
        private @Nullable Output<Boolean> enableDeletionProtection;
        private @Nullable Output<Boolean> enableHttp2;
        private @Nullable Output<Boolean> enableWafFailOpen;
        private @Nullable Output<Integer> idleTimeout;
        private @Nullable Output<Boolean> internal;
        private @Nullable Output<String> ipAddressType;
        private @Nullable Output<String> loadBalancerType;
        private @Nullable Output<String> name;
        private @Nullable Output<String> namePrefix;
        private @Nullable Output<List<String>> securityGroups;
        private @Nullable Output<List<LoadBalancerSubnetMappingArgs>> subnetMappings;
        private @Nullable Output<List<String>> subnets;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(LoadBalancerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessLogs = defaults.accessLogs;
    	      this.customerOwnedIpv4Pool = defaults.customerOwnedIpv4Pool;
    	      this.desyncMitigationMode = defaults.desyncMitigationMode;
    	      this.dropInvalidHeaderFields = defaults.dropInvalidHeaderFields;
    	      this.enableCrossZoneLoadBalancing = defaults.enableCrossZoneLoadBalancing;
    	      this.enableDeletionProtection = defaults.enableDeletionProtection;
    	      this.enableHttp2 = defaults.enableHttp2;
    	      this.enableWafFailOpen = defaults.enableWafFailOpen;
    	      this.idleTimeout = defaults.idleTimeout;
    	      this.internal = defaults.internal;
    	      this.ipAddressType = defaults.ipAddressType;
    	      this.loadBalancerType = defaults.loadBalancerType;
    	      this.name = defaults.name;
    	      this.namePrefix = defaults.namePrefix;
    	      this.securityGroups = defaults.securityGroups;
    	      this.subnetMappings = defaults.subnetMappings;
    	      this.subnets = defaults.subnets;
    	      this.tags = defaults.tags;
        }

        public Builder accessLogs(@Nullable Output<LoadBalancerAccessLogsArgs> accessLogs) {
            this.accessLogs = accessLogs;
            return this;
        }
        public Builder accessLogs(@Nullable LoadBalancerAccessLogsArgs accessLogs) {
            this.accessLogs = Codegen.ofNullable(accessLogs);
            return this;
        }
        public Builder customerOwnedIpv4Pool(@Nullable Output<String> customerOwnedIpv4Pool) {
            this.customerOwnedIpv4Pool = customerOwnedIpv4Pool;
            return this;
        }
        public Builder customerOwnedIpv4Pool(@Nullable String customerOwnedIpv4Pool) {
            this.customerOwnedIpv4Pool = Codegen.ofNullable(customerOwnedIpv4Pool);
            return this;
        }
        public Builder desyncMitigationMode(@Nullable Output<String> desyncMitigationMode) {
            this.desyncMitigationMode = desyncMitigationMode;
            return this;
        }
        public Builder desyncMitigationMode(@Nullable String desyncMitigationMode) {
            this.desyncMitigationMode = Codegen.ofNullable(desyncMitigationMode);
            return this;
        }
        public Builder dropInvalidHeaderFields(@Nullable Output<Boolean> dropInvalidHeaderFields) {
            this.dropInvalidHeaderFields = dropInvalidHeaderFields;
            return this;
        }
        public Builder dropInvalidHeaderFields(@Nullable Boolean dropInvalidHeaderFields) {
            this.dropInvalidHeaderFields = Codegen.ofNullable(dropInvalidHeaderFields);
            return this;
        }
        public Builder enableCrossZoneLoadBalancing(@Nullable Output<Boolean> enableCrossZoneLoadBalancing) {
            this.enableCrossZoneLoadBalancing = enableCrossZoneLoadBalancing;
            return this;
        }
        public Builder enableCrossZoneLoadBalancing(@Nullable Boolean enableCrossZoneLoadBalancing) {
            this.enableCrossZoneLoadBalancing = Codegen.ofNullable(enableCrossZoneLoadBalancing);
            return this;
        }
        public Builder enableDeletionProtection(@Nullable Output<Boolean> enableDeletionProtection) {
            this.enableDeletionProtection = enableDeletionProtection;
            return this;
        }
        public Builder enableDeletionProtection(@Nullable Boolean enableDeletionProtection) {
            this.enableDeletionProtection = Codegen.ofNullable(enableDeletionProtection);
            return this;
        }
        public Builder enableHttp2(@Nullable Output<Boolean> enableHttp2) {
            this.enableHttp2 = enableHttp2;
            return this;
        }
        public Builder enableHttp2(@Nullable Boolean enableHttp2) {
            this.enableHttp2 = Codegen.ofNullable(enableHttp2);
            return this;
        }
        public Builder enableWafFailOpen(@Nullable Output<Boolean> enableWafFailOpen) {
            this.enableWafFailOpen = enableWafFailOpen;
            return this;
        }
        public Builder enableWafFailOpen(@Nullable Boolean enableWafFailOpen) {
            this.enableWafFailOpen = Codegen.ofNullable(enableWafFailOpen);
            return this;
        }
        public Builder idleTimeout(@Nullable Output<Integer> idleTimeout) {
            this.idleTimeout = idleTimeout;
            return this;
        }
        public Builder idleTimeout(@Nullable Integer idleTimeout) {
            this.idleTimeout = Codegen.ofNullable(idleTimeout);
            return this;
        }
        public Builder internal(@Nullable Output<Boolean> internal) {
            this.internal = internal;
            return this;
        }
        public Builder internal(@Nullable Boolean internal) {
            this.internal = Codegen.ofNullable(internal);
            return this;
        }
        public Builder ipAddressType(@Nullable Output<String> ipAddressType) {
            this.ipAddressType = ipAddressType;
            return this;
        }
        public Builder ipAddressType(@Nullable String ipAddressType) {
            this.ipAddressType = Codegen.ofNullable(ipAddressType);
            return this;
        }
        public Builder loadBalancerType(@Nullable Output<String> loadBalancerType) {
            this.loadBalancerType = loadBalancerType;
            return this;
        }
        public Builder loadBalancerType(@Nullable String loadBalancerType) {
            this.loadBalancerType = Codegen.ofNullable(loadBalancerType);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder namePrefix(@Nullable Output<String> namePrefix) {
            this.namePrefix = namePrefix;
            return this;
        }
        public Builder namePrefix(@Nullable String namePrefix) {
            this.namePrefix = Codegen.ofNullable(namePrefix);
            return this;
        }
        public Builder securityGroups(@Nullable Output<List<String>> securityGroups) {
            this.securityGroups = securityGroups;
            return this;
        }
        public Builder securityGroups(@Nullable List<String> securityGroups) {
            this.securityGroups = Codegen.ofNullable(securityGroups);
            return this;
        }
        public Builder securityGroups(String... securityGroups) {
            return securityGroups(List.of(securityGroups));
        }
        public Builder subnetMappings(@Nullable Output<List<LoadBalancerSubnetMappingArgs>> subnetMappings) {
            this.subnetMappings = subnetMappings;
            return this;
        }
        public Builder subnetMappings(@Nullable List<LoadBalancerSubnetMappingArgs> subnetMappings) {
            this.subnetMappings = Codegen.ofNullable(subnetMappings);
            return this;
        }
        public Builder subnetMappings(LoadBalancerSubnetMappingArgs... subnetMappings) {
            return subnetMappings(List.of(subnetMappings));
        }
        public Builder subnets(@Nullable Output<List<String>> subnets) {
            this.subnets = subnets;
            return this;
        }
        public Builder subnets(@Nullable List<String> subnets) {
            this.subnets = Codegen.ofNullable(subnets);
            return this;
        }
        public Builder subnets(String... subnets) {
            return subnets(List.of(subnets));
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }        public LoadBalancerArgs build() {
            return new LoadBalancerArgs(accessLogs, customerOwnedIpv4Pool, desyncMitigationMode, dropInvalidHeaderFields, enableCrossZoneLoadBalancing, enableDeletionProtection, enableHttp2, enableWafFailOpen, idleTimeout, internal, ipAddressType, loadBalancerType, name, namePrefix, securityGroups, subnetMappings, subnets, tags);
        }
    }
}
