// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.devtest.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetLabArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetLabArgs Empty = new GetLabArgs();

    /**
     * The name of the Dev Test Lab.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of the Dev Test Lab.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * The Name of the Resource Group where the Dev Test Lab exists.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The Name of the Resource Group where the Dev Test Lab exists.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetLabArgs() {}

    private GetLabArgs(GetLabArgs $) {
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetLabArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetLabArgs $;

        public Builder() {
            $ = new GetLabArgs();
        }

        public Builder(GetLabArgs defaults) {
            $ = new GetLabArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the Dev Test Lab.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param resourceGroupName The Name of the Resource Group where the Dev Test Lab exists.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetLabArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
