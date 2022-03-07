// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.docker.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.docker.inputs.NetworkIpamConfigGetArgs;
import io.pulumi.docker.inputs.NetworkLabelGetArgs;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NetworkState extends io.pulumi.resources.ResourceArgs {

    public static final NetworkState Empty = new NetworkState();

    /**
     * Enable manual container attachment to the network.
     * 
     */
    @InputImport(name="attachable")
      private final @Nullable Input<Boolean> attachable;

    public Input<Boolean> getAttachable() {
        return this.attachable == null ? Input.empty() : this.attachable;
    }

    /**
     * Requests daemon to check for networks with same name.
     * 
     */
    @InputImport(name="checkDuplicate")
      private final @Nullable Input<Boolean> checkDuplicate;

    public Input<Boolean> getCheckDuplicate() {
        return this.checkDuplicate == null ? Input.empty() : this.checkDuplicate;
    }

    /**
     * The driver of the Docker network. Possible values are `bridge`, `host`, `overlay`, `macvlan`. See [network
     * docs](https://docs.docker.com/network/#network-drivers) for more details.
     * 
     */
    @InputImport(name="driver")
      private final @Nullable Input<String> driver;

    public Input<String> getDriver() {
        return this.driver == null ? Input.empty() : this.driver;
    }

    /**
     * Create swarm routing-mesh network. Defaults to `false`.
     * 
     */
    @InputImport(name="ingress")
      private final @Nullable Input<Boolean> ingress;

    public Input<Boolean> getIngress() {
        return this.ingress == null ? Input.empty() : this.ingress;
    }

    /**
     * Whether the network is internal.
     * 
     */
    @InputImport(name="internal")
      private final @Nullable Input<Boolean> internal;

    public Input<Boolean> getInternal() {
        return this.internal == null ? Input.empty() : this.internal;
    }

    /**
     * The IPAM configuration options
     * 
     */
    @InputImport(name="ipamConfigs")
      private final @Nullable Input<List<NetworkIpamConfigGetArgs>> ipamConfigs;

    public Input<List<NetworkIpamConfigGetArgs>> getIpamConfigs() {
        return this.ipamConfigs == null ? Input.empty() : this.ipamConfigs;
    }

    /**
     * Driver used by the custom IP scheme of the network. Defaults to `default`
     * 
     */
    @InputImport(name="ipamDriver")
      private final @Nullable Input<String> ipamDriver;

    public Input<String> getIpamDriver() {
        return this.ipamDriver == null ? Input.empty() : this.ipamDriver;
    }

    /**
     * Enable IPv6 networking. Defaults to `false`.
     * 
     */
    @InputImport(name="ipv6")
      private final @Nullable Input<Boolean> ipv6;

    public Input<Boolean> getIpv6() {
        return this.ipv6 == null ? Input.empty() : this.ipv6;
    }

    /**
     * User-defined key/value metadata
     * 
     */
    @InputImport(name="labels")
      private final @Nullable Input<List<NetworkLabelGetArgs>> labels;

    public Input<List<NetworkLabelGetArgs>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    /**
     * The name of the Docker network.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Only available with bridge networks. See [bridge options
     * docs](https://docs.docker.com/engine/reference/commandline/network_create/#bridge-driver-options) for more details.
     * 
     */
    @InputImport(name="options")
      private final @Nullable Input<Map<String,Object>> options;

    public Input<Map<String,Object>> getOptions() {
        return this.options == null ? Input.empty() : this.options;
    }

    /**
     * Scope of the network. One of `swarm`, `global`, or `local`.
     * 
     */
    @InputImport(name="scope")
      private final @Nullable Input<String> scope;

    public Input<String> getScope() {
        return this.scope == null ? Input.empty() : this.scope;
    }

    public NetworkState(
        @Nullable Input<Boolean> attachable,
        @Nullable Input<Boolean> checkDuplicate,
        @Nullable Input<String> driver,
        @Nullable Input<Boolean> ingress,
        @Nullable Input<Boolean> internal,
        @Nullable Input<List<NetworkIpamConfigGetArgs>> ipamConfigs,
        @Nullable Input<String> ipamDriver,
        @Nullable Input<Boolean> ipv6,
        @Nullable Input<List<NetworkLabelGetArgs>> labels,
        @Nullable Input<String> name,
        @Nullable Input<Map<String,Object>> options,
        @Nullable Input<String> scope) {
        this.attachable = attachable;
        this.checkDuplicate = checkDuplicate;
        this.driver = driver;
        this.ingress = ingress;
        this.internal = internal;
        this.ipamConfigs = ipamConfigs;
        this.ipamDriver = ipamDriver;
        this.ipv6 = ipv6;
        this.labels = labels;
        this.name = name;
        this.options = options;
        this.scope = scope;
    }

    private NetworkState() {
        this.attachable = Input.empty();
        this.checkDuplicate = Input.empty();
        this.driver = Input.empty();
        this.ingress = Input.empty();
        this.internal = Input.empty();
        this.ipamConfigs = Input.empty();
        this.ipamDriver = Input.empty();
        this.ipv6 = Input.empty();
        this.labels = Input.empty();
        this.name = Input.empty();
        this.options = Input.empty();
        this.scope = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> attachable;
        private @Nullable Input<Boolean> checkDuplicate;
        private @Nullable Input<String> driver;
        private @Nullable Input<Boolean> ingress;
        private @Nullable Input<Boolean> internal;
        private @Nullable Input<List<NetworkIpamConfigGetArgs>> ipamConfigs;
        private @Nullable Input<String> ipamDriver;
        private @Nullable Input<Boolean> ipv6;
        private @Nullable Input<List<NetworkLabelGetArgs>> labels;
        private @Nullable Input<String> name;
        private @Nullable Input<Map<String,Object>> options;
        private @Nullable Input<String> scope;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attachable = defaults.attachable;
    	      this.checkDuplicate = defaults.checkDuplicate;
    	      this.driver = defaults.driver;
    	      this.ingress = defaults.ingress;
    	      this.internal = defaults.internal;
    	      this.ipamConfigs = defaults.ipamConfigs;
    	      this.ipamDriver = defaults.ipamDriver;
    	      this.ipv6 = defaults.ipv6;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.options = defaults.options;
    	      this.scope = defaults.scope;
        }

        public Builder setAttachable(@Nullable Input<Boolean> attachable) {
            this.attachable = attachable;
            return this;
        }

        public Builder setAttachable(@Nullable Boolean attachable) {
            this.attachable = Input.ofNullable(attachable);
            return this;
        }

        public Builder setCheckDuplicate(@Nullable Input<Boolean> checkDuplicate) {
            this.checkDuplicate = checkDuplicate;
            return this;
        }

        public Builder setCheckDuplicate(@Nullable Boolean checkDuplicate) {
            this.checkDuplicate = Input.ofNullable(checkDuplicate);
            return this;
        }

        public Builder setDriver(@Nullable Input<String> driver) {
            this.driver = driver;
            return this;
        }

        public Builder setDriver(@Nullable String driver) {
            this.driver = Input.ofNullable(driver);
            return this;
        }

        public Builder setIngress(@Nullable Input<Boolean> ingress) {
            this.ingress = ingress;
            return this;
        }

        public Builder setIngress(@Nullable Boolean ingress) {
            this.ingress = Input.ofNullable(ingress);
            return this;
        }

        public Builder setInternal(@Nullable Input<Boolean> internal) {
            this.internal = internal;
            return this;
        }

        public Builder setInternal(@Nullable Boolean internal) {
            this.internal = Input.ofNullable(internal);
            return this;
        }

        public Builder setIpamConfigs(@Nullable Input<List<NetworkIpamConfigGetArgs>> ipamConfigs) {
            this.ipamConfigs = ipamConfigs;
            return this;
        }

        public Builder setIpamConfigs(@Nullable List<NetworkIpamConfigGetArgs> ipamConfigs) {
            this.ipamConfigs = Input.ofNullable(ipamConfigs);
            return this;
        }

        public Builder setIpamDriver(@Nullable Input<String> ipamDriver) {
            this.ipamDriver = ipamDriver;
            return this;
        }

        public Builder setIpamDriver(@Nullable String ipamDriver) {
            this.ipamDriver = Input.ofNullable(ipamDriver);
            return this;
        }

        public Builder setIpv6(@Nullable Input<Boolean> ipv6) {
            this.ipv6 = ipv6;
            return this;
        }

        public Builder setIpv6(@Nullable Boolean ipv6) {
            this.ipv6 = Input.ofNullable(ipv6);
            return this;
        }

        public Builder setLabels(@Nullable Input<List<NetworkLabelGetArgs>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setLabels(@Nullable List<NetworkLabelGetArgs> labels) {
            this.labels = Input.ofNullable(labels);
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

        public Builder setOptions(@Nullable Input<Map<String,Object>> options) {
            this.options = options;
            return this;
        }

        public Builder setOptions(@Nullable Map<String,Object> options) {
            this.options = Input.ofNullable(options);
            return this;
        }

        public Builder setScope(@Nullable Input<String> scope) {
            this.scope = scope;
            return this;
        }

        public Builder setScope(@Nullable String scope) {
            this.scope = Input.ofNullable(scope);
            return this;
        }
        public NetworkState build() {
            return new NetworkState(attachable, checkDuplicate, driver, ingress, internal, ipamConfigs, ipamDriver, ipv6, labels, name, options, scope);
        }
    }
}