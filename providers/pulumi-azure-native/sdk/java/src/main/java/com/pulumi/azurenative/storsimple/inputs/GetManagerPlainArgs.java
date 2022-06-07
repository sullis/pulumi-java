// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storsimple.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetManagerPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetManagerPlainArgs Empty = new GetManagerPlainArgs();

    /**
     * The manager name
     * 
     */
    @Import(name="managerName", required=true)
    private String managerName;

    /**
     * @return The manager name
     * 
     */
    public String managerName() {
        return this.managerName;
    }

    /**
     * The resource group name
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The resource group name
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetManagerPlainArgs() {}

    private GetManagerPlainArgs(GetManagerPlainArgs $) {
        this.managerName = $.managerName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetManagerPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetManagerPlainArgs $;

        public Builder() {
            $ = new GetManagerPlainArgs();
        }

        public Builder(GetManagerPlainArgs defaults) {
            $ = new GetManagerPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param managerName The manager name
         * 
         * @return builder
         * 
         */
        public Builder managerName(String managerName) {
            $.managerName = managerName;
            return this;
        }

        /**
         * @param resourceGroupName The resource group name
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetManagerPlainArgs build() {
            $.managerName = Objects.requireNonNull($.managerName, "expected parameter 'managerName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
