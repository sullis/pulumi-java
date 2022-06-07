// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.ManagementAgent.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.oci.ManagementAgent.inputs.GetManagementAgentsFilter;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetManagementAgentsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetManagementAgentsPlainArgs Empty = new GetManagementAgentsPlainArgs();

    /**
     * Filter to return only Management Agents in the particular availability status.
     * 
     */
    @Import(name="availabilityStatus")
    private @Nullable String availabilityStatus;

    /**
     * @return Filter to return only Management Agents in the particular availability status.
     * 
     */
    public Optional<String> availabilityStatus() {
        return Optional.ofNullable(this.availabilityStatus);
    }

    /**
     * The OCID of the compartment to which a request will be scoped.
     * 
     */
    @Import(name="compartmentId", required=true)
    private String compartmentId;

    /**
     * @return The OCID of the compartment to which a request will be scoped.
     * 
     */
    public String compartmentId() {
        return this.compartmentId;
    }

    /**
     * Filter to return only Management Agents having the particular display name.
     * 
     */
    @Import(name="displayName")
    private @Nullable String displayName;

    /**
     * @return Filter to return only Management Agents having the particular display name.
     * 
     */
    public Optional<String> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    @Import(name="filters")
    private @Nullable List<GetManagementAgentsFilter> filters;

    public Optional<List<GetManagementAgentsFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * Filter to return only Management Agents having the particular agent host id.
     * 
     */
    @Import(name="hostId")
    private @Nullable String hostId;

    /**
     * @return Filter to return only Management Agents having the particular agent host id.
     * 
     */
    public Optional<String> hostId() {
        return Optional.ofNullable(this.hostId);
    }

    /**
     * A filter to return either agents or gateway types depending upon install type selected by user. By default both install type will be returned.
     * 
     */
    @Import(name="installType")
    private @Nullable String installType;

    /**
     * @return A filter to return either agents or gateway types depending upon install type selected by user. By default both install type will be returned.
     * 
     */
    public Optional<String> installType() {
        return Optional.ofNullable(this.installType);
    }

    /**
     * true, if the agent image is manually downloaded and installed. false, if the agent is deployed as a plugin in Oracle Cloud Agent.
     * 
     */
    @Import(name="isCustomerDeployed")
    private @Nullable Boolean isCustomerDeployed;

    /**
     * @return true, if the agent image is manually downloaded and installed. false, if the agent is deployed as a plugin in Oracle Cloud Agent.
     * 
     */
    public Optional<Boolean> isCustomerDeployed() {
        return Optional.ofNullable(this.isCustomerDeployed);
    }

    /**
     * Filter to return only results having the particular platform type.
     * 
     */
    @Import(name="platformTypes")
    private @Nullable List<String> platformTypes;

    /**
     * @return Filter to return only results having the particular platform type.
     * 
     */
    public Optional<List<String>> platformTypes() {
        return Optional.ofNullable(this.platformTypes);
    }

    /**
     * Filter to return only Management Agents having the particular Plugin installed. A special pluginName of &#39;None&#39; can be provided and this will return only Management Agents having no plugin installed.
     * 
     */
    @Import(name="pluginNames")
    private @Nullable List<String> pluginNames;

    /**
     * @return Filter to return only Management Agents having the particular Plugin installed. A special pluginName of &#39;None&#39; can be provided and this will return only Management Agents having no plugin installed.
     * 
     */
    public Optional<List<String>> pluginNames() {
        return Optional.ofNullable(this.pluginNames);
    }

    /**
     * Filter to return only Management Agents in the particular lifecycle state.
     * 
     */
    @Import(name="state")
    private @Nullable String state;

    /**
     * @return Filter to return only Management Agents in the particular lifecycle state.
     * 
     */
    public Optional<String> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * Filter to return only Management Agents having the particular agent version.
     * 
     */
    @Import(name="versions")
    private @Nullable List<String> versions;

    /**
     * @return Filter to return only Management Agents having the particular agent version.
     * 
     */
    public Optional<List<String>> versions() {
        return Optional.ofNullable(this.versions);
    }

    private GetManagementAgentsPlainArgs() {}

    private GetManagementAgentsPlainArgs(GetManagementAgentsPlainArgs $) {
        this.availabilityStatus = $.availabilityStatus;
        this.compartmentId = $.compartmentId;
        this.displayName = $.displayName;
        this.filters = $.filters;
        this.hostId = $.hostId;
        this.installType = $.installType;
        this.isCustomerDeployed = $.isCustomerDeployed;
        this.platformTypes = $.platformTypes;
        this.pluginNames = $.pluginNames;
        this.state = $.state;
        this.versions = $.versions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetManagementAgentsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetManagementAgentsPlainArgs $;

        public Builder() {
            $ = new GetManagementAgentsPlainArgs();
        }

        public Builder(GetManagementAgentsPlainArgs defaults) {
            $ = new GetManagementAgentsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param availabilityStatus Filter to return only Management Agents in the particular availability status.
         * 
         * @return builder
         * 
         */
        public Builder availabilityStatus(@Nullable String availabilityStatus) {
            $.availabilityStatus = availabilityStatus;
            return this;
        }

        /**
         * @param compartmentId The OCID of the compartment to which a request will be scoped.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(String compartmentId) {
            $.compartmentId = compartmentId;
            return this;
        }

        /**
         * @param displayName Filter to return only Management Agents having the particular display name.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable String displayName) {
            $.displayName = displayName;
            return this;
        }

        public Builder filters(@Nullable List<GetManagementAgentsFilter> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(GetManagementAgentsFilter... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param hostId Filter to return only Management Agents having the particular agent host id.
         * 
         * @return builder
         * 
         */
        public Builder hostId(@Nullable String hostId) {
            $.hostId = hostId;
            return this;
        }

        /**
         * @param installType A filter to return either agents or gateway types depending upon install type selected by user. By default both install type will be returned.
         * 
         * @return builder
         * 
         */
        public Builder installType(@Nullable String installType) {
            $.installType = installType;
            return this;
        }

        /**
         * @param isCustomerDeployed true, if the agent image is manually downloaded and installed. false, if the agent is deployed as a plugin in Oracle Cloud Agent.
         * 
         * @return builder
         * 
         */
        public Builder isCustomerDeployed(@Nullable Boolean isCustomerDeployed) {
            $.isCustomerDeployed = isCustomerDeployed;
            return this;
        }

        /**
         * @param platformTypes Filter to return only results having the particular platform type.
         * 
         * @return builder
         * 
         */
        public Builder platformTypes(@Nullable List<String> platformTypes) {
            $.platformTypes = platformTypes;
            return this;
        }

        /**
         * @param platformTypes Filter to return only results having the particular platform type.
         * 
         * @return builder
         * 
         */
        public Builder platformTypes(String... platformTypes) {
            return platformTypes(List.of(platformTypes));
        }

        /**
         * @param pluginNames Filter to return only Management Agents having the particular Plugin installed. A special pluginName of &#39;None&#39; can be provided and this will return only Management Agents having no plugin installed.
         * 
         * @return builder
         * 
         */
        public Builder pluginNames(@Nullable List<String> pluginNames) {
            $.pluginNames = pluginNames;
            return this;
        }

        /**
         * @param pluginNames Filter to return only Management Agents having the particular Plugin installed. A special pluginName of &#39;None&#39; can be provided and this will return only Management Agents having no plugin installed.
         * 
         * @return builder
         * 
         */
        public Builder pluginNames(String... pluginNames) {
            return pluginNames(List.of(pluginNames));
        }

        /**
         * @param state Filter to return only Management Agents in the particular lifecycle state.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable String state) {
            $.state = state;
            return this;
        }

        /**
         * @param versions Filter to return only Management Agents having the particular agent version.
         * 
         * @return builder
         * 
         */
        public Builder versions(@Nullable List<String> versions) {
            $.versions = versions;
            return this;
        }

        /**
         * @param versions Filter to return only Management Agents having the particular agent version.
         * 
         * @return builder
         * 
         */
        public Builder versions(String... versions) {
            return versions(List.of(versions));
        }

        public GetManagementAgentsPlainArgs build() {
            $.compartmentId = Objects.requireNonNull($.compartmentId, "expected parameter 'compartmentId' to be non-null");
            return $;
        }
    }

}
