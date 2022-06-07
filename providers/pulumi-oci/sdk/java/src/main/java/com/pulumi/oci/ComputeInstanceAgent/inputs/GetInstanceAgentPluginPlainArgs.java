// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.ComputeInstanceAgent.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetInstanceAgentPluginPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetInstanceAgentPluginPlainArgs Empty = new GetInstanceAgentPluginPlainArgs();

    @Import(name="compartmentId", required=true)
    private String compartmentId;

    public String compartmentId() {
        return this.compartmentId;
    }

    /**
     * The OCID of the instance.
     * 
     */
    @Import(name="instanceagentId", required=true)
    private String instanceagentId;

    /**
     * @return The OCID of the instance.
     * 
     */
    public String instanceagentId() {
        return this.instanceagentId;
    }

    /**
     * The name of the plugin.
     * 
     */
    @Import(name="pluginName", required=true)
    private String pluginName;

    /**
     * @return The name of the plugin.
     * 
     */
    public String pluginName() {
        return this.pluginName;
    }

    private GetInstanceAgentPluginPlainArgs() {}

    private GetInstanceAgentPluginPlainArgs(GetInstanceAgentPluginPlainArgs $) {
        this.compartmentId = $.compartmentId;
        this.instanceagentId = $.instanceagentId;
        this.pluginName = $.pluginName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetInstanceAgentPluginPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetInstanceAgentPluginPlainArgs $;

        public Builder() {
            $ = new GetInstanceAgentPluginPlainArgs();
        }

        public Builder(GetInstanceAgentPluginPlainArgs defaults) {
            $ = new GetInstanceAgentPluginPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder compartmentId(String compartmentId) {
            $.compartmentId = compartmentId;
            return this;
        }

        /**
         * @param instanceagentId The OCID of the instance.
         * 
         * @return builder
         * 
         */
        public Builder instanceagentId(String instanceagentId) {
            $.instanceagentId = instanceagentId;
            return this;
        }

        /**
         * @param pluginName The name of the plugin.
         * 
         * @return builder
         * 
         */
        public Builder pluginName(String pluginName) {
            $.pluginName = pluginName;
            return this;
        }

        public GetInstanceAgentPluginPlainArgs build() {
            $.compartmentId = Objects.requireNonNull($.compartmentId, "expected parameter 'compartmentId' to be non-null");
            $.instanceagentId = Objects.requireNonNull($.instanceagentId, "expected parameter 'instanceagentId' to be non-null");
            $.pluginName = Objects.requireNonNull($.pluginName, "expected parameter 'pluginName' to be non-null");
            return $;
        }
    }

}
