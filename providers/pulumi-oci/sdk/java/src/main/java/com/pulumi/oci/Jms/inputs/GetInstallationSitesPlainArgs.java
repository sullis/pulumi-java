// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Jms.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.oci.Jms.inputs.GetInstallationSitesFilter;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetInstallationSitesPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetInstallationSitesPlainArgs Empty = new GetInstallationSitesPlainArgs();

    /**
     * The Fleet-unique identifier of the related application.
     * 
     */
    @Import(name="applicationId")
    private @Nullable String applicationId;

    /**
     * @return The Fleet-unique identifier of the related application.
     * 
     */
    public Optional<String> applicationId() {
        return Optional.ofNullable(this.applicationId);
    }

    @Import(name="filters")
    private @Nullable List<GetInstallationSitesFilter> filters;

    public Optional<List<GetInstallationSitesFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Fleet.
     * 
     */
    @Import(name="fleetId", required=true)
    private String fleetId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Fleet.
     * 
     */
    public String fleetId() {
        return this.fleetId;
    }

    /**
     * The file system path of the installation.
     * 
     */
    @Import(name="installationPath")
    private @Nullable String installationPath;

    /**
     * @return The file system path of the installation.
     * 
     */
    public Optional<String> installationPath() {
        return Optional.ofNullable(this.installationPath);
    }

    /**
     * The distribution of the related Java Runtime.
     * 
     */
    @Import(name="jreDistribution")
    private @Nullable String jreDistribution;

    /**
     * @return The distribution of the related Java Runtime.
     * 
     */
    public Optional<String> jreDistribution() {
        return Optional.ofNullable(this.jreDistribution);
    }

    /**
     * The security status of the Java Runtime.
     * 
     */
    @Import(name="jreSecurityStatus")
    private @Nullable String jreSecurityStatus;

    /**
     * @return The security status of the Java Runtime.
     * 
     */
    public Optional<String> jreSecurityStatus() {
        return Optional.ofNullable(this.jreSecurityStatus);
    }

    /**
     * The vendor of the related Java Runtime.
     * 
     */
    @Import(name="jreVendor")
    private @Nullable String jreVendor;

    /**
     * @return The vendor of the related Java Runtime.
     * 
     */
    public Optional<String> jreVendor() {
        return Optional.ofNullable(this.jreVendor);
    }

    /**
     * The version of the related Java Runtime.
     * 
     */
    @Import(name="jreVersion")
    private @Nullable String jreVersion;

    /**
     * @return The version of the related Java Runtime.
     * 
     */
    public Optional<String> jreVersion() {
        return Optional.ofNullable(this.jreVersion);
    }

    /**
     * The Fleet-unique identifier of the related managed instance.
     * 
     */
    @Import(name="managedInstanceId")
    private @Nullable String managedInstanceId;

    /**
     * @return The Fleet-unique identifier of the related managed instance.
     * 
     */
    public Optional<String> managedInstanceId() {
        return Optional.ofNullable(this.managedInstanceId);
    }

    /**
     * The operating system type.
     * 
     */
    @Import(name="osFamilies")
    private @Nullable List<String> osFamilies;

    /**
     * @return The operating system type.
     * 
     */
    public Optional<List<String>> osFamilies() {
        return Optional.ofNullable(this.osFamilies);
    }

    private GetInstallationSitesPlainArgs() {}

    private GetInstallationSitesPlainArgs(GetInstallationSitesPlainArgs $) {
        this.applicationId = $.applicationId;
        this.filters = $.filters;
        this.fleetId = $.fleetId;
        this.installationPath = $.installationPath;
        this.jreDistribution = $.jreDistribution;
        this.jreSecurityStatus = $.jreSecurityStatus;
        this.jreVendor = $.jreVendor;
        this.jreVersion = $.jreVersion;
        this.managedInstanceId = $.managedInstanceId;
        this.osFamilies = $.osFamilies;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetInstallationSitesPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetInstallationSitesPlainArgs $;

        public Builder() {
            $ = new GetInstallationSitesPlainArgs();
        }

        public Builder(GetInstallationSitesPlainArgs defaults) {
            $ = new GetInstallationSitesPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param applicationId The Fleet-unique identifier of the related application.
         * 
         * @return builder
         * 
         */
        public Builder applicationId(@Nullable String applicationId) {
            $.applicationId = applicationId;
            return this;
        }

        public Builder filters(@Nullable List<GetInstallationSitesFilter> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(GetInstallationSitesFilter... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param fleetId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Fleet.
         * 
         * @return builder
         * 
         */
        public Builder fleetId(String fleetId) {
            $.fleetId = fleetId;
            return this;
        }

        /**
         * @param installationPath The file system path of the installation.
         * 
         * @return builder
         * 
         */
        public Builder installationPath(@Nullable String installationPath) {
            $.installationPath = installationPath;
            return this;
        }

        /**
         * @param jreDistribution The distribution of the related Java Runtime.
         * 
         * @return builder
         * 
         */
        public Builder jreDistribution(@Nullable String jreDistribution) {
            $.jreDistribution = jreDistribution;
            return this;
        }

        /**
         * @param jreSecurityStatus The security status of the Java Runtime.
         * 
         * @return builder
         * 
         */
        public Builder jreSecurityStatus(@Nullable String jreSecurityStatus) {
            $.jreSecurityStatus = jreSecurityStatus;
            return this;
        }

        /**
         * @param jreVendor The vendor of the related Java Runtime.
         * 
         * @return builder
         * 
         */
        public Builder jreVendor(@Nullable String jreVendor) {
            $.jreVendor = jreVendor;
            return this;
        }

        /**
         * @param jreVersion The version of the related Java Runtime.
         * 
         * @return builder
         * 
         */
        public Builder jreVersion(@Nullable String jreVersion) {
            $.jreVersion = jreVersion;
            return this;
        }

        /**
         * @param managedInstanceId The Fleet-unique identifier of the related managed instance.
         * 
         * @return builder
         * 
         */
        public Builder managedInstanceId(@Nullable String managedInstanceId) {
            $.managedInstanceId = managedInstanceId;
            return this;
        }

        /**
         * @param osFamilies The operating system type.
         * 
         * @return builder
         * 
         */
        public Builder osFamilies(@Nullable List<String> osFamilies) {
            $.osFamilies = osFamilies;
            return this;
        }

        /**
         * @param osFamilies The operating system type.
         * 
         * @return builder
         * 
         */
        public Builder osFamilies(String... osFamilies) {
            return osFamilies(List.of(osFamilies));
        }

        public GetInstallationSitesPlainArgs build() {
            $.fleetId = Objects.requireNonNull($.fleetId, "expected parameter 'fleetId' to be non-null");
            return $;
        }
    }

}
