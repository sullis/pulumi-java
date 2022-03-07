// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dns.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.dns.inputs.ManagedZoneDnssecConfigGetArgs;
import io.pulumi.gcp.dns.inputs.ManagedZoneForwardingConfigGetArgs;
import io.pulumi.gcp.dns.inputs.ManagedZonePeeringConfigGetArgs;
import io.pulumi.gcp.dns.inputs.ManagedZonePrivateVisibilityConfigGetArgs;
import io.pulumi.gcp.dns.inputs.ManagedZoneServiceDirectoryConfigGetArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ManagedZoneState extends io.pulumi.resources.ResourceArgs {

    public static final ManagedZoneState Empty = new ManagedZoneState();

    /**
     * A textual description field. Defaults to 'Managed by Pulumi'.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The DNS name of this managed zone, for instance "example.com.".
     * 
     */
    @InputImport(name="dnsName")
      private final @Nullable Input<String> dnsName;

    public Input<String> getDnsName() {
        return this.dnsName == null ? Input.empty() : this.dnsName;
    }

    /**
     * DNSSEC configuration
     * Structure is documented below.
     * 
     */
    @InputImport(name="dnssecConfig")
      private final @Nullable Input<ManagedZoneDnssecConfigGetArgs> dnssecConfig;

    public Input<ManagedZoneDnssecConfigGetArgs> getDnssecConfig() {
        return this.dnssecConfig == null ? Input.empty() : this.dnssecConfig;
    }

    /**
     * Set this true to delete all records in the zone.
     * 
     */
    @InputImport(name="forceDestroy")
      private final @Nullable Input<Boolean> forceDestroy;

    public Input<Boolean> getForceDestroy() {
        return this.forceDestroy == null ? Input.empty() : this.forceDestroy;
    }

    /**
     * The presence for this field indicates that outbound forwarding is enabled
     * for this zone. The value of this field contains the set of destinations
     * to forward to.
     * Structure is documented below.
     * 
     */
    @InputImport(name="forwardingConfig")
      private final @Nullable Input<ManagedZoneForwardingConfigGetArgs> forwardingConfig;

    public Input<ManagedZoneForwardingConfigGetArgs> getForwardingConfig() {
        return this.forwardingConfig == null ? Input.empty() : this.forwardingConfig;
    }

    /**
     * A set of key/value label pairs to assign to this ManagedZone.
     * 
     */
    @InputImport(name="labels")
      private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    /**
     * User assigned name for this resource.
     * Must be unique within the project.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Delegate your managed_zone to these virtual name servers; defined by the server
     * 
     */
    @InputImport(name="nameServers")
      private final @Nullable Input<List<String>> nameServers;

    public Input<List<String>> getNameServers() {
        return this.nameServers == null ? Input.empty() : this.nameServers;
    }

    /**
     * The presence of this field indicates that DNS Peering is enabled for this
     * zone. The value of this field contains the network to peer with.
     * Structure is documented below.
     * 
     */
    @InputImport(name="peeringConfig")
      private final @Nullable Input<ManagedZonePeeringConfigGetArgs> peeringConfig;

    public Input<ManagedZonePeeringConfigGetArgs> getPeeringConfig() {
        return this.peeringConfig == null ? Input.empty() : this.peeringConfig;
    }

    /**
     * For privately visible zones, the set of Virtual Private Cloud
     * resources that the zone is visible from.
     * Structure is documented below.
     * 
     */
    @InputImport(name="privateVisibilityConfig")
      private final @Nullable Input<ManagedZonePrivateVisibilityConfigGetArgs> privateVisibilityConfig;

    public Input<ManagedZonePrivateVisibilityConfigGetArgs> getPrivateVisibilityConfig() {
        return this.privateVisibilityConfig == null ? Input.empty() : this.privateVisibilityConfig;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * Specifies if this is a managed reverse lookup zone. If true, Cloud DNS will resolve reverse
     * lookup queries using automatically configured records for VPC resources. This only applies
     * to networks listed under `private_visibility_config`.
     * 
     */
    @InputImport(name="reverseLookup")
      private final @Nullable Input<Boolean> reverseLookup;

    public Input<Boolean> getReverseLookup() {
        return this.reverseLookup == null ? Input.empty() : this.reverseLookup;
    }

    /**
     * The presence of this field indicates that this zone is backed by Service Directory. The value of this field contains information related to the namespace associated with the zone.
     * Structure is documented below.
     * 
     */
    @InputImport(name="serviceDirectoryConfig")
      private final @Nullable Input<ManagedZoneServiceDirectoryConfigGetArgs> serviceDirectoryConfig;

    public Input<ManagedZoneServiceDirectoryConfigGetArgs> getServiceDirectoryConfig() {
        return this.serviceDirectoryConfig == null ? Input.empty() : this.serviceDirectoryConfig;
    }

    /**
     * The zone's visibility: public zones are exposed to the Internet,
     * while private zones are visible only to Virtual Private Cloud resources.
     * Default value is `public`.
     * Possible values are `private` and `public`.
     * 
     */
    @InputImport(name="visibility")
      private final @Nullable Input<String> visibility;

    public Input<String> getVisibility() {
        return this.visibility == null ? Input.empty() : this.visibility;
    }

    public ManagedZoneState(
        @Nullable Input<String> description,
        @Nullable Input<String> dnsName,
        @Nullable Input<ManagedZoneDnssecConfigGetArgs> dnssecConfig,
        @Nullable Input<Boolean> forceDestroy,
        @Nullable Input<ManagedZoneForwardingConfigGetArgs> forwardingConfig,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<String> name,
        @Nullable Input<List<String>> nameServers,
        @Nullable Input<ManagedZonePeeringConfigGetArgs> peeringConfig,
        @Nullable Input<ManagedZonePrivateVisibilityConfigGetArgs> privateVisibilityConfig,
        @Nullable Input<String> project,
        @Nullable Input<Boolean> reverseLookup,
        @Nullable Input<ManagedZoneServiceDirectoryConfigGetArgs> serviceDirectoryConfig,
        @Nullable Input<String> visibility) {
        this.description = description == null ? Input.ofNullable("Managed by Pulumi") : description;
        this.dnsName = dnsName;
        this.dnssecConfig = dnssecConfig;
        this.forceDestroy = forceDestroy;
        this.forwardingConfig = forwardingConfig;
        this.labels = labels;
        this.name = name;
        this.nameServers = nameServers;
        this.peeringConfig = peeringConfig;
        this.privateVisibilityConfig = privateVisibilityConfig;
        this.project = project;
        this.reverseLookup = reverseLookup;
        this.serviceDirectoryConfig = serviceDirectoryConfig;
        this.visibility = visibility;
    }

    private ManagedZoneState() {
        this.description = Input.empty();
        this.dnsName = Input.empty();
        this.dnssecConfig = Input.empty();
        this.forceDestroy = Input.empty();
        this.forwardingConfig = Input.empty();
        this.labels = Input.empty();
        this.name = Input.empty();
        this.nameServers = Input.empty();
        this.peeringConfig = Input.empty();
        this.privateVisibilityConfig = Input.empty();
        this.project = Input.empty();
        this.reverseLookup = Input.empty();
        this.serviceDirectoryConfig = Input.empty();
        this.visibility = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedZoneState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private @Nullable Input<String> dnsName;
        private @Nullable Input<ManagedZoneDnssecConfigGetArgs> dnssecConfig;
        private @Nullable Input<Boolean> forceDestroy;
        private @Nullable Input<ManagedZoneForwardingConfigGetArgs> forwardingConfig;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<String> name;
        private @Nullable Input<List<String>> nameServers;
        private @Nullable Input<ManagedZonePeeringConfigGetArgs> peeringConfig;
        private @Nullable Input<ManagedZonePrivateVisibilityConfigGetArgs> privateVisibilityConfig;
        private @Nullable Input<String> project;
        private @Nullable Input<Boolean> reverseLookup;
        private @Nullable Input<ManagedZoneServiceDirectoryConfigGetArgs> serviceDirectoryConfig;
        private @Nullable Input<String> visibility;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedZoneState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.dnsName = defaults.dnsName;
    	      this.dnssecConfig = defaults.dnssecConfig;
    	      this.forceDestroy = defaults.forceDestroy;
    	      this.forwardingConfig = defaults.forwardingConfig;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.nameServers = defaults.nameServers;
    	      this.peeringConfig = defaults.peeringConfig;
    	      this.privateVisibilityConfig = defaults.privateVisibilityConfig;
    	      this.project = defaults.project;
    	      this.reverseLookup = defaults.reverseLookup;
    	      this.serviceDirectoryConfig = defaults.serviceDirectoryConfig;
    	      this.visibility = defaults.visibility;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setDnsName(@Nullable Input<String> dnsName) {
            this.dnsName = dnsName;
            return this;
        }

        public Builder setDnsName(@Nullable String dnsName) {
            this.dnsName = Input.ofNullable(dnsName);
            return this;
        }

        public Builder setDnssecConfig(@Nullable Input<ManagedZoneDnssecConfigGetArgs> dnssecConfig) {
            this.dnssecConfig = dnssecConfig;
            return this;
        }

        public Builder setDnssecConfig(@Nullable ManagedZoneDnssecConfigGetArgs dnssecConfig) {
            this.dnssecConfig = Input.ofNullable(dnssecConfig);
            return this;
        }

        public Builder setForceDestroy(@Nullable Input<Boolean> forceDestroy) {
            this.forceDestroy = forceDestroy;
            return this;
        }

        public Builder setForceDestroy(@Nullable Boolean forceDestroy) {
            this.forceDestroy = Input.ofNullable(forceDestroy);
            return this;
        }

        public Builder setForwardingConfig(@Nullable Input<ManagedZoneForwardingConfigGetArgs> forwardingConfig) {
            this.forwardingConfig = forwardingConfig;
            return this;
        }

        public Builder setForwardingConfig(@Nullable ManagedZoneForwardingConfigGetArgs forwardingConfig) {
            this.forwardingConfig = Input.ofNullable(forwardingConfig);
            return this;
        }

        public Builder setLabels(@Nullable Input<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setLabels(@Nullable Map<String,String> labels) {
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

        public Builder setNameServers(@Nullable Input<List<String>> nameServers) {
            this.nameServers = nameServers;
            return this;
        }

        public Builder setNameServers(@Nullable List<String> nameServers) {
            this.nameServers = Input.ofNullable(nameServers);
            return this;
        }

        public Builder setPeeringConfig(@Nullable Input<ManagedZonePeeringConfigGetArgs> peeringConfig) {
            this.peeringConfig = peeringConfig;
            return this;
        }

        public Builder setPeeringConfig(@Nullable ManagedZonePeeringConfigGetArgs peeringConfig) {
            this.peeringConfig = Input.ofNullable(peeringConfig);
            return this;
        }

        public Builder setPrivateVisibilityConfig(@Nullable Input<ManagedZonePrivateVisibilityConfigGetArgs> privateVisibilityConfig) {
            this.privateVisibilityConfig = privateVisibilityConfig;
            return this;
        }

        public Builder setPrivateVisibilityConfig(@Nullable ManagedZonePrivateVisibilityConfigGetArgs privateVisibilityConfig) {
            this.privateVisibilityConfig = Input.ofNullable(privateVisibilityConfig);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setReverseLookup(@Nullable Input<Boolean> reverseLookup) {
            this.reverseLookup = reverseLookup;
            return this;
        }

        public Builder setReverseLookup(@Nullable Boolean reverseLookup) {
            this.reverseLookup = Input.ofNullable(reverseLookup);
            return this;
        }

        public Builder setServiceDirectoryConfig(@Nullable Input<ManagedZoneServiceDirectoryConfigGetArgs> serviceDirectoryConfig) {
            this.serviceDirectoryConfig = serviceDirectoryConfig;
            return this;
        }

        public Builder setServiceDirectoryConfig(@Nullable ManagedZoneServiceDirectoryConfigGetArgs serviceDirectoryConfig) {
            this.serviceDirectoryConfig = Input.ofNullable(serviceDirectoryConfig);
            return this;
        }

        public Builder setVisibility(@Nullable Input<String> visibility) {
            this.visibility = visibility;
            return this;
        }

        public Builder setVisibility(@Nullable String visibility) {
            this.visibility = Input.ofNullable(visibility);
            return this;
        }
        public ManagedZoneState build() {
            return new ManagedZoneState(description, dnsName, dnssecConfig, forceDestroy, forwardingConfig, labels, name, nameServers, peeringConfig, privateVisibilityConfig, project, reverseLookup, serviceDirectoryConfig, visibility);
        }
    }
}