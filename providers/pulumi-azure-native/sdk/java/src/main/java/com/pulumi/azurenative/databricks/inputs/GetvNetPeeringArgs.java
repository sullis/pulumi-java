// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.databricks.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetvNetPeeringArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetvNetPeeringArgs Empty = new GetvNetPeeringArgs();

    /**
     * The name of the workspace vNet peering.
     * 
     */
    @Import(name="peeringName", required=true)
    private String peeringName;

    /**
     * @return The name of the workspace vNet peering.
     * 
     */
    public String peeringName() {
        return this.peeringName;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group. The name is case insensitive.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the workspace.
     * 
     */
    @Import(name="workspaceName", required=true)
    private String workspaceName;

    /**
     * @return The name of the workspace.
     * 
     */
    public String workspaceName() {
        return this.workspaceName;
    }

    private GetvNetPeeringArgs() {}

    private GetvNetPeeringArgs(GetvNetPeeringArgs $) {
        this.peeringName = $.peeringName;
        this.resourceGroupName = $.resourceGroupName;
        this.workspaceName = $.workspaceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetvNetPeeringArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetvNetPeeringArgs $;

        public Builder() {
            $ = new GetvNetPeeringArgs();
        }

        public Builder(GetvNetPeeringArgs defaults) {
            $ = new GetvNetPeeringArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param peeringName The name of the workspace vNet peering.
         * 
         * @return builder
         * 
         */
        public Builder peeringName(String peeringName) {
            $.peeringName = peeringName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param workspaceName The name of the workspace.
         * 
         * @return builder
         * 
         */
        public Builder workspaceName(String workspaceName) {
            $.workspaceName = workspaceName;
            return this;
        }

        public GetvNetPeeringArgs build() {
            $.peeringName = Objects.requireNonNull($.peeringName, "expected parameter 'peeringName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.workspaceName = Objects.requireNonNull($.workspaceName, "expected parameter 'workspaceName' to be non-null");
            return $;
        }
    }

}
