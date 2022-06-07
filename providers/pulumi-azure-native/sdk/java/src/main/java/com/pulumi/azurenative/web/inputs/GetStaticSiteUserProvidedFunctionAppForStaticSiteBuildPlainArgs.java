// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetStaticSiteUserProvidedFunctionAppForStaticSiteBuildPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetStaticSiteUserProvidedFunctionAppForStaticSiteBuildPlainArgs Empty = new GetStaticSiteUserProvidedFunctionAppForStaticSiteBuildPlainArgs();

    /**
     * The stage site identifier.
     * 
     */
    @Import(name="environmentName", required=true)
    private String environmentName;

    /**
     * @return The stage site identifier.
     * 
     */
    public String environmentName() {
        return this.environmentName;
    }

    /**
     * Name of the function app registered with the static site build.
     * 
     */
    @Import(name="functionAppName", required=true)
    private String functionAppName;

    /**
     * @return Name of the function app registered with the static site build.
     * 
     */
    public String functionAppName() {
        return this.functionAppName;
    }

    /**
     * Name of the static site.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return Name of the static site.
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

    private GetStaticSiteUserProvidedFunctionAppForStaticSiteBuildPlainArgs() {}

    private GetStaticSiteUserProvidedFunctionAppForStaticSiteBuildPlainArgs(GetStaticSiteUserProvidedFunctionAppForStaticSiteBuildPlainArgs $) {
        this.environmentName = $.environmentName;
        this.functionAppName = $.functionAppName;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetStaticSiteUserProvidedFunctionAppForStaticSiteBuildPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetStaticSiteUserProvidedFunctionAppForStaticSiteBuildPlainArgs $;

        public Builder() {
            $ = new GetStaticSiteUserProvidedFunctionAppForStaticSiteBuildPlainArgs();
        }

        public Builder(GetStaticSiteUserProvidedFunctionAppForStaticSiteBuildPlainArgs defaults) {
            $ = new GetStaticSiteUserProvidedFunctionAppForStaticSiteBuildPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param environmentName The stage site identifier.
         * 
         * @return builder
         * 
         */
        public Builder environmentName(String environmentName) {
            $.environmentName = environmentName;
            return this;
        }

        /**
         * @param functionAppName Name of the function app registered with the static site build.
         * 
         * @return builder
         * 
         */
        public Builder functionAppName(String functionAppName) {
            $.functionAppName = functionAppName;
            return this;
        }

        /**
         * @param name Name of the static site.
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

        public GetStaticSiteUserProvidedFunctionAppForStaticSiteBuildPlainArgs build() {
            $.environmentName = Objects.requireNonNull($.environmentName, "expected parameter 'environmentName' to be non-null");
            $.functionAppName = Objects.requireNonNull($.functionAppName, "expected parameter 'functionAppName' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
