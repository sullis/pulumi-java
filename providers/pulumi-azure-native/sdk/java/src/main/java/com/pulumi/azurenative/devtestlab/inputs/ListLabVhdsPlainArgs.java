// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.devtestlab.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ListLabVhdsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final ListLabVhdsPlainArgs Empty = new ListLabVhdsPlainArgs();

    /**
     * The name of the lab.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of the lab.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private ListLabVhdsPlainArgs() {}

    private ListLabVhdsPlainArgs(ListLabVhdsPlainArgs $) {
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListLabVhdsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListLabVhdsPlainArgs $;

        public Builder() {
            $ = new ListLabVhdsPlainArgs();
        }

        public Builder(ListLabVhdsPlainArgs defaults) {
            $ = new ListLabVhdsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the lab.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public ListLabVhdsPlainArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
