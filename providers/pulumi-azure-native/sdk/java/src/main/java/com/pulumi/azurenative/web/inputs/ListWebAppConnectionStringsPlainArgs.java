// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ListWebAppConnectionStringsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final ListWebAppConnectionStringsPlainArgs Empty = new ListWebAppConnectionStringsPlainArgs();

    /**
     * Name of the app.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return Name of the app.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * Name of the resource group to which the resource belongs.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return Name of the resource group to which the resource belongs.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private ListWebAppConnectionStringsPlainArgs() {}

    private ListWebAppConnectionStringsPlainArgs(ListWebAppConnectionStringsPlainArgs $) {
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListWebAppConnectionStringsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListWebAppConnectionStringsPlainArgs $;

        public Builder() {
            $ = new ListWebAppConnectionStringsPlainArgs();
        }

        public Builder(ListWebAppConnectionStringsPlainArgs defaults) {
            $ = new ListWebAppConnectionStringsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Name of the app.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param resourceGroupName Name of the resource group to which the resource belongs.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public ListWebAppConnectionStringsPlainArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
