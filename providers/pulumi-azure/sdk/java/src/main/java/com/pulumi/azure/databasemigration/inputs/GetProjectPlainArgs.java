// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.databasemigration.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetProjectPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetProjectPlainArgs Empty = new GetProjectPlainArgs();

    /**
     * Name of the database migration project.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return Name of the database migration project.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * Name of the resource group where resource belongs to.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return Name of the resource group where resource belongs to.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Name of the database migration service where resource belongs to.
     * 
     */
    @Import(name="serviceName", required=true)
    private String serviceName;

    /**
     * @return Name of the database migration service where resource belongs to.
     * 
     */
    public String serviceName() {
        return this.serviceName;
    }

    private GetProjectPlainArgs() {}

    private GetProjectPlainArgs(GetProjectPlainArgs $) {
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
        this.serviceName = $.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetProjectPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetProjectPlainArgs $;

        public Builder() {
            $ = new GetProjectPlainArgs();
        }

        public Builder(GetProjectPlainArgs defaults) {
            $ = new GetProjectPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Name of the database migration project.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param resourceGroupName Name of the resource group where resource belongs to.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param serviceName Name of the database migration service where resource belongs to.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(String serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        public GetProjectPlainArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.serviceName = Objects.requireNonNull($.serviceName, "expected parameter 'serviceName' to be non-null");
            return $;
        }
    }

}
