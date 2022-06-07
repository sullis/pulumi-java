// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storsimple.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetManagerExtendedInfoArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetManagerExtendedInfoArgs Empty = new GetManagerExtendedInfoArgs();

    /**
     * The manager name
     * 
     */
    @Import(name="managerName", required=true)
    private Output<String> managerName;

    /**
     * @return The manager name
     * 
     */
    public Output<String> managerName() {
        return this.managerName;
    }

    /**
     * The resource group name
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The resource group name
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetManagerExtendedInfoArgs() {}

    private GetManagerExtendedInfoArgs(GetManagerExtendedInfoArgs $) {
        this.managerName = $.managerName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetManagerExtendedInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetManagerExtendedInfoArgs $;

        public Builder() {
            $ = new GetManagerExtendedInfoArgs();
        }

        public Builder(GetManagerExtendedInfoArgs defaults) {
            $ = new GetManagerExtendedInfoArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param managerName The manager name
         * 
         * @return builder
         * 
         */
        public Builder managerName(Output<String> managerName) {
            $.managerName = managerName;
            return this;
        }

        /**
         * @param managerName The manager name
         * 
         * @return builder
         * 
         */
        public Builder managerName(String managerName) {
            return managerName(Output.of(managerName));
        }

        /**
         * @param resourceGroupName The resource group name
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The resource group name
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public GetManagerExtendedInfoArgs build() {
            $.managerName = Objects.requireNonNull($.managerName, "expected parameter 'managerName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
