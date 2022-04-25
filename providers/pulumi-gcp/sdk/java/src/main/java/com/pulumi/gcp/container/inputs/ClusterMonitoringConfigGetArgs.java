// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class ClusterMonitoringConfigGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterMonitoringConfigGetArgs Empty = new ClusterMonitoringConfigGetArgs();

    /**
     * The GKE components exposing logs. `SYSTEM_COMPONENTS` and in beta provider, both `SYSTEM_COMPONENTS` and `WORKLOADS` are supported.
     * 
     */
    @Import(name="enableComponents", required=true)
    private Output<List<String>> enableComponents;

    /**
     * @return The GKE components exposing logs. `SYSTEM_COMPONENTS` and in beta provider, both `SYSTEM_COMPONENTS` and `WORKLOADS` are supported.
     * 
     */
    public Output<List<String>> enableComponents() {
        return this.enableComponents;
    }

    private ClusterMonitoringConfigGetArgs() {}

    private ClusterMonitoringConfigGetArgs(ClusterMonitoringConfigGetArgs $) {
        this.enableComponents = $.enableComponents;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterMonitoringConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterMonitoringConfigGetArgs $;

        public Builder() {
            $ = new ClusterMonitoringConfigGetArgs();
        }

        public Builder(ClusterMonitoringConfigGetArgs defaults) {
            $ = new ClusterMonitoringConfigGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enableComponents The GKE components exposing logs. `SYSTEM_COMPONENTS` and in beta provider, both `SYSTEM_COMPONENTS` and `WORKLOADS` are supported.
         * 
         * @return builder
         * 
         */
        public Builder enableComponents(Output<List<String>> enableComponents) {
            $.enableComponents = enableComponents;
            return this;
        }

        /**
         * @param enableComponents The GKE components exposing logs. `SYSTEM_COMPONENTS` and in beta provider, both `SYSTEM_COMPONENTS` and `WORKLOADS` are supported.
         * 
         * @return builder
         * 
         */
        public Builder enableComponents(List<String> enableComponents) {
            return enableComponents(Output.of(enableComponents));
        }

        /**
         * @param enableComponents The GKE components exposing logs. `SYSTEM_COMPONENTS` and in beta provider, both `SYSTEM_COMPONENTS` and `WORKLOADS` are supported.
         * 
         * @return builder
         * 
         */
        public Builder enableComponents(String... enableComponents) {
            return enableComponents(List.of(enableComponents));
        }

        public ClusterMonitoringConfigGetArgs build() {
            $.enableComponents = Objects.requireNonNull($.enableComponents, "expected parameter 'enableComponents' to be non-null");
            return $;
        }
    }

}
