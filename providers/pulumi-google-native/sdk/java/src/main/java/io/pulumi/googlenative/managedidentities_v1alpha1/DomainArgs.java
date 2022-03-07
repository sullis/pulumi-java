// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.managedidentities_v1alpha1;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DomainArgs extends io.pulumi.resources.ResourceArgs {

    public static final DomainArgs Empty = new DomainArgs();

    /**
     * Optional. Configuration for audit logs. True if audit logs are enabled, else false. Default is audit logs disabled.
     * 
     */
    @InputImport(name="auditLogsEnabled")
      private final @Nullable Input<Boolean> auditLogsEnabled;

    public Input<Boolean> getAuditLogsEnabled() {
        return this.auditLogsEnabled == null ? Input.empty() : this.auditLogsEnabled;
    }

    /**
     * Optional. The full names of the Google Compute Engine [networks](/compute/docs/networks-and-firewalls#networks) to which the instance is connected. Network can be added using UpdateDomain later. Domain is only available on network part of authorized_networks. Caller needs to make sure that CIDR subnets do not overlap between networks, else domain creation will fail.
     * 
     */
    @InputImport(name="authorizedNetworks")
      private final @Nullable Input<List<String>> authorizedNetworks;

    public Input<List<String>> getAuthorizedNetworks() {
        return this.authorizedNetworks == null ? Input.empty() : this.authorizedNetworks;
    }

    @InputImport(name="domainName")
      private final @Nullable Input<String> domainName;

    public Input<String> getDomainName() {
        return this.domainName == null ? Input.empty() : this.domainName;
    }

    /**
     * Optional. Resource labels to represent user provided metadata
     * 
     */
    @InputImport(name="labels")
      private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    /**
     * Locations where domain needs to be provisioned. regions e.g. us-west1 or us-east4 Service supports up to 4 locations at once. Each location will use a /26 block.
     * 
     */
    @InputImport(name="locations", required=true)
      private final Input<List<String>> locations;

    public Input<List<String>> getLocations() {
        return this.locations;
    }

    /**
     * Optional. Name of customer-visible admin used to perform Active Directory operations. If not specified `setupadmin` would be used.
     * 
     */
    @InputImport(name="managedIdentitiesAdminName")
      private final @Nullable Input<String> managedIdentitiesAdminName;

    public Input<String> getManagedIdentitiesAdminName() {
        return this.managedIdentitiesAdminName == null ? Input.empty() : this.managedIdentitiesAdminName;
    }

    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * The CIDR range of internal addresses that are reserved for this domain. Reserved networks must be /24 or larger. Ranges must be unique and non-overlapping with existing subnets in [Domain].[authorized_networks].
     * 
     */
    @InputImport(name="reservedIpRange", required=true)
      private final Input<String> reservedIpRange;

    public Input<String> getReservedIpRange() {
        return this.reservedIpRange;
    }

    public DomainArgs(
        @Nullable Input<Boolean> auditLogsEnabled,
        @Nullable Input<List<String>> authorizedNetworks,
        @Nullable Input<String> domainName,
        @Nullable Input<Map<String,String>> labels,
        Input<List<String>> locations,
        @Nullable Input<String> managedIdentitiesAdminName,
        @Nullable Input<String> project,
        Input<String> reservedIpRange) {
        this.auditLogsEnabled = auditLogsEnabled;
        this.authorizedNetworks = authorizedNetworks;
        this.domainName = domainName;
        this.labels = labels;
        this.locations = Objects.requireNonNull(locations, "expected parameter 'locations' to be non-null");
        this.managedIdentitiesAdminName = managedIdentitiesAdminName;
        this.project = project;
        this.reservedIpRange = Objects.requireNonNull(reservedIpRange, "expected parameter 'reservedIpRange' to be non-null");
    }

    private DomainArgs() {
        this.auditLogsEnabled = Input.empty();
        this.authorizedNetworks = Input.empty();
        this.domainName = Input.empty();
        this.labels = Input.empty();
        this.locations = Input.empty();
        this.managedIdentitiesAdminName = Input.empty();
        this.project = Input.empty();
        this.reservedIpRange = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> auditLogsEnabled;
        private @Nullable Input<List<String>> authorizedNetworks;
        private @Nullable Input<String> domainName;
        private @Nullable Input<Map<String,String>> labels;
        private Input<List<String>> locations;
        private @Nullable Input<String> managedIdentitiesAdminName;
        private @Nullable Input<String> project;
        private Input<String> reservedIpRange;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.auditLogsEnabled = defaults.auditLogsEnabled;
    	      this.authorizedNetworks = defaults.authorizedNetworks;
    	      this.domainName = defaults.domainName;
    	      this.labels = defaults.labels;
    	      this.locations = defaults.locations;
    	      this.managedIdentitiesAdminName = defaults.managedIdentitiesAdminName;
    	      this.project = defaults.project;
    	      this.reservedIpRange = defaults.reservedIpRange;
        }

        public Builder setAuditLogsEnabled(@Nullable Input<Boolean> auditLogsEnabled) {
            this.auditLogsEnabled = auditLogsEnabled;
            return this;
        }

        public Builder setAuditLogsEnabled(@Nullable Boolean auditLogsEnabled) {
            this.auditLogsEnabled = Input.ofNullable(auditLogsEnabled);
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

        public Builder setLabels(@Nullable Input<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setLabels(@Nullable Map<String,String> labels) {
            this.labels = Input.ofNullable(labels);
            return this;
        }

        public Builder setLocations(Input<List<String>> locations) {
            this.locations = Objects.requireNonNull(locations);
            return this;
        }

        public Builder setLocations(List<String> locations) {
            this.locations = Input.of(Objects.requireNonNull(locations));
            return this;
        }

        public Builder setManagedIdentitiesAdminName(@Nullable Input<String> managedIdentitiesAdminName) {
            this.managedIdentitiesAdminName = managedIdentitiesAdminName;
            return this;
        }

        public Builder setManagedIdentitiesAdminName(@Nullable String managedIdentitiesAdminName) {
            this.managedIdentitiesAdminName = Input.ofNullable(managedIdentitiesAdminName);
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

        public Builder setReservedIpRange(Input<String> reservedIpRange) {
            this.reservedIpRange = Objects.requireNonNull(reservedIpRange);
            return this;
        }

        public Builder setReservedIpRange(String reservedIpRange) {
            this.reservedIpRange = Input.of(Objects.requireNonNull(reservedIpRange));
            return this;
        }
        public DomainArgs build() {
            return new DomainArgs(auditLogsEnabled, authorizedNetworks, domainName, labels, locations, managedIdentitiesAdminName, project, reservedIpRange);
        }
    }
}