// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.mobilenetwork.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetPacketCoreDataPlanePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPacketCoreDataPlanePlainArgs Empty = new GetPacketCoreDataPlanePlainArgs();

    /**
     * The name of the packet core control plane.
     * 
     */
    @Import(name="packetCoreControlPlaneName", required=true)
    private String packetCoreControlPlaneName;

    /**
     * @return The name of the packet core control plane.
     * 
     */
    public String packetCoreControlPlaneName() {
        return this.packetCoreControlPlaneName;
    }

    /**
     * The name of the packet core data plane.
     * 
     */
    @Import(name="packetCoreDataPlaneName", required=true)
    private String packetCoreDataPlaneName;

    /**
     * @return The name of the packet core data plane.
     * 
     */
    public String packetCoreDataPlaneName() {
        return this.packetCoreDataPlaneName;
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

    private GetPacketCoreDataPlanePlainArgs() {}

    private GetPacketCoreDataPlanePlainArgs(GetPacketCoreDataPlanePlainArgs $) {
        this.packetCoreControlPlaneName = $.packetCoreControlPlaneName;
        this.packetCoreDataPlaneName = $.packetCoreDataPlaneName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPacketCoreDataPlanePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPacketCoreDataPlanePlainArgs $;

        public Builder() {
            $ = new GetPacketCoreDataPlanePlainArgs();
        }

        public Builder(GetPacketCoreDataPlanePlainArgs defaults) {
            $ = new GetPacketCoreDataPlanePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param packetCoreControlPlaneName The name of the packet core control plane.
         * 
         * @return builder
         * 
         */
        public Builder packetCoreControlPlaneName(String packetCoreControlPlaneName) {
            $.packetCoreControlPlaneName = packetCoreControlPlaneName;
            return this;
        }

        /**
         * @param packetCoreDataPlaneName The name of the packet core data plane.
         * 
         * @return builder
         * 
         */
        public Builder packetCoreDataPlaneName(String packetCoreDataPlaneName) {
            $.packetCoreDataPlaneName = packetCoreDataPlaneName;
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

        public GetPacketCoreDataPlanePlainArgs build() {
            $.packetCoreControlPlaneName = Objects.requireNonNull($.packetCoreControlPlaneName, "expected parameter 'packetCoreControlPlaneName' to be non-null");
            $.packetCoreDataPlaneName = Objects.requireNonNull($.packetCoreDataPlaneName, "expected parameter 'packetCoreDataPlaneName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
