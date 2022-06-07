// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.ComputeInstanceAgent.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.oci.ComputeInstanceAgent.inputs.GetInstanceAvailablePluginFilterArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetInstanceAvailablePluginArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetInstanceAvailablePluginArgs Empty = new GetInstanceAvailablePluginArgs();

    @Import(name="compartmentId", required=true)
    private Output<String> compartmentId;

    public Output<String> compartmentId() {
        return this.compartmentId;
    }

    @Import(name="filters")
    private @Nullable Output<List<GetInstanceAvailablePluginFilterArgs>> filters;

    public Optional<Output<List<GetInstanceAvailablePluginFilterArgs>>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * The plugin name
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The plugin name
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The OS for which the plugin is supported. Examples of OperatingSystemQueryParam:OperatingSystemVersionQueryParam are as follows: &#39;CentOS&#39; &#39;6.10&#39; , &#39;CentOS Linux&#39; &#39;7&#39;, &#39;CentOS Linux&#39; &#39;8&#39;, &#39;Oracle Linux Server&#39; &#39;6.10&#39;, &#39;Oracle Linux Server&#39; &#39;8.0&#39;, &#39;Red Hat Enterprise Linux Server&#39; &#39;7.8&#39;, &#39;Windows&#39; &#39;10&#39;, &#39;Windows&#39; &#39;2008ServerR2&#39;, &#39;Windows&#39; &#39;2012ServerR2&#39;, &#39;Windows&#39; &#39;7&#39;, &#39;Windows&#39; &#39;8.1&#39;
     * 
     */
    @Import(name="osName", required=true)
    private Output<String> osName;

    /**
     * @return The OS for which the plugin is supported. Examples of OperatingSystemQueryParam:OperatingSystemVersionQueryParam are as follows: &#39;CentOS&#39; &#39;6.10&#39; , &#39;CentOS Linux&#39; &#39;7&#39;, &#39;CentOS Linux&#39; &#39;8&#39;, &#39;Oracle Linux Server&#39; &#39;6.10&#39;, &#39;Oracle Linux Server&#39; &#39;8.0&#39;, &#39;Red Hat Enterprise Linux Server&#39; &#39;7.8&#39;, &#39;Windows&#39; &#39;10&#39;, &#39;Windows&#39; &#39;2008ServerR2&#39;, &#39;Windows&#39; &#39;2012ServerR2&#39;, &#39;Windows&#39; &#39;7&#39;, &#39;Windows&#39; &#39;8.1&#39;
     * 
     */
    public Output<String> osName() {
        return this.osName;
    }

    /**
     * The OS version for which the plugin is supported.
     * 
     */
    @Import(name="osVersion", required=true)
    private Output<String> osVersion;

    /**
     * @return The OS version for which the plugin is supported.
     * 
     */
    public Output<String> osVersion() {
        return this.osVersion;
    }

    private GetInstanceAvailablePluginArgs() {}

    private GetInstanceAvailablePluginArgs(GetInstanceAvailablePluginArgs $) {
        this.compartmentId = $.compartmentId;
        this.filters = $.filters;
        this.name = $.name;
        this.osName = $.osName;
        this.osVersion = $.osVersion;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetInstanceAvailablePluginArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetInstanceAvailablePluginArgs $;

        public Builder() {
            $ = new GetInstanceAvailablePluginArgs();
        }

        public Builder(GetInstanceAvailablePluginArgs defaults) {
            $ = new GetInstanceAvailablePluginArgs(Objects.requireNonNull(defaults));
        }

        public Builder compartmentId(Output<String> compartmentId) {
            $.compartmentId = compartmentId;
            return this;
        }

        public Builder compartmentId(String compartmentId) {
            return compartmentId(Output.of(compartmentId));
        }

        public Builder filters(@Nullable Output<List<GetInstanceAvailablePluginFilterArgs>> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(List<GetInstanceAvailablePluginFilterArgs> filters) {
            return filters(Output.of(filters));
        }

        public Builder filters(GetInstanceAvailablePluginFilterArgs... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param name The plugin name
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The plugin name
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param osName The OS for which the plugin is supported. Examples of OperatingSystemQueryParam:OperatingSystemVersionQueryParam are as follows: &#39;CentOS&#39; &#39;6.10&#39; , &#39;CentOS Linux&#39; &#39;7&#39;, &#39;CentOS Linux&#39; &#39;8&#39;, &#39;Oracle Linux Server&#39; &#39;6.10&#39;, &#39;Oracle Linux Server&#39; &#39;8.0&#39;, &#39;Red Hat Enterprise Linux Server&#39; &#39;7.8&#39;, &#39;Windows&#39; &#39;10&#39;, &#39;Windows&#39; &#39;2008ServerR2&#39;, &#39;Windows&#39; &#39;2012ServerR2&#39;, &#39;Windows&#39; &#39;7&#39;, &#39;Windows&#39; &#39;8.1&#39;
         * 
         * @return builder
         * 
         */
        public Builder osName(Output<String> osName) {
            $.osName = osName;
            return this;
        }

        /**
         * @param osName The OS for which the plugin is supported. Examples of OperatingSystemQueryParam:OperatingSystemVersionQueryParam are as follows: &#39;CentOS&#39; &#39;6.10&#39; , &#39;CentOS Linux&#39; &#39;7&#39;, &#39;CentOS Linux&#39; &#39;8&#39;, &#39;Oracle Linux Server&#39; &#39;6.10&#39;, &#39;Oracle Linux Server&#39; &#39;8.0&#39;, &#39;Red Hat Enterprise Linux Server&#39; &#39;7.8&#39;, &#39;Windows&#39; &#39;10&#39;, &#39;Windows&#39; &#39;2008ServerR2&#39;, &#39;Windows&#39; &#39;2012ServerR2&#39;, &#39;Windows&#39; &#39;7&#39;, &#39;Windows&#39; &#39;8.1&#39;
         * 
         * @return builder
         * 
         */
        public Builder osName(String osName) {
            return osName(Output.of(osName));
        }

        /**
         * @param osVersion The OS version for which the plugin is supported.
         * 
         * @return builder
         * 
         */
        public Builder osVersion(Output<String> osVersion) {
            $.osVersion = osVersion;
            return this;
        }

        /**
         * @param osVersion The OS version for which the plugin is supported.
         * 
         * @return builder
         * 
         */
        public Builder osVersion(String osVersion) {
            return osVersion(Output.of(osVersion));
        }

        public GetInstanceAvailablePluginArgs build() {
            $.compartmentId = Objects.requireNonNull($.compartmentId, "expected parameter 'compartmentId' to be non-null");
            $.osName = Objects.requireNonNull($.osName, "expected parameter 'osName' to be non-null");
            $.osVersion = Objects.requireNonNull($.osVersion, "expected parameter 'osVersion' to be non-null");
            return $;
        }
    }

}
