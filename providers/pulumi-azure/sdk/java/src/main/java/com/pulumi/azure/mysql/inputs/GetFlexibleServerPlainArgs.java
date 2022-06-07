// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.mysql.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetFlexibleServerPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetFlexibleServerPlainArgs Empty = new GetFlexibleServerPlainArgs();

    /**
     * Specifies the name of the MySQL Flexible Server.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return Specifies the name of the MySQL Flexible Server.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * The name of the resource group for the MySQL Flexible Server.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group for the MySQL Flexible Server.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetFlexibleServerPlainArgs() {}

    private GetFlexibleServerPlainArgs(GetFlexibleServerPlainArgs $) {
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFlexibleServerPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFlexibleServerPlainArgs $;

        public Builder() {
            $ = new GetFlexibleServerPlainArgs();
        }

        public Builder(GetFlexibleServerPlainArgs defaults) {
            $ = new GetFlexibleServerPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Specifies the name of the MySQL Flexible Server.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group for the MySQL Flexible Server.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetFlexibleServerPlainArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
