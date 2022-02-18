// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.activedirectory.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DomainState extends io.pulumi.resources.ResourceArgs {

    public static final DomainState Empty = new DomainState();

    /**
     * The name of delegated administrator account used to perform Active Directory operations.
     * If not specified, setupadmin will be used.
     * 
     */
    @InputImport(name="admin")
    private final @Nullable Input<String> admin;

    public Input<String> getAdmin() {
        return this.admin == null ? Input.empty() : this.admin;
    }

    /**
     * The full names of the Google Compute Engine networks the domain instance is connected to. The domain is only available on networks listed in authorizedNetworks.
     * If CIDR subnets overlap between networks, domain creation will fail.
     * 
     */
    @InputImport(name="authorizedNetworks")
    private final @Nullable Input<List<String>> authorizedNetworks;

    public Input<List<String>> getAuthorizedNetworks() {
        return this.authorizedNetworks == null ? Input.empty() : this.authorizedNetworks;
    }

    /**
     * The fully qualified domain name. e.g. mydomain.myorganization.com, with the restrictions,
     * https://cloud.google.com/managed-microsoft-ad/reference/rest/v1/projects.locations.global.domains.
     * 
     */
    @InputImport(name="domainName")
    private final @Nullable Input<String> domainName;

    public Input<String> getDomainName() {
        return this.domainName == null ? Input.empty() : this.domainName;
    }

    /**
     * The fully-qualified domain name of the exposed domain used by clients to connect to the service. Similar to what would
     * be chosen for an Active Directory set up on an internal network.
     * 
     */
    @InputImport(name="fqdn")
    private final @Nullable Input<String> fqdn;

    public Input<String> getFqdn() {
        return this.fqdn == null ? Input.empty() : this.fqdn;
    }

    /**
     * Resource labels that can contain user-provided metadata
     * 
     */
    @InputImport(name="labels")
    private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    /**
     * Locations where domain needs to be provisioned. [regions][compute/docs/regions-zones/]
     * e.g. us-west1 or us-east4 Service supports up to 4 locations at once. Each location will use a /26 block.
     * 
     */
    @InputImport(name="locations")
    private final @Nullable Input<List<String>> locations;

    public Input<List<String>> getLocations() {
        return this.locations == null ? Input.empty() : this.locations;
    }

    /**
     * The unique name of the domain using the format: 'projects/{project}/locations/global/domains/{domainName}'.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
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
     * The CIDR range of internal addresses that are reserved for this domain. Reserved networks must be /24 or larger.
     * Ranges must be unique and non-overlapping with existing subnets in authorizedNetworks
     * 
     */
    @InputImport(name="reservedIpRange")
    private final @Nullable Input<String> reservedIpRange;

    public Input<String> getReservedIpRange() {
        return this.reservedIpRange == null ? Input.empty() : this.reservedIpRange;
    }

    public DomainState(
        @Nullable Input<String> admin,
        @Nullable Input<List<String>> authorizedNetworks,
        @Nullable Input<String> domainName,
        @Nullable Input<String> fqdn,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<List<String>> locations,
        @Nullable Input<String> name,
        @Nullable Input<String> project,
        @Nullable Input<String> reservedIpRange) {
        this.admin = admin;
        this.authorizedNetworks = authorizedNetworks;
        this.domainName = domainName;
        this.fqdn = fqdn;
        this.labels = labels;
        this.locations = locations;
        this.name = name;
        this.project = project;
        this.reservedIpRange = reservedIpRange;
    }

    private DomainState() {
        this.admin = Input.empty();
        this.authorizedNetworks = Input.empty();
        this.domainName = Input.empty();
        this.fqdn = Input.empty();
        this.labels = Input.empty();
        this.locations = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
        this.reservedIpRange = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> admin;
        private @Nullable Input<List<String>> authorizedNetworks;
        private @Nullable Input<String> domainName;
        private @Nullable Input<String> fqdn;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<List<String>> locations;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;
        private @Nullable Input<String> reservedIpRange;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.admin = defaults.admin;
    	      this.authorizedNetworks = defaults.authorizedNetworks;
    	      this.domainName = defaults.domainName;
    	      this.fqdn = defaults.fqdn;
    	      this.labels = defaults.labels;
    	      this.locations = defaults.locations;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.reservedIpRange = defaults.reservedIpRange;
        }

        public Builder setAdmin(@Nullable Input<String> admin) {
            this.admin = admin;
            return this;
        }

        public Builder setAdmin(@Nullable String admin) {
            this.admin = Input.ofNullable(admin);
            return this;
        }

        public Builder setAuthorizedNetworks(@Nullable Input<List<String>> authorizedNetworks) {
            this.authorizedNetworks = authorizedNetworks;
            return this;
        }

        public Builder setAuthorizedNetworks(@Nullable List<String> authorizedNetworks) {
            this.authorizedNetworks = Input.ofNullable(authorizedNetworks);
            return this;
        }

        public Builder setDomainName(@Nullable Input<String> domainName) {
            this.domainName = domainName;
            return this;
        }

        public Builder setDomainName(@Nullable String domainName) {
            this.domainName = Input.ofNullable(domainName);
            return this;
        }

        public Builder setFqdn(@Nullable Input<String> fqdn) {
            this.fqdn = fqdn;
            return this;
        }

        public Builder setFqdn(@Nullable String fqdn) {
            this.fqdn = Input.ofNullable(fqdn);
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

        public Builder setLocations(@Nullable Input<List<String>> locations) {
            this.locations = locations;
            return this;
        }

        public Builder setLocations(@Nullable List<String> locations) {
            this.locations = Input.ofNullable(locations);
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

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setReservedIpRange(@Nullable Input<String> reservedIpRange) {
            this.reservedIpRange = reservedIpRange;
            return this;
        }

        public Builder setReservedIpRange(@Nullable String reservedIpRange) {
            this.reservedIpRange = Input.ofNullable(reservedIpRange);
            return this;
        }

        public DomainState build() {
            return new DomainState(admin, authorizedNetworks, domainName, fqdn, labels, locations, name, project, reservedIpRange);
        }
    }
}
