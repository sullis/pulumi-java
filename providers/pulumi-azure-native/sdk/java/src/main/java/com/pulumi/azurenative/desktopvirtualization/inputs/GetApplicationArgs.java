// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.desktopvirtualization.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetApplicationArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetApplicationArgs Empty = new GetApplicationArgs();

    /**
     * The name of the application group
     * 
     */
    @Import(name="applicationGroupName", required=true)
    private Output<String> applicationGroupName;

    /**
     * @return The name of the application group
     * 
     */
    public Output<String> applicationGroupName() {
        return this.applicationGroupName;
    }

    /**
     * The name of the application within the specified application group
     * 
     */
    @Import(name="applicationName", required=true)
    private Output<String> applicationName;

    /**
     * @return The name of the application within the specified application group
     * 
     */
    public Output<String> applicationName() {
        return this.applicationName;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group. The name is case insensitive.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetApplicationArgs() {}

    private GetApplicationArgs(GetApplicationArgs $) {
        this.applicationGroupName = $.applicationGroupName;
        this.applicationName = $.applicationName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetApplicationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetApplicationArgs $;

        public Builder() {
            $ = new GetApplicationArgs();
        }

        public Builder(GetApplicationArgs defaults) {
            $ = new GetApplicationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param applicationGroupName The name of the application group
         * 
         * @return builder
         * 
         */
        public Builder applicationGroupName(Output<String> applicationGroupName) {
            $.applicationGroupName = applicationGroupName;
            return this;
        }

        /**
         * @param applicationGroupName The name of the application group
         * 
         * @return builder
         * 
         */
        public Builder applicationGroupName(String applicationGroupName) {
            return applicationGroupName(Output.of(applicationGroupName));
        }

        /**
         * @param applicationName The name of the application within the specified application group
         * 
         * @return builder
         * 
         */
        public Builder applicationName(Output<String> applicationName) {
            $.applicationName = applicationName;
            return this;
        }

        /**
         * @param applicationName The name of the application within the specified application group
         * 
         * @return builder
         * 
         */
        public Builder applicationName(String applicationName) {
            return applicationName(Output.of(applicationName));
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public GetApplicationArgs build() {
            $.applicationGroupName = Objects.requireNonNull($.applicationGroupName, "expected parameter 'applicationGroupName' to be non-null");
            $.applicationName = Objects.requireNonNull($.applicationName, "expected parameter 'applicationName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
